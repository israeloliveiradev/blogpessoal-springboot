package com.generation.blogpessoal.controller;

import com.generation.blogpessoal.model.Usuario;
import com.generation.blogpessoal.repository.UsuarioRepository;
import com.generation.blogpessoal.service.UsuarioService;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class UsuarioControllerTest {

    @Autowired
    private TestRestTemplate testRestTemplate;

    @Autowired
    private UsuarioService usuarioService;

    @Autowired
    private UsuarioRepository usuarioRepository;

    @BeforeAll
    void start() {

        usuarioRepository.deleteAll();

        usuarioService.cadastrarUsuario(new Usuario(0L, "root", "root@root.com", "12345678", " "));
    }

    @Test
    @DisplayName("🚀 Cadastro de novo Usuário!")
    public void deveCriarNovoUsuario() {

        HttpEntity<Usuario> corpoRequisicao = new HttpEntity<Usuario>(new Usuario(0L, "Roberto Firmnino", "robertof@gmail.com", "12345678", " "));

        ResponseEntity<Usuario> corpoDaResposta = testRestTemplate
                .exchange("/usuarios/cadastrar", HttpMethod.POST, corpoRequisicao, Usuario.class);

        assertEquals(HttpStatus.CREATED, corpoDaResposta.getStatusCode());
    }

    @Test
    @DisplayName("Não deve permitir a duplicação do Usuário!")
    public void naoDevDuplicarUsuario() {

        usuarioService.cadastrarUsuario(new Usuario(0L, "Roberto Firmino", "roberto_firmino@gmail.com", "123456", "-"));

        HttpEntity<Usuario> corpoRequisicao = new HttpEntity<Usuario>(new Usuario(0L, "Roberto Firmino", "roberto_firmino@gmail.com", "123456", "-"));

        ResponseEntity<Usuario> corpoDaResposta = testRestTemplate.exchange("/usuarios/cadastrar", HttpMethod.POST, corpoRequisicao, Usuario.class);

        assertEquals(HttpStatus.BAD_REQUEST, corpoDaResposta.getStatusCode());
    }

    @Test
    @DisplayName("🚀 Alterar Usuário!")
    public void deveAtualizarUsuario() {

        Optional<Usuario> usuarioCadastrado = usuarioService.cadastrarUsuario(new Usuario(0L, "Jorge Ben Jor", "jorgebenjor@gmail.com", "jorge1234", "-"));

        Usuario usuarioParaAtualizar = new Usuario(usuarioCadastrado.get().getId(), "Jorge Ben Jor", "jorge@gmail.com", "jorge1234", "teste123");

        HttpEntity<Usuario> request = new HttpEntity<Usuario>(usuarioParaAtualizar);

        ResponseEntity<Usuario> corpoDaResposta = testRestTemplate.withBasicAuth("root@root.com", "12345678")
                .exchange("/usuarios/atualizar", HttpMethod.PUT, request, Usuario.class);

        assertEquals(HttpStatus.OK, corpoDaResposta.getStatusCode());
    }

    @Test
    @DisplayName("🚀 Listar todos os Usuários!")
    public void deveMostrarTodosUsuarios() {

        usuarioService.cadastrarUsuario(new Usuario(0L, "Sabrina Sanchez", "sabrina@gmail.com", "123456", "-"));

        usuarioService.cadastrarUsuario(new Usuario(0L, "Ricardo Santos", "ricardo@gmail.com", "123456", "-"));

        ResponseEntity<String> corpoDaResposta = testRestTemplate.withBasicAuth("root@root.com", "12345678")
                .exchange("/usuarios/all", HttpMethod.GET, null, String.class);

        assertEquals(HttpStatus.OK, corpoDaResposta.getStatusCode());
    }
}

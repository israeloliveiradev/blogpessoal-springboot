package com.generation.blogpessoal.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

import java.util.List;

@Entity
@Table(name = "tb_usuario")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "O atributo NOME é Obrigatório!")
    private String nome;

    @NotBlank(message = "O atributo USUARIO é Obrigatório!")
    @Email(message = "O Atributo Usuário deve ser um email válido!")
    private String usuario;

    @NotBlank(message = "O atributo SENHA é Obrigatório!")
    @Size(min = 8, message = "A Senha deve ter no mínimo 8 caracteres")
    private String senha;

    @Size(max = 5000, message = "O link da foto não pode ser maior do que 5000 caracteres")
    private String foto;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "usuario", cascade = CascadeType.REMOVE)
    @JsonIgnoreProperties("usuario")
    private List<Postagem> postagem;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public @NotBlank(message = "O atributo NOME é Obrigatório!") String getNome() {
        return nome;
    }

    public void setNome(@NotBlank(message = "O atributo NOME é Obrigatório!") String nome) {
        this.nome = nome;
    }

    public @NotBlank(message = "O atributo USUARIO é Obrigatório!") @Email(message = "O Atributo Usuário deve ser um email válido!") String getUsuario() {
        return usuario;
    }

    public void setUsuario(@NotBlank(message = "O atributo USUARIO é Obrigatório!") @Email(message = "O Atributo Usuário deve ser um email válido!") String usuario) {
        this.usuario = usuario;
    }

    public @NotBlank(message = "O atributo SENHA é Obrigatório!") @Size(min = 8, message = "A Senha deve ter no mínimo 8 caracteres") String getSenha() {
        return senha;
    }

    public void setSenha(@NotBlank(message = "O atributo SENHA é Obrigatório!") @Size(min = 8, message = "A Senha deve ter no mínimo 8 caracteres") String senha) {
        this.senha = senha;
    }

    public @Size(max = 5000, message = "O link da foto não pode ser maior do que 5000 caracteres") String getFoto() {
        return foto;
    }

    public void setFoto(@Size(max = 5000, message = "O link da foto não pode ser maior do que 5000 caracteres") String foto) {
        this.foto = foto;
    }

    public List<Postagem> getPostagem() {
        return postagem;
    }

    public void setPostagem(List<Postagem> postagem) {
        this.postagem = postagem;
    }
}
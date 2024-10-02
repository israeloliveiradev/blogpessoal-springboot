<!--<p align="center">
    <em>
        (Coloque uma imagem que represente o seu Projeto)<br>
        (Insert an image that represents your Project)
    </em>
</p> -->

<br/>
<h1 align="center">Blog Pessoal Back-End</h1>

<div>
    <p align="center">
    <a href="https://www.linkedin.com/in/israeloliveiradev/" target="_blank">
        <img src="https://img.shields.io/static/v1?label=Author&message=Israel&color=00ba6d&style=for-the-badge&logo=LinkedIn" alt="Author:Israel">
    </a>
    <a href="#">
        <img src="https://img.shields.io/static/v1?label=Language&message=Java&color=red&style=for-the-badge&logo=openjdk" alt="Language: Java">
    </a>
    <a href="#">
        <img src="https://img.shields.io/static/v1?label=Framework&message=Spring Boot&color=green&style=for-the-badge&logo=Spring" alt="Framework: Spring Boot">
    </a>
    <a href="#">
        <img src="https://img.shields.io/static/v1?label=Database&message=MySQL&color=blue&style=for-the-badge&logo=MySQL" alt="Database: MySQL">
    </a>
    <a href="#">
        <img src="https://img.shields.io/static/v1?label=Deployment&message=Render&color=purple&style=for-the-badge&logo=Render" alt="Deployment: Render">
    </a>
    </p>
</div>

## Índice

<p align="center">
 <a href="#about">Sobre</a> •
 <a href="##features">Features</a> •
 <a href="#improvements">Melhorias em Andamento</a> • 
 <a href="#installation">Instalação</a> • 
 <a href="#technologies">Tecnologias</a> •
 <a href="#prints">Prints</a> •

</p>

## 📌 Sobre

<div>
    <p align="center">
    <em>
        O Blog Pessoal é um sistema back-end que oferece funcionalidades completas de CRUD para postagens e temas, além de recursos avançados de segurança para autenticação de usuários. Desenvolvido com Java e Spring Boot, utiliza MySQL para armazenamento de dados e é implantado no Render.<br><br>
        The Blog Pessoal is a back-end system providing full CRUD functionalities for posts and themes, along with advanced security features for user authentication. Developed with Java and Spring Boot, it uses MySQL for data storage and is deployed on Render.<br><br>
    </em>
    </p>
</div>

## 🚀 Features

<p align="center">

- CRUD Completo para Postagens e Temas
  - Criação: Adicione novas postagens e temas.
  - Leitura: Visualize postagens e temas existentes.
  - Atualização: Atualize postagens e temas conforme necessário.
  - Deleção: Exclua postagens e temas que não são mais necessários.
- **Autenticação e Autorização**: 
  - **Criação de Conta:** Permite aos usuários criar novas contas.
    - **Endpoint:** `/usuarios/cadastrar`
    - **Método:** POST
    - **Descrição:** Cria uma nova conta de usuário com e-mail, nome e senha.
    - **Corpo da Requisição:**
      ```json
      {
        "nome": "Nome do Usuário",
        "usuario": "email@dominio.com",
        "senha": "suaSenhaSegura",
        "foto": "linkParaFoto"
      }
      ```
    - **Resposta:** 
      - **Código de Sucesso:** 201 Created
      - **Mensagem:** "Usuário criado com sucesso"
      - **Código de Erro:** 400 Bad Request (se e-mail já estiver em uso ou dados inválidos)
  - **Login:** Usuários podem fazer login com credenciais seguras.
    - **Endpoint:** `/usuarios/logar`
    - **Método:** POST
    - **Descrição:** Autentica o usuário com e-mail e senha.
    - **Corpo da Requisição:**
      ```json
      {
        "usuario": "email@dominio.com",
        "senha": "suaSenhaSegura"
      }
      ```
    - **Resposta:** 
      - **Código de Sucesso:** 200 OK
      - **Mensagem:** Token de autenticação gerado
      - **Código de Erro:** 401 Unauthorized (se credenciais inválidas)
- Integração com MySQL: Banco de dados robusto para armazenamento de dados.
- **Testes Unitários:** Implementados com JUnit para garantir a qualidade do código.
- **Deploy:** Aplicação implantada no Render para fácil acesso.

</p>

## 👓 Melhorias em Andamento

<p align="center">

- Implementação de funcionalidades adicionais de segurança.
- Refatoração de código para melhorar a eficiência e manutenibilidade.
- Adição de novos recursos como suporte para múltiplos tipos de usuários e permissões.

</p>

## 📕 Instalação

<p align="center">
</p>

**Você deve ter instalado previamente.**
- [Java 17](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html)
- [Spring Boot](https://spring.io/projects/spring-boot)
- [MySQL](https://www.mysql.com/)

**Recomendações**
- É recomendado que você tenha instalado o Google Chrome ou o Edge.
- Eu recomendo usar uma IDE como IntelliJ IDEA ou Eclipse para desenvolvimento.

**Vamos dividir isso em 3 etapas.**
1. Clonar este repositório
2. Instalar as dependências
3. Inicializar o Back-End

### 1. Clone esse repositório

### 2. Instale as dependências
Navegue até o diretório do projeto e execute:

### 3. Inicialize o Back-End
Para iniciar a aplicação, execute:


## 🌐 Tecnologias

<p align="center">

- [Java](https://www.oracle.com/java/)
- [Spring Boot](https://spring.io/projects/spring-boot)
- [MySQL](https://www.mysql.com/)
- [JUnit](https://junit.org/junit4/) (para testes unitários)
- [Swagger](https://swagger.io/tools/swagger-ui/) (para documentação da API)
- [H2 Database](https://www.h2database.com/html/main.html) (para testes)

</p>

## 📷 Prints

<!-- Adicione prints relevantes aqui se disponíveis -->

</div>

Lançado em 2024.

Feito com Amor por [Israel Oliveira](https://www.linkedin.com/in/israeloliveiradev/) 🚀.



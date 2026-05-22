# Sistema de Biblioteca

Sistema de gerenciamento de biblioteca desenvolvido em Java, com funcionalidades de cadastro de livros, usuários e controle de empréstimos.

## Funcionalidades

- Cadastrar livros
- Cadastrar usuários
- Realizar empréstimo de livros
- Devolver livros
- Listar livros disponíveis

## Tecnologias

- Java 17
- Orientação a Objetos
- Arquitetura em camadas (Model, Repository, Service)

## Como rodar

1. Clone o repositório
2. Abra o projeto no IntelliJ IDEA
3. Execute o arquivo `Main.java`

## Estrutura do projeto

```
src/
├── model/
│   ├── Livro.java
│   ├── Usuario.java
│   └── Emprestimo.java
├── repository/
│   ├── LivroRepository.java
│   ├── UsuarioRepository.java
│   └── EmprestimoRepository.java
├── service/
│   └── BibliotecaService.java
└── Main.java
```

## Autora

Thamires Barbosa

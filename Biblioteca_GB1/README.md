# Sistema de Biblioteca

- Java (`OpenJDK 17`)
- IntelliJ IDEA `2026.1`
- CachyOS (`6.19.11-1-cachyos (64-bit)`)

Projeto simples de gerenciamento de biblioteca com foco em POO. Trabalho GB1 de Paradigmas de Programação 2026/1.

## Estrutura

- `src/Livro.java`
- `src/Usuario.java`
- `src/Aluno.java`
- `src/Professor.java`
- `src/Emprestimo.java`
- `src/BibliotecaService.java`
- `src/Main.java`

## Como executar

### Pré-requisitos

- Java 17 instalado e configurado no PATH
- Terminal ou prompt de comando
- (Opcional) IDE para facilitar a execução

### Passos para execução via terminal

```bash
cd /<local até o projeto>/Biblioteca_GB1
javac src/*.java
java -cp src Main
```

## Cenarios simulados

- Cadastro de livros
- Cadastro de aluno e professor
- Empréstimo com validação de disponibilidade
- Devolução e atualização de disponibilidade
- Exibição de resumo do empréstimo e dados dos usuários


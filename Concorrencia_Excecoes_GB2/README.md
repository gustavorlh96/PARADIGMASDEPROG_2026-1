# Trabalho Concorrência e Tratamento de Exceções

- Java (`OpenJDK 17`)
- IntelliJ IDEA `2026.1`
- CachyOS (`6.19.11-1-cachyos (64-bit)`)

Projeto com três exercícios sobre threads com variável compartilhada, tratamento de exceções e exceções customizadas. Trabalho de Paradigmas de Programacao 2026/1.

## Estrutura

- `src/ContadorSemProtecao.java` - Exercício 1a: threads sem proteção
- `src/ContadorComProtecao.java` - Exercício 1b: threads com Lock
- `src/Divisao.java` - Exercício 2: divisão com tratamento de exceção
- `src/IdadeInvalidaException.java` - Exercício 3: exceção customizada
- `src/ValidadorIdade.java` - Exercício 3: validação de idade
- `src/Main.java` - Classe principal

## Como executar

### Pré-requisitos

- Java 17 instalado e configurado no PATH
- Terminal ou prompt de comando
- (Opcional) IDE para facilitar a execução

### Passos para execução via terminal

```bash
cd /<local ate o projeto>/Concorrencia_Excecoes_GB2
javac src/*.java
java -cp src Main
```

## Exercícios

### 1 - Threads e Contador Compartilhado

Duas threads incrementam uma variável global 1000 vezes cada:
- **a)** Sem proteção: demonstra race condition
- **b)** Com proteção: usa `ReentrantLock` para sincronizar o acesso

### 2 - Divisão com Exceção

Método que realiza divisão e captura a exceção quando o divisor é zero, exibindo mensagem personalizada.

### 3 - IdadeInvalidaException

Exceção customizada disparada quando a idade é menor que 18 ou maior que 100.

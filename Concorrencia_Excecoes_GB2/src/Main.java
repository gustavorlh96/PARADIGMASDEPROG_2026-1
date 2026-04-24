public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("========================================");
        System.out.println("  Exercicio 1 - Threads e Contador");
        System.out.println("========================================\n");

        ContadorSemProtecao.executar();
        ContadorComProtecao.executar();

        System.out.println("Comparacao: Sem protecao, o valor final pode ser menor que 200000 devido");
        System.out.println("a condicao de corrida (race condition), onde ambas as threads leem e");
        System.out.println("escrevem na variavel ao mesmo tempo, perdendo incrementos. Com o uso");
        System.out.println("de Lock, o acesso a variavel e sincronizado, garantindo que apenas uma");
        System.out.println("thread por vez modifique o contador, resultando sempre no valor correto.\n");

        System.out.println("========================================");
        System.out.println("  Exercicio 2 - Divisao com Excecao");
        System.out.println("========================================\n");

        Divisao.dividir(10, 2);
        Divisao.dividir(7, 0);
        System.out.println();

        System.out.println("========================================");
        System.out.println("  Exercicio 3 - IdadeInvalidaException");
        System.out.println("========================================\n");

        int[] idades = {15, 25, 105};
        for (int idade : idades) {
            try {
                ValidadorIdade.verificarIdade(idade);
            } catch (IdadeInvalidaException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}

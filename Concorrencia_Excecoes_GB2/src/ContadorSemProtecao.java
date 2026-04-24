public class ContadorSemProtecao {
    static int contador = 0;

    public static void executar() throws InterruptedException {
        contador = 0;

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 100000; i++) {
                contador++;
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 100000; i++) {
                contador++;
            }
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println("=== Sem Protecao ===");
        System.out.println("Valor esperado: 200000");
        System.out.println("Valor obtido:   " + contador);
        System.out.println();
    }
}

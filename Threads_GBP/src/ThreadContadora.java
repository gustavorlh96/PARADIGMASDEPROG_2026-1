public class ThreadContadora {
    static int contadorSemProtecao = 0;
    static int contadorComProtecao = 0;
    static final Object lock = new Object();

    public static void main(String[] args) throws InterruptedException {

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 300000; i++) contadorSemProtecao++;
        });
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 300000; i++) contadorSemProtecao++;
        });

        Thread t3 = new Thread(() -> {
            for (int i = 0; i < 300000; i++) {
                synchronized (lock) { contadorComProtecao++; }
            }
        });
        Thread t4 = new Thread(() -> {
            for (int i = 0; i < 300000; i++) {
                synchronized (lock) { contadorComProtecao++; }
            }
        });

        t1.start(); t2.start();
        t3.start(); t4.start();

        t1.join(); t2.join();
        t3.join(); t4.join();

        System.out.println("Total sem proteção: " + contadorSemProtecao);
        System.out.println("Total com proteção: " + contadorComProtecao);
    }
}
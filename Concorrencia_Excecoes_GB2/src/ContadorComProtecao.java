import java.util.concurrent.locks.ReentrantLock;

public class ContadorComProtecao {
    static int contador = 0;
    static final ReentrantLock lock = new ReentrantLock();

    public static void executar() throws InterruptedException {
        contador = 0;

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 100000; i++) {
                lock.lock();
                try {
                    contador++;
                } finally {
                    lock.unlock();
                }
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 100000; i++) {
                lock.lock();
                try {
                    contador++;
                } finally {
                    lock.unlock();
                }
            }
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println("=== Com Protecao (Lock) ===");
        System.out.println("Valor esperado: 200000");
        System.out.println("Valor obtido:   " + contador);
        System.out.println();
    }
}

public class Main {

    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria("João", 1000.0f);
        ContaBancaria conta2 = new ContaBancaria("Maria", 500.0f);

        conta1.depositar(200.0f);
        conta1.sacar(150.0f);
        conta1.mostrar_saldo();

        conta2.depositar(300.0f);
        conta2.sacar(100.0f);
        conta2.mostrar_saldo();
    }
}

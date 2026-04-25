public class ContaBancaria {
    private String titular;
    private float saldo;

    public ContaBancaria(String titular, float saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    public void depositar(float valor) {
        if (valor > 0) {
            this.saldo += valor;
        }
    }

    public void sacar(float valor) {
        if (valor > 0 && this.saldo >= valor) {
            this.saldo -= valor;
        } else {
            System.out.println("Erro: Saldo insuficiente para efetuar o saque.");
        }
    }

    public void mostrar_saldo() {
        System.out.println("Saldo atual de " + this.titular + ": R$ " + this.saldo);
    }
}
public class Divisao {
    public static void dividir(double dividendo, double divisor) {
        try {
            if (divisor == 0) {
                throw new ArithmeticException();
            }
            double resultado = dividendo / divisor;
            System.out.println(dividendo + " / " + divisor + " = " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Erro: nao e possivel dividir por zero!");
        }
    }
}

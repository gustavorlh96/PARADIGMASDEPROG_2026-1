public class ValidadorIdade {
    public static void verificarIdade(int idade) throws IdadeInvalidaException {
        if (idade < 18) {
            throw new IdadeInvalidaException("Idade invalida: " + idade + ". A idade minima e 18 anos.");
        }
        if (idade > 100) {
            throw new IdadeInvalidaException("Idade invalida: " + idade + ". A idade maxima e 100 anos.");
        }
        System.out.println("Idade " + idade + " e valida.");
    }
}

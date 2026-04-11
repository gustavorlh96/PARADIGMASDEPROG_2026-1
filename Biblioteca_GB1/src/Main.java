import java.time.LocalDate;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        BibliotecaService biblioteca = new BibliotecaService();

        Livro livro1 = new Livro("Introducao a POO", "Fulano de Tal", "978-00-0000-000-1");
        Livro livro2 = new Livro("Padroes de Projeto", "Beltrano Silva", "978-00-0000-000-2");
        biblioteca.cadastrarLivro(livro1);
        biblioteca.cadastrarLivro(livro2);

        Usuario aluno = new Aluno("Joao Silva", "A001", "Ciencia da Computacao");
        Usuario professor = new Professor("Maria Souza", "P001", "Engenharia de Software");
        biblioteca.cadastrarUsuario(aluno);
        biblioteca.cadastrarUsuario(professor);

        System.out.println("=== Livros Cadastrados ===");
        biblioteca.listarLivros().forEach(livro -> System.out.println(livro.exibirInformacoes()));

        System.out.println("\n=== Usuarios Cadastrados ===");
        biblioteca.listarUsuarios().forEach(usuario ->
                System.out.println("Nome: " + usuario.getNome() + " | ID: " + usuario.getId() + " | Tipo: " + usuario.exibirTipoUsuario())
        );

        System.out.println("\n=== Emprestimo 1 ===");
        Optional<Emprestimo> emprestimoAluno = biblioteca.realizarEmprestimo(livro1, aluno, LocalDate.of(2026, 4, 10));
        if (emprestimoAluno.isPresent()) {
            System.out.println("Livro emprestado com sucesso!");
            System.out.println(emprestimoAluno.get().exibirResumoEmprestimo());
        } else {
            System.out.println("Livro indisponivel para emprestimo.");
        }

        System.out.println("\n=== Tentativa de Emprestimo com Livro Indisponivel ===");
        Optional<Emprestimo> emprestimoProfessor = biblioteca.realizarEmprestimo(livro1, professor, LocalDate.of(2026, 4, 11));
        if (emprestimoProfessor.isPresent()) {
            System.out.println("Livro emprestado com sucesso!");
        } else {
            System.out.println("Livro indisponivel para emprestimo.");
        }

        System.out.println("\n=== Devolucao ===");
        emprestimoAluno.ifPresent(emprestimo -> {
            boolean devolvido = biblioteca.realizarDevolucao(emprestimo, LocalDate.of(2026, 4, 15));
            if (devolvido) {
                System.out.println("Livro devolvido com sucesso!");
                System.out.println(emprestimo.exibirResumoEmprestimo());
            }
        });

        System.out.println("\n=== Novo Emprestimo apos Devolucao ===");
        Optional<Emprestimo> novoEmprestimoProfessor = biblioteca.realizarEmprestimo(livro1, professor, LocalDate.of(2026, 4, 16));
        if (novoEmprestimoProfessor.isPresent()) {
            System.out.println("Livro emprestado com sucesso!");
            System.out.println(novoEmprestimoProfessor.get().exibirResumoEmprestimo());
        } else {
            System.out.println("Livro indisponivel para emprestimo.");
        }
    }
}
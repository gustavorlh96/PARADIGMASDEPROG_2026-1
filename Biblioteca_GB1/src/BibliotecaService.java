import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class BibliotecaService {
    private final List<Livro> livros = new ArrayList<>();
    private final List<Usuario> usuarios = new ArrayList<>();
    private final List<Emprestimo> emprestimos = new ArrayList<>();

    public void cadastrarLivro(Livro livro) {
        livros.add(livro);
    }

    public void cadastrarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    public Optional<Emprestimo> realizarEmprestimo(Livro livro, Usuario usuario, LocalDate dataEmprestimo) {
        if (!livro.emprestar()) {
            return Optional.empty();
        }

        Emprestimo emprestimo = new Emprestimo(livro, usuario, dataEmprestimo);
        emprestimos.add(emprestimo);
        return Optional.of(emprestimo);
    }

    public boolean realizarDevolucao(Emprestimo emprestimo, LocalDate dataDevolucao) {
        if (!emprestimos.contains(emprestimo)) {
            return false;
        }

        emprestimo.getLivro().devolver();
        emprestimo.registrarDevolucao(dataDevolucao);
        return true;
    }

    public List<Livro> listarLivros() {
        return List.copyOf(livros);
    }

    public List<Usuario> listarUsuarios() {
        return List.copyOf(usuarios);
    }
}


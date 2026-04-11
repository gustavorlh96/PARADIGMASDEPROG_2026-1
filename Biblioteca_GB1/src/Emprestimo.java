import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

public class Emprestimo {
    private static final DateTimeFormatter FORMATO_DATA = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    private final Livro livro;
    private final Usuario usuario;
    private final LocalDate dataEmprestimo;
    private LocalDate dataDevolucao;

    public Emprestimo(Livro livro, Usuario usuario, LocalDate dataEmprestimo) {
        this.livro = Objects.requireNonNull(livro, "livro nao pode ser nulo");
        this.usuario = Objects.requireNonNull(usuario, "usuario nao pode ser nulo");
        this.dataEmprestimo = Objects.requireNonNull(dataEmprestimo, "dataEmprestimo nao pode ser nula");
    }

    public void registrarDevolucao(LocalDate dataDevolucao) {
        this.dataDevolucao = Objects.requireNonNull(dataDevolucao, "dataDevolucao nao pode ser nula");
    }

    public String exibirResumoEmprestimo() {
        return "Resumo do Emprestimo:\n"
                + "Livro: " + livro.getTitulo() + "\n"
                + "Usuario: " + usuario.getNome() + " (" + usuario.exibirTipoUsuario() + ")\n"
                + "Data do Emprestimo: " + dataEmprestimo.format(FORMATO_DATA) + "\n"
                + "Data da Devolucao: "
                + (dataDevolucao == null ? "Pendente" : dataDevolucao.format(FORMATO_DATA));
    }

    public Livro getLivro() {
        return livro;
    }
}


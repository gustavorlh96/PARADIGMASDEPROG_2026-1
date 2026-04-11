import java.util.Objects;

public class Livro {
    private final String titulo;
    private final String autor;
    private final String isbn;
    private boolean disponivel;

    public Livro(String titulo, String autor, String isbn) {
        this.titulo = Objects.requireNonNull(titulo, "titulo nao pode ser nulo");
        this.autor = Objects.requireNonNull(autor, "autor nao pode ser nulo");
        this.isbn = Objects.requireNonNull(isbn, "isbn nao pode ser nulo");
        this.disponivel = true;
    }

    public boolean emprestar() {
        if (!disponivel) {
            return false;
        }
        disponivel = false;
        return true;
    }

    public void devolver() {
        disponivel = true;
    }

    public String exibirInformacoes() {
        return String.format(
                "Livro: %s | Autor: %s | ISBN: %s | Disponivel: %s",
                titulo,
                autor,
                isbn,
                disponivel ? "Sim" : "Nao"
        );
    }

    public String getTitulo() {
        return titulo;
    }

    public boolean isDisponivel() {
        return disponivel;
    }
}


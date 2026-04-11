import java.util.Objects;

public class Aluno extends Usuario {
    private final String curso;

    public Aluno(String nome, String id, String curso) {
        super(nome, id);
        this.curso = Objects.requireNonNull(curso, "curso nao pode ser nulo");
    }

    @Override
    public String exibirTipoUsuario() {
        return "Aluno";
    }

    public String getCurso() {
        return curso;
    }
}


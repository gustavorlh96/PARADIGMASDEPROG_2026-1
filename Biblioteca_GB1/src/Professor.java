import java.util.Objects;

public class Professor extends Usuario {
    private final String departamento;

    public Professor(String nome, String id, String departamento) {
        super(nome, id);
        this.departamento = Objects.requireNonNull(departamento, "departamento nao pode ser nulo");
    }

    @Override
    public String exibirTipoUsuario() {
        return "Professor";
    }

    public String getDepartamento() {
        return departamento;
    }
}


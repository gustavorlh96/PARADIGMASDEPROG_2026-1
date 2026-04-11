import java.util.Objects;

public abstract class Usuario {
    private final String nome;
    private final String id;

    protected Usuario(String nome, String id) {
        this.nome = Objects.requireNonNull(nome, "nome nao pode ser nulo");
        this.id = Objects.requireNonNull(id, "id nao pode ser nulo");
    }

    public abstract String exibirTipoUsuario();

    public String getNome() {
        return nome;
    }

    public String getId() {
        return id;
    }
}


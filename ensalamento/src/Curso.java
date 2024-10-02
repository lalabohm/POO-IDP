import java.util.UUID;

public class Curso {
    private final UUID cursoId;
    private String nome;

    public Curso(String nome){
        this.cursoId = UUID.randomUUID();
        this.nome = nome;
    }

    public UUID getCursoId() {
        return cursoId;
    }

    public String getNome() {
        return nome;
    }

}

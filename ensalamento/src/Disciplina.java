import java.util.UUID;

public class Disciplina {
    private final UUID disciplinaId;
    private String nome;
    private Curso curso;

    public Disciplina(String nome, Curso curso){
        this.disciplinaId = UUID.randomUUID();
        this.nome = nome;
        this.curso = curso;
    }

    public UUID getDisciplinaId(){
        return disciplinaId;
    }

    public String getNome(){
        return nome;
    }

    public Curso getCurso() {
        return curso;
    }
}

import java.util.UUID;

public class Aluno extends Pessoa {

    private final UUID alunoId;
    private Curso curso;

    public Aluno(String nome, Curso curso){
       super(nome);
       this.alunoId = UUID.randomUUID();
       this.curso = curso;
    }

    public UUID getAlunoId(){
        return alunoId;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }
}

import java.util.UUID;

public class Professor extends Pessoa {

    private final UUID professorId;
    private Disciplina disciplina;

    public Professor(String nome, Disciplina disciplina){
        super(nome);
        this.professorId = UUID.randomUUID();
        this.disciplina = disciplina;
    }

    public UUID getProfessorId(){
        return professorId;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }
}


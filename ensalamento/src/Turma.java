import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Turma {
    private final UUID turmaId;
    private String nome;
    private Professor professor;
    private Disciplina disciplina;
    private List<Aluno> alunos;

    public Turma(Professor professor, Disciplina disciplina){
        this.turmaId = UUID.randomUUID();
        this.nome = nome;
        this.professor = professor;
        this.disciplina = disciplina;
        this.alunos = new ArrayList<>();
    }

    public UUID getTurmaId(){
        return turmaId;
    }

    public String getNome() {
        return nome;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void adicionarAluno(Aluno aluno){
        alunos.add(aluno);
    }

    public void removerAluno(Aluno aluno){
        alunos.remove(aluno);
    }

    public void exibirInfo() {
        System.out.println("Turma: " + nome);
        System.out.println("Disciplina: " + disciplina.getNome());
        System.out.println("Alunos:");
        for (Aluno aluno : alunos) {
            System.out.println(aluno.getNome());
        }
    }
}

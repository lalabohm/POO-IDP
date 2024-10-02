import java.util.List;

public class Ensalamento {

    public void realizarEnsalamento(List<Aluno> alunos, List<Turma> turmas) {
        for (Aluno aluno : alunos) {
            for (Turma turma : turmas) {
                if (aluno.getCurso().equals(turma.getDisciplina().getCurso())) {
                    turma.adicionarAluno(aluno);
                }
            }
        }
    }

    public void exibirResultado(List<Turma> turmas) {
        for (Turma turma : turmas) {
            turma.exibirInfo();
        }
    }
}

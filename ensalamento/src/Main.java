import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Cursos
        Curso ti = new Curso("TI");
        Curso adm = new Curso("ADM");

        // Disciplinas
        Disciplina poo = new Disciplina("POO", ti);
        Disciplina estruturaDados = new Disciplina("Estrutura de Dados", ti);
        Disciplina bi = new Disciplina("BI", adm);

        // Professores
        Professor profMia = new Professor("Mia", poo);
        Professor profSaulo = new Professor("Saulo", estruturaDados);
        Professor profPaula = new Professor("Paula", bi);

        // Alunos
        List<Aluno> alunos = new ArrayList<>();
        alunos.add(new Aluno("Alfredo", ti));
        alunos.add(new Aluno("Amélia", ti));
        alunos.add(new Aluno("Ana", adm));
        alunos.add(new Aluno("Bruno", ti));
        alunos.add(new Aluno("Bentinho", adm));
        alunos.add(new Aluno("Capitú", ti));
        alunos.add(new Aluno("Debra", ti));
        alunos.add(new Aluno("Ian", adm));
        alunos.add(new Aluno("Iracema", ti));
        alunos.add(new Aluno("Joelmir", adm));
        alunos.add(new Aluno("Julieta", ti));
        alunos.add(new Aluno("Luana", adm));
        alunos.add(new Aluno("Luciana", ti));
        alunos.add(new Aluno("Majô", adm));
        alunos.add(new Aluno("Maria", adm));
        alunos.add(new Aluno("Norberto", ti));
        alunos.add(new Aluno("Paulo", adm));
        alunos.add(new Aluno("Romeu", adm));
        alunos.add(new Aluno("Wendel", ti));
        alunos.add(new Aluno("Zoey", ti));

        List<Turma> turmas = new ArrayList<>();
        turmas.add(new Turma(profMia, poo));
        turmas.add(new Turma(profSaulo, estruturaDados));
        turmas.add(new Turma(profPaula, bi));

        Ensalamento ensalamento = new Ensalamento();

        ensalamento.realizarEnsalamento(alunos, turmas);

        ensalamento.exibirResultado(turmas);
    }
}

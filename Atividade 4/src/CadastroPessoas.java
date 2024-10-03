import java.util.ArrayList;

public class CadastroPessoas {
    private ArrayList<Pessoa> pessoas = new ArrayList<>();

    public void cadastraPessoa(Pessoa p) {
        pessoas.add(p);
    }

    public void imprimeCadastro() {
        for (Pessoa p : pessoas) {
            p.imprimeDados();
        }
    }

    public void acessarPessoaPorIndice(int indice) {
        try {
            Pessoa pessoa = pessoas.get(indice);
            pessoa.imprimeDados();
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Erro: Índice fora dos limites do array!");
        }
    }
}

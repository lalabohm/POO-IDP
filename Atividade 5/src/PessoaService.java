import java.util.ArrayList;

public class PessoaService {
    private ArrayList<Pessoa> pessoas = new ArrayList<>();
    private static final int MAX_FUNCIONARIOS = 7;
    private static final int MAX_GERENTES = 1;
    private int gerenteCount = 0;
    private int funcionarioCount = 0;

    public void cadastraPessoa(Pessoa p) throws QuantidadeExcedidaException {
        if (p instanceof Gerente) {
            if (gerenteCount >= MAX_GERENTES) {
                throw new QuantidadeExcedidaException("Gerente");
            }
            gerenteCount++;
        } else if (p instanceof Funcionario) {
            if (funcionarioCount >= MAX_FUNCIONARIOS) {
                throw new QuantidadeExcedidaException("Funcionario");
            }
            funcionarioCount++;
        }
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


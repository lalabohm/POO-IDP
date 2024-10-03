public class Main {
    public static void main(String[] args) {

        CadastroPessoas cadastro = new CadastroPessoas();

        Data data1 = new Data(12, 5, 2005);
        Cliente cliente = new Cliente ("Larissa", data1, 123);

        Data data2 = new Data(19, 4, 2003);
        Funcionario funcionario = new Funcionario("Rafael", data2, 5000f);

        Data data3 = new Data(31, 1, 2005);
        Gerente gerente = new Gerente("Lana", data3, 10000f, "TI");

        cadastro.cadastraPessoa(cliente);
        cadastro.cadastraPessoa(funcionario);
        cadastro.cadastraPessoa(gerente);

        cadastro.imprimeCadastro();

        System.out.println("\nAcessando pessoa de indice 1...");
        cadastro.acessarPessoaPorIndice(1);

        System.out.println("\nO índice é inválido ");
        cadastro.acessarPessoaPorIndice(5);
    }
}
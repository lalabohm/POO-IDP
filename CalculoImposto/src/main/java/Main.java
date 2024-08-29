public class Main {
    public static void main(String[] args) {
        // Massa de dados fixa (hard-coded)
        Item produto = new Item("Computador", 3000.00, true);
        Item servico = new Item("Consultoria", 1500.00, false);

        ISS iss = new ISS();
        ICMS icms = new ICMS();
        IPI ipi = new IPI();

        OperacaoComercial operacaoProduto = new OperacaoComercial(produto, iss, icms, ipi);
        OperacaoComercial operacaoServico = new OperacaoComercial(servico, iss, icms, ipi);

        // Mostrar detalhes das operações
        System.out.println("Detalhes da Operação Comercial - Produto:");
        operacaoProduto.mostrarDetalhes();
        System.out.println();

        System.out.println("Detalhes da Operação Comercial - Serviço:");
        operacaoServico.mostrarDetalhes();
    }
}


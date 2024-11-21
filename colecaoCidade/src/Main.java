public class Main {
    public static void main(String[] args) {
        AgrupadorCidades agrupador = new AgrupadorCidades();


        agrupador.adicionarCidade("DF", "Brasília", true);
        agrupador.adicionarCidade("SP", "São Paulo", true);
        agrupador.adicionarCidade("SP", "Campinas", false);
        agrupador.adicionarCidade("RJ", "Rio de Janeiro", true);
        agrupador.adicionarCidade("RJ", "Niterói", false);
        agrupador.adicionarCidade("MG", "Belo Horizonte", true);
        agrupador.adicionarCidade("MG", "Uberlândia", false);

        // Estrutura 1:
        System.out.println("=== Estrutura 1 ===");
        agrupador.imprimirCidadesPorUFOrdenadas();

        // Estrutura 2:
        System.out.println("\n=== Estrutura 2 ===");
        agrupador.listarCidadesPorUF("SP");
        agrupador.listarCidadesPorUF("RJ");
        agrupador.listarCidadesPorUF("MG");

        // Estrutura 3:
        System.out.println("\n=== Estrutura 3 ===");
        agrupador.listarCidadesDecrescente();
    }
}

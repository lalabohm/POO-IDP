class OperacaoComercial {
    private Item item;
    private ISS iss;
    private ICMS icms;
    private IPI ipi;

    public OperacaoComercial(Item item, ISS iss, ICMS icms, IPI ipi) {
        this.item = item;
        this.iss = iss;
        this.icms = icms;
        this.ipi = ipi;
    }

    public double calcularValorTotal() {
        double valorBase = item.getValor();
        double valorImpostos = 0;

        if (item.isProduto()) {
            valorImpostos += icms.calcular(valorBase);
            valorImpostos += ipi.calcular(valorBase);
        } else {
            valorImpostos += iss.calcular(valorBase);
            valorImpostos += icms.calcular(valorBase);
        }

        return valorBase + valorImpostos;
    }

    public void mostrarDetalhes() {
        double valorBase = item.getValor();
        System.out.println("Item: " + item.getNome());
        System.out.println("Valor base: R$" + valorBase);

        double valorImpostos = 0;
        if (item.isProduto()) {
            double valorICMS = icms.calcular(valorBase);
            double valorIPI = ipi.calcular(valorBase);
            valorImpostos += valorICMS + valorIPI;
            System.out.println("Imposto (ICMS): R$" + valorICMS);
            System.out.println("Imposto (IPI): R$" + valorIPI);
        } else {
            double valorISS = iss.calcular(valorBase);
            double valorICMS = icms.calcular(valorBase);
            valorImpostos += valorISS + valorICMS;
            System.out.println("Imposto (ISS): R$" + valorISS);
            System.out.println("Imposto (ICMS): R$" + valorICMS);
        }

        double valorTotal = valorBase + valorImpostos;
        System.out.println("Valor total: R$" + valorTotal);
    }
}

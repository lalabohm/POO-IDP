class bombaCombustivel {
    private String tipoCombustivel;
    private double valorLitro;
    private double quantidadeCombustivel;
    private double valorTotalAbastecido = 0;

    public bombaCombustivel(String tipoCombustivel, double valorLitro, double quantidadeCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
        this.valorLitro = valorLitro;
        this.quantidadeCombustivel = quantidadeCombustivel;
    }

    public void abastecerPorValor(double valor) {
        double litros = valor / valorLitro;
        if (litros <= quantidadeCombustivel) {
            quantidadeCombustivel -= litros;
            valorTotalAbastecido += valor;
            System.out.println("Você abasteceu " + litros + " litros.");
        } else {
            System.out.println("Quantidade de combustível insuficiente na bomba.");
        }
    }

    public void abastecerPorLitro(double litros) {
        double valor = litros * valorLitro;
        if (litros <= quantidadeCombustivel) {
            quantidadeCombustivel -= litros;
            valorTotalAbastecido += valor;
            System.out.println("O valor a ser pago é: R$ " + valor);
        } else {
            System.out.println("Quantidade de combustível insuficiente na bomba.");
        }
    }

    public void alterarValor(double novoValor) {
        valorLitro = novoValor;
        System.out.println("Valor por litro alterado para R$ " + novoValor);
    }

    public void alterarCombustivel(String novoCombustivel) {
        tipoCombustivel = novoCombustivel;
        System.out.println("Tipo de combustível alterado para: " + novoCombustivel);
    }

    public void alterarQuantidadeCombustivel(double novaQuantidade) {
        quantidadeCombustivel = novaQuantidade;
        System.out.println("Quantidade de combustível restante alterada para: " + novaQuantidade + " litros.");
    }

    public double getValorTotalAbastecido() {
        return valorTotalAbastecido;
    }
}

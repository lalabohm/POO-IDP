public class ClienteVip extends Cliente {
    private double percentualDesconto;

    public ClienteVip(String nome, Data nascimento, int codigo, double percentualDesconto) {
        super(nome, nascimento, codigo);
        this.percentualDesconto = percentualDesconto;
    }

    public double getPercentualDesconto() {
        return percentualDesconto;
    }

    @Override
    public void imprimeDados() {
        System.out.println("Cliente VIP: " + nome + ", Código: " + codigo + ", Percentual de Desconto: " + percentualDesconto + "%, Nascimento: " + nascimento);
    }
}


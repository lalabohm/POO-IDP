class Produto {
    private int id;
    private String tipo;
    private String descricao;
    private double peso;
    private int quantidade;
    private String unidadeMedida;

    public Produto(String tipo, String descricao, double peso, int quantidade, String unidadeMedida) {
        this.tipo = tipo;
        this.descricao = descricao;
        this.peso = peso;
        this.quantidade = quantidade;
        this.unidadeMedida = unidadeMedida;
    }

    public Produto(int id, String tipo, String descricao, double peso, int quantidade, String unidadeMedida) {
        this.id = id;
        this.tipo = tipo;
        this.descricao = descricao;
        this.peso = peso;
        this.quantidade = quantidade;
        this.unidadeMedida = unidadeMedida;
    }

    @Override
    public String toString() {
        return "Produto [id=" + id + ", tipo=" + tipo + ", descricao=" + descricao +
                ", peso=" + peso + ", quantidade=" + quantidade + ", unidadeMedida=" + unidadeMedida + "]";
    }
}


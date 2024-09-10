class Furgao extends Veiculo {

    public Furgao(double peso) {
        super(peso);
    }

    @Override
    public double calcularTarifa() {
        if (peso <= 3000) {
            return 25.00;  // Furgão não carregado
        } else {
            return 50.00;  // Furgão carregado
        }
    }
}

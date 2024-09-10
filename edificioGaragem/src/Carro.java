class Carro extends Veiculo {

    public Carro(double peso) {
        super(peso);
    }

    @Override
    public double calcularTarifa() {
        if (peso <= 2000) {
            return 13.00;
        } else if (peso <= 2000) {
            return 15.00;
        } else {
            return 20.00;  // SUV
        }
    }
}


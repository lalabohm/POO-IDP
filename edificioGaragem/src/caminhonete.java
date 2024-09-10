class Caminhonete extends Veiculo {

    public Caminhonete(double peso) {
        super(peso);
    }

    @Override
    public double calcularTarifa() {
        if (peso <= 3000) {
            return 25.00;
        } else {
            return 50.00;
        }
    }
}


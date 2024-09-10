abstract class Veiculo {
    protected double peso;

    public Veiculo(double peso) {
        this.peso = peso;
    }

    public abstract double calcularTarifa();
}

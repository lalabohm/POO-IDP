public class QuantidadeExcedidaException extends Exception {
    public QuantidadeExcedidaException(String tipoPessoa) {
        super("Quantidade máxima de " + tipoPessoa + "s excedida.");
    }
}

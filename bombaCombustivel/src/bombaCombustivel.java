public class bombaCombustivel {
    public string tipoCombustivel;
    public float valorLitro;
    public double quantidadeCombustivel;

    public void abastecerPorValor(double valor) {
        double litrosAbastecidos = valor / valorLitro;
        quantidadeCombustivel += litrosAbastecidos;
        System.out.println("Abastecido: " + litrosAbastecidos + " litros de " + tipoCombustivel);
    }


    public void abastecerPorLitro(double quantidade) {
        double precoPagar = quantidade * valorLitro;
        System.out.println("Valor a ser pago: R$ " + precoPagar);
        quantidadeCombustivel += quantidade;
    }

    public void alterarValor(double valor){

    }



}

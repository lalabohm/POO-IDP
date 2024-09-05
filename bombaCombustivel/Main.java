import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        bombaCombustivel bomba = new bombaCombustivel("Gasolina", 5.0, 100.0);

        while (true) {
            System.out.println("Escolha uma operação:");
            System.out.println("1. Abastecer por valor");
            System.out.println("2. Abastecer por litro");
            System.out.println("3. Alterar valor por litro");
            System.out.println("4. Alterar tipo de combustível");
            System.out.println("5. Alterar quantidade de combustível");
            System.out.println("6. Ver valor total abastecido");
            System.out.println("7. Sair");

            int opcao = scanner.nextInt();

            if (opcao == 1) {
                System.out.print("Informe o valor para abastecimento: ");
                double valor = scanner.nextDouble();
                bomba.abastecerPorValor(valor);
            } else if (opcao == 2) {
                System.out.print("Informe a quantidade de litros para abastecimento: ");
                double litros = scanner.nextDouble();
                bomba.abastecerPorLitro(litros);
            } else if (opcao == 3) {
                System.out.print("Informe o novo valor por litro: ");
                double novoValor = scanner.nextDouble();
                bomba.alterarValor(novoValor);
            } else if (opcao == 4) {
                System.out.print("Informe o novo tipo de combustível: ");
                String novoCombustivel = scanner.next();
                bomba.alterarCombustivel(novoCombustivel);
            } else if (opcao == 5) {
                System.out.print("Informe a nova quantidade de combustível: ");
                double novaQuantidade = scanner.nextDouble();
                bomba.alterarQuantidadeCombustivel(novaQuantidade);
            } else if (opcao == 6) {
                System.out.println("Valor total abastecido na bomba: R$ " + bomba.getValorTotalAbastecido());
            } else if (opcao == 7) {
                System.out.println("Saindo...");
                break;
            } else {
                System.out.println("Opção inválida.");
            }
        }

        scanner.close();
    }
}


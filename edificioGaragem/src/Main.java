import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Seja bem-vindo(a)!");
            System.out.println(" ");
            System.out.println("Selecione uma das opções:");
            System.out.println("1. Conferir o preço das tarifas");
            System.out.println("2. Adicionar um novo veículo.");
            System.out.println("3. Sair");

            int escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    conferirPrecoTarifas(scanner);
                    break;

                case 2:
                    Estacionamento.estacionarVeiculo();
                    break;

                case 3:
                    System.out.println("Saindo do sistema... Até logo!");
                    scanner.close();  // Fecha o scanner
                    return;  // Sai do loop e encerra o programa

                default:
                    System.out.println("Opção inválida. Por favor, tente novamente.");
            }
        }
    }

    public static void conferirPrecoTarifas(Scanner scanner) {
        System.out.println("Preços das tarifas:");
        System.out.println("Motocicleta leve: R$ 2,00 por hora.");
        System.out.println("Motocicleta padrão: R$ 4,00 por hora.");
        System.out.println("Motocicleta pesada:  R$ 10,00 por hora.");
        System.out.println("Carro de passeio hatchback:  R$ 13,00 por hora.");
        System.out.println("Carro de passeio sedan:  R$ 15,00 por hora.");
        System.out.println("Carro SUV:  R$ 20,00 por hora.");
        System.out.println("Caminhonete não carregada:  R$ 25,00 por hora.");
        System.out.println("Caminhonete carregada:  R$ 50,00 por hora.");
        System.out.println("Furgão não carregado:  R$ 25,00 por hora.");
        System.out.println("Furgão carregado:  R$ 50,00 por hora.");
        System.out.println(" ");
        System.out.println("Pressione qualquer tecla e ENTER para voltar ao menu principal.");
        scanner.next();
    }
}

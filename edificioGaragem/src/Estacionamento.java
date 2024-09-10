import java.util.Scanner;

public class Estacionamento {

    public static void estacionarVeiculo() {
        Scanner scanner = new Scanner(System.in);

        // Exibe as opções de veículos
        System.out.println("Por favor, informe o seu tipo de veiculo:");
        System.out.println("1. Motocicleta");
        System.out.println("2. Carro de passeio");
        System.out.println("3. Caminhonete");
        System.out.println("4. Furgão");

        // Captura a escolha do usuário
        int escolha = scanner.nextInt();

        switch (escolha) {
            case 1:
                estacionarMotocicleta(scanner);
                break;
            case 2:
                estacionarCarro(scanner);
                break;
            case 3:
                estacionarCaminhonete(scanner);
                break;
            case 4:
                estacionarFurgao(scanner);
                break;
            default:
                System.out.println("Opção inválida.");
                break;
        }

    }

    // Método para estacionar motocicletas
    public static void estacionarMotocicleta(Scanner scanner) {
        System.out.println("Escolha o tipo de motocicleta:");
        System.out.println("1. Motocicleta leve");
        System.out.println("2. Motocicleta padrão");
        System.out.println("3. Motocicleta pesada");

        int tipoMotocicleta = scanner.nextInt();
        scanner.nextLine();
        double precoHoraMotocicleta = 0;

        switch (tipoMotocicleta) {
            case 1:
                System.out.println("Você escolheu estacionar uma Motocicleta leve.");
                precoHoraMotocicleta = 2.00;
                break;
            case 2:
                System.out.println("Você escolheu estacionar uma Motocicleta padrão.");
                precoHoraMotocicleta = 4.00;
                break;
            case 3:
                System.out.println("Você escolheu estacionar uma Motocicleta pesada.");
                precoHoraMotocicleta = 10.00;
                break;
            default:
                System.out.println("Opção inválida.");
                break;
        }
        System.out.println("Por quanto tempo você deseja utilizar o estacionamento?");
        int tempo = scanner.nextInt();

        CalculadoraEstacionamento calculadora = new CalculadoraEstacionamento();
        double precoFinal = calculadora.calcularPrecoFinal(precoHoraMotocicleta, tempo);

        System.out.println("O preço final para estacionar o furgão por " + tempo + " horas é: R$ " + precoFinal);
    }

    // Método para estacionar carros
    public static void estacionarCarro(Scanner scanner) {
        System.out.println("Escolha o tipo de carro de passeio:");
        System.out.println("1. Carro de passeio hatchback");
        System.out.println("2. Carro de passeio sedan");
        System.out.println("3. Carro SUV");

        int tipoCarro = scanner.nextInt();
        scanner.nextLine();
        double precoHoraCarro = 0;

        switch (tipoCarro) {
            case 1:
                System.out.println("Você escolheu estacionar um Carro de passeio hatchback.");
                precoHoraCarro = 13.00;
                break;
            case 2:
                System.out.println("Você escolheu estacionar um Carro de passeio sedan.");
                precoHoraCarro = 15.00;
                break;
            case 3:
                System.out.println("Você escolheu estacionar um SUV.");
                precoHoraCarro = 20.00;
                break;
            default:
                System.out.println("Opção inválida.");
                break;
        }
        System.out.println("Por quanto tempo você deseja utilizar o estacionamento?");
        int tempo = scanner.nextInt();

        CalculadoraEstacionamento calculadora = new CalculadoraEstacionamento();
        double precoFinal = calculadora.calcularPrecoFinal(precoHoraCarro, tempo);

        System.out.println("O preço final para estacionar o furgão por " + tempo + " horas é: R$ " + precoFinal);
    }

    // Método para estacionar caminhonetes
    public static void estacionarCaminhonete(Scanner scanner) {
        System.out.println("Escolha o tipo de caminhonete:");
        System.out.println("1. Caminhonete não carregada");
        System.out.println("2. Caminhonete carregada");

        int tipoCaminhonete = scanner.nextInt();
        scanner.nextLine();
        double precoHoraCaminhonetes = 0;

        switch (tipoCaminhonete) {
            case 1:
                System.out.println("Você escolheu estacionar uma Caminhonete não carregada.");
                precoHoraCaminhonetes = 25.00;
                break;
            case 2:
                System.out.println("Você escolheu estacionar uma Caminhonete carregada.");
                precoHoraCaminhonetes = 50.00;
                break;
            default:
                System.out.println("Opção inválida.");
                break;

        }

        System.out.println("Por quanto tempo você deseja utilizar o estacionamento?");
        int tempo = scanner.nextInt();

        CalculadoraEstacionamento calculadora = new CalculadoraEstacionamento();
        double precoFinal = calculadora.calcularPrecoFinal(precoHoraCaminhonetes, tempo);

        System.out.println("O preço final para estacionar o furgão por " + tempo + " horas é: R$ " + precoFinal);
    }

    // Método para estacionar furgões
    public static void estacionarFurgao(Scanner scanner) {
        System.out.println("Escolha o tipo de furgão:");
        System.out.println("1. Furgão não carregado");
        System.out.println("2. Furgão carregado");

        int tipoFurgao = scanner.nextInt();
        scanner.nextLine();
        double precoHoraFurgoes = 0;

        switch (tipoFurgao) {
            case 1:
                System.out.println("Você escolheu estacionar um Furgão não carregado.");
                precoHoraFurgoes = 25.00;
                break;
            case 2:
                System.out.println("Você escolheu estacionar um Furgão carregado.");
                precoHoraFurgoes = 50.00;
                break;
            default:
                System.out.println("Opção inválida.");
                break;
        }

        System.out.println("Por quanto tempo você deseja utilizar o estacionamento?");
        int tempo = scanner.nextInt();

        CalculadoraEstacionamento calculadora = new CalculadoraEstacionamento();
        double precoFinal = calculadora.calcularPrecoFinal(precoHoraFurgoes, tempo);

        System.out.println("O preço final para estacionar o furgão por " + tempo + " horas é: R$ " + precoFinal);
    }
}


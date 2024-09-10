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

        double peso = 0;

        switch (tipoMotocicleta) {
            case 1:
                peso = 100;  // Motocicleta leve
                break;
            case 2:
                peso = 200;  // Motocicleta padrão
                break;
            case 3:
                peso = 300;  // Motocicleta pesada
                break;
            default:
                System.out.println("Opção inválida.");
                return;
        }

        Motocicleta motocicleta = new Motocicleta(peso);
        double precoHoraMotocicleta = motocicleta.calcularTarifa();

        System.out.println("Por quanto tempo você deseja utilizar o estacionamento?");
        int tempo = scanner.nextInt();

        CalculadoraEstacionamento calculadora = new CalculadoraEstacionamento();
        double precoFinal = calculadora.calcularPrecoFinal(precoHoraMotocicleta, tempo);

        System.out.println("O preço final para estacionar a motocicleta por " + tempo + " horas é: R$ " + precoFinal);
    }

    // Método para estacionar carros
    public static void estacionarCarro(Scanner scanner) {
        System.out.println("Escolha o tipo de carro de passeio:");
        System.out.println("1. Carro de passeio hatchback");
        System.out.println("2. Carro de passeio sedan");
        System.out.println("3. SUV");

        int tipoCarro = scanner.nextInt();
        scanner.nextLine();

        double peso = 0;

        switch (tipoCarro) {
            case 1:
                peso = 1500;  // Carro hatchback
                break;
            case 2:
                peso = 1800;  // Carro sedan
                break;
            case 3:
                peso = 2500;  // SUV
                break;
            default:
                System.out.println("Opção inválida.");
                return;
        }

        Carro carro = new Carro(peso);
        double precoHoraCarro = carro.calcularTarifa();

        System.out.println("Por quanto tempo você deseja utilizar o estacionamento?");
        int tempo = scanner.nextInt();

        CalculadoraEstacionamento calculadora = new CalculadoraEstacionamento();
        double precoFinal = calculadora.calcularPrecoFinal(precoHoraCarro, tempo);

        System.out.println("O preço final para estacionar o carro por " + tempo + " horas é: R$ " + precoFinal);
    }

    // Método para estacionar caminhonetes
    public static void estacionarCaminhonete(Scanner scanner) {
        System.out.println("Escolha o tipo de caminhonete:");
        System.out.println("1. Caminhonete não carregada");
        System.out.println("2. Caminhonete carregada");

        int tipoCaminhonete = scanner.nextInt();
        scanner.nextLine();

        double peso = 0;

        switch (tipoCaminhonete) {
            case 1:
                peso = 2500;  // Caminhonete não carregada
                break;
            case 2:
                peso = 4000;  // Caminhonete carregada
                break;
            default:
                System.out.println("Opção inválida.");
                return;
        }

        Caminhonete caminhonete = new Caminhonete(peso);
        double precoHoraCaminhonete = caminhonete.calcularTarifa();

        System.out.println("Por quanto tempo você deseja utilizar o estacionamento?");
        int tempo = scanner.nextInt();

        CalculadoraEstacionamento calculadora = new CalculadoraEstacionamento();
        double precoFinal = calculadora.calcularPrecoFinal(precoHoraCaminhonete, tempo);

        System.out.println("O preço final para estacionar a caminhonete por " + tempo + " horas é: R$ " + precoFinal);
    }

    // Método para estacionar furgões
    public static void estacionarFurgao(Scanner scanner) {
        System.out.println("Escolha o tipo de furgão:");
        System.out.println("1. Furgão não carregado");
        System.out.println("2. Furgão carregado");

        int tipoFurgao = scanner.nextInt();
        scanner.nextLine();

        double peso = 0;

        switch (tipoFurgao) {
            case 1:
                peso = 3000;  // Furgão não carregado
                break;
            case 2:
                peso = 4500;  // Furgão carregado
                break;
            default:
                System.out.println("Opção inválida.");
                return;
        }

        Furgao furgao = new Furgao(peso);
        double precoHoraFurgao = furgao.calcularTarifa();

        System.out.println("Por quanto tempo você deseja utilizar o estacionamento?");
        int tempo = scanner.nextInt();

        CalculadoraEstacionamento calculadora = new CalculadoraEstacionamento();
        double precoFinal = calculadora.calcularPrecoFinal(precoHoraFurgao, tempo);

        System.out.println("O preço final para estacionar o furgão por " + tempo + " horas é: R$ " + precoFinal);
    }
}


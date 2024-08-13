package atividades;

import java.util.Scanner;

public class Atividade09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String opcao;
        double celsius, fahrenheit;

        while (true) {
            // Solicita ao usuário a escolha da direção da conversão
            System.out.println("Escolha a conversão que deseja realizar:");
            System.out.println("1. Celsius para Fahrenheit");
            System.out.println("2. Fahrenheit para Celsius");
            System.out.println("Digite 'sair' para encerrar o programa.");
            System.out.print("Sua escolha: ");
            opcao = scanner.nextLine();

            // Condição de parada
            if (opcao.equalsIgnoreCase("sair")) {
                System.out.println("Programa encerrado.");
                break;
            }

            // Executa a conversão baseada na escolha do usuário
            switch (opcao) {
                case "1":
                    System.out.print("Digite a temperatura em Celsius: ");
                    celsius = scanner.nextDouble();
                    fahrenheit = celsiusParaFahrenheit(celsius);
                    System.out.println(celsius + "°C equivale a " + fahrenheit + "°F");
                    break;

                case "2":
                    System.out.print("Digite a temperatura em Fahrenheit: ");
                    fahrenheit = scanner.nextDouble();
                    celsius = fahrenheitParaCelsius(fahrenheit);
                    System.out.println(fahrenheit + "°F equivale a " + celsius + "°C");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    continue;
            }

            // Limpa o buffer do scanner após leitura de números
            scanner.nextLine();
        }

        scanner.close();
    }

    // Método para converter Celsius para Fahrenheit
    public static double celsiusParaFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }

    // Método para converter Fahrenheit para Celsius
    public static double fahrenheitParaCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }
}

package atividades;

import java.util.Scanner;

public class Atividade10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita que o usuário insira a string
        System.out.print("Digite uma string: ");
        String input = scanner.nextLine();

        // Solicita que o usuário insira o caractere a ser contado
        System.out.print("Digite o caractere que deseja contar: ");
        char caractere = scanner.next().charAt(0);

        // Conta o número de ocorrências do caractere
        int contagem = contarOcorrencias(input, caractere);

        // Exibe o resultado
        System.out.println("O caractere '" + caractere + "' aparece " + contagem + " vezes na string.");

        scanner.close();
    }

    // Método para contar as ocorrências de um caractere em uma string
    public static int contarOcorrencias(String str, char c) {
        int contagem = 0;

        // Itera sobre a string e conta quantas vezes o caractere aparece
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == c) {
                contagem++;
            }
        }

        return contagem;
    }
}

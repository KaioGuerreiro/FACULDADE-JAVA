/*Desenvolva um programa que verifique se um número
 fornecido pelo usuário é um número primo.
 Um número primo é um número maior que 1 que só pode
 ser dividido por 1 e por ele mesmo. O programa deve continuar até
 atingir uma condição de parada definida pelo programador */

package atividades;

import java.util.Scanner;

public class Atividade08 {
    public static void main(String[] args) {

        Scanner le = new Scanner(System.in);
        int numero;

        while (true) {
            System.out.print("Digite um número inteiro (digite um número menor ou igual a 1 para parar): ");
            numero = le.nextInt();

            // Condição de parada
            if (numero <= 1) {
                System.out.println("Programa encerrado.");
                break;
            }

            // Verifica se o número é primo
            if (ehPrimo(numero)) {
                System.out.println(numero + " é um número primo.");
            } else {
                System.out.println(numero + " não é um número primo.");
            }
        }

        le.close();
    }

    public static boolean ehPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }

        return true;
    }
}

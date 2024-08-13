/*Crie um programa que conte o número de vogais
em uma string fornecida pelo usuário. */
package atividades;

import java.util.Scanner;

public class Atividade05 {
    public static void main(String[] args) {
        int vogais = 0, tamFrase;
        String frase;
        Scanner le = new Scanner(System.in);

        System.out.println("CONTA VOGAIS");
        System.out.print("INFORME UMA FRASE: ");
        frase = le.nextLine();
        tamFrase = frase.length();
        frase = frase.toLowerCase();

        for ( int i = 0; i < tamFrase; i++){
            switch (frase.charAt(i)){
                case 'a','e','i','o','u':
                    vogais++;
                    break;
            }
        }

        System.out.println("TOTAL DE VOGAIS: "+vogais);

    }
}

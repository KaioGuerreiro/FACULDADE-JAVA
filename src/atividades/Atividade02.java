/*Desenvolva um programa que verifica se uma string fornecida pelo usuário
é um palíndromo (uma palavra que pode ser lida da mesma forma de frente para trás e
de trás para frente).*/

package atividades;

import java.util.Scanner;

public class Atividade02 {
    public static void main(String[] args) {
        String palavraOriginal = "";
        Scanner le = new Scanner(System.in);

        System.out.print("INFORME UMA PALAVRA: ");
        palavraOriginal = le.nextLine();

        char[] arrayDeChar = palavraOriginal.toCharArray();

        for (int i = palavraOriginal.length() - 1, j = 0; i >= 0; i--, j++){
            arrayDeChar[j] = palavraOriginal.charAt(i);
        }

        String palavraInvertida = new String(arrayDeChar);

        if ( palavraInvertida.equals(palavraOriginal)){
            System.out.println(palavraOriginal+" É UM PALINDROMO");
        }
        else {
            System.out.println(palavraOriginal+" NÃO É UM PALINDROMO");
        }

        System.out.println(palavraInvertida);
    }
}

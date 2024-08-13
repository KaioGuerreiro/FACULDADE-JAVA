/*Crie um programa que leia 5 números inteiros fornecidos
pelo usuário e os exiba em ordem crescente. */
package atividades;

import java.util.Arrays;
import java.util.Scanner;

public class Atividade07 {
    public static void main(String[] args) {
        int[] numeros = new int[5];

        Scanner le = new Scanner(System.in);

        System.out.println("ORDENA NUMEROS");

        for ( int i = 0; i < 5; i++) {
            System.out.print("INFORME UM NUMERO: ");
            numeros[i] = le.nextInt();

        }
        Arrays.sort(numeros);
        System.out.print("NUMEROS EM ORDEM CRESCENTE: ");

        for ( int i = 0; i < 5; i++){
            System.out.print(numeros[i]+" ");
        }
    }
}

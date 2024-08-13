/*Desenvolva um programa que calcule o fatorial de um número
inteiro positivo fornecido pelo usuário. O fatorial de um número
n é o produto de todos os números inteiros de 1 a n (n! = 1 × 2 × 3 × ... × n). */
package atividades;

import java.util.Scanner;

public class Atividade06 {
    public static void main(String[] args) {
        int n; // numero para gerar a fatorial
        long resultado = 1;
        Scanner le = new Scanner(System.in);

        System.out.println("CALCULADORA FATORIAL JAVA");
        System.out.print("INFORME UM NUMERO INTEIRO POSITIVO: ");
        n = le.nextInt();

        for ( int i = 1; i <= n; i++){
            resultado = resultado * i;
        }

        System.out.println("FATORIAL DE "+n+" = "+resultado);

    }
}

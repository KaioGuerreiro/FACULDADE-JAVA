/*Desenvolva um programa que gere a tabuada de um número
fornecido pelo usuário, de 1 a 10. */
package atividades;

import java.util.Scanner;

public class Atividade04 {
    public static void main(String[] args) {
        int n; // numero para gerar a tabuada
        int resultado;
        Scanner le = new Scanner(System.in);

        System.out.println("TABUADA JAVA");
        System.out.print("INFORME UM NUMERO PARA GERAR A TABUADA: ");
        n = le.nextInt();

        for ( int i = 1; i <= 10; i++){
            resultado = n * i;
            System.out.println(n+" X "+i+" = "+resultado);
        }

        System.out.println("FIM DA TABUADA");

    }
}

/*Crie um programa que solicite ao usuário dois números e uma
operação matemática (adição, subtração, multiplicação ou divisão).
O programa deve realizar a operação e exibir o resultado.*/

package atividades;

import java.util.Scanner;

public class Atividade01 {
    public static void main(String[] args) {
        int opcao = 0; // armazena a opcao de operacao.
        int n1 = 0, n2 = 0; // armazena os dois numeros.
        float resultado = 0;
        Scanner le = new Scanner(System.in);

        System.out.println("CALCULADORA JAVA");
        while( opcao != 5) {
            System.out.println("----------MENU DE OPERAÇOES----------");
            System.out.println("1 - ADIÇÃO\n2 - SUBTRAÇÃO\n3 - MULTIPLICAÇÃO\n4 - DIVISÃO\n5 - SAIR");
            System.out.print("INFORME A OPÇÃO: ");
            opcao = le.nextInt();

            if( opcao == 1 || opcao == 2 || opcao == 3 || opcao == 4) {
                System.out.print("INFORME UM NUMERO: ");
                n1 = le.nextInt();
                System.out.print("INFORME MAIS UM NUMERO: ");
                n2 = le.nextInt();
            }

            switch (opcao) {
                case 1:
                    resultado = n1 + n2;
                    break;
                case 2:
                    resultado = n1 - n2;
                    break;
                case 3:
                    resultado = n1 * n2;
                    break;
                case 4:
                    resultado = n1 / n2;
                    break;
                case 5:
                    System.out.println("FIM DO PROGRAMA");
                    break;
                default:
                    System.out.println("OPÇÃO INVALIDA");
            }

            if( opcao == 1 || opcao == 2 || opcao == 3 || opcao == 4) {
                System.out.println("RESULTADO: "+resultado);
            }
        }
    }
}

/*Crie um programa que preencha um array com 5 números inteiros
fornecidos pelo usuário e calcule a soma desses números.
 */

package atividades;

import java.util.Arrays;
import java.util.Scanner;

public class Atividade03 {
    public static void main(String[] args) {
        int[] arrayNumeros = new int[]{0, 0, 0, 0, 0};
        int resultado;
        Scanner le = new Scanner(System.in);

        for ( int i = 0; i < 5; i++){
            System.out.print("Informe um numero: ");
            arrayNumeros[i] = le.nextInt();

        }
        resultado = Arrays.stream(arrayNumeros).sum();
        System.out.println("RESULTADO: "+resultado);
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String nome;
        int tam;
        Scanner le = new Scanner(System.in);
        System.out.print("Escreva seu nome:");
        nome = le.nextLine();
        tam = nome.length();

        System.out.println("Ola Bem Vindo! "+nome);
        System.out.println();
        System.out.print("Seu nome Inverso: ");

        for (int i = (tam-1); i >= 0; i--) {
            System.out.print(nome.charAt(i));
        }
        System.out.println();
    }
}
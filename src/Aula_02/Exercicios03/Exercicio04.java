package Aula_02.Exercicios03;

import java.util.Scanner;

public class Exercicio04{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        int divisores = 0;

        for (int i = 1; i <= numero; i++) {
            if (numero % i == 0) {
                divisores++;
            }
        }

        if (divisores == 2) {
            System.out.println("É primo!");
        } else {
            System.out.println("Não é primo!");
        }

        scanner.close();
    }
}
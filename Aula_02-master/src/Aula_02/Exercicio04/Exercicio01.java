package Aula_02.Exercicio04;

import java.util.Scanner;

public class Exercicio01{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[5];
        int soma = 0;

        System.out.println("Por favor, digite 5 números inteiros:");

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        for (int numero : numeros) {
            soma += numero;
        }

        System.out.println("\nA soma dos elementos do vetor é: " + soma);

        scanner.close();
    }
}
package Aula_02.Exercicio04;

import java.util.Scanner;

public class Exercicio04{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double [] notas = new double[4];
        double soma = 0;

        for (int i = 0; i < notas.length; i++) {
            System.out.print("Digite a Nota: " + (i + 1) + ": ");
            notas[i] = sc.nextDouble();
        }
        for (int i = 0; i < notas.length; i++) {
            soma = soma + notas[i];
        }
        double media = soma / notas.length;
        System.out.println("\nA média das notas é: " + media);

        sc.close();
    }
}

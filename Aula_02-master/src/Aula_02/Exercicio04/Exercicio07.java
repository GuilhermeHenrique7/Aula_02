package Aula_02.Exercicio04;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] matriz = new int[3][3];
        int soma = 0;

        System.out.println("--- Preenchendo a Matriz 3x3 ---");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Digite o valor para a posição [" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                soma = soma + matriz[i][j];
            }
        }

        System.out.println("\nA soma dos valores da matriz é: " + soma);

        sc.close();
    }
}
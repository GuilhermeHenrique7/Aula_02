package Aula_02.Exercicio04;

import java.util.Scanner;

public class Exercicio06{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] matriz = new int[2][2];

        System.out.println("--- Preenchendo a Matriz 2x2 ---");

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("Digite o valor para a posição [" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextInt();
            }
        }

        System.out.println("\n--- Valores Inseridos na Matriz ---");

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        sc.close();
    }
}
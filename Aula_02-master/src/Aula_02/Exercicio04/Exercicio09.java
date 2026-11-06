package Aula_02.Exercicio04;

import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] matriz = new int[4][4];
        int contadorPares = 0;

        System.out.println("--- Preenchendo a Matriz 4x4 ---");

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Digite o valor para a posição [" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (matriz[i][j] % 2 == 0) {
                    contadorPares = contadorPares + 1;
                }
            }
        }

        System.out.println("\nQuantidade de números pares na matriz: " + contadorPares);

        sc.close();
    }
}
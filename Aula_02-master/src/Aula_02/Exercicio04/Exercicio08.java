package Aula_02.Exercicio04;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[][] tabela = new double[2][2];

        System.out.println("--- Preenchendo a Matriz 2x2 (double) ---");

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("Digite o valor para a posição [" + i + "][" + j + "]: ");
                tabela[i][j] = sc.nextDouble();
            }
        }

        System.out.println("\n--- Soma dos Valores de Cada Linha ---");

        for (int i = 0; i < 2; i++) {
            double somaLinha = 0;
            for (int j = 0; j < 2; j++) {
                somaLinha = somaLinha + tabela[i][j];
            }
            System.out.println("Soma da linha " + i + ": " + somaLinha);
        }

        sc.close();
    }
}
package Aula_02.Exercicio04;

import java.util.Scanner;

public class Exercicio03{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean[] valores = new boolean[8];
        int contadorTrue = 0;

        System.out.println("Digite 'true' ou 'false' para cada uma das 8 posições:");

        for (int i = 0; i < valores.length; i++) {
            System.out.print("Posição " + i + ": ");
            valores[i] = scanner.nextBoolean();
        }
        for (int i = 0; i < valores.length; i++) {
            if (valores[i] == true) {
                contadorTrue = contadorTrue + 1;
            }
        }

        System.out.println("\nQuantidade de valores 'true' inseridos: " + contadorTrue);

        scanner.close();
    }
}
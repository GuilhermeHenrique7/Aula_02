package Aula_02.Exercicios03;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double soma = 0;
        int quantidadeNotas = 5;

        for (int i = 1; i <= quantidadeNotas; i++) {
            System.out.print("Digite a " + i + "ª nota: ");
            double nota = scanner.nextDouble();
            soma += nota;
        }

        double media = soma / quantidadeNotas;

        System.out.printf("A média das notas é: %.2f\n", media);

        scanner.close();
    }
}
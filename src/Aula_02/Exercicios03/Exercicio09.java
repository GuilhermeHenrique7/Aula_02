package Aula_02.Exercicios03;

import java.util.Random;
import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Gera o número entre 1 e 100
        int numeroSecreto = new Random().nextInt(100) + 1;
        int palpite;
        int tentativas = 0;

        do {
            System.out.print("Digite um número (1 a 100): ");
            palpite = scanner.nextInt();
            tentativas++;
        } while (palpite != numeroSecreto);

        System.out.println("Acertou! Tentativas: " + tentativas);

        scanner.close();
    }
}
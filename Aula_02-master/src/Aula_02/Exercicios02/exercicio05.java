package Aula_02.Exercicios02;

import java.util.Scanner;

public class exercicio05 {
    public static void main(String[] args) {
        int horas_extras = 0;
        int trabalhadas = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a quatidade trabalhadas: ");
        trabalhadas = scanner.nextInt();

        if (trabalhadas > 40){
         horas_extras = trabalhadas - 40;
         System.out.println("Sua hora extra "+horas_extras);
        }
    }
}

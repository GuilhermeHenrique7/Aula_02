package Aula_02.Exercicios05;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        double nota = sc.nextDouble();

        System.out.println("Digite a segunda nota: ");
        double nota2 = sc.nextDouble();

        System.out.println("Digite a terceira nota: ");
        double nota3 = sc.nextDouble();

        System.out.println("Média: "+ calcularMedia(nota, nota2, nota3));
    }
    public static double calcularMedia(double num1, double num2, double num3) {
        double media = (num1 + num2 + num3) / 3;
        return media;
    }
}

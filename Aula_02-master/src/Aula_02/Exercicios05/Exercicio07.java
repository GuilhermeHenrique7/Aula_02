package Aula_02.Exercicios05;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro numero: ");
        int num1 = sc.nextInt();

        System.out.println("Digite o segundo numero: ");
        int num2 = sc.nextInt();

        System.out.println("Digite o terceiro numero: ");
        int num3 = sc.nextInt();

        System.out.println("O numero maior: " + maiorNumero(num1, num2, num3));
    }

    public static int maiorNumero(int num1, int num2, int num3) {
        if (num1 > num2 && num1 < num3) {
            return num1;
        } else if (num2 > num3 && num2 < num1) {
            return num2;
        } else if (num3 > num1 && num3 < num2) {
            return num3;
        }
        return maiorNumero(num1, num2, num3);
    }
}
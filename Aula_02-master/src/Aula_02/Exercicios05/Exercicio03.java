package Aula_02.Exercicios05;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        System.out.println("Qual número você quer que dobre?");
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o numero: ");
        int x = sc.nextInt();

        System.out.println(dobrar(x));
    }
    public static int dobrar(int x){
        return x*2;
    }
}

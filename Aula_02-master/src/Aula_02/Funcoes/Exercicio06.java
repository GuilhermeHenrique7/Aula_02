package Aula_02.Funcoes;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o numero: ");
        int numero = sc.nextInt();

        System.out.println("Numero Par = "+verificarPar(numero));
    }
    public static boolean verificarPar(int numero){
        return numero % 2==0;
    }
}

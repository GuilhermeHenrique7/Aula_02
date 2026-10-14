package Aula_02.exercicios02;

import java.util.Scanner;

public class exercicio01 {
    public static void main(String[] args) {
        int idade = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite sua idade: ");
        idade = scanner.nextInt();

       if ( idade >= 18){
           System.out.println("Pode entrar!");
       } else {
           System.out.println("Precisa ter 18 anos!");
       }
        scanner.close();
    }
}

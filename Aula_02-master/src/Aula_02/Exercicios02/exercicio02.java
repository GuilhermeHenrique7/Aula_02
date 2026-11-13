package Aula_02.Exercicios02;

import java.util.Scanner;

public class exercicio02 {
    public static void main(String[] args) {
        double compra = 0;
        double desconto = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Valor da compra: ");
        compra = scanner.nextInt();

        desconto = compra * 0.90;

        if (compra >= 100){
            System.out.println("Desconto de 10%, Valor da Compra: R$"+ desconto);
        } else {
            System.out.println("Você não recebe desconto! Total a pagar: R$"+ compra);
        }
        scanner.close();
    }
}

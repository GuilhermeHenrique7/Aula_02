package Aula_02.exercicios02;

import java.util.Scanner;

public class exercicio04 {
    public static void main(String[] args) {
        double venda = 0;
        double comissao = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor da venda: ");
        venda = scanner.nextDouble();

        if (venda < 1000){
            comissao = venda * 0.05;
            System.out.println("Comissão de 5%, Seu valor é: R$"+ comissao);

        } else if (venda <= 5000){
            comissao = venda * 0.1;
            System.out.println("Comissão de 10%, Seu valor é: R$"+ comissao);

        } else if (venda > 5000){
            comissao = venda * 0.15;
            System.out.println("Comissão de 15%, Seu valor é: R$"+ comissao);
        }
    }
}

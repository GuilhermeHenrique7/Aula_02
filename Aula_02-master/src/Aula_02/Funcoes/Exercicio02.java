package Aula_02.Funcoes;

 import  java.util.Scanner;

public class Exercicio02{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro numero: ");
        int x = sc.nextInt();

        System.out.println("Digite o segundo numero: ");
        int y = sc.nextInt();

        System.out.println("Resultado: "+ somar(x,y));
    }
    public static int somar(int x, int y){
        return x+y;

    }
}

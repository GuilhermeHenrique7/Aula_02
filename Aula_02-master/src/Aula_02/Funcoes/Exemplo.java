package Aula_02.Funcoes;

import java.util.Scanner;

public class Exemplo {
    static void main(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o lado do quadrado: ");
        int lado = scanner.nextInt();

        int areaDoQuadrado = calcularAreaDoQuadrado(lado);
        System.out.println("Area do quadrado: " + areaDoQuadrado);
    }
    public static int calcularAreaDoQuadrado(int lado) {
        return lado * lado;
    }
}

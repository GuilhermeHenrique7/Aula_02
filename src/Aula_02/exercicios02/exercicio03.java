package Aula_02.exercicios02;

import java.util.Scanner;

public class exercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("""
                Digite o código do produto:
                    1 - Eletrônicos
                    2 - Alimentos
                    3 - Vestúario
                """);
        int codigo = scanner.nextInt();

        switch (codigo){
            case 1:
                System.out.println("Você escolheu o Eletrônicos");
                break;
            case 2:
                System.out.println("Você escolheu o Alimentos");
                break;
            case 3:
                System.out.println("Você escolheu Vestúario");
            default:
                System.out.println("Opção invalida!");
                break;
        }
        scanner.close();
    }
}

package Aula_02.Exercicios03;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio10{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> pares = new ArrayList<>();
        ArrayList<Integer> impares = new ArrayList<>();

        while (true) {
            System.out.print("Digite um número: ");
            int numero = scanner.nextInt();

            // Interrompe se for maior que 100
            if (numero > 100) {
                System.out.println("Número muito grande, interrupção realizada");
                break;
            }

            // Para se for negativo
            if (numero < 0) {
                break;
            }

            // Separa pares e ímpares usando continue
            if (numero % 2 == 0) {
                pares.add(numero);
                continue;
            }

            impares.add(numero);
        }

        // Exibe os resultados
        System.out.println("Pares: " + pares);
        System.out.println("Ímpares: " + impares);

        scanner.close();
    }
}
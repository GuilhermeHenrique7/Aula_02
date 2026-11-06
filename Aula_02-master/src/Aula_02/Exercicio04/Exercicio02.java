package Aula_02.Exercicio04;

import java.util.Scanner;

public class Exercicio02{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] letras = {"A", "B", "C", "D", "E", "F"};

        System.out.print("Digite uma letra para pesquisar no vetor: ");
        String busca = scanner.nextLine();

        boolean encontrada = false;

        for (int i = 0; i < letras.length; i++) {
            if (letras[i].equals(busca)) {
                System.out.println("A letra '" + busca + "' foi encontrada na posição (índice): " + i);
                encontrada = true;
            }
        }
        if (encontrada == false) {
            System.out.println("A letra '" + busca + "' não está presente no vetor.");
        }

        scanner.close();
    }
}
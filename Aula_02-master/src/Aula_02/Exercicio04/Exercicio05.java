package Aula_02.Exercicio04;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] nomes = {"Guilherme", "Joao", "Luiz"};

        System.out.print("Digite o nome que deseja verificar: ");
        String nomeBusca = sc.nextLine();

        boolean encontrado = false;

        for (int i = 0; i < nomes.length; i++) {
            if (nomes[i].equals(nomeBusca)) {
                encontrado = true;
            }
        }
        if (encontrado) {
            System.out.println("O nome " + nomeBusca + " está presente no vetor!");
        } else {
            System.out.println("O nome " + nomeBusca + " NÃO está presente no vetor.");
        }

        sc.close();
    }
}

package Aula_02.Exercicios03;

public class Exercicio06{
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int contador = 0;

        while (contador < 10) {
            System.out.print(a + " ");

            int proximo = a + b;
            a = b;
            b = proximo;

            contador++;
        }
    }
}
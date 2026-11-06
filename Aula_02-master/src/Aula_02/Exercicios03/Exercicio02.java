package Aula_02.Exercicios03;

    public class Exercicio02 {
        public static void main(String[] args) {
            int numero = 2;
            int soma = 0;

            while (numero <= 100) {
                soma = soma + numero;
                numero = numero + 2;
            }

            System.out.println("A soma dos pares de 1 a 100 é: " + soma);
        }
    }
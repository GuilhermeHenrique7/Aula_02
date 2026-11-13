package Aula_02.Exercicios05;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite a Temperatura em Celsius: ");
        double Celsios = input.nextDouble();

        System.out.print("Fahrenheit: "+ converterCelsiusParaFahrenheit(Celsios));
    }
    public static double converterCelsiusParaFahrenheit(double Celsios){
        return Celsios * 1.8 + 32;
    }
}

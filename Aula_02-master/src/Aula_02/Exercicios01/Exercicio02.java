package Aula_02.Exercicios01;

public class Exercicio02 {
    public static void main(String[] args) {
        int horas = 8;
        int dias = 6;
        int semana = 0;
        double hora_trabalhada = 60;
        semana = horas * dias;

        System.out.println("Salario semanal: R$"+ semana * hora_trabalhada);
    }
}

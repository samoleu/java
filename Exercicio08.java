package com.company;

import java.util.Scanner;

//Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês. Calcule e mostre o total do seu salário no referido mês.

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("DIGITE O QUANTO VOCÊ GANHA POR HORA: ");
        double ganhaPorHora = scanner.nextDouble();
        System.out.println("DIGITE O QUANTAS HORAS VOCÊ TRABALHA NO MÊS: ");
        double horasTrabalhadas = scanner.nextDouble();

        double salario = ganhaPorHora * horasTrabalhadas;

        System.out.println("O SEU SÁLARIO MENSAL É " +  salario);
        scanner.close();
    }
}

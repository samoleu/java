package com.company;

//Faça um Programa que peça as 4 notas bimestrais e mostre a média.

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("\n------------------------------------BOLETIM ESCOLAR------------------------------------\n\n     DIGITE A PRIMEIRA NOTA: ");
        double nota1 = scanner.nextDouble();
        System.out.print("     DIGITE A SEGUNDA NOTA: ");
        double nota2 = scanner.nextDouble();
        System.out.print("     DIGITE A TERCEIRA NOTA: ");
        double nota3 = scanner.nextDouble();
        System.out.print("     DIGITE A QUARTA NOTA: ");
        double nota4 = scanner.nextDouble();

        double media = nota1 + nota2 + nota3 + nota4;

        System.out.println("\n     A MÉDIA DAS SUAS NOTAS É IGUAL À " + media);
        scanner.close();
    }
}

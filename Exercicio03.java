package com.company;
import java.util.Scanner;

//Faça um Programa que peça dois números e imprima a soma.

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("         SOMA\n\nDIGITE O PRIMEIRO NÚMERO: ");
        double primeiroValor = scanner.nextDouble();
        System.out.print("DIGITE O SEGUNDO NÚMERO: ");
        double segundoValor = scanner.nextDouble();

        double soma = primeiroValor + segundoValor;

        System.out.println("A SOMA DOS VALORES É IGUAL À " + soma);
        scanner.close();
    }
}

package com.company;
//Faça um Programa que peça 2 números inteiros e um número real. Calcule e mostre:
//o produto do dobro do primeiro com metade do segundo .
//a soma do triplo do primeiro com o terceiro.
//o terceiro elevado ao cubo.
import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("DIGITE UM NÚMERO INTEIRO: ");
        int inteiro1 = scanner.nextInt();
        System.out.print("DIGITE OUTRO NÚMERO INTEIRO: ");
        int inteiro2 = scanner.nextInt();
        System.out.print("DIGITE UM NÚMERO REAL: ");
        double real = scanner.nextDouble();
        int a = (inteiro1 * 2) + (inteiro2 / 2);
        double b = (inteiro1 * 3) + real;
        double c = real * real * real;
        System.out.println("A) o produto do dobro do primeiro com metade do segundo é igual à " + a
                + "\nB) a soma do triplo do primeiro com o terceiro é igual à " + b + "\nC) o terceiro elevado ao cubo é igual à " + c);
        scanner.close();
    }
}

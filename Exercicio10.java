package com.company;
//Faça um Programa que peça a temperatura em graus Celsius, transforme e mostre em graus Fahrenheit.

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("DIGITE A TEMPERATURA EM CELSIUS: ");
        double C = scanner.nextDouble();


        double F = (C * 9/5) + 32;

        System.out.println("A TEMPERATURA " + C + "C° FAHRENHEIT É " + F);
        scanner.close();
    }
}

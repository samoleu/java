package com.company;
//Faça um Programa que peça a temperatura em graus Fahrenheit, transforme e mostre a temperatura em graus Celsius.
//C = 5 * ((F-32) / 9).
import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("DIGITE A TEMPERATURA EM FAHRENHEIT: ");
        double F = scanner.nextDouble();

        double C = (F-32) * 5/ 9;

        System.out.println("A TEMPERATURA " + F + "F° EM CELSIUS É " + C);
        scanner.close();
    }
}

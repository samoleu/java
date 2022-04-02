package com.company;

import java.util.Scanner;

//Faça um Programa que converta metros para centímetros.

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("-------------------CONVERSOR DE METROS PARA CENTÍMETROS-------------------\n");
        System.out.print("         DIGITE O VALOR EM METROS: ");
        double metros = scanner.nextDouble();

        double centimetro = metros / 100;

        System.out.println("         " + metros + " EM CENTIMETROS É " + centimetro);
        scanner.close();
    }
}

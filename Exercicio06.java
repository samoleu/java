package com.company;

import java.util.Scanner;

//Faça um Programa que peça o raio de um círculo, calcule e mostre sua área.

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("DIGITE O RAIO: ");
        double raio = scanner.nextDouble();
        System.out.print("Diga a unidade de medida: ");
        String medida = scanner.next();
        float pi = 3.14f;
        double area = pi * (raio * raio);
        System.out.println("A AREA É IGUAL À " + area + " " + medida);
        scanner.close();
    }
}
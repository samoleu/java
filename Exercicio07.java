package com.company;

//Faça um Programa que calcule a área de um quadrado, em seguida mostre o dobro desta área para o usuário.

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("DIGITE A BASE DO QUADRILÁTERO RETO: \n");
        double baseDoQuadrilatero = scanner.nextDouble();
        System.out.print("DIGITE A ALTURA DO QUADRILÁTERO RETO: \n");
        double alturaDoQuadrilatero = scanner.nextDouble();
        double areaDoQuadrilatero = baseDoQuadrilatero * alturaDoQuadrilatero;
        double dobroArea = areaDoQuadrilatero * 2;
        System.out.println("O DOBRO DA AREA DO QUADRILÁTERO É " + dobroArea + " E A AREA É " + areaDoQuadrilatero);
        scanner.close();
    }
}

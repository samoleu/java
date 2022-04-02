package com.company;
//Tendo como dados de entrada a altura de uma pessoa, construa um algoritmo que calcule seu peso ideal,
// usando a seguinte fórmula: (72.7*altura) - 58
import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Qual a sua altura: ");
        double altura = scanner.nextDouble();

        double pesoIdeal = (72.7*altura) - 58;

        System.out.println("O seu peso ideal é " + pesoIdeal);
        scanner.close();
    }
}

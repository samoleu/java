package com.company;
//Tendo como dado de entrada a altura (h) de uma pessoa, construa um algoritmo que calcule seu peso ideal, utilizando as seguintes fórmulas:
//Para homens: (72.7*h) - 58
//Para mulheres: (62.1*h) - 44.7
import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Qual a sua altura(HOMEM): ");
        double altura = scanner.nextDouble();
        double alturaHomem = (72.7 * altura) - 58;
        double alturaMulher = (62.1*altura) - 44.7;

        System.out.println("O seu peso ideal é \nPara homens: " + alturaHomem + "\nPara mulheres: " + alturaMulher);
        scanner.close();
    }
}

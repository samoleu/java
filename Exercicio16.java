package com.company;
//Faça um programa para uma loja de tintas. O programa deverá pedir o tamanho em metros quadrados da área a ser pintada.
// Considere que a cobertura da tinta é de 1 litro para cada 3 metros quadrados e que a tinta é vendida em latas de 18 litros, que custam R$ 80,00.
// Informe ao usuário a quantidades de latas de tinta a serem compradas e o preço total.
import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("DIGITE O TAMANHO DA ÁREA A SER PINTADA(em m²): ");
        double tamanho = scanner.nextDouble();
        double litros = tamanho / 3;
        double lata = litros / 18;
        System.out.print("Quantidade: " + lata + "\nArredonde a quantidade para cima[ex.: 1.34 = 2]:" );
        lata = scanner.nextDouble();
        double preco = lata * 80;
        System.out.print("a quantidades de latas de tinta a serem compradas é " + lata + "  o preço total é " + preco);
        scanner.close();
    }
}

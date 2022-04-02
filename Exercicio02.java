package com.company;

//Faça um Programa que peça um número e então mostre a mensagem O número informado foi [número].

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número: ");
        String numero = scanner.next();
        System.out.println("O número informado foi " + numero);
        scanner.close();
    }
}

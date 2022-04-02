package com.company;
//Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês. Calcule e mostre o total do seu salário no referido mês,
// sabendo-se que são descontados 11% para o Imposto de Renda, 8% para o INSS e 5% para o sindicato, faça um programa que nos dê:
//
// salário bruto.
//quanto pagou ao INSS.
//quanto pagou ao sindicato.
//o salário líquido.
//calcule os descontos e o salário líquido, conforme a tabela abaixo:

import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("QUANTO VOCÊ GANHA POR HORA: ");
        double valor = scanner.nextDouble();
        System.out.print("QUANTAS HORAS VOCÊ TRABALHA NO MÊS: ");
        double hora = scanner.nextDouble();
        double salario = valor * hora;
        double imposto = valor * 0.89;
        double inss = valor * 0.92;
        double sindicato = valor * 0.95;
        double liquido = salario - imposto - inss - sindicato;
        System.out.print("Salário Bruto : R$" + salario +
                "\nIR (11%) : R$ " + imposto +
                "\nINSS (8%) : R$" + inss +
                "\nSindicato (5%) : R$ " + sindicato +
                "\nSalário Liquido : R$" + liquido);
        scanner.close();
    }
}

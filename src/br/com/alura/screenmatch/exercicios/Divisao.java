package br.com.alura.screenmatch.exercicios;

import java.util.Scanner;

public class Divisao {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);

        System.out.println("Digite o numerador: ");
        int numerador = num.nextInt();

        System.out.println("Digite o denominador: ");
        int denominador = num.nextInt();
        num.close();
        try {
            int finalDivisao = numerador / denominador;
            System.out.println("Resultado final: " + finalDivisao);
        } catch (ArithmeticException e) {
             System.out.println("Numero não permitido");
            
        }

    }
}

package br.com.alura.screenmatch.principal;

import java.util.Scanner;

public class PrincipalCompras {
    public static void main(String[] args) {
        

        Scanner leitura = new Scanner(System.in);
        
        System.out.println("Digite o limite do cartão: ");
        double limite = leitura.nextDouble();
        leitura.nextLine();

        int opcao = 1;

        while (opcao != 0) {
        System.out.println("Digite a descrição da compra: ");
        String descricao = leitura.nextLine();

        System.out.println("Digite o valor da compra: ");
        double valor = leitura.nextDouble();
        leitura.nextLine();

        if (valor <= limite) {
            System.out.println("Compra realizada. ");
            limite = limite - valor;
            System.out.println("Limite atual: " + limite);
        } else {
            System.out.println("Saldo insuficiente! ");
        }
        
        System.out.println("Digite 1 para continuar ou 0 para parar.");
        opcao = leitura.nextInt();
        leitura.nextLine();
        }
        
        
        
    }
}

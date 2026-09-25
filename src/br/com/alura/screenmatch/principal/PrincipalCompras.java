package br.com.alura.screenmatch.principal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import br.com.alura.screenmatch.exercicios.Compras;


public class PrincipalCompras {
    public static void main(String[] args) {
        

        Scanner leitura = new Scanner(System.in);
        List<Compras> descricaoDasCompras = new ArrayList<>();
        
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
            Compras compra = new Compras(valor, descricao);
            descricaoDasCompras.add(compra);
            Collections.sort(descricaoDasCompras);
            System.out.println(descricaoDasCompras);
            System.out.println("Limite atual: " + limite);
        } else {
            System.out.println("Saldo insuficiente! ");
            System.out.println("Os itens comprados foram: ");
            for (Compras todasAsDescricoes : descricaoDasCompras) {
            System.out.println(todasAsDescricoes);
        }
        }
            
        System.out.println("Digite 1 para continuar ou 0 para parar.");
        opcao = leitura.nextInt();
        leitura.nextLine();



        
        }
        System.out.println("Seu limite terminou em: " + limite);
        System.out.println("Os itens comprados foram: ");
        Collections.sort(descricaoDasCompras);
        for (Compras todasAsDescricoes : descricaoDasCompras) {
            
            System.out.println(todasAsDescricoes);
        }
        leitura.close();
        
        
    }
}


package br.com.alura.screenmatch.exercicios;
public class Carro {
    String modelo;
    int ano;
    String cor;

    void qualCarro(){
        System.out.println("\nCarro: "+ modelo + "\nAno: " + ano + "\nCor: " + cor);
    }
    int idadeCarro(){
        return 2026 - ano;
    }
}

package br.com.alura.screenmatch.exercicios;

import com.google.gson.Gson;

public class Veiculo {
    private String modelo;
    private int ano;
    private String cor;

    public int getAno() {
        return ano;
    }
    public String getCor() {
        return cor;
    }
    public String getModelo() {
        return modelo;
    }

    public Veiculo(String modelo, int ano, String cor){
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
    }
    @Override
    public String toString() {
        return getModelo() + " - " + getCor() + " - (" + getAno() + ")";
    }
    

    public static void main(String[] args) {
        Veiculo veiculo = new Veiculo("Celta", 2014, "Preto");
        System.out.println(veiculo);

        Gson gson = new Gson();
        String json = gson.toJson(veiculo);
        System.out.println(json);
    }

}

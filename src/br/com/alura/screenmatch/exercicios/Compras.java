package br.com.alura.screenmatch.exercicios;

import java.util.Comparator;

public class Compras implements Comparable<Compras>{
    private double valor;
    private String descricao;

    public String getDescricao() {
        return descricao;
    }
    public double getValor() {
        return valor;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }
    public Compras(double valor ,String descricao){
        this.valor = valor;
        this.descricao = descricao;

    }
    @Override
    public String toString() {
        return getDescricao() + " - " + getValor();
    }
    @Override
    public int compareTo(Compras outrasCompras) {
        return Double.compare(this.getValor(), outrasCompras.getValor());
    }
}

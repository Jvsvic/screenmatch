package br.com.alura.screenmatch.modelos;
import br.com.alura.screenmatch.calculo.Classificar;


public class Episodio implements Classificar {
    private int numero;
    private String nome;
    private Serie serie;
    private int totalVisualizacoes;

    public int getTotalVisualizacoes() {
        return totalVisualizacoes;
    }

    public void setTotalVisualizacoes(int totalVisualizacoes) {
        this.totalVisualizacoes = totalVisualizacoes;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }

    public String getNome() {
        return nome;
    }

    public int getNumero() {
        return numero;
    }

    public Serie getSerie() {
        return serie;
    }
    public int getClassificacao(){
        if (totalVisualizacoes > 100) {
            return 4;
        } else{
            return 2;
        }
        
    }
}

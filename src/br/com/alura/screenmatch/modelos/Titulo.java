package br.com.alura.screenmatch.modelos;

import com.google.gson.annotations.SerializedName;

public class Titulo implements Comparable<Titulo> {

    @SerializedName("Title")
    private String nome;
    @SerializedName("Year")
    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    private double somaAvaliacoes;
    private int totalDeAvaliacoes;
    private int duracaoEmMinutos;
    
    public Titulo(String nome, int anoDeLancamento){
        this.nome = nome;
        this.anoDeLancamento = anoDeLancamento;
    }

    public Titulo(TituloOmdb meuTituloOmdb) {
        this.nome = meuTituloOmdb.title();
        this.anoDeLancamento = Integer.valueOf(meuTituloOmdb.year());
        this.duracaoEmMinutos = Integer.valueOf(meuTituloOmdb.runtime().substring(0,3));
    }

    //GETTERS
    public int getTotalDeAvaliacoes() {
        return totalDeAvaliacoes;
    }
    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }
    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }
    public String getNome() {
        return nome;
    }

    //SETTERS
    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }
    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }
    

    public void exibeFichaTecnica(){
        System.out.println("Nome do filme: " + nome);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        System.out.println("Duração em minutos: " + duracaoEmMinutos);
        System.out.println("Incluido no plano atual? " + incluidoNoPlano);
        System.out.println("Média das avaliações: " + pegaMedia());
        System.out.println("Total de avaliações: " + getTotalDeAvaliacoes());
        System.out.println();

    }


    public void Avalia(double nota){
        somaAvaliacoes = somaAvaliacoes + nota;
        totalDeAvaliacoes++;
    }

    public double pegaMedia(){
      return somaAvaliacoes / totalDeAvaliacoes;
    }

    @Override
    public int compareTo(Titulo outroTitulo) {
        return this.getNome().compareTo(outroTitulo.getNome());
    }
    @Override 
    public String toString() {
        return "Titulo: " + getNome() + ", Ano de lançamento: " + getAnoDeLancamento() + ", Duração: " + getDuracaoEmMinutos() + " minutos";
    }

}

package br.com.alura.screenmatch.modelos;

public class Titulo {
    private String nome;
    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    private double somaAvaliacoes;
    private int totalDeAvaliacoes;
    private int duracaoEmMinutos;
    
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




}

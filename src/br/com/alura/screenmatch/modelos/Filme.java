package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.calculo.Classificar;

public class Filme extends Titulo implements Classificar {
    private String diretor;

    public String getDiretor() {
        return diretor;
    }
    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override 
    public int getClassificacao(){
        return (int) pegaMedia() / 2;
    }

    @Override
    public String toString() {
        return "Filme: " + this.getNome() + " - (Ano: " + this.getAnoDeLancamento() + ")";
    }
}

package br.com.alura.screenmatch.exercicios;

public class ListaDeTitulos implements Comparable<ListaDeTitulos> {
    private String nome;

    public ListaDeTitulos(String nome){
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    @Override
    public int compareTo(ListaDeTitulos outraListaDeTitulos) {
        return this.getNome().compareTo(outraListaDeTitulos.getNome());
    }
    @Override
    public String toString() {
        return this.getNome();
    }

}

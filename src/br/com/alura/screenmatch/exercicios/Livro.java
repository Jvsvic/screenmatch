package br.com.alura.screenmatch.exercicios;
public class Livro {
    private String titulo;
    private String autor;

    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void exibeLivro(){
        System.out.println("Nome do livro: " + getTitulo() + "\nNome do autor: " + getAutor());
    }
}

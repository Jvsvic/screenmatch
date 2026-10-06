package br.com.alura.screenmatch.exercicios;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class TituloExercicio {
    private String nome;
    private String autor;
    private String genero;

    public TituloExercicio(String nome, String autor, String genero){
        this.nome = nome;
        this.autor = autor;
        this.genero = genero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return " Nome: " + getNome() + " Autor : " + getAutor() + " Genero: " + getGenero();
    }
    
    
    public static void main(String[] args) throws IOException{
        TituloExercicio ex11 = new TituloExercicio("teste1", "teste2", "teste3");
        TituloExercicio ex12 = new TituloExercicio("teste1", "teste2", "teste3");
        TituloExercicio ex13 = new TituloExercicio("teste1", "teste2", "teste3");
        TituloExercicio ex14 = new TituloExercicio("teste1", "teste2", "teste3");
        TituloExercicio ex15 = new TituloExercicio("teste1", "teste2", "teste3");
        TituloExercicio ex16 = new TituloExercicio("teste1", "teste2", "teste3");
        TituloExercicio ex17 = new TituloExercicio("teste1", "teste2", "teste3");
        TituloExercicio ex18 = new TituloExercicio("teste1", "teste2", "teste3");
        TituloExercicio ex19 = new TituloExercicio("teste1", "teste2", "teste3");
        TituloExercicio ex20 = new TituloExercicio("teste1", "teste2", "teste3");
        List<TituloExercicio> lista = new ArrayList<>();
        lista.add(ex20);
        lista.add(ex11);
        lista.add(ex12);
        lista.add(ex13);
        lista.add(ex14);
        lista.add(ex15);
        lista.add(ex16);
        lista.add(ex17);
        lista.add(ex18);
        lista.add(ex19);
        Gson gson = new GsonBuilder()
        .setPrettyPrinting()
        .create();
        String json = gson.toJson(lista);
        System.out.println(json);
    }
}

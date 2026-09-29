package br.com.alura.screenmatch.principal;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import br.com.alura.screenmatch.exercicios.LivroRecord;
import br.com.alura.screenmatch.exercicios.PessoaRecord;

public class PrincipalExercicios {
    public static void main(String[] args) {
        String json = "{\"nome\":\"Rodrigo\",\"cidade\":\"Brasília\"}";
        System.out.println(json);
        Gson gson = new GsonBuilder().setLenient().create();
        PessoaRecord pessoa = gson.fromJson(json, PessoaRecord.class);
        System.out.println("Teste" + pessoa);
        String jsonLivro = "{\"titulo\":\"Aventuras do Java\",\"autor\":\"Akemi\",\"editora\":{\"nome\":\"TechBooks\",\"cidade\":\"São Paulo\"}}";
        System.out.println(jsonLivro);
        Gson gsonLivro = new Gson();
        LivroRecord livro = gsonLivro.fromJson(jsonLivro, LivroRecord.class);
        System.out.println("Objeto livro: " + livro);
    }
}

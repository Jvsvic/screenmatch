package br.com.alura.screenmatch.principal;

import java.util.ArrayList;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

public class PrincipalComListas {
    public static void main(String[] args) {
        var filmeDoPaulo = new Filme("Dogville", 2003);
        filmeDoPaulo.Avalia(10);
        Filme meuFilme = new Filme("Teste", 2026);
        meuFilme.Avalia(5);
        Filme outroFilme = new Filme("Avatar", 2022);
        outroFilme.Avalia(8);
        Serie lost = new Serie("Lost", 2000); 
        Serie dexter = new Serie("Dexter", 2018);
        Serie breaking = new Serie("Breaking Bad", 2022);

        
        //Filme f1 = filmeDoPaulo;
        //Filme f3 = f1;

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(filmeDoPaulo);
        lista.add(outroFilme);
        lista.add(meuFilme);
        lista.add(lost);
        lista.add(dexter);
        lista.add(breaking);

        for (Titulo todosOsFilmesAndSerie : lista) {
            System.out.println(todosOsFilmesAndSerie);
        }

        }

    }


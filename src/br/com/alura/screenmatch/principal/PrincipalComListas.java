package br.com.alura.screenmatch.principal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

import br.com.alura.screenmatch.exercicios.ListaDeTitulos;
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

        
        List<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Adam Sandler");
        buscaPorArtista.add("Jaqueline");
        buscaPorArtista.add("Paulo");
        buscaPorArtista.add("João");
        System.out.println(buscaPorArtista);
        Collections.sort(buscaPorArtista);
        System.out.println(buscaPorArtista);
    
        Collections.sort(lista);
        System.out.println(lista);
        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento)); 
        System.out.println("Ordenando por ano: " + lista);

        List<Integer> numeros = new ArrayList<>();
        numeros.add(2);
        numeros.add(12);
        numeros.add(232);
        numeros.add(42);
        numeros.add(52);
        numeros.add(32);
        numeros.add(102);

        System.out.println(numeros);
        Collections.sort(numeros);
        System.out.println(numeros);

        ListaDeTitulos listaNova = new ListaDeTitulos("z");
        ListaDeTitulos listaNova1 = new ListaDeTitulos("h");
        ListaDeTitulos listaNova2 = new ListaDeTitulos("k");
        ListaDeTitulos listaNova3 = new ListaDeTitulos("r");
        ListaDeTitulos listaNova4 = new ListaDeTitulos("a");

        List<ListaDeTitulos> listaOrdenada = new ArrayList<>();
        listaOrdenada.add(listaNova);
        listaOrdenada.add(listaNova1);
        listaOrdenada.add(listaNova2);
        listaOrdenada.add(listaNova3);
        listaOrdenada.add(listaNova4);
        System.out.println(listaOrdenada);
        Collections.sort(listaOrdenada);
        System.out.println(listaOrdenada);

        List<String> lista1 = new ArrayList<>();
        lista1.add("Elemento 1");
        lista1.add("Elemento 2");

        List<String> lista2 = new LinkedList<>();
        lista2.add("Elemento A");
        lista2.add("Elemento B");

        System.out.println("ArrayList" + lista1);
        System.out.println("LinkedList: " + lista2);


        }

        
    }


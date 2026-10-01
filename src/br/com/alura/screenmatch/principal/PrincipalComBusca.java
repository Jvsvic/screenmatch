package br.com.alura.screenmatch.principal;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import br.com.alura.screenmatch.excecao.ErroException;
import br.com.alura.screenmatch.modelos.Titulo;
import br.com.alura.screenmatch.modelos.TituloOmdb;

public class PrincipalComBusca {
    /**
     * @param args
     * @throws IOException
     * @throws InterruptedException
     */
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner leituraScanner = new Scanner(System.in);
        String buscarFilmeLoop = "";
        List<Titulo> tituloLista = new ArrayList<>();
        Gson gson = new GsonBuilder()
        .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
        .setPrettyPrinting()
        .create();

        while (!buscarFilmeLoop.equalsIgnoreCase("sair")) {

            System.out.println("Digite um filme para buscar: ");
            buscarFilmeLoop = leituraScanner.nextLine();

            if (buscarFilmeLoop.equalsIgnoreCase("sair")) {
                break;
            }


            var endereco = "https://www.omdbapi.com/?t=" + buscarFilmeLoop.replace(" ", "+") + "&apikey=6585022c";
            

            try {
                HttpClient client = HttpClient.newHttpClient();
                final HttpRequest request = HttpRequest.newBuilder()
                        .uri(URI.create(endereco))
                        .build();
                HttpResponse<String> response = client
                        .send(request, BodyHandlers.ofString());

                String json = response.body();
                System.out.println(json);
                TituloOmdb meuTituloOmdb = gson.fromJson(json, TituloOmdb.class);
                System.out.println(meuTituloOmdb);

                Titulo meuTitulo = new Titulo(meuTituloOmdb);
                System.out.println("Titulo convertido: ");
                System.out.println(meuTitulo);

                tituloLista.add(meuTitulo);
                
                //FileWriter escrita = new FileWriter("filmes.txt");
                //escrita.write(meuTitulo.toString());
                //escrita.close();

            } catch (NumberFormatException e) {
                System.out.println("Aconteceu um erro: ");
                System.out.println(e.getMessage());
            } catch (IllegalArgumentException e) {
                System.out.println("Algum erro de argumento na busca, verifique o link");
            } catch (ErroException e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println(tituloLista);
        FileWriter escrita = new FileWriter("filmex.json");
        escrita.write(gson.toJson(tituloLista));
        System.out.println("O programa finalizou corretamente! ");
        escrita.close();
        leituraScanner.close();
    }
}

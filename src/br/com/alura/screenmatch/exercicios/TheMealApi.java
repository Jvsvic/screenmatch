package br.com.alura.screenmatch.exercicios;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.Scanner;

public class TheMealApi {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Qual receita gostaria de aprender? ");
        var nomeReceita = leitura.nextLine();
        var receitaFinal = "https://www.themealdb.com/api/json/v1/1/search.php?s=" + nomeReceita;

        leitura.close();
        HttpClient client = HttpClient.newHttpClient();
        final HttpRequest request = HttpRequest.newBuilder()
            .uri(URI.create(receitaFinal))
            .build();
        HttpResponse<String> response = client
        .send(request, BodyHandlers.ofString());
        System.out.println(response.body());

    }
}

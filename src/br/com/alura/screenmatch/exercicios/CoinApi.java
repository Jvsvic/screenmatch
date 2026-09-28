package br.com.alura.screenmatch.exercicios;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.Scanner;

public class CoinApi {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Qual moeda você escolhe para cotar? ");
        var moeda = leitura.nextLine();
        System.out.println("Qual cripto você escolhe para cotar? ");
        var cripto = leitura.nextLine();
        var link = "https://api.coingecko.com/api/v3/simple/price?ids="+ cripto + "&vs_currencies=" + moeda;



        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
            .uri(URI.create(link))
            .build();
        HttpResponse<String> response = client
        .send(request, BodyHandlers.ofString());
        System.out.println(response.body());
    }
}

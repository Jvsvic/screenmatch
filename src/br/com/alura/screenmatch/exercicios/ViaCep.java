package br.com.alura.screenmatch.exercicios;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandler;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.Scanner;

public class ViaCep {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner cep = new Scanner(System.in);
        


        System.out.println("Digite o cep para busca: ");
        String buscar = cep.nextLine();
        System.out.println("O cep digitado foi: " + buscar);
        String endereco = "https://viacep.com.br/ws/" + buscar + "/json/";

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
            .uri(URI.create(endereco))
            .build();
        HttpResponse<String> response = client
        .send(request, BodyHandlers.ofString());
        System.out.println(response.body());
    }
}

package br.com.alura.screenmatch.exercicios;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandler;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.Scanner;

public class GoogleBooksApi {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite um livro: ");
        var busca = leitura.nextLine();
        var chave = "&key=AIzaSyBYv6C-eWlRXDqyW38pXhPlYhlK06LsfEc";
        var livro = "https://www.googleapis.com/books/v1/volumes?q=" + busca + chave;

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
            .uri(URI.create(livro))
            .build();
        HttpResponse<String> response = client
        .send(request, BodyHandlers.ofString());
        System.out.println(response.body());

    }
}

package br.com.alura.screenmatch.exercicios;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class GithubApi {

    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner user = new Scanner(System.in);

        System.out.println("Qual perfil você gostaria de buscar no GitHub? (Digite o usuário): ");
        String profile = user.nextLine();

        String endereco = "https://api.github.com/users/" + profile;

        user.close();

        try {
            HttpClient client = HttpClient.newHttpClient();

            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(endereco))
                    .build();

            HttpResponse<String> response = client.send(
                    request,
                    HttpResponse.BodyHandlers.ofString()
            );

            System.out.println(response.body());
            if (response.statusCode() == 404) {
                throw new ErroConsultaGitHubException("Perfil não encontrado!");
            }
        } catch (ErroConsultaGitHubException e) {
            System.out.println(e.getMessage());
        }
    }
}

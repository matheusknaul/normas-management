package com.matheusknaul.normas_management.domain.api;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class TesteApi {
    public static void main(String[] args) {
        try {
            // Criando o cliente HTTP
            HttpClient client = HttpClient.newHttpClient();

            // Criando a requisição GET
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create("https://admabnt.com.br/backend/api/v1/abntonline/search_360?search=17025&options[]=1&scale=2"))
                    .GET()
                    .build();

            // Enviando a requisição e pegando a resposta como String
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            // Exibindo o código de resposta e o corpo da resposta
            System.out.println("Código de resposta: " + response.statusCode());
            System.out.println("Resposta: " + response.body());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

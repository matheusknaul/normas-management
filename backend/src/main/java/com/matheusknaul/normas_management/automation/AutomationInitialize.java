package com.matheusknaul.normas_management.automation;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class AutomationInitialize {

	public static void main(String[] args) throws IOException, InterruptedException {
		String path = "https://www.abntcatalogo.com.br/pav.aspx";
		
		HttpClient client = HttpClient.newHttpClient();
		HttpRequest request = HttpRequest.newBuilder()
		        .uri(URI.create(path))
		        .GET()
		        .build();
		HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
		System.out.println(response.body());


	}

}

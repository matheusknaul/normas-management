package com.matheusknaul.normas_management.domain.api;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class NormaAPI {
	
	private final String responseBody;

	public NormaAPI(String query, boolean isNational) {
		this.responseBody = fetchNorma(query, isNational);
	}
		
	private String fetchNorma(String query, boolean isNational) {
		try {
				
			HttpClient client = HttpClient.newHttpClient();
			
			HttpRequest request = HttpRequest.newBuilder().uri(URI.create(makeUrl(query, verifyLocal(isNational)))).GET().build();
			
			HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
			
			return response.body();
		
		}catch(Exception e) {
			e.printStackTrace();
			return "Erro ao buscar norma: " + e.getMessage();
		}
	}
	
	private int verifyLocal(boolean isNational) {
		if(isNational) {
			return 1;
		}
		return 2;
	}
	
	private String makeUrl(String query, int option) {
		return "https://admabnt.com.br/backend/api/v1/abntonline/search_360?search=" + query + "&options[]=" + option + "&scale=2";
	}
	
	private String parseJson() {
		return "aaa";
	}
	
	public String getResponseBody() {
		return this.responseBody;
	}
	
	
}

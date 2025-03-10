package com.matheusknaul.normas_management.domain.api;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class NormaAPI {
	
	private static final int ArrayList = 0;
	private final ArrayList<String> responseBody;

	public NormaAPI(String query, boolean isNational) throws JsonMappingException, JsonProcessingException {
		String json = fetchNorma(query, isNational);
		this.responseBody = parseJson(json);
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
		
		System.out.println(isNational);
		if(isNational) {
			return 1;
		}
		return 2;
	}
	
	private String makeUrl(String query, int option) {
		String url = "https://admabnt.com.br/backend/api/v1/abntonline/search_360?search=" + query + "&options[]=" + option + "&scale=2";
		System.out.println(url);
		return url;
	}
	
	private ArrayList<String> parseJson(String json) throws JsonMappingException, JsonProcessingException {
		
		ArrayList<String> jsonResult = new ArrayList<>();
		
		ObjectMapper objectMapper = new ObjectMapper();
		JsonNode rootNode = objectMapper.readTree(json);
		JsonNode dataArray = rootNode.get("data");
		
		if(dataArray.isArray()) {
			for(JsonNode item: dataArray) {
				String link = item.get("link").asText();
				String date = item.get("date").asText();
				String number = item.get("number").asText();
				String title = item.get("title").asText();
				
				String formattedDate = formatDate(date);
				
				jsonResult.add(link);
				jsonResult.add(formattedDate);
				jsonResult.add(number);
				jsonResult.add(title);
			}
		}
		return jsonResult;
		
	}
	
	private String formatDate(String date) {
		DateTimeFormatter inputFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		DateTimeFormatter outputFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		LocalDate localDate = LocalDate.parse(date, inputFormatter);
		return localDate.format(outputFormatter);
		
	}

	public ArrayList<String> getResponseBody() {
		return this.responseBody;
	}
	
	
}

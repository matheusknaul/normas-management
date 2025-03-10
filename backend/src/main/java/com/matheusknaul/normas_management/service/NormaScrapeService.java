package com.matheusknaul.normas_management.service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.matheusknaul.normas_management.domain.Norma;
import com.matheusknaul.normas_management.domain.api.NormaAPI;

@Service
public class NormaScrapeService {

	private final NormaService normaService;
	
	public NormaScrapeService(NormaService normaService) {
		this.normaService = normaService;
	}
	
	public boolean verifyDate(Integer id) throws JsonMappingException, JsonProcessingException {
		Norma normaVerify = normaService.searchById(id);
		
		NormaAPI normaApi = new NormaAPI(normaVerify.getNumber(), normaVerify.isNational());
		ArrayList<String> result = normaApi.getResponseBody();
		
		String dateString = result.get(1);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate resultDate = LocalDate.parse(dateString, formatter);
		
		System.out.println(result);
		System.out.println("Data norma (minha): " + normaVerify.getVersionDate() + "| Data norma (deles):" + resultDate);
		
		if(resultDate.equals(normaVerify.getVersionDate())) {
			System.out.println("É igual!");
			return true;
		}
		
		System.out.println("Não é igual!");
		return false;
	}
}

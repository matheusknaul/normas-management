package com.matheusknaul.normas_management.service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.matheusknaul.normas_management.domain.Norma;
import com.matheusknaul.normas_management.domain.api.NormaAPI;
import com.matheusknaul.normas_management.verification.VersionVerification;

@Service
public class NormaScrapeService {

	private final NormaService normaService;
	
	public NormaScrapeService(NormaService normaService) {
		this.normaService = normaService;
	}
	
	public boolean verifyDate(Integer id) throws JsonMappingException, JsonProcessingException {
		Norma normaVerify = normaService.searchById(id);
		
		normaVerify.setNational();
		boolean local = normaVerify.isNational();
		
		System.out.println("Local:" + local);
		
		NormaAPI normaApi = new NormaAPI(normaVerify.getNumber(), local);
		ArrayList<String> result = normaApi.getResponseBody();
		
		String dateString = result.get(1); //Pega a data da lista que o método parseJson retorna.
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate resultDate = LocalDate.parse(dateString, formatter);
		
		System.out.println(result);
		System.out.println("Data norma (minha): " + normaVerify.getVersionDate() + "| Data norma (deles):" + resultDate);
		
		//Compara as duas datas (cadastrada / data da norma na sua versão mais recente)
		
		if(resultDate.equals(normaVerify.getVersionDate())) {
			System.out.println("É igual!");
			return true;
		}
		
		System.out.println("Não é igual!");
		return false;
	}
	
	public List<Norma> testVerification(){
		VersionVerification vv = new VersionVerification(this.normaService);
		
		return vv.test();
	}
}

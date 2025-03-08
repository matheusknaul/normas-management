package com.matheusknaul.normas_management.service;

import org.springframework.stereotype.Service;

import com.matheusknaul.normas_management.domain.Norma;

@Service
public class NormaScrapeService {

	private final NormaService normaService;
	
	public NormaScrapeService(NormaService normaService) {
		this.normaService = normaService;
	}
	
	public boolean verifyDate(Integer id) {
		Norma normaVerify = normaService.searchById(id);
		
		
	}
}

package com.matheusknaul.normas_management.verification;

import java.util.List;

import com.matheusknaul.normas_management.domain.Norma;
import com.matheusknaul.normas_management.service.NormaScrapeService;
import com.matheusknaul.normas_management.service.NormaService;

public class VersionVerification {

	private List<Norma> norma;
	private NormaService normaService;
	private NormaScrapeService normaScrapeService;
	
	public VersionVerification(NormaService normaService) {
		this.normaService = normaService;
	}
	
	public List<Norma> test(){
		return this.normaService.listAll();
	}
	
	
	
}

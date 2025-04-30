package com.matheusknaul.normas_management.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.matheusknaul.normas_management.domain.Norma;
import com.matheusknaul.normas_management.service.NormaScrapeService;

@RestController
@RequestMapping("/scrape")
public class NormaScrapeController {

	@Autowired
	private NormaScrapeService normaScrapeService;
	
	@GetMapping("/{id}")
	public ResponseEntity<Boolean> verifyDate(@PathVariable Integer id) throws JsonMappingException, JsonProcessingException{
		return ResponseEntity.ok(normaScrapeService.verifyDate(id));
	}
	
	@GetMapping("/test")
	public ResponseEntity<List<Norma>> verificationTest(){
		return ResponseEntity.ok(normaScrapeService.testVerification());
	}
}

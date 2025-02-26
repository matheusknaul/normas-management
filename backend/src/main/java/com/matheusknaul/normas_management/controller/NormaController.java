package com.matheusknaul.normas_management.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.matheusknaul.normas_management.domain.Norma;
import com.matheusknaul.normas_management.service.NormaService;

@RestController
@RequestMapping("/api/normas")
public class NormaController {


	@Autowired
	private NormaService normaService;
	
	@GetMapping
	public ResponseEntity<List<Norma>> listAll(){
		return ResponseEntity.ok(normaService.listAll());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Norma> searchById(@PathVariable Integer id) {
		return ResponseEntity.ok(normaService.searchById(id));
	}
	
	@PostMapping
	public ResponseEntity<Norma> save(@RequestBody Norma norma){
		return ResponseEntity.ok(normaService.save(norma));
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Norma> update(@PathVariable Integer id, @RequestBody Norma norma){
		return ResponseEntity.ok(normaService.update(id, norma));
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> delete(@PathVariable Integer id){
		normaService.delete(id);
		return ResponseEntity.noContent().build();
	}
	
}

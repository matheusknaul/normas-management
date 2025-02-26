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

import com.matheusknaul.normas_management.domain.Grupo;
import com.matheusknaul.normas_management.service.GrupoService;

@RestController
@RequestMapping("api/grupos")
public class GrupoController {

	@Autowired
	private GrupoService grupoService;
	
	@GetMapping
	public ResponseEntity<List<Grupo>> listAll(){
		return ResponseEntity.ok(grupoService.listAll());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Grupo> searchById(@PathVariable Integer id) {
		return ResponseEntity.ok(grupoService.searchById(id));
	}
	
	@PostMapping
	public ResponseEntity<Grupo> save(@RequestBody Grupo grupo){
		return ResponseEntity.ok(grupoService.save(grupo));
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Grupo> update(@PathVariable Integer id, @RequestBody Grupo grupo){
		return ResponseEntity.ok(grupoService.update(id, grupo));
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> delete(@PathVariable Integer id){
		grupoService.delete(id);
		return ResponseEntity.noContent().build();
	}
	
}

package com.matheusknaul.normas_management.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.matheusknaul.normas_management.domain.Grupo;
import com.matheusknaul.normas_management.repository.GrupoRepository;

@Service
public class GrupoService {

	private final GrupoRepository grupoRepository;
	
	public GrupoService(GrupoRepository grupoRepository) {
		this.grupoRepository = grupoRepository;
	}
	
	public List<Grupo> listAll(){
		return grupoRepository.findAll();
	}
	
	public Grupo searchById(Integer id) {
		return grupoRepository.findById(id).orElseThrow(()-> new RuntimeException("Grupo não encontrado!"));
	}
	
	public Grupo save(Grupo grupo) {
		return grupoRepository.save(grupo);
	}
	
	public Grupo update(Integer id, Grupo grupo) {
		Grupo grupoEditado = searchById(id);
		grupoEditado.setTitle(grupo.getTitle());
		grupoEditado.setDescription(grupo.getDescription());
		grupoEditado.setNormas(grupo.getNormas());
		return save(grupoEditado);
	}
	
	public void delete(Integer id) {
		grupoRepository.deleteById(id);
	}
}

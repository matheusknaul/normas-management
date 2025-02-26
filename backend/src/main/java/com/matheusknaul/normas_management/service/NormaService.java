package com.matheusknaul.normas_management.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.matheusknaul.normas_management.domain.Norma;
import com.matheusknaul.normas_management.repository.NormaRepository;

@Service
public class NormaService {
	
	private final NormaRepository normaRepository;
	
	public NormaService(NormaRepository normaRepository) {
		this.normaRepository = normaRepository;
	}
	
	public List<Norma> listAll(){
		return normaRepository.findAll();
	}
	
	public Norma searchById(Integer id) {
		return normaRepository.findById(id).orElseThrow(()-> new RuntimeException("Norma não encontrada!"));
	}
	
	public Norma save(Norma norma) {
		return normaRepository.save(norma);
	}
	
	public Norma update(Integer id, Norma norma) {
		Norma normaEditada = searchById(id);
		normaEditada.setTag(norma.getTag());
		normaEditada.setNumber(norma.getNumber());
		normaEditada.setVerificationDate(norma.getVerificationDate());
		normaEditada.setVersionDate(norma.getVersionDate());
		return save(normaEditada);
	}
	
	public void delete(Integer id) {
		normaRepository.deleteById(id);
	}
}

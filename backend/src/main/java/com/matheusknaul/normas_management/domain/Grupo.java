package com.matheusknaul.normas_management.domain;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Grupo {
	
	@Id
	private Integer id;
	
	private String title;
	
	private String description;
	
	@JsonIgnore
	@OneToMany(mappedBy = "grupo")
	private Set<Norma> normas = new HashSet<>();

	public Grupo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Grupo(Integer id, String title, String description,Set<Norma> normas) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
		this.normas = normas;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Set<Norma> getNormas() {
		return normas;
	}

	public void setNormas(Set<Norma> normas) {
		this.normas = normas;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, normas, title);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Grupo other = (Grupo) obj;
		return Objects.equals(id, other.id) && Objects.equals(normas, other.normas)
				&& Objects.equals(title, other.title);
	}
	
	
}

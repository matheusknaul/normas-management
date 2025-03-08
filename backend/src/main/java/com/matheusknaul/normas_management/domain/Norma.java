package com.matheusknaul.normas_management.domain;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Norma {
	
	@Id
	private Integer id;
	
	private String tag;
	private String number;
	private String description;
	
	private boolean isNational;
	private String linkAddres;
	
	@JsonFormat(pattern = "dd/MM/yyyy")
	private LocalDate verificationDate = LocalDate.now();
	@JsonFormat(pattern = "dd/MM/yyyy")
	private LocalDate versionDate;
	
	@ManyToOne
	@JoinColumn(name = "grupo_id")
	private Grupo grupo;

	public Norma() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Norma(Integer id, String tag, String number, String description, LocalDate verificationDate,
			LocalDate versionDate, Grupo grupo) {
		super();
		this.id = id;
		this.tag = tag;
		this.number = number;
		this.description = description;
		this.verificationDate = verificationDate;
		this.versionDate = versionDate;
		this.grupo = grupo;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTag() {
		return tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public boolean isNational() {
		return isNational;
	}

	public void setNational() {
		if(this.tag == "ABNT") {
			this.isNational = true;
		}
	}

	public String getLinkAddres() {
		return linkAddres;
	}

	public void setLinkAddres(String linkAddres) {
		this.linkAddres = linkAddres;
	}

	public LocalDate getVerificationDate() {
		return verificationDate;
	}

	public void setVerificationDate(LocalDate verificationDate) {
		this.verificationDate = verificationDate;
	}

	public LocalDate getVersionDate() {
		return versionDate;
	}

	public void setVersionDate(LocalDate versionDate) {
		this.versionDate = versionDate;
	}

	public Grupo getGrupo() {
		return grupo;
	}

	public void setGroup(Grupo grupo) {
		this.grupo = grupo;
	}

	@Override
	public int hashCode() {
		return Objects.hash(description, grupo, id, number, tag, verificationDate, versionDate);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Norma other = (Norma) obj;
		return Objects.equals(description, other.description) && Objects.equals(grupo, other.grupo)
				&& Objects.equals(id, other.id) && Objects.equals(number, other.number)
				&& Objects.equals(tag, other.tag) && Objects.equals(verificationDate, other.verificationDate)
				&& Objects.equals(versionDate, other.versionDate);
	}
	
	
}

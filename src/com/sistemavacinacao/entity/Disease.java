package com.sistemavacinacao.entity;

import java.util.List;

/**
 * Classe entidade do objeto Doenças referentes a tabela tb_diseases
 * @author luiz
 *
 */
public class Disease {
	
	private Integer idDisease;
	private String description;
	private List<Vaccine> vaccinesForReferentDisease;
	private List<Vaccine> vaccinesForbiddenForReferentDisease;
	public Integer getIdDisease() {
		return idDisease;
	}
	public void setIdDisease(Integer idDisease) {
		this.idDisease = idDisease;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public List<Vaccine> getVaccinesForReferentDisease() {
		return vaccinesForReferentDisease;
	}
	public void setVaccinesForReferentDisease(List<Vaccine> vaccinesForReferentDisease) {
		this.vaccinesForReferentDisease = vaccinesForReferentDisease;
	}
	public List<Vaccine> getVaccinesForbiddenForReferentDisease() {
		return vaccinesForbiddenForReferentDisease;
	}
	public void setVaccinesForbiddenForReferentDisease(List<Vaccine> vaccinesForbiddenForReferentDisease) {
		this.vaccinesForbiddenForReferentDisease = vaccinesForbiddenForReferentDisease;
	}
	@Override
	public String toString() {
		return "Disease [idDisease=" + idDisease + ", description=" + description + ", vaccinesForReferentDisease="
				+ vaccinesForReferentDisease + ", vaccinesForbiddenForReferentDisease="
				+ vaccinesForbiddenForReferentDisease + "]";
	}
	
	

}

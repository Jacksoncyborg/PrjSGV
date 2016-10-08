package com.sistemavacinacao.entity;

import java.util.List;

/**
 * Classe entidade do objeto Alergias referente a tabela tb_allergies
 * @author luiz
 *
 */
public class Allergy {
	
	private Integer idAllergy;
	private String description;
	private List<Vaccine> vaccinesForReferentAllergy;
	private List<Vaccine> vaccinesForbiddenForReferentAllergy;
	
	public Integer getIdAllergy() {
		return idAllergy;
	}
	public void setIdAllergy(Integer idAllergy) {
		this.idAllergy = idAllergy;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public List<Vaccine> getVaccinesForReferentAllergy() {
		return vaccinesForReferentAllergy;
	}
	public void setVaccinesForReferentAllergy(List<Vaccine> vaccinesForReferentAllergy) {
		this.vaccinesForReferentAllergy = vaccinesForReferentAllergy;
	}
	public List<Vaccine> getVaccinesForbiddenForReferentAllergy() {
		return vaccinesForbiddenForReferentAllergy;
	}
	public void setVaccinesForbiddenForReferentAllergy(List<Vaccine> vaccinesForbiddenForReferentAllergy) {
		this.vaccinesForbiddenForReferentAllergy = vaccinesForbiddenForReferentAllergy;
	}
	@Override
	public String toString() {
		return "Allergy [idAllergy=" + idAllergy + ", description=" + description + ", vaccinesForReferentAllergy="
				+ vaccinesForReferentAllergy + ", vaccinesForbiddenForReferentAllergy="
				+ vaccinesForbiddenForReferentAllergy + "]";
	}
	
	

}

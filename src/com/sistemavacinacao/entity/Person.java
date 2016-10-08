package com.sistemavacinacao.entity;

import java.sql.Date;
import java.util.List;

/**
 * Classe entidade do objeto Pessoa referente a tabela tb_person
 * @author luiz
 *
 */
public class Person {
	
	private Long  cpf;
	private String  name;
	private String  rg;
	private Integer  weight; 
	private Boolean  has_tattoo;
	private Date  dtBirth;
	private List<Address> addresses;
	private List<Email> emails;
	private List<Vaccine> vaccines;
	private List<Person> dependents;
	private List<Disease> diseases;
	private List<Allergy> allergies;
	public Long getCpf() {
		return cpf;
	}
	public void setCpf(Long cpf) {
		this.cpf = cpf;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public Integer getWeight() {
		return weight;
	}
	public void setWeight(Integer weight) {
		this.weight = weight;
	}
	public Boolean getHas_tattoo() {
		return has_tattoo;
	}
	public void setHas_tattoo(Boolean has_tattoo) {
		this.has_tattoo = has_tattoo;
	}
	public Date getDtBirth() {
		return dtBirth;
	}
	public void setDtBirth(Date dtBirth) {
		this.dtBirth = dtBirth;
	}
	public List<Address> getAddresses() {
		return addresses;
	}
	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}
	public List<Email> getEmails() {
		return emails;
	}
	public void setEmails(List<Email> emails) {
		this.emails = emails;
	}
	public List<Vaccine> getVaccines() {
		return vaccines;
	}
	public void setVaccines(List<Vaccine> vaccines) {
		this.vaccines = vaccines;
	}
	public List<Person> getDependents() {
		return dependents;
	}
	public void setDependents(List<Person> dependents) {
		this.dependents = dependents;
	}
	public List<Disease> getDiseases() {
		return diseases;
	}
	public void setDiseases(List<Disease> diseases) {
		this.diseases = diseases;
	}
	public List<Allergy> getAllergies() {
		return allergies;
	}
	public void setAllergies(List<Allergy> allergies) {
		this.allergies = allergies;
	}
	
	
	@Override
	public String toString() {
		return "Person [cpf=" + cpf + ", name=" + name + ", rg=" + rg + ", weight=" + weight + ", has_tattoo="
				+ has_tattoo + ", dtBirth=" + dtBirth + ", addresses=" + addresses + ", emails=" + emails
				+ ", vaccines=" + vaccines + ", dependents=" + dependents + ", diseases=" + diseases + ", allergies="
				+ allergies + "]";
	}
	
	


}

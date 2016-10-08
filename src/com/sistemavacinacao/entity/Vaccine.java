package com.sistemavacinacao.entity;

import java.sql.Date;

/**
 * Classe entidade do objeto Vacinas referente a tabela tb_vaccines
 * @author luiz
 *
 */
public class Vaccine {
	
	private Integer  idVaccine;
	private Integer  lot;
	private Date  validate;
	private String  name;
	private Integer  idType;
	public Integer getIdVaccine() {
		return idVaccine;
	}
	public void setIdVaccine(Integer idVaccine) {
		this.idVaccine = idVaccine;
	}
	public Integer getLot() {
		return lot;
	}
	public void setLot(Integer lot) {
		this.lot = lot;
	}
	public Date getValidate() {
		return validate;
	}
	public void setValidate(Date validate) {
		this.validate = validate;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getIdType() {
		return idType;
	}
	public void setIdType(Integer idType) {
		this.idType = idType;
	}
	@Override
	public String toString() {
		return "Vaccine [idVaccine=" + idVaccine + ", lot=" + lot + ", validate=" + validate + ", name=" + name
				+ ", idType=" + idType + "]";
	}
	
	

}

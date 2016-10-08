package com.sistemavacinacao.entity;

/**
 * Classe entidade do objeto Endereço referente a tabela tb_addresses
 * @author luiz
 *
 */
public class Address {
	
	private Integer  seqAddress;
	private Long  cpf;
	private String  address;
	private Integer  number;
	public Integer getSeqAddress() {
		return seqAddress;
	}
	public void setSeqAddress(Integer seqAddress) {
		this.seqAddress = seqAddress;
	}
	public Long getCpf() {
		return cpf;
	}
	public void setCpf(Long cpf) {
		this.cpf = cpf;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Integer getNumber() {
		return number;
	}
	public void setNumber(Integer number) {
		this.number = number;
	}
	@Override
	public String toString() {
		return "Address [seqAddress=" + seqAddress + ", cpf=" + cpf + ", address=" + address + ", number=" + number
				+ "]";
	}

	
	

}

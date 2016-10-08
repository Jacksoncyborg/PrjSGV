package com.sistemavacinacao.entity;

/**
 * Classe entidade do objeto Telefones referente a tabela tb_phones
 * @author luiz
 *
 */
public class Phone {

	 private Long cpf;
	 private Integer seqAddress;
	 private Long phoneNumber;
	public Long getCpf() {
		return cpf;
	}
	public void setCpf(Long cpf) {
		this.cpf = cpf;
	}
	public Integer getSeqAddress() {
		return seqAddress;
	}
	public void setSeqAddress(Integer seqAddress) {
		this.seqAddress = seqAddress;
	}
	public Long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(Long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	@Override
	public String toString() {
		return "Phone [cpf=" + cpf + ", seqAddress=" + seqAddress + ", phoneNumber=" + phoneNumber + "]";
	}
	 
	 
	 
}

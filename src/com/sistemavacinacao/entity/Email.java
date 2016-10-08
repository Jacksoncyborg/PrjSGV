package com.sistemavacinacao.entity;

/**
 * Classe entidade do objeto Emails referente a tabela tb_emails
 * @author luiz
 *
 */
public class Email {
	
	 private Integer seqEmail;
	 private Long cpf;
	 private String email;
	public Integer getSeqEmail() {
		return seqEmail;
	}
	public void setSeqEmail(Integer seqEmail) {
		this.seqEmail = seqEmail;
	}
	public Long getCpf() {
		return cpf;
	}
	public void setCpf(Long cpf) {
		this.cpf = cpf;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Email [seqEmail=" + seqEmail + ", cpf=" + cpf + ", email=" + email + "]";
	}
	 
	 

}

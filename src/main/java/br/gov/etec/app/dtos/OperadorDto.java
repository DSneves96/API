package br.gov.etec.app.dtos;

import java.io.Serializable;
import java.sql.Date;



public class OperadorDto implements Serializable{
	
	private static final long serialVersionUID = 8325934242088068615L;

	
	private String nome; 
	private String rg;
	private String cpf;
	private String email;
	private Date data_nasc;
	private String senha;
	private String matricula;
	



	public String getMatricula() {
		return matricula;
	}





	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}





	public String getSenha() {
		return senha;
	}





	public void setSenha(String senha) {
		this.senha = senha;
	}





	public OperadorDto() {}
	
	
	
	

	public String getNome() {
		return nome;
	}





	public void setNome(String nome) {
		this.nome = nome;
	}





	public String getRg() {
		return rg;
	}





	public void setRg(String rg) {
		this.rg = rg;
	}





	public String getCpf() {
		return cpf;
	}





	public void setCpf(String cpf) {
		this.cpf = cpf;
	}





	public String getEmail() {
		return email;
	}





	public void setEmail(String email) {
		this.email = email;
	}





	public Date getData_nasc() {
		return data_nasc;
	}
	




	public void setData_nasc(Date data_nasc) {
		this.data_nasc = data_nasc;
	}
	
	
	



	@Override
	public String toString() {
		return "OperadorDto [nome=" + nome + ", rg=" + rg + ", cpf=" + cpf + ", email=" + email + ", data_nasc = "+data_nasc+"]";
	}

	

}

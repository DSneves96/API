package br.gov.etec.app.dtos;

import java.io.Serializable;
import java.sql.Date;



public class AlunoDto implements Serializable{
	
	private static final long serialVersionUID = 1410628766527667487L;
	
	private String nome; 
	private String rg;
	private String cpf;
	private String email;
	private Date data_nasc;
	private Long id_curso;
	



	public AlunoDto() {}
	
	
	
	

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
	
	
	

	public Long getId_curso() {
		return id_curso;
	}





	public void setId_curso(Long id_curso) {
		this.id_curso = id_curso;
	}








	@Override
	public String toString() {
		return "CursoDto [nome=" + nome + ", rg=" + rg + ", cpf=" + cpf + ", email=" + email + ", data_nasc = "+data_nasc+", id_curso = + id_curso +]";
	}

	

}

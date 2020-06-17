package br.gov.etec.app.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_operador")
public class Operador{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_operador", nullable = false)
	private Long id;
	
	@Column(name = "nome", nullable = false)
	private String nome;
	
	@Column(name = "rg", nullable = true)
	private String rg;
	
	@Column(name = "cpf", nullable = true)
	private String cpf;
	
	@Column(name = "email", nullable = true)
	private String email;
	
	@Column(name = "data_nasc", nullable = false)
	private Date data_nasc;
	
	@Column(name = "senha", nullable = false)
	private String senha;
	
	@Column(name = "matricula", nullable = false)
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

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

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


	

}

package br.gov.etec.app.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.gov.etec.app.dtos.AlunoDto;
import br.gov.etec.app.entity.Aluno;
import br.gov.etec.app.repository.AlunoRepository;





@RestController
public class AlunoController {
	
	@Autowired
	private AlunoRepository repository;
	
	private static final Logger log = LoggerFactory.getLogger(AlunoController.class);
	
	@RequestMapping("/listaraluno")
	public List<Aluno> listarAlunos(){
		log.info("listando todos alunos da base de dados");
		List<Aluno> alunos = repository.findAll();		
		for (Aluno aluno : alunos) {
			log.debug("Aluno: " ,aluno.toString());
		}	
		
		return alunos;	
	}
	
	@PostMapping
	@RequestMapping("/cadastroaluno")
	public void cadastrarAluno(@RequestBody AlunoDto dtoAluno) {		
		Aluno aluno = this.toDtoEntity(dtoAluno);		
		repository.save(aluno);
	}
		
	private Aluno toDtoEntity(AlunoDto dtoAluno) {
		log.info("Cadastro do ", dtoAluno.toString());
		log.debug("Cadastro do ", dtoAluno.toString());
		Aluno aluno = new Aluno();
		aluno.setNome(dtoAluno.getNome());
		aluno.setRg(dtoAluno.getRg());
		aluno.setCpf(dtoAluno.getCpf());
		aluno.setEmail(dtoAluno.getEmail());
		aluno.setData_nasc(dtoAluno.getData_nasc());
		aluno.setId_curso(dtoAluno.getId_curso());
		return aluno;
	}
	
	
	

}

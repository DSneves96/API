package br.gov.etec.app.controller;



import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.gov.etec.app.entity.Evento;
import br.gov.etec.app.repository.EventoRepository;


@RestController
public class EventoController {
	
	@Autowired
	private EventoRepository repository;
	
	private static final Logger log = LoggerFactory.getLogger(EventoController.class);
	
	@RequestMapping("/listarevento")
	public List<Evento> listarEvento(){
		log.info("listando todos eventos da base de dados");
		List<Evento> eventos = repository.findAll();		
		for (Evento evento : eventos) {
			log.debug("Evento: " ,evento.toString());
		}	
		
		return eventos;	
	}
	
	/*@PostMapping
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
	}*/
	
	
	

}

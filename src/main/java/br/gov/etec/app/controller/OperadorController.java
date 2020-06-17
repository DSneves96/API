package br.gov.etec.app.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.gov.etec.app.dtos.OperadorDto;
import br.gov.etec.app.entity.Operador;
import br.gov.etec.app.repository.OperadorRepository;

@RestController
public class OperadorController {
	
	@Autowired
	private OperadorRepository repository;
	
	private static final Logger log = LoggerFactory.getLogger(OperadorController.class);
	
	@RequestMapping("/listaroperador")
	public List<Operador> listarOperadores(){
		log.info("listando todos operadores da base de dados");
		List<Operador> operadores = repository.findAll();		
		for (Operador operador : operadores) {
			log.debug("Operador: ",operador.toString());
		}	
		
		return operadores;	
	}
	@PostMapping
	@RequestMapping("/cadastrooperador")
	public void cadastrarOperador(@RequestBody OperadorDto dtoOperador) {		
		Operador operador = this.toDtoEntity(dtoOperador);		
		repository.save(operador);
	}
		
	private Operador toDtoEntity(OperadorDto dtoOperador) {
		log.info("Cadastro do ", dtoOperador.toString());
		log.debug("Cadastro do ", dtoOperador.toString());
		Operador operador = new Operador();
		operador.setNome(dtoOperador.getNome());
		operador.setRg(dtoOperador.getRg());
		operador.setCpf(dtoOperador.getCpf());
		operador.setEmail(dtoOperador.getEmail());
		operador.setData_nasc(dtoOperador.getData_nasc());
		operador.setSenha(dtoOperador.getSenha());
		operador.setMatricula(dtoOperador.getMatricula());
		return operador;
	}
	
}

package br.com.campanhas.controller;

import org.junit.runners.Parameterized.Parameter;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.campanhas.dao.campanhaDaoImpl;

@Controller
@RestController
@RequestMapping({"/campanha"})
public class campanha {
	
	private campanhaDaoImpl campanha;
	
	campanha (campanhaDaoImpl campanha){
		this.campanha = campanha;
	}
	
	// metodos crud
	@PostMapping
	@RequestMapping(value="/incluir", method = RequestMethod.POST, produces = {MediaType.APPLICATION_JSON_VALUE})
	public campanha cria(@RequestBody campanha campanha) {
		return campanha.incluir(campanha);
		
	}
	
	
	@PostMapping
	@RequestMapping(value="/consultar", method = RequestMethod.POST, produces = {MediaType.APPLICATION_JSON_VALUE})
	public campanha consultar(@RequestBody campanha campanha) {
		return campanha.consultar(campanha);
	}
	
	@PostMapping
	@RequestMapping(value="/consultar/{id}", method = RequestMethod.POST, produces = {MediaType.APPLICATION_JSON_VALUE})
	public campanha consultar(@Parameter Long id) {
		return campanha.consultarId(this.id);
	}
	
}

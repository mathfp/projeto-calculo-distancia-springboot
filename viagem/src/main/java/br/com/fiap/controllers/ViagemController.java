package br.com.fiap.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.fiap.dto.ViagemDto;
import br.com.fiap.service.ViagemCalculoService;

@Controller()
public class ViagemController {
	
	@GetMapping("/viagem/calcular")
	public ModelAndView calcular() {
		ModelAndView model = new ModelAndView("viagem/calcular");
		
		ViagemDto viagem = new ViagemDto();
		
		model.addObject("viagem", viagem);
		
		return model;
	}
	
	@PostMapping("/viagem/calcular")
	public ModelAndView calcular(@ModelAttribute("viagem") ViagemDto viagem) {
		ModelAndView model = new ModelAndView("viagem/index");
		
		ViagemCalculoService viagemCalculoService = new ViagemCalculoService();
		
		viagemCalculoService.calcularViagem(viagem);
		
		model.addObject("viagem", viagem);
		
		return model;
	}
	
	@GetMapping("/viagem")
	public ModelAndView index() {
		ModelAndView model = new ModelAndView("viagem/index");
		
		
		return model;
	}
	
}

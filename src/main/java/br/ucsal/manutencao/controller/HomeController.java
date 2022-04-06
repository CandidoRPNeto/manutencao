package br.ucsal.manutencao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	private ModelAndView mvc;
	
	@GetMapping
	public ModelAndView index() {
		mvc = new ModelAndView("index");
		return mvc;
	}
}

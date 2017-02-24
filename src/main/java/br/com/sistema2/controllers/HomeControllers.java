package br.com.sistema2.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.sistema2.threads.Tarefa;



@Controller
public class HomeControllers {
  
	@RequestMapping("/")
	public String home(){
		return "home";		
	}
	
	
	
	
	
}

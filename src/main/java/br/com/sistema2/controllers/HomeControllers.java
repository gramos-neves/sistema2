package br.com.sistema2.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.sistema2.threads.Tarefa;



@Controller
public class HomeControllers {
  
	@RequestMapping("/")
	public String home(){
     
		Runnable tarefa = new Tarefa();
		Thread thread = new Thread(tarefa);
		thread.start();
		return "home";		
	}
	
}

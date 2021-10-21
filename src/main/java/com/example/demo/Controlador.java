package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class Controlador {
	
	@GetMapping("otra")
	 public String login()
	 {		
		 return "otrapagina";
	 }  

	@GetMapping("nueva")
	 public String nuevo()
	 {		
		 return "nuevo";
	 }  
}

package com.example.demo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Controller2 {
	
	@GetMapping("hola")
	@ResponseBody
    public String helloWorld() {
        return "Hello World!";
    }
}



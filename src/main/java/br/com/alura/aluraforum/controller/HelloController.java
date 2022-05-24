package br.com.alura.aluraforum.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
	
	@RequestMapping("/")
	@ResponseBody // retorno do metodo é direto no navegador
	public String Hello() {
		return "Hello World!";
	}
}

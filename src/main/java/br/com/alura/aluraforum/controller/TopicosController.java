package br.com.alura.aluraforum.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.alura.aluraforum.dto.TopicoDTO;
import br.com.alura.forum.modelo.Curso;
import br.com.alura.forum.modelo.Topico;

//@Controller para não precisar digitar sempre a @Responsebody eu utilizo o rest controller para avisar ao Spring que essa é uma RestController
@RestController
public class TopicosController {

	@RequestMapping("/topicos")
	@ResponseBody
	public List<TopicoDTO> lista() {
		Topico topico = new Topico("Dúvida", "Dúvida com Spring", new Curso("Spring", "Programação"));
		return TopicoDTO.converter(Arrays.asList(topico, topico, topico));
		// return Arrays.asList(topico, topico, topico); // Arrays.asList cria uma lista com tres elementos, que na verdade
														// sao o mesmo topico
	}

}
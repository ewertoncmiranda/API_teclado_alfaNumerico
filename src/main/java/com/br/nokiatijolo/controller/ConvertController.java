package com.br.nokiatijolo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.br.nokiatijolo.model.Convert;

@RestController
@Controller
@RequestMapping(value = "/")
public class ConvertController {
	
	@RequestMapping("/convert/{valor}")
	public String converts(@PathVariable ("valor")String valor) {
		Convert cv = new Convert() ;
	    String top = cv.conversao(valor) ;
		return top; 
	}
		
	
	

}

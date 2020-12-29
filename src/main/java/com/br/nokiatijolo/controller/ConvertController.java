package com.br.nokiatijolo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.br.nokiatijolo.model.Convert;
import com.br.nokiatijolo.service.ConvertService;

@RestController
@RequestMapping(value = "/")
public class ConvertController {
	
	@Autowired
	ConvertService repos ;
	
	@RequestMapping("/convert/{valor}")
	public String converts(@PathVariable ("valor")String valor) {
		return repos.conversor(valor);
	}
		
	
	

}

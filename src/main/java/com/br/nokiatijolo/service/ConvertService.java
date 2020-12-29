package com.br.nokiatijolo.service;

import org.springframework.stereotype.Service;

import com.br.nokiatijolo.model.Convert;

@Service
public class ConvertService {

	public String conversor(String valor) {
		Convert cv = new Convert() ;
	    return cv.conversao(valor) ;	    
	}
	
	
	
	
}

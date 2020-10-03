package com.br.nokiatijolo.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Convert {

	public Convert() {
	};

	public HashMap<String, String> getMap() {
		HashMap<String, String> maps = new HashMap<>();

		maps.put("2", "A");
		maps.put("22", "B");
		maps.put("222", "C");

		maps.put("3", "D");
		maps.put("33", "E");
		maps.put("333", "F");

		maps.put("4", "G");
		maps.put("44", "H");
		maps.put("444", "I");

		maps.put("5", "J");
		maps.put("55", "K");
		maps.put("555", "L");

		maps.put("6", "M");
		maps.put("66", "N");
		maps.put("666", "O");

		maps.put("7", "P");
		maps.put("77", "Q");
		maps.put("777", "R");
		maps.put("7777", "S");

		maps.put("8", "T");
		maps.put("88", "U");
		maps.put("888", "V");

		maps.put("9", "W");
		maps.put("99", "X");
		maps.put("999", "Y");
		maps.put("9999", "Z");
		maps.put(" ", " ");
		return maps;

	}

	public String conversao(String letras) {

		String [] numLetras = letras.split(" ");
		StringBuilder bd = new StringBuilder();
		
		
		List<String> lista01 = new ArrayList<String>();

		if (letras == null || letras.length() == 0) {
			
		}
		
		for( int x=0 ; x < numLetras.length ;x++) {
			
			String po = this.getMap().get(numLetras[x]); 			
			bd.append(po);			
		}			

		return bd.toString();
	}

}

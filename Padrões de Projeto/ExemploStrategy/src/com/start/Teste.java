package com.start;

import com.strategy.Converter;
import com.strategy.Maiuscula;
import com.strategy.Minuscula;

public class Teste {
	public static void main(String[] args) {
		String texto = "Hello";
		
		Converter converter = new Maiuscula(texto);
		
		System.out.println(converter.execute());
	}
}

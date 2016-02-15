package com.start;

import com.factory.ProjetoFactory;

public class Start {

	public static void main(String[] args) {
		ProjetoFactory factory = new ProjetoFactory();
		String nome = "InvestProj";
		String dataInicio = "01/02/2014";
		String detalhes = "Um sistema web para o TCC";
		
		factory.getSistema(nome, dataInicio, detalhes);
		
	}

}

package com.factory;

import com.creator.Investimento;
import com.creator.Sistema;

public class ProjetoFactory {
	
	public Investimento getInvestimento(String nome, String dataInicio, double valor){	
		return new Investimento(nome, dataInicio, valor);
	}
	
	public Sistema getSistema(String nome, String dataInicio, String detalhes){
		return new Sistema(nome, dataInicio, detalhes);	
	}
}

package com.creator;

public class Sistema extends Projeto{
	String detalhes;
	
	public Sistema(String nome, String dataInicio, String detalhes){
		this.nome = nome;
		this.dataInicio = dataInicio;
		this.detalhes = detalhes;
		System.out.println("Sistema: " + nome + " Sobre: " + detalhes);
	}
}

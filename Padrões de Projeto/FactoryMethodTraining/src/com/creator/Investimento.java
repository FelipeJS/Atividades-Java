package com.creator;

public class Investimento extends Projeto{
	double valor;
	
	public Investimento(String nome, String dataInicio, double valor){
		this.nome = nome;
		this.dataInicio = dataInicio;
		this.valor = valor;
		System.out.println("Investimento: " + nome + " Valor: " + valor);
	}
}

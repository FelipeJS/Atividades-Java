package com.strategy;

public class Maiuscula extends Converter{

	public Maiuscula(String texto) {
		super(texto);
	}

	public String execute() {
		return this.texto.toUpperCase();
	}

}

package com.strategy;

public class Minuscula extends Converter{

	public Minuscula(String texto) {
		super(texto);
	}

	@Override
	public String execute() {
		return this.texto.toLowerCase();
	}

}

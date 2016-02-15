package com.strategy;

public abstract class Converter {
	protected final String texto;
	
	public Converter(String texto){
		this.texto = texto;
		if(this.texto == null){
			throw new NullPointerException("Texto invalido");
		}
	}
	
	public abstract String execute();
	
}

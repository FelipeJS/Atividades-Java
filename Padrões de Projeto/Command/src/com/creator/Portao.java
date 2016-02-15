package com.creator;

public class Portao {
	public final static boolean ABERTO = true;
	public final static boolean FECHADO = false;
	private boolean estado = false;
	
	public boolean getEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	
	public void abrir() {
		this.setEstado(ABERTO);
		System.out.println("O port�o abriu");
	}
	
	public void fechar() {
		this.setEstado(FECHADO);
		System.out.println("O port�o fechou");
	}
	
	public String verEstado(){
		if(getEstado()){
			return "O port�o est� aberto";
		}
		return "O port�o est� fechado";	
	}
}

package com.command;

import com.creator.Portao;

public class AbrirCommand implements Command{
	Portao portao = new Portao();
	
	public AbrirCommand(Portao portao) {
		this.portao = portao;
	}
	
	public void excute() {
		portao.abrir();
	}
}

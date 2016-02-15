package com.command;

import com.creator.Portao;

public class FecharCommand implements Command{
	Portao portao = new Portao();
	
	public FecharCommand(Portao portao){
		this.portao = portao;
	}
	
	public void excute() {
		portao.fechar();
	}
}

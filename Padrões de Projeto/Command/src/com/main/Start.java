package com.main;

import com.command.AbrirCommand;
import com.command.Command;
import com.command.FecharCommand;
import com.creator.Controle;
import com.creator.Portao;

public class Start {
	public static void main(String[] args) {
		Portao portao = new Portao();
		Command abrirCommand = new AbrirCommand(portao);
		Command fecharCommand = new FecharCommand(portao);
		Controle controle = new Controle(abrirCommand, fecharCommand);
		
		controle.abrirPortao();
		controle.fecharPortao();
		controle.abrirPortao();
		controle.abrirPortao();
		controle.fecharPortao();
	}
	
}

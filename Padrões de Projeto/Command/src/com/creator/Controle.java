package com.creator;

import com.command.Command;

public class Controle {
	private Command[] commands;
	
	public Controle(Command abrirCommand, Command fecharCommand){
		this.commands = new Command[2];
		commands[0] = abrirCommand;
		commands[1] = fecharCommand;
	}
	
	public void abrirPortao(){
		commands[0].excute();
	}
	
	public void fecharPortao(){
		commands[1].excute();
	}
	
}

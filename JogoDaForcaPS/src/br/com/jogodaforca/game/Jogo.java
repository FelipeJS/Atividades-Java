package br.com.jogodaforca.game;

import java.util.Scanner;

import br.com.jogodaforca.implementObserver.JogoObservable;
import br.com.jogodaforca.model.Letra;

//Criei essa classe para tentar distribuir a logica do jogo
public class Jogo {
	Letra letra = new Letra();
	Scanner scan = new Scanner(System.in);
	JogoObservable jogoObservable = new JogoObservable();

	public char getLetra() {
		return letra.getLetra();
	}

	public void setLetra() {
		System.out.println("\nDigite uma letra:");
		letra.setLetra(scan.nextLine().charAt(0));
	}
}

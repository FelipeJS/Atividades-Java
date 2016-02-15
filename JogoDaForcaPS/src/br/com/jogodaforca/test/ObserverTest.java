package br.com.jogodaforca.test;

import org.junit.Test;

import br.com.jogodaforca.implementObserver.JogadorObserver;
import br.com.jogodaforca.implementObserver.JogoObservable;

public class ObserverTest {

	@Test
	public void registrarJogador() {
		JogoObservable jogo = new JogoObservable();
		JogadorObserver jogador1 = new JogadorObserver();
		JogadorObserver jogador2 = new JogadorObserver();

		jogo.registerObserver(jogador1);
		jogo.registerObserver(jogador2);

	}
}

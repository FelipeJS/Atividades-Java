package br.com.jogodaforca.implementObserver;

import br.com.jogodaforca.interfaceObserver.Observer;

public class JogadorObserver implements Observer {

	public void update(Object obj) {
		char[] palavraDoJogo = (char[]) obj;
		System.out.println(palavraDoJogo);
	}

}

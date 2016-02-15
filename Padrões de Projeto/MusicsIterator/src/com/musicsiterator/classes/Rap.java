package com.musicsiterator.classes;

import java.util.Arrays;
import java.util.Iterator;

public class Rap implements MusicaIterator {
	private Musica[] melhoresMusicas;
	private int contador = 0;

	public Rap() {
		melhoresMusicas = new Musica[3];

		addMusica("Magico de Oz", "Racionais", 2005);
		addMusica("Formula Magica da Paz", "Jorge e Matheus", 2004);
		addMusica("Nego Drama", "Jorge e Matheus", 2002);
	}

	public void addMusica(String nome, String banda, int ano) {
		Musica musica = new Musica(nome, banda, ano);

		melhoresMusicas[contador++] = musica;
	}

	// Sem Iterator
	// public Musica[] getMelhoresMusicas() {
	// return melhoresMusicas;
	// }

	public Iterator<Musica> createIterator() {
		return Arrays.asList(melhoresMusicas).iterator();
	}

}

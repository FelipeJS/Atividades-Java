package com.musicsiterator.classes;

import java.util.ArrayList;
import java.util.Iterator;

public class Sertanejo implements MusicaIterator {
	private ArrayList<Musica> melhoresMusicas;

	public Sertanejo() {
		melhoresMusicas = new ArrayList<Musica>();

		addMusica("Flor", "Jorge e Matheus", 2011);
		addMusica("Anjos", "Jorge e Matheus", 2015);
		addMusica("Amor", "Jorge e Matheus", 2014);
	}

	public void addMusica(String nome, String banda, int ano) {
		Musica musica = new Musica(nome, banda, ano);

		melhoresMusicas.add(musica);
	}

	// Sem Iterator
	// public ArrayList<Musica> getMelhoresMusicas() {
	// return melhoresMusicas;
	// }

	public Iterator<Musica> createIterator() {
		return melhoresMusicas.iterator();
	}

}

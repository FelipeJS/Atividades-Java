package com.musicsiterator.classes;

import java.util.Hashtable;
import java.util.Iterator;

public class Rock implements MusicaIterator {
	private Hashtable<Integer, Musica> melhoresMusicas;
	private int contador = 0;

	public Rock() {
		melhoresMusicas = new Hashtable<Integer, Musica>();

		addMusica("Na sua estante", "Pity", 2010);
		addMusica("Equalize", "Pity", 2008);
		addMusica("Teto de vidro", "Pity", 2009);
	}

	public void addMusica(String nome, String banda, int ano) {
		Musica musica = new Musica(nome, banda, ano);

		melhoresMusicas.put(contador++, musica);
	}

	// Sem Iterator
	// public Hashtable<Integer, Musica> getMelhoresMusicas() {
	// return melhoresMusicas;
	// }

	public Iterator<Musica> createIterator() {
		return melhoresMusicas.values().iterator();
	}

}

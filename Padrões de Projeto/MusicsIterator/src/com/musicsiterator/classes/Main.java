package com.musicsiterator.classes;

public class Main {
	public static void main(String[] args) {
		Sertanejo sertanejo = new Sertanejo();
		Rock rock = new Rock();
		Rap rap = new Rap();
		Discoteca discoteca = new Discoteca(sertanejo, rock, rap);

		discoteca.mostrarMusicasComIterator();
	}
}

package com.musicsiterator.classes;

import java.util.Iterator;

public class Discoteca {
	private MusicaIterator iterSertanejo;
	private MusicaIterator iterRock;
	private MusicaIterator iterRap;

	public Discoteca(MusicaIterator iterSertanejo, MusicaIterator iterRock,
			MusicaIterator iterRap) {
		this.iterSertanejo = iterSertanejo;
		this.iterRock = iterRock;
		this.iterRap = iterRap;
	}

	// Sem Iterator
	// public void mostarMusicas() {
	// ArrayList<Musica> melhoresSertanejos = sertanejo.getMelhoresMusicas();
	//
	// System.out.println("Melhores Sertanejos:\n");
	//
	// for (Musica msc : melhoresSertanejos) {
	// System.out.println(msc.getNome());
	// System.out.println(msc.getBanda());
	// System.out.println(msc.getAno());
	// }
	//
	// Hashtable<Integer, Musica> melhoresRocks = rock.getMelhoresMusicas();
	//
	// System.out.println();
	// System.out.println("Melhores Rocks:\n");
	//
	// for (Enumeration<Integer> e = melhoresRocks.keys(); e.hasMoreElements();)
	// {
	// Musica musica = melhoresRocks.get(e.nextElement());
	//
	// System.out.println(musica.getNome());
	// System.out.println(musica.getBanda());
	// System.out.println(musica.getAno());
	// }
	//
	// Musica[] melhoresRaps = rap.getMelhoresMusicas();
	//
	// System.out.println();
	// System.out.println("Melhores Raps:\n");
	//
	// for (Musica msc : melhoresRaps) {
	// System.out.println(msc.getNome());
	// System.out.println(msc.getBanda());
	// System.out.println(msc.getAno());
	// }
	// }

	public void mostrarMusicasComIterator() {
		Iterator<Musica> sertanejo = iterSertanejo.createIterator();
		Iterator<Musica> rock = iterRock.createIterator();
		Iterator<Musica> rap = iterRap.createIterator();

		System.out.println("Melhores Sertanejos:\n");
		iterarMusicas(sertanejo);

		System.out.println("Melhores Rocks:\n");
		iterarMusicas(rock);

		System.out.println("Melhores Raps:\n");
		iterarMusicas(rap);

	}

	public void iterarMusicas(Iterator<Musica> iterator) {
		while (iterator.hasNext()) {
			Musica musica = iterator.next();

			System.out.println(musica.getNome());
			System.out.println(musica.getBanda());
			System.out.println(musica.getAno());
		}
	}

}

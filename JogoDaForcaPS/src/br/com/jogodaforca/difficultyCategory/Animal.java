package br.com.jogodaforca.difficultyCategory;

import java.util.ArrayList;

import br.com.jogodaforca.dao.PalavraDAO;
import br.com.jogodaforca.model.Palavra;

public class Animal {
	ArrayList<Palavra> animais = new ArrayList<Palavra>();
	Palavra palavra = new Palavra();
	PalavraDAO dao = new PalavraDAO();
	int qntDePalavrasBD = 7;

	public ArrayList<Palavra> selecionarCategoria() {

		for (int i = 1; i < qntDePalavrasBD; i++) {
			palavra.setCodigo(i);
			try {
				Palavra palavraRetorno = dao.buscarPalavra(palavra);

				if (palavraRetorno.getCategoria().toLowerCase().equals("animal")) {
					animais.add(palavraRetorno);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return animais;
	}
}

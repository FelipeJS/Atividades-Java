package br.com.jogodaforca.test;

import org.junit.Test;

import br.com.jogodaforca.difficultyCategory.Filme;

public class FilmeTest {
	Filme filme = new Filme();
	
	@Test
	public void buscarFilmes(){
		System.out.println(filme.selecionarCategoria());
	}
}

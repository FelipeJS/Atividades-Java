package br.com.jogodaforca.test;

import org.junit.Test;

import br.com.jogodaforca.difficultyCategory.Facil;

public class FacilTest {
	Facil facil = new Facil();

	@Test
	public void mostraDificuldade() {
		System.out.println(facil.getDificuldade());
	}
}

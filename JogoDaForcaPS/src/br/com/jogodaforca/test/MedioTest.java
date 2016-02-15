package br.com.jogodaforca.test;

import org.junit.Test;

import br.com.jogodaforca.difficultyCategory.Medio;

public class MedioTest {
	Medio medio = new Medio();

	@Test
	public void mostraDificuldade() {
		System.out.println(medio.getDificuldade());
	}
}

package br.com.jogodaforca.test;

import org.junit.Test;

import br.com.jogodaforca.difficultyCategory.Animal;

public class AnimalTest {
	Animal animal = new Animal();
	
	@Test
	public void buscarAnimais() {

		System.out.println(animal.selecionarCategoria());
	}
}

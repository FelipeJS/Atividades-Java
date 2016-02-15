package br.com.jogodaforca.test;

import org.junit.Test;

import br.com.jogodaforca.difficultyCategory.Profissao;

public class ProfissaoTest {
	Profissao profissao = new Profissao();

	@Test
	public void buscarProfissoes() {

		System.out.println(profissao.selecionarCategoria());
	}
}

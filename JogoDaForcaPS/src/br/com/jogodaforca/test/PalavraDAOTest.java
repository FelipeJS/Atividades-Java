package br.com.jogodaforca.test;

import java.sql.SQLException;

import org.junit.Test;

import br.com.jogodaforca.dao.PalavraDAO;
import br.com.jogodaforca.model.Palavra;

public class PalavraDAOTest {
	@Test
	public void buscarPalavra() {
		Palavra palavra = new Palavra();
		palavra.setCodigo(1);

		PalavraDAO dao = new PalavraDAO();

		try {
			Palavra palavraRetorno = dao.buscarPalavra(palavra);
			System.out.println(palavraRetorno);
			System.out.println(palavraRetorno.getCategoria().toLowerCase());
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Erro ao tentar trazer a palavra");
		}
	}
}

package br.com.jogodaforca.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.com.jogodaforca.factory.Conexao;
import br.com.jogodaforca.model.Palavra;

public class PalavraDAO {
	public Palavra buscarPalavra(Palavra palavra) throws SQLException {
		StringBuilder sql = new StringBuilder();
		sql.append("SELECT codigo, palavra, categoria ");
		sql.append("FROM tbl_palavra ");
		sql.append("WHERE codigo = ? ");

		Connection conexao = Conexao.conectar();

		PreparedStatement comando = conexao.prepareStatement(sql.toString());
		comando.setInt(1, palavra.getCodigo());

		ResultSet resultado = comando.executeQuery();

		Palavra retorno = null;

		if (resultado.next()) {
			retorno = new Palavra();
			retorno.setCodigo(resultado.getInt("codigo"));
			retorno.setPalavra(resultado.getString("palavra"));
			retorno.setCategoria(resultado.getString("categoria"));
		}

		return retorno;
	}
}

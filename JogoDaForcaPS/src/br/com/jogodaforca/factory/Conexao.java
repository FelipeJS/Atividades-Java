package br.com.jogodaforca.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
	private static final String USUARIO = "root";
	private static final String SENHA = "2236763";
	private static final String URL = "jdbc:mysql://localhost:3306/jogodaforca";
	
	public static Connection conectar() throws SQLException{
		Connection conexao = DriverManager.getConnection(URL, USUARIO, SENHA);
		return conexao;
	}
}

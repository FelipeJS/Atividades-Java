package br.com.investprojrestful.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
	private static final String DRIVER = "com.mysql.jdbc.Driver";
	private static final String USUARIO = "root";
	private static final String SENHA = "2236763";
	private static final String URL = "jdbc:mysql://localhost:3306/webservice";

	public Connection conectar() {
		Connection conexao = null;

		try {
			Class.forName(DRIVER);
			conexao = DriverManager.getConnection(URL, USUARIO, SENHA);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return conexao;
	}

	public void fecharConexao(Connection connection) {
		if (connection != null) {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		Conexao conexao = new Conexao();
		
		try{
		Connection connection = conexao.conectar();
		System.out.println("Conexão realizada com sucesso");
		conexao.fecharConexao(connection);
		System.out.println("Conexão fechada com sucesso");
		}catch(Exception e){
			System.out.println("Deu erro");
		}
	}
}

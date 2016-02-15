package br.com.investprojrestful.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import br.com.investprojrestful.domain.Usuario;
import br.com.investprojrestful.factory.Conexao;

/**
 * 
 * @author Felipe Campos
 * @since 13/05/2015
 * @version 1.0
 */

public class UsuarioDAO extends Conexao {
	private static UsuarioDAO instance;
	
	
	public static UsuarioDAO getInstance() {
		if(instance == null)
			instance = new UsuarioDAO();
		return instance;
	}


	public ArrayList<Usuario> listarTodos(){
		Conexao conexao = new Conexao();
		Connection connection = conexao.conectar();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		ArrayList<Usuario> usuarios = null;
		usuarios = new ArrayList<Usuario>();
		
		try{	
			pstmt = connection.prepareStatement("select * from usuario");
			rs = pstmt.executeQuery();
			
			while(rs.next()){
				Usuario usuario = new Usuario();
				
				usuario.setId(rs.getInt("id"));
				usuario.setNome(rs.getString("nome"));
				usuario.setEmail(rs.getString("email"));
				usuario.setCpf(rs.getString("cpf"));
				
				usuarios.add(usuario);
			}
		}catch(Exception e){
			System.out.println("Erro ao listar todos os usuarios");
			e.printStackTrace();
		}finally{
			fecharConexao(connection);
		}
		return usuarios;
	}
	
	public static void main(String[] args) {
		UsuarioDAO dao = new UsuarioDAO();
		System.out.println(dao.listarTodos());
		
	}
}

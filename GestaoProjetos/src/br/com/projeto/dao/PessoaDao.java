package br.com.projeto.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import br.com.projeto.domain.Pessoa;
import br.com.projeto.factory.ConexaoFactory;

public class PessoaDao {
	
	public void salvar(Pessoa f) throws SQLException {
		StringBuilder sql = new StringBuilder();

		sql.append("INSERT INTO pessoa ");
		sql.append("(nome, telefone, tarefa_id) ");
		sql.append("VALUES(? ? ?)");

		Connection conexao = ConexaoFactory.conectar();

		PreparedStatement comando = conexao.prepareStatement(sql.toString());
		comando.setString(1, f.getNome());
		comando.setString(2, f.getTelefone());
		comando.setInt(3, f.getIdtarefa());

		comando.executeUpdate();
	}

	public void excluir(Pessoa f) throws SQLException {
		StringBuilder sql = new StringBuilder();
		sql.append("DELETE FROM pessoa ");
		sql.append("WHERE codigo = ? ");

		Connection conexao = ConexaoFactory.conectar();

		PreparedStatement comando = conexao.prepareStatement(sql.toString());
		comando.setLong(1, f.getCodigo());

		comando.executeUpdate();
	}

	public void editar(Pessoa f) throws SQLException {
		StringBuilder sql = new StringBuilder();
		sql.append("UPDATE pessoa ");
		sql.append("SET nome = ? ");
		sql.append("WHERE codigo = ?");

		Connection conexao = ConexaoFactory.conectar();

		PreparedStatement comando = conexao.prepareStatement(sql.toString());
		comando.setString(1, f.getNome());
		comando.setLong(2, f.getCodigo());

		comando.executeUpdate();

	}

	public Pessoa pesquisar(Pessoa f) throws SQLException {
		StringBuilder sql = new StringBuilder();
		sql.append("SELECT codigo, nome ");
		sql.append("FROM pessoa ");
		sql.append("WHERE codigo = ?");

		Connection conexao = ConexaoFactory.conectar();

		PreparedStatement comando = conexao.prepareStatement(sql.toString());
		comando.setLong(1, f.getCodigo());

		ResultSet resultado = comando.executeQuery();
		Pessoa retorno = null;

		if (resultado.next()) {
			retorno = new Pessoa();
			retorno.setCodigo(resultado.getInt("codigo"));
			retorno.setNome(resultado.getString("nome"));
		}

		return retorno;
	}

	public ArrayList<Pessoa> listar() throws SQLException {
		StringBuilder sql = new StringBuilder();
		sql.append("SELECT codigo, nome ");
		sql.append("FROM pessoa ");
		sql.append("ORDER BY descricao ASC");

		Connection conexao = ConexaoFactory.conectar();

		PreparedStatement comando = conexao.prepareStatement(sql.toString());

		ResultSet resultado = comando.executeQuery();

		ArrayList<Pessoa> lista = new ArrayList<Pessoa>();

		while (resultado.next()) {
			Pessoa f = new Pessoa();
			f.setCodigo(resultado.getInt("codigo"));
			f.setNome(resultado.getString("nome"));

			lista.add(f);
		}

		return lista;
	}

	public ArrayList<Pessoa> buscarPorDescricao(Pessoa f) throws SQLException {
		StringBuilder sql = new StringBuilder();
		sql.append("SELECT codigo, nome ");
		sql.append("FROM fabricante ");
		sql.append("WHERE descricao LIKE ? ");
		sql.append("ORDER BY descricao ASC ");

		Connection conexao = ConexaoFactory.conectar();

		PreparedStatement comando = conexao.prepareStatement(sql.toString());
		comando.setString(1, "%" + f.getNome() + "%");

		ResultSet resultado = comando.executeQuery();

		ArrayList<Pessoa> lista = new ArrayList<Pessoa>();

		while (resultado.next()) {
			Pessoa item = new Pessoa();
			item.setCodigo(resultado.getInt("codigo"));
			item.setNome(resultado.getString("nome"));

			lista.add(item);
		}

		return lista;
	}

	public static void main(String[] args) {
		
		//inserindo duas pessoas no banco
		Pessoa f1 = new Pessoa();
		f1.setNome("Felipe");
		f1.setTelefone("999999934");
		f1.setIdtarefa(1);

		Pessoa f2 = new Pessoa();
		f2.setNome("Parker");
		f2.setTelefone("9999999");
		f2.setIdtarefa(2);

		PessoaDao fdao = new PessoaDao();

		try {
			fdao.salvar(f1);
			fdao.salvar(f2);
			System.out.println("Incluido com Sucesso");
		} catch (Exception e) {
			System.out.println("Falha ao salvar");
			e.printStackTrace();
		}
		
		/*
		 * Pessoa f1 = new Pessoa(); f1.setPessoa("ovo");
		 * 
		 * PessoaDAO fdao = new PessoaDAO();
		 * 
		 * try { ArrayList<Fabricante> lista = fdao.buscarPorDescricao(f1);
		 * 
		 * for (Fabricante f : lista) { System.out.println(f); }
		 * 
		 * } catch (SQLException e) { System.out.println("Erro");
		 * e.printStackTrace(); }
		 */

		/*
		 * Listar FabricanteDAO fdao = new FabricanteDAO();
		 * 
		 * try { ArrayList<Fabricante> lista = fdao.listar();
		 * 
		 * for (Fabricante f : lista) { System.out.println(f); } } catch
		 * (SQLException e) { System.out.println("Erro"); e.printStackTrace(); }
		 */

		/*
		 * Pesquisar Fabricante f1 = new Fabricante(); f1.setCodigo(2L);
		 * 
		 * FabricanteDAO fdao = new FabricanteDAO();
		 * 
		 * try { Fabricante resultado = fdao.pesquisar(f1);
		 * System.out.println(resultado.toString()); } catch (SQLException e) {
		 * System.out.println("Não foi possivel encontrar o fabricante");
		 * e.printStackTrace(); }
		 */

		

		/*
		 * Excluir Fabricante f1 = new Fabricante(); f1.setCodigo(1L);
		 * 
		 * FabricanteDAO fdao = new FabricanteDAO();
		 * 
		 * try { fdao.excluir(f1); System.out.println("Exluido com sucesso"); }
		 * catch (SQLException e) { System.out.println("Erro ao excluir");
		 * e.printStackTrace(); }
		 */

		/*
		 * Editar Fabricante f1 = new Fabricante();
		 * f1.setDescricao("Nova Descrição"); f1.setCodigo(2L);
		 * 
		 * FabricanteDAO fdao = new FabricanteDAO();
		 * 
		 * try { fdao.editar(f1); System.out.println("Alterado com sucesso"); }
		 * catch (SQLException e) { System.out.println("Falha ao alterar");
		 * e.printStackTrace(); }
		 */
	}
}

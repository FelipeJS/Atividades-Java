package br.com.projeto.domain;

public class Pessoa {
	private int codigo;
	private String nome;
	private String telefone;
	private int idtarefa;

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public int getIdtarefa() {
		return idtarefa;
	}

	public void setIdtarefa(int idtarefa) {
		this.idtarefa = idtarefa;
	}

	@Override
	public String toString() {
		String saida = codigo + " - " + nome + " - " + idtarefa;
		return saida;
	}
}

package br.com.projeto.domain;

public class SubTarefa {
	private int codigo;
	private String nome;
	private String descricao;
	private String inicio;
	private String termino;
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

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getInicio() {
		return inicio;
	}

	public void setInicio(String inicio) {
		this.inicio = inicio;
	}

	public String getTermino() {
		return termino;
	}

	public void setTermino(String termino) {
		this.termino = termino;
	}

	public int getIdtarefa() {
		return idtarefa;
	}

	public void setIdtarefa(int idtarefa) {
		this.idtarefa = idtarefa;
	}

	@Override
	public String toString() {
		String saida = codigo + " - " + nome + " - " + descricao + " - " + idtarefa;
		return saida;
	}
}

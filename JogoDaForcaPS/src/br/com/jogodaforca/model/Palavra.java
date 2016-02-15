package br.com.jogodaforca.model;

public class Palavra {
	private int codigo;
	private String palavra;
	private String categoria;

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getPalavra() {
		return palavra;
	}

	public void setPalavra(String palavra) {
		this.palavra = palavra;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	@Override
	public String toString() {
		return "Palavra [codigo=" + codigo + ", palavra=" + palavra
				+ ", categoria=" + categoria + "]";
	}

}

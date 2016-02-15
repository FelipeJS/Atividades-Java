package com.musicsiterator.classes;

public class Musica {
	private String nome;
	private String banda;
	private int ano;

	public Musica(String nome, String banda, int ano) {
		this.nome = nome;
		this.banda = banda;
		this.ano = ano;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getBanda() {
		return banda;
	}

	public void setBanda(String banda) {
		this.banda = banda;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	@Override
	public String toString() {
		return "MusicaInfo [nome=" + nome + ", banda=" + banda + ", ano=" + ano
				+ "]";
	}

}

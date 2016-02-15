package domain;

public class Tarefa {
	private int codigo;
	private String nome;
	private String descricao;
	private Pessoa pessoa;

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

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	@Override
	public String toString() {
		String saida = "Codigo: " + codigo + " | Nome: " + nome
				+ " | Descrição: " + descricao + "\r\n" + pessoa.getNome();
		return saida;
	}
}

package domain;

public class SubTarefa {
	private int codigo;
	private String nome;
	private String descricao;
	private Tarefa tarefa;

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

	public Tarefa getTarefa() {
		return tarefa;
	}

	public void setTarefa(Tarefa tarefa) {
		this.tarefa = tarefa;
	}

	@Override
	public String toString() {
		String saida = "Codigo: " + codigo + " | Nome: " + nome
				+ " | Descrição: " + descricao + "\r\n SubTarefa da Tarefa: "
				+ tarefa.getNome();
		return saida;
	}
}

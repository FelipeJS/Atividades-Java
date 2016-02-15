package dao;

import java.util.ArrayList;

import domain.Pessoa;
import domain.Tarefa;

public class TarefaDao {
	static ArrayList<Tarefa> listaDeTarefas = new ArrayList<Tarefa>();

	public void salvar(int codigo, String nome, String descricao, Pessoa pessoa) {
		Tarefa t = new Tarefa();

		t.setCodigo(codigo);
		t.setNome(nome);
		t.setDescricao(descricao);
		t.setPessoa(pessoa);

		listaDeTarefas.add(t);
		System.out.println("\r\nTarefa Cadastrada com Sucesso\r\n");
	}

	public String editar(int codigo, String nome, String descricao) {
		if (!listaDeTarefas.isEmpty()) {
			for (Tarefa tarefa : listaDeTarefas) {
				if (tarefa.getCodigo() == codigo) {
					tarefa.setNome(nome);
					tarefa.setDescricao(descricao);
					return "\r\nInformações Alteradas com Sucesso\r\n";
				} else {
					return "\r\nCodigo Não Encontrado na Lista\r\n";
				}
			}
		}
		return "\r\nA Lista Está Vazia\r\n";
	}

	public String excluir(int codigo) {
		if (!listaDeTarefas.isEmpty()) {
			for (Tarefa tarefa : listaDeTarefas) {
				if (tarefa.getCodigo() == codigo) {
					listaDeTarefas.remove(tarefa);
					return "\r\nTarafa Removida com Sucesso\r\n";
				} else {
					return "\r\nCodigo Não Encontrado na Lista\r\n";
				}
			}
		}
		return "\r\nA Lista Está Vazia\r\n";
	}

	public void listar() {
		if (!listaDeTarefas.isEmpty()) {
			for (Tarefa tarefa : listaDeTarefas) {
				System.out.println("\r\n" + tarefa.toString() + "\r\n");
			}
		}else{
			System.out.println("A Lista Está Vazia");
		}
	}
	
	//Método para verificar se existe a tarefa cadastrada para ser usada nas SubTarefas
		public Tarefa verificar(int codigo) {
			if (!listaDeTarefas.isEmpty()) {
				for (Tarefa tarefa : listaDeTarefas) {
					if(tarefa.getCodigo() == codigo){
						return tarefa;
					}else{
						System.out.println("Tarefa Não Cadastrada");
					}
				}
			}else{
				System.out.println("A Lista Está Vazia");
			}
			return null;
		}
}

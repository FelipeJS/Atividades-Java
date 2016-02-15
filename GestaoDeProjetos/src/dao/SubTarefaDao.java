package dao;

import java.util.ArrayList;

import domain.SubTarefa;
import domain.Tarefa;

public class SubTarefaDao {
	static ArrayList<SubTarefa> listaDeSubTarefas = new ArrayList<SubTarefa>();

	public void salvar(int codigo, String nome, String descricao, Tarefa tarefa) {
		SubTarefa s = new SubTarefa();

		s.setCodigo(codigo);
		s.setNome(nome);
		s.setDescricao(descricao);
		s.setTarefa(tarefa);

		listaDeSubTarefas.add(s);
		System.out.println("\r\nSubTarefa Cadastrada com Sucesso\r\n");
	}

	public String editar(int codigo, String nome, String descricao) {
		if (!listaDeSubTarefas.isEmpty()) {
			for (SubTarefa subtarefa : listaDeSubTarefas) {
				if (subtarefa.getCodigo() == codigo) {
					subtarefa.setNome(nome);
					subtarefa.setDescricao(descricao);
					return "\r\nInformações Alteradas com Sucesso\r\n";
				} else {
					return "\r\nCodigo Não Encontrado na Lista\r\n";
				}
			}
		}
		return "\r\nA Lista Está Vazia\r\n";
	}

	public String excluir(int codigo) {
		if (!listaDeSubTarefas.isEmpty()) {
			for (SubTarefa subtarefa : listaDeSubTarefas) {
				if (subtarefa.getCodigo() == codigo) {
					listaDeSubTarefas.remove(subtarefa);
					return "\r\nSubTarafa Removida com Sucesso\r\n";
				} else {
					return "\r\nCodigo Não Encontrado na Lista\r\n";
				}
			}
		}
		return "\r\nA Lista Está Vazia\r\n";
	}

	public void listar() {
		if (!listaDeSubTarefas.isEmpty()) {
			for (SubTarefa subtarefa : listaDeSubTarefas) {
				System.out.println("\r\n" + subtarefa.toString() + "\r\n");
			}
		}else{
			System.out.println("A Lista Está Vazia");
		}
	}
}

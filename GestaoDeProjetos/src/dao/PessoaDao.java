package dao;

import java.util.ArrayList;

import domain.Pessoa;

public class PessoaDao {

	static ArrayList<Pessoa> listaDePessoas = new ArrayList<Pessoa>();

	public void salvar(int codigo, String nome, String telefone) {
		Pessoa p = new Pessoa();

		p.setCodigo(codigo);
		p.setNome(nome);
		p.setTelefone(telefone);

		listaDePessoas.add(p);
		System.out.println("\r\nPessoa Cadastrada com Sucesso\r\n");
	}

	public String editar(int codigo, String nome, String telefone) {
		if (!listaDePessoas.isEmpty()) {
			for (Pessoa pessoa : listaDePessoas) {
				if (pessoa.getCodigo() == codigo) {
					pessoa.setNome(nome);
					pessoa.setTelefone(telefone);
					return "\r\nInformações Alteradas com Sucesso\r\n";
				} else {
					return "\r\nCodigo Não Encontrado na Lista\r\n";
				}
			}
		}
		return "\r\nA Lista Está Vazia\r\n";
	}

	public String excluir(int codigo) {
		if (!listaDePessoas.isEmpty()) {
			for (Pessoa pessoa : listaDePessoas) {
				if (pessoa.getCodigo() == codigo) {
					listaDePessoas.remove(pessoa);
					return "\r\nPessoa Removida com Sucesso\r\n";
				} else {
					return "\r\nCodigo Não Encontrado na Lista\r\n";
				}
			}
		}
		return "\r\nA Lista Está Vazia\r\n";
	}

	public void listar() {
		if (!listaDePessoas.isEmpty()) {
			for (Pessoa p : listaDePessoas) {
				System.out.println("\r\n" + p.toString() + "\r\n");
			}
		}else{
			System.out.println("A Lista Está Vazia");
		}
	}
	
	//Método para verificar se existe a pessoa cadastrada para ser usada nas tarefas
	public Pessoa verificar(int codigo) {
		if (!listaDePessoas.isEmpty()) {
			for (Pessoa pessoa : listaDePessoas) {
				if(pessoa.getCodigo() == codigo){
					return pessoa;
				}else{
					System.out.println("Pessoa Não Cadastrada");
				}
			}
		}else{
			System.out.println("A Lista Está Vazia");
		}
		return null;
	}
}

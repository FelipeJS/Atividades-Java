package main;

import java.util.Scanner;

import dao.PessoaDao;
import dao.SubTarefaDao;
import dao.TarefaDao;
import domain.Pessoa;
import domain.SubTarefa;
import domain.Tarefa;

public class main {
	private static Scanner input;

	public static void main(String[] args) {
		input = new Scanner(System.in);
		Menu menu = new Menu();
		Pessoa p = new Pessoa();
		PessoaDao pdao = new PessoaDao();
		Tarefa t = new Tarefa();
		TarefaDao tdao = new TarefaDao();
		SubTarefa s = new SubTarefa();
		SubTarefaDao sdao = new SubTarefaDao();
		int opcaoCrud;
		int opcaoTipo;
		int countPessoa = 0;
		int countTarefa = 0;
		int countSubTarefa = 0;

		while (true) {
			opcaoCrud = menu.menuCrud();

			switch (opcaoCrud) {
			case 1:
				opcaoTipo = menu.menuTipo();

				switch (opcaoTipo) {
				case 1:
					p.setCodigo(++countPessoa);

					System.out.print("Digite o Nome: ");
					p.setNome(input.next());

					System.out.print("Digite o Telefone: ");
					p.setTelefone(input.next());

					pdao.salvar(p.getCodigo(), p.getNome(), p.getTelefone());
					break;
				case 2:
					t.setCodigo(++countTarefa);

					System.out.print("Digite o Nome da Tarefa: ");
					t.setNome(input.next());

					System.out.print("Digite a Descrição da Tarefa: ");
					t.setDescricao(input.next());

					System.out.print("Digite o Codigo da Pessoa: ");
					int codigoP = input.nextInt();
					Pessoa pessoa = new Pessoa();
					pessoa = pdao.verificar(codigoP);

					if (pessoa != null) {
						t.setPessoa(pessoa);
						tdao.salvar(t.getCodigo(), t.getNome(), t.getDescricao(), t.getPessoa());
					}
					break;
				case 3:
					s.setCodigo(++countSubTarefa);

					System.out.print("Digite o Nome da SubTarefa: ");
					s.setNome(input.next());

					System.out.print("Digite a Descrição da SubTarefa: ");
					s.setDescricao(input.next());

					System.out.print("Digite o Codigo da Tarefa Relacionada: ");
					int codigoT = input.nextInt();
					Tarefa tarefa = new Tarefa();
					tarefa = tdao.verificar(codigoT);

					if (tarefa != null) {
						s.setTarefa(tarefa);
						sdao.salvar(s.getCodigo(), s.getNome(), s.getDescricao(), s.getTarefa());
					}
					break;
				default:
					System.out.println("\n\nOPÇÃO INVALIDA\n\n");
					break;
				}
				break;
			case 2:
				opcaoTipo = menu.menuTipo();

				switch (opcaoTipo) {
				case 1:
					System.out.print("Codigo que Deseja Editar: ");
					int codigoP = input.nextInt();

					System.out.print("Novo Nome: ");
					p.setNome(input.next());

					System.out.print("Novo Telefone: ");
					p.setTelefone(input.next());

					System.out.println(pdao.editar(codigoP, p.getNome(), p.getTelefone()));
					break;
				case 2:
					System.out.print("Codigo da Tarefa que Deseja Editar: ");
					int codigoT = input.nextInt();

					System.out.print("Novo Nome: ");
					t.setNome(input.next());

					System.out.print("Nova Descrição: ");
					t.setDescricao(input.next());

					System.out.println(tdao.editar(codigoT, t.getNome(), t.getDescricao()));
					break;
				case 3:
					System.out.print("Codigo da SubTarefa que Deseja Editar: ");
					int codigoS = input.nextInt();

					System.out.print("Novo Nome: ");
					s.setNome(input.next());

					System.out.print("Nova Descrição: ");
					s.setDescricao(input.next());

					System.out.println(sdao.editar(codigoS, s.getNome(), s.getDescricao()));
					break;
				default:
					System.out.println("\n\nOPÇÃO INVALIDA\n\n");
					break;
				}
				break;
			case 3:
				opcaoTipo = menu.menuTipo();

				switch (opcaoTipo) {
				case 1:
					System.out.print("Codigo da Pessoa que Deseja Excluir: ");
					int codigoP = input.nextInt();

					System.out.println(pdao.excluir(codigoP));
					break;
				case 2:
					System.out.print("Codigo da Tarefa que Deseja Excluir: ");
					int codigoT = input.nextInt();

					System.out.println(tdao.excluir(codigoT));
					break;
				case 3:
					System.out.print("Codigo da SubTarefa que Deseja Excluir: ");
					int codigoS = input.nextInt();

					System.out.println(sdao.excluir(codigoS));
					break;
				default:
					System.out.println("\n\nOPÇÃO INVALIDA\n\n");
					break;
				}
				break;
			case 4:
				opcaoTipo = menu.menuTipo();

				switch (opcaoTipo) {
				case 1:
					pdao.listar();
					break;
				case 2:
					tdao.listar();
					break;
				case 3:
					sdao.listar();
					break;
				default:
					System.out.println("\n\nOPÇÃO INVALIDA\n\n");
					break;
				}
				break;
			default:
				System.out.println("\n\nOPÇÃO INVALIDA\n\n");
				break;
			}
		}
	}
}

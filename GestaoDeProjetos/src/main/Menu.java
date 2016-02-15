package main;

import java.util.Scanner;

public class Menu {
	Scanner input = new Scanner(System.in);
	int opcaoCrud;
	int opcaoTipo;

	public int menuCrud() {
		System.out.println("1 - Cadastrar");
		System.out.println("2 - Editar");
		System.out.println("3 - Excluir");
		System.out.println("4 - Listar");
		System.out.print("Opção: ");
		opcaoCrud = input.nextInt();
		System.out.println();
		return opcaoCrud;
	}

	public int menuTipo() {
		System.out.println("1 - Pessoa");
		System.out.println("2 - Tarefa");
		System.out.println("3 - SubTarefa");
		System.out.print("Opção: ");
		opcaoTipo = input.nextInt();
		return opcaoTipo;
	}
}

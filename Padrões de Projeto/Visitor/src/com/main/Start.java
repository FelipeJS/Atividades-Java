package com.main;

import com.creator.Produto;
import com.visitor.ValorInternetVisitor;
import com.visitor.ValorLojaVisitor;
import com.visitor.ValorTelefoneVisitor;

public class Start {
	public static void main(String[] args) {
		Produto produto = new Produto("Camisa", 10, 5, 2);
		ValorLojaVisitor lojaVisitor = new ValorLojaVisitor();
		ValorInternetVisitor internetVisitor = new ValorInternetVisitor();
		ValorTelefoneVisitor telefoneVisitor = new ValorTelefoneVisitor();
		
		System.out.println("Valor Loja: " + produto.accept(lojaVisitor));
		System.out.println("Valor Telefone: " + produto.accept(telefoneVisitor));
		System.out.println("Valor Internet: " + produto.accept(internetVisitor));
	}
	
	
	
}

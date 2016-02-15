package com.visitor;

import com.creator.Produto;

public class ValorTelefoneVisitor implements Visitor{

	public float visit(Produto produto) {
		return produto.getPreco() + produto.getFrete();
	}
	
}

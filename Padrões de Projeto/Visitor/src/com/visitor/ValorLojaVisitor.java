package com.visitor;

import com.creator.Produto;

public class ValorLojaVisitor implements Visitor {

	public float visit(Produto produto) {
		return produto.getPreco();
	}
	
}

package com.visitor;

import com.creator.Produto;

public class ValorInternetVisitor implements Visitor{

	public float visit(Produto produto) {
		return produto.getPreco() + produto.getFrete() + produto.getAcrescimo();
	}
	
}

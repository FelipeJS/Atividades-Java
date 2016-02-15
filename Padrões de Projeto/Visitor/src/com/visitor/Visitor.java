package com.visitor;

import com.creator.Produto;

public interface Visitor {
	public float visit(Produto produto);
}

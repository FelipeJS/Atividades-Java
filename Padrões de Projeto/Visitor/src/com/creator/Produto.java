package com.creator;

import com.visitor.Visitor;

public class Produto {
	private String nome;
	private float preco;
	private float frete;
	private float acrescimo;
	
	public Produto(String nome, float preco, float valorFrete, float acrescimo){
		this.nome = nome;
		this.preco = preco;
		this.frete = valorFrete;
		this.acrescimo = acrescimo;
	}
	
	public Object accept(Visitor visitor){
		return visitor.visit(this);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	public float getFrete() {
		return frete;
	}

	public void setFrete(float frete) {
		this.frete = frete;
	}

	public float getAcrescimo() {
		return acrescimo;
	}

	public void setAcrescimo(float acrescimo) {
		this.acrescimo = acrescimo;
	}
	
	
	
}

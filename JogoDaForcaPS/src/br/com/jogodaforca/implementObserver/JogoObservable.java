package br.com.jogodaforca.implementObserver;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import br.com.jogodaforca.difficultyCategory.Animal;
import br.com.jogodaforca.difficultyCategory.Filme;
import br.com.jogodaforca.difficultyCategory.Profissao;
import br.com.jogodaforca.interfaceObserver.Observable;
import br.com.jogodaforca.interfaceObserver.Observer;
import br.com.jogodaforca.model.Palavra;

public class JogoObservable implements Observable {
	private List<Observer> observers;
	ArrayList<Palavra> palavraRetorno;
	Random gerador = new Random();
	int contador;
	char[] palavraDinamica;
	int erros = 0;

	public JogoObservable() {
		observers = new ArrayList<Observer>();
	}

	public void registerObserver(Observer obj) {
		observers.add(obj);
		for (Observer observer : observers) {
			System.out.println("Jogador " + observer.getClass().getName()
					+ " esta registrado");
		}
		System.out.println();
	}

	public void removeObserver(Observer obj) {
		observers.remove(obj);
		System.out.println("Jogador " + obj.getClass().getName()
				+ " foi removido");
		System.out.println();

	}

	public void notifyObservers(Object obj) {
		char[] resposta = (char[]) obj;
		
		for (Observer observer : observers) {
			observer.update(resposta);
		}
		System.out.println();
	}

	public ArrayList<Palavra> escolherCategoria(int categoriaEscolhida) {
		switch (categoriaEscolhida) {
		case 2:
			Profissao profissao = new Profissao();
			palavraRetorno = profissao.selecionarCategoria();
			System.out.println();
			System.out.println("Categoria profissao escolhida ");
			break;
		case 3:
			Filme filme = new Filme();
			palavraRetorno = filme.selecionarCategoria();
			System.out.println();
			System.out.println("Categoria filme escolhida ");
			break;
		default:
			Animal animal = new Animal();
			palavraRetorno = animal.selecionarCategoria();
			System.out.println();
			System.out.println("Categoria animal escolhida ");
			break;
		}

		contador = gerador.nextInt(2);
		palavraDinamica = new char[palavraRetorno.get(contador).getPalavra().length()];

		for (int tam = 0; tam < palavraRetorno.get(contador).getPalavra().length(); tam++) {
			palavraDinamica[tam] = '-';
		}
		
		notifyObservers(palavraDinamica);
		return palavraRetorno;
	}
	
	public char[] getPalavraDinamica(){
		return palavraDinamica;
	}
	
	public void setPalavraDinamica(char[] palavraDinamica){
		this.palavraDinamica = palavraDinamica;
	}
	
	public int getContador(){
		return contador;
	}

}

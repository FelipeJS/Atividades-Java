package br.com.jogodaforca.interfaceObserver;

import br.com.jogodaforca.interfaceObserver.Observer;

public interface Observable {
	public void registerObserver(Observer obj);
	public void removeObserver(Observer obj);
	public void notifyObservers(Object obj);
}

package br.com.salao.interfaces;

public interface IAutentica {

	
	Object login(String user, String senha);
	boolean logout();
	
}

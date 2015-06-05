package br.com.salao.interfaces;

import br.com.salao.entity.UsuarioEntity;

public interface IAutentica {

	
	Object login(String user, String senha);
	boolean logout();
	
}

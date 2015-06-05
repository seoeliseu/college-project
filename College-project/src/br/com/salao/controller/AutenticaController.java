package br.com.salao.controller;

import br.com.salao.dao.UsuarioDAO;
import br.com.salao.entity.UsuarioEntity;
import br.com.salao.interfaces.IAutentica;

public class AutenticaController implements IAutentica{

	public static IAutentica usuarioLogado;

	@Override
	public Object login(String user, String senha) {
		return new UsuarioDAO().Pesquisar(new UsuarioEntity(user,senha, false));
	}

	@Override
	public boolean logout() {
		return true;
	}
}

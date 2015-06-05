package br.com.salao.controller;

import br.com.salao.dao.UsuarioDAO;
import br.com.salao.interfaces.IController;

public class UsuarioController implements IController{

	@Override
	public void Excluir(Object objeto) {
	}

	@Override
	public void Alterar(Object objeto) {
	}

	@Override
	public boolean Inserir(Object objeto) {
		UsuarioDAO uDao = new UsuarioDAO();
		return uDao.Inserir(objeto);
	}

	@Override
	public Object Pesquisar(Object objeto) {
		return null;
	}

}

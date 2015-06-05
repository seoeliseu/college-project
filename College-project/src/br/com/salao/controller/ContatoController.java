package br.com.salao.controller;

import br.com.salao.dao.ContatoDAO;
import br.com.salao.interfaces.IController;

public class ContatoController implements IController{

	@Override
	public void Excluir(Object objeto) {
	}

	@Override
	public void Alterar(Object objeto) {
	}

	@Override
	public boolean Inserir(Object objeto) {
		ContatoDAO cDao = new ContatoDAO();
		return cDao.Inserir(objeto);
	}

	@Override
	public Object Pesquisar(Object objeto) {
		return null;
	}

}

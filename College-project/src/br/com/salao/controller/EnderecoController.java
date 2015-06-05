package br.com.salao.controller;

import br.com.salao.dao.EnderecoDAO;
import br.com.salao.interfaces.IController;

public class EnderecoController implements IController{

	@Override
	public void Excluir(Object objeto) {
	}

	@Override
	public void Alterar(Object objeto) {
	}

	@Override
	public boolean Inserir(Object objeto) {
		EnderecoDAO eDao = new EnderecoDAO();
		return eDao.Inserir(objeto);
		
	}

	@Override
	public Object Pesquisar(Object objeto) {
		return null;
	}

}

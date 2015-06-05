package br.com.salao.controller;

import br.com.salao.dao.ConfiguracaoDao;
import br.com.salao.interfaces.IController;

public class ConfiguracaoController implements IController{

	@Override
	public void Excluir(Object objeto) {
	}

	@Override
	public void Alterar(Object objeto) {
	}

	@Override
	public boolean Inserir(Object objeto) {
		ConfiguracaoDao cDao = new ConfiguracaoDao();
		return cDao.Inserir(objeto);
	}

	@Override
	public Object Pesquisar(Object objeto) {
		return null;
	}

}

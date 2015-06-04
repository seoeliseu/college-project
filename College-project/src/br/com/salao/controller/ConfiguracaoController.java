package br.com.salao.controller;

import br.com.salao.dao.ConfiguracaoDao;
import br.com.salao.interfaces.IController;

public class ConfiguracaoController implements IController{

	@Override
	public void Excluir(Object objeto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Alterar(Object objeto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean Inserir(Object objeto) {
		// TODO Auto-generated method stub
		ConfiguracaoDao cDao = new ConfiguracaoDao();
		return cDao.Inserir(objeto);
	}

	@Override
	public Object Pesquisar(Object objeto) {
		// TODO Auto-generated method stub
		return null;
	}

}

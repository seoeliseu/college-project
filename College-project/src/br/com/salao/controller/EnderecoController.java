package br.com.salao.controller;

import br.com.salao.dao.EnderecoDAO;
import br.com.salao.interfaces.IController;

public class EnderecoController implements IController{

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
		EnderecoDAO eDao = new EnderecoDAO();
		return eDao.Inserir(objeto);
		
	}

	@Override
	public Object Pesquisar(Object objeto) {
		// TODO Auto-generated method stub
		return null;
	}

}

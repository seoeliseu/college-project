package br.com.salao.controller;

import br.com.salao.dao.ClienteDAO;
import br.com.salao.interfaces.IDao;

public class ClienteController implements IDao {

	@Override
	public void Excluir(Object objeto) {
	
	}
	
	@Override
	public void Alterar(Object objeto) {

	}

	@Override
	public boolean Inserir(Object objeto) {
		return new ClienteDAO().Inserir(objeto);
	}

	@Override
	public Object Pesquisar(Object objeto) {

		return null;
	}

	@Override
	public int getId(Object objeto) {
		return 0;
	}

}

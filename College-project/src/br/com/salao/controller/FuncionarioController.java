package br.com.salao.controller;

import br.com.salao.dao.FuncionarioDAO;
import br.com.salao.interfaces.IController;

public class FuncionarioController implements IController{

	@Override
	public void Excluir(Object objeto) {
	}

	@Override
	public void Alterar(Object objeto) {
	}

	@Override
	public boolean Inserir(Object objeto) {
		return new FuncionarioDAO().Inserir(objeto);
	}

	@Override
	public Object Pesquisar(Object objeto) {
		return null;
	}
	
}

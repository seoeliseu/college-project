package br.com.salao.controller;

import br.com.salao.dao.FuncionarioDAO;
import br.com.salao.interfaces.IController;

public class FuncionarioController implements IController{

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
		System.out.println("passou aki controller funcio");
		FuncionarioDAO fDao = new FuncionarioDAO();
		return fDao.Inserir(objeto);
		
	}

	@Override
	public Object Pesquisar(Object objeto) {
		// TODO Auto-generated method stub
		return null;
	}
	
}

package br.com.salao.controller;

import br.com.salao.dao.ServicoDAO;
import br.com.salao.interfaces.IController;

public class ServicoController implements IController{

	@Override
	public void Excluir(Object objeto) {
		
	}

	@Override
	public void Alterar(Object objeto) {
		
	}

	@Override
	public boolean Inserir(Object objeto) {
		System.out.println("veio aqui");
		return new ServicoDAO().Inserir(objeto);
	}

	@Override
	public Object Pesquisar(Object objeto) {
		return null; 
	}

}

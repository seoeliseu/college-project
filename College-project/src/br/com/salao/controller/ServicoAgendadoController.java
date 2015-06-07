package br.com.salao.controller;

import br.com.salao.interfaces.IController;
import br.com.salao.dao.ServicoAgendadoDAO;

public class ServicoAgendadoController implements IController{

	@Override
	public void Excluir(Object objeto) {
		
	}

	@Override
	public void Alterar(Object objeto) {
		
	}

	@Override
	public boolean Inserir(Object objeto) {
		return new ServicoAgendadoDAO().Inserir(objeto);
	}

	@Override
	public Object Pesquisar(Object objeto) {
		return null;
	}

}

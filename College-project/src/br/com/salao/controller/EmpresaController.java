package br.com.salao.controller;

import br.com.salao.dao.EmpresaDAO;
import br.com.salao.interfaces.IDao;

public class EmpresaController implements IDao {

	@Override
	public void Excluir(Object objeto) {
		
	}

	@Override
	public void Alterar(Object objeto) {
		
	}

	@Override
	public void Inserir(Object objeto) {
		System.out.println("Passei aqui2");
		EmpresaDAO empDAO = new EmpresaDAO();
		empDAO.Inserir(objeto);
	}

	@Override
	public Object Pesquisar(Object objeto) {
		return null;
	}

}

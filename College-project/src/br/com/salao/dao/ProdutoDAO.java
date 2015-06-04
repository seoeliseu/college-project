package br.com.salao.dao;

import br.com.salao.entity.ProdutoEntity;
import br.com.salao.interfaces.IDao;

public class ProdutoDAO implements IDao{

	@Override
	public void Excluir(Object objeto) {
		ProdutoEntity produto = (ProdutoEntity)objeto;		
	}

	@Override
	public void Alterar(Object objeto) {
		ProdutoEntity produto = (ProdutoEntity)objeto;		
	}

	@Override
	public boolean Inserir(Object objeto) {
		ProdutoEntity produto = (ProdutoEntity)objeto;
		
		return true;
	}

	@Override
	public Object Pesquisar(Object objeto) {
		ProdutoEntity produto = (ProdutoEntity)objeto;
		return null;
	}

	@Override
	public int getId(Object objeto) {
		// TODO Auto-generated method stub
		return 0;
	}

}

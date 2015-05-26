package br.com.salao.dao;

import br.com.salao.entity.ClienteEntity;
import br.com.salao.interfaces.IDao;

public class ClienteDAO implements IDao {

	private final String INSERT = " INSERT INTO ";
	private final String SELECT = " SELECT ";
	private final String FROM = " FROM ";
	private final String WHERE = " WHERE ";
	private final String UPDATE = " UPDATE ";
	
	@Override
	public void Salvar(Object objeto) {
		ClienteEntity cliente = (ClienteEntity)objeto;
		String sql = "";
		sql+= INSERT+"CLIENTE ("+"nome"+", "+"email"+", "+"dataDeNascimento )";
		
	}

	@Override
	public void Alterar(Object objeto) {
		ClienteEntity cliente = (ClienteEntity)objeto;
	}

	@Override
	public void Inserir(Object objeto) {
		ClienteEntity cliente = (ClienteEntity)objeto;
	}

	@Override
	public Object Pesquisar(Object objeto) {
		ClienteEntity cliente = (ClienteEntity)objeto;
		return null;
	}

}

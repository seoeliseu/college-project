package br.com.salao.dao;

import br.com.salao.entity.EnderecoEntity;
import br.com.salao.interfaces.IDao;

public class EnderecoDAO implements IDao{

	private final String INSERT = " INSERT ";
	private final String SELECT = " SELECT ";
	private final String INTO = " INTO ";
	private final String FROM = " FROM ";
	private final String WHERE = " WHERE ";
	private final String UPDATE = " UPDATE ";
	
	@Override
	public void Excluir(Object objeto) {
		EnderecoEntity endereco = (EnderecoEntity)objeto;		
	}

	@Override
	public void Alterar(Object objeto) {
		EnderecoEntity endereco = (EnderecoEntity)objeto;		
	}

	@Override
	public void Inserir(Object objeto) {
		EnderecoEntity endereco = (EnderecoEntity)objeto;		
	}

	@Override
	public Object Pesquisar(Object objeto) {
		EnderecoEntity endereco = (EnderecoEntity)objeto;
		return null;
	}

}

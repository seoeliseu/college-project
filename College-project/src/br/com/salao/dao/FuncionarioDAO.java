package br.com.salao.dao;

import br.com.salao.entity.FuncionarioEntity;
import br.com.salao.interfaces.IDao;

public class FuncionarioDAO implements IDao{

	private final String INSERT = " INSERT ";
	private final String SELECT = " SELECT ";
	private final String INTO = " INTO ";
	private final String FROM = " FROM ";
	private final String WHERE = " WHERE ";
	private final String UPDATE = " UPDATE ";
	
	@Override
	public void Excluir(Object objeto) {
		FuncionarioEntity funcionario = (FuncionarioEntity)objeto;
	}

	@Override
	public void Alterar(Object objeto) {
		FuncionarioEntity funcionario = (FuncionarioEntity)objeto;
	}

	@Override
	public void Inserir(Object objeto) {
		FuncionarioEntity funcionario = (FuncionarioEntity)objeto;
	}

	@Override
	public Object Pesquisar(Object objeto) {
		FuncionarioEntity funcionario = (FuncionarioEntity)objeto;
		return null;
	}

}

package br.com.salao.dao;

import br.com.salao.entity.ServicoEntity;
import br.com.salao.interfaces.IDao;

public class ServicoDAO implements IDao{

	private final String INSERT = " INSERT ";
	private final String SELECT = " SELECT ";
	private final String INTO = " INTO ";
	private final String FROM = " FROM ";
	private final String WHERE = " WHERE ";
	private final String UPDATE = " UPDATE ";
	
	@Override
	public void Salvar(Object objeto) {
		ServicoEntity servico = (ServicoEntity)objeto;
	}

	@Override
	public void Alterar(Object objeto) {
		ServicoEntity servico = (ServicoEntity)objeto;
	}

	@Override
	public void Inserir(Object objeto) {
		ServicoEntity servico = (ServicoEntity)objeto;
	}

	@Override
	public Object Pesquisar(Object objeto) {
		ServicoEntity servico = (ServicoEntity)objeto;
		return null;
	}

}
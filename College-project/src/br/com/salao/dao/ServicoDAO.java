package br.com.salao.dao;

import br.com.salao.entity.ServicoEntity;
import br.com.salao.interfaces.IDao;

public class ServicoDAO implements IDao{

	
	@Override
	public void Excluir(Object objeto) {
		ServicoEntity servico = (ServicoEntity)objeto;
	}

	@Override
	public void Alterar(Object objeto) {
		ServicoEntity servico = (ServicoEntity)objeto;
	}

	@Override
	public boolean Inserir(Object objeto) {
		ServicoEntity servico = (ServicoEntity)objeto;
		return true;
	}

	@Override
	public Object Pesquisar(Object objeto) {
		ServicoEntity servico = (ServicoEntity)objeto;
		return null;
	}

	@Override
	public int getId(Object objeto) {
		return 0;
	}

}

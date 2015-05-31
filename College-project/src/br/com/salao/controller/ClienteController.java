package br.com.salao.controller;

import br.com.salao.dao.ClienteDAO;
import br.com.salao.entity.ClienteEntity;
import br.com.salao.interfaces.IDao;

public class ClienteController implements IDao {

	@Override
	public void Salvar(Object objeto) {
		
		ClienteDAO cliDAO = new ClienteDAO();
		try{

			ClienteEntity cli = (ClienteEntity)objeto;
			cliDAO.Inserir(cli);

		}catch(ClassCastException e){
			//tenta fazer o cast novamente caso não dê certo
			e.getMessage();
			this.Salvar(objeto);
		}catch(Exception e){
			//retornar erro com tipo de excessão para visão
			e.getMessage();
		}
	}

	@Override
	public void Alterar(Object objeto) {

	}

	@Override
	public void Inserir(Object objeto) {

	}

	@Override
	public Object Pesquisar(Object objeto) {

		return null;
	}

}

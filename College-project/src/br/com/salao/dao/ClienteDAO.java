package br.com.salao.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.com.salao.entity.ClienteEntity;
import br.com.salao.factory.FactoryEntity;
import br.com.salao.interfaces.IDao;
import br.com.salao.resource.JDBCConnection;

public class ClienteDAO implements IDao {

	private final String INSERT = " INSERT INTO ";
	private final String SELECT = " SELECT ";
	private final String FROM = " FROM ";
	private final String WHERE = " WHERE ";
	private final String UPDATE = " UPDATE ";
	private final String VALUES = " VALUES( ";

	@Override
	public void Salvar(Object objeto) {
		
	}

	@Override
	public void Alterar(Object objeto) {
		ClienteEntity cliente = (ClienteEntity)objeto;
	}

	@Override
	public void Inserir(Object objeto) {
		JDBCConnection conn = FactoryEntity.getInstance().connection();
		conn.getConnection();
		ResultSet rs = null;
		PreparedStatement prstm = null;
		ClienteEntity cliente = (ClienteEntity)objeto;
		String sql = "";
		sql+= INSERT+"CLIENTE (nome, email, dataDeNascimento, endereco_id )";
	}

	@Override
	public Object Pesquisar(Object objeto) {
		ClienteEntity cliente = (ClienteEntity)objeto;
		return null;
	}

}

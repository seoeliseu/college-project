package br.com.salao.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.com.salao.controller.ContatoController;
import br.com.salao.entity.ClienteEntity;
import br.com.salao.factory.FactoryDAO;
import br.com.salao.interfaces.IDao;

public class ClienteDAO implements IDao {
	@Override
	public void Excluir(Object objeto) {
		
	}

	@Override
	public void Alterar(Object objeto) {
		ClienteEntity cliente = (ClienteEntity)objeto;
	}

	@Override
	public boolean Inserir(Object objeto) {
		Connection conn = FactoryDAO.getInstance().connection();
		@SuppressWarnings("unused")
		ResultSet rs = null;
		PreparedStatement pstm = null;
		ClienteEntity cliente = (ClienteEntity)objeto;
		String sql = "";
		
		
		
		sql+= INSERT+"CLIENTE (nome, rg, credito, contatos_id, dtNascimento)";
		sql+= VALUES+"(?,?,?,?,?)";
		try {
			
			new ContatoController().Inserir(cliente.getContato());
			int contatos_id = new ContatoDAO().getId(cliente.getContato());
			
			pstm = conn.prepareStatement(sql);
			pstm.setString(1, cliente.getNome());
			pstm.setString(2, cliente.getRg());
			pstm.setDouble(3, cliente.getCreditoFidelidade());
			pstm.setInt(4, contatos_id);
			pstm.setInt(5, cliente.getDataDeNascimento());

			pstm.executeUpdate();
			conn.commit();
			conn.close();
			pstm.close();
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public Object Pesquisar(Object objeto) {
		ClienteEntity cliente = (ClienteEntity)objeto;
		return null;
	}

	@Override
	public int getId(Object objeto) {
		return 0;
	}

}

package br.com.salao.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.com.salao.entity.ContatoEntity;
import br.com.salao.factory.FactoryDAO;
import br.com.salao.factory.FactoryEntity;
import br.com.salao.interfaces.IDao;

public class ContatoDAO implements IDao{
	
	
	@Override
	public void Excluir(Object objeto) {
		ContatoEntity contato = (ContatoEntity)objeto;
	}

	@Override
	public void Alterar(Object objeto) {
		ContatoEntity contato = (ContatoEntity)objeto;
	}

	@Override
	public boolean Inserir(Object objeto) {
		Connection connection = FactoryDAO.getInstance().connection();
		
		PreparedStatement pstm = null;
		
		ContatoEntity contato = (ContatoEntity)objeto;
		
		String insertContato = "";
		
		insertContato += INSERT+"contatos(telefone1, telefone2, email)";
		insertContato += "VALUES (?,?,?)";
		
		try {
			pstm = connection.prepareStatement(insertContato);
			pstm.setString(1, contato.getTelefone1());
			pstm.setString(2, contato.getTelefone2());
			pstm.setString(3, contato.getEmail());

			pstm.execute();
			
			connection.commit();
			
			connection.close();
			pstm.close();
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		
		
	}

	@Override
	public Object Pesquisar(Object objeto) {
		ContatoEntity contato = (ContatoEntity)objeto;
		return null;
	}
	
	@Override
	public int getId(Object objeto){
		ContatoEntity contato = (ContatoEntity)objeto;
		Connection connection = FactoryDAO.getInstance().connection();
		try {
			ResultSet rs = connection.prepareStatement(SELECT+"contatos.id"+FROM+"contatos"+WHERE+"telefone1 = "+
					"'"+contato.getTelefone1()+"'").executeQuery();
			while(rs.next()) return rs.getInt("id");
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return -1;
	}

}

package br.com.salao.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.com.salao.entity.ServicoEntity;
import br.com.salao.factory.FactoryDAO;
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
		
Connection connection = FactoryDAO.getInstance().connection();
		
		PreparedStatement pstm = null;
		
		ServicoEntity servico = (ServicoEntity)objeto;
		
		String insertContato = "";
		
		insertContato += INSERT+"produto(valor, tempo, descricao)";
		insertContato += "VALUES (?,?,?)";
		
		try {
			pstm = connection.prepareStatement(insertContato);
			pstm.setDouble(1, servico.getValor());
			pstm.setInt(2, servico.getTempoMinutos());
			pstm.setString(3, servico.getNome());

			pstm.execute();
			connection.commit();
			connection.close();
			pstm.close();
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public Object Pesquisar(Object objeto) {
		ServicoEntity servico = (ServicoEntity)objeto;
		return null;
	}

	@Override
	public int getId(Object objeto) {
	String nome = (String) objeto;
		
		Connection connection = FactoryDAO.getInstance().connection();
		ResultSet rs = null;
		
		try{
			rs = connection.prepareStatement(SELECT+"id"+FROM+"produto"+WHERE+"produto.descricao = "+"'"+nome+"'").executeQuery();
			
			while(rs.next()) return rs.getInt("id");
			
			connection.close();
			rs.close();
		}catch(SQLException e){
			e.printStackTrace();
			return -1;
		}
		return -1;
	}

}

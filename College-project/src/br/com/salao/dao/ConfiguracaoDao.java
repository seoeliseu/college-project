package br.com.salao.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.com.salao.entity.ConfiguracaoEntity;
import br.com.salao.entity.ContatoEntity;
import br.com.salao.factory.FactoryDAO;
import br.com.salao.factory.FactoryEntity;
import br.com.salao.interfaces.IDao;

public class ConfiguracaoDao implements IDao {

	@Override
	public void Excluir(Object objeto) {
		// TODO Auto-generated method stub

	}

	@Override
	public void Alterar(Object objeto) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean Inserir(Object objeto) {
		// TODO Auto-generated method stub
		Connection connection = FactoryDAO.getInstance().connection();
		
		PreparedStatement pstm = null;
		
		ConfiguracaoEntity config = (ConfiguracaoEntity) objeto;
		try{
		String insertConfig = INSERT+"configuracao (hora_fechamento, credito_fidelidade, credito_aniversario)"+
				VALUES+"(?,?,?)";
				
				pstm = connection.prepareStatement(insertConfig);
				
				pstm.setLong(1, config.getHoraFechamento());
				pstm.setFloat(2, config.getCredFidelidade());
				pstm.setFloat(3, config.getCredAniversario());
				
				pstm.execute();
				
				connection.commit();
				
				connection.close();
				pstm.close();
				return true;
		}catch(SQLException e){
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public Object Pesquisar(Object objeto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getId(Object objeto) {
		// TODO Auto-generated method stub
		ConfiguracaoEntity config = (ConfiguracaoEntity)objeto;
		Connection connection = FactoryDAO.getInstance().connection();
		try {
			ResultSet rs = connection.prepareStatement(SELECT+"configuracao.id_config"+FROM+"configuracao"+WHERE+"hora_fechamento = "+
					config.getHoraFechamento()+AND+"credito_fidelidade = "+config.getCredFidelidade()+AND+"credito_aniversario = "+
					config.getCredAniversario()).executeQuery();
			while(rs.next()) return rs.getInt("id_config");
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return -1;
	}

}

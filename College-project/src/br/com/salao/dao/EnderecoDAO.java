package br.com.salao.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.com.salao.entity.ContatoEntity;
import br.com.salao.entity.EnderecoEntity;
import br.com.salao.factory.FactoryEntity;
import br.com.salao.interfaces.IDao;

public class EnderecoDAO implements IDao{

	@Override
	public void Excluir(Object objeto) {
		EnderecoEntity endereco = (EnderecoEntity)objeto;		
	}

	@Override
	public void Alterar(Object objeto) {
		EnderecoEntity endereco = (EnderecoEntity)objeto;		
	}

	@Override
	public boolean Inserir(Object objeto) {
		EnderecoEntity endereco = (EnderecoEntity)objeto;
		
		Connection connection = FactoryEntity.getInstance().connection().getConnection();
		
		PreparedStatement pstm = null;
		
		String insertEndereco = "";
		insertEndereco += INSERT+"endereco(cep, bairro, rua, numero, complemento, cidade_id)";
		insertEndereco += "VALUES (?,?,?,?,?,?)";
		
		try {
			pstm = connection.prepareStatement(insertEndereco);

			pstm.setString(1, endereco.getCep());
			pstm.setString(2, endereco.getBairro());
			pstm.setString(3, endereco.getRua());
			pstm.setString(4, endereco.getNumero());
			pstm.setString(5, endereco.getComplemento());
			pstm.setInt(6, endereco.getCidade());
			
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
		EnderecoEntity endereco = (EnderecoEntity)objeto;
		return null;
	}

	@Override
	public int getId(Object objeto) {
		// TODO Auto-generated method stub
		EnderecoEntity endereco = (EnderecoEntity)objeto;
		Connection connection = FactoryEntity.getInstance().connection().getConnection();
		try {
			ResultSet rs = connection.prepareStatement(SELECT+"endereco.id"+FROM+"endereco"+WHERE
					+"endereco.cep = "+endereco.getCep()+AND+"endereco.bairro = "+
					endereco.getBairro().toString()+AND+"endereco.rua = "+
					endereco.getRua()+AND+"endereco.numero = "+
					endereco.getNumero()+AND+"endereco.complemento = "+
					endereco.getComplemento()+AND+"endereco.cidade_id = "+
					String.valueOf(endereco.getCidade())).executeQuery();
			
			while(rs.next()) return rs.getInt("id");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return -1;
	}

}

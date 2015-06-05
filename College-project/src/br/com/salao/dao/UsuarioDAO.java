package br.com.salao.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.com.salao.entity.ContatoEntity;
import br.com.salao.entity.UsuarioEntity;
import br.com.salao.factory.FactoryDAO;
import br.com.salao.factory.FactoryEntity;
import br.com.salao.interfaces.IDao;

public class UsuarioDAO implements IDao {

	@Override
	public void Excluir(Object objeto) {
		UsuarioEntity produto = (UsuarioEntity) objeto;
	}

	@Override
	public void Alterar(Object objeto) {
		UsuarioEntity produto = (UsuarioEntity) objeto;
	}

	@Override
	public boolean Inserir(Object objeto) {
		UsuarioEntity produto = (UsuarioEntity) objeto;

		Connection connection = FactoryDAO.getInstance().connection();

		PreparedStatement pstm = null;

		UsuarioEntity usuario = (UsuarioEntity) objeto;

		String insertUsuario = "";

		insertUsuario += INSERT + "usuario(nome_usuario, senha_usuario, tipo)";
		insertUsuario += "VALUES (?,?,?)";

		try {
			pstm = connection.prepareStatement(insertUsuario);
			pstm.setString(1, usuario.getNomeDeUsuario());
			pstm.setString(2, usuario.getSenha());	
			pstm.setBoolean(3, usuario.getTipo());

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
		UsuarioEntity usuario = (UsuarioEntity) objeto;
		Connection connection = FactoryDAO.getInstance().connection();
		try {
			ResultSet rs = connection.prepareStatement(SELECT+"tipo"+FROM+"usuario"+WHERE+"nome_usuario = "+
					"'"+usuario.getNomeDeUsuario()+"'"+AND+"senha_usuario = "+"'"+usuario.getSenha()+"'").executeQuery();
			
			while(rs.next()) if(rs.getInt("tipo") == 1) return true; if(rs.getInt("tipo") == 0) return false;
			connection.close();
			
		} catch (SQLException e) {
			return -1;
		}
		return -1;
	}

	@Override
	public int getId(Object objeto) {
		// TODO Auto-generated method stub
		UsuarioEntity usuario = (UsuarioEntity)objeto;
		Connection connection = FactoryDAO.getInstance().connection();
		try {
			ResultSet rs = connection.prepareStatement(SELECT+"usuario.id"+FROM+"usuario"+WHERE+"nome_usuario = "+
					"'"+usuario.getNomeDeUsuario()+"'"+AND+"senha_usuario = "+usuario.getSenha()+AND+"tipo = "+usuario.getTipo()).executeQuery();
			while(rs.next()) return rs.getInt("id");
			connection.close();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return -1;
	}

}

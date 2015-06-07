package br.com.salao.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import br.com.salao.controller.ContatoController;
import br.com.salao.entity.ClienteEntity;
import br.com.salao.entity.ContatoEntity;
import br.com.salao.factory.FactoryDAO;
import br.com.salao.factory.FactoryEntity;
import br.com.salao.interfaces.IDao;

public class ClienteDAO implements IDao {
	@Override
	public void Excluir(Object objeto) {

	}

	@Override
	public void Alterar(Object objeto) {
		ClienteEntity cliente = (ClienteEntity) objeto;
	}

	@Override
	public boolean Inserir(Object objeto) {
		Connection conn = FactoryDAO.getInstance().connection();
		PreparedStatement pstm = null;
		ClienteEntity cliente = (ClienteEntity) objeto;
		String sql = "";

		sql += INSERT
				+ "CLIENTE (nome, rg, credito, contatos_id, dtNascimento)";
		sql += VALUES + "(?,?,?,?,?)";
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
		ClienteEntity cliente = (ClienteEntity) objeto;
		return null;
	}

	@Override
	public int getId(Object objeto) {
		return 0;
	}

	public ObservableList<ClienteEntity> getAll() {
		Connection conn = FactoryDAO.getInstance().connection();
		ResultSet rs = null;

		ObservableList<ClienteEntity> lista_cliente = FXCollections
				.observableArrayList();

		try {
			rs = conn.prepareStatement(SELECT + "*" + FROM + "cliente")
					.executeQuery();
			while (rs.next()) {
				ResultSet rsID = conn.prepareStatement(
						SELECT + "*" + FROM + "contatos" + WHERE
								+ String.valueOf(rs.getInt("contatos_id"))
								+ "= contatos.id").executeQuery();
				
				rsID.next();
				
				ClienteEntity cliente = FactoryEntity.getInstance().clienteEntity(rs.getString("nome"),
						new ContatoEntity(rsID.getString("email"), rsID
								.getString("telefone1"), rsID
								.getString("telefone2")), rs.getString("rg"),
						rs.getInt("dtNascimento"), rs.getDouble("credito"));
				
				cliente.setEmail(cliente.getContato().getEmail());
				cliente.setTelefone1(cliente.getContato().getTelefone1());
				cliente.setTelefone2(cliente.getContato().getTelefone2());
				cliente.setId(rs.getInt("id"));
				

				lista_cliente.add(cliente);
			}
			
			conn.close();
			rs.close();
			
			return lista_cliente;

		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}
}

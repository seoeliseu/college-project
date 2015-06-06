package br.com.salao.resource;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.com.salao.factory.FactoryDAO;
import javafx.collections.ObservableList;

public class MontaCombo {

	public void getPais(ObservableList<String> pais){

		Connection conn = FactoryDAO.getInstance().connection();
		ResultSet rs = null;
		String sql = "SELECT NOME FROM PAIS ORDER BY ID;";
		try {
			rs = conn.prepareStatement(sql).executeQuery();
			
			while(rs.next()){
				pais.add(rs.getString("nome"));
			}
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void getEstado(ObservableList<String> estado, int id){

		Connection conn = FactoryDAO.getInstance().connection();
		ResultSet rs = null;
		String sql = "SELECT NOME FROM ESTADO WHERE PAIS_ID = "+id+" ORDER BY ID;";
		try {
			rs = conn.prepareStatement(sql).executeQuery();
			
			while(rs.next()){
				estado.add(rs.getString("nome"));
			}
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void getCidade(ObservableList<String> cidade, int id){

		Connection conn = FactoryDAO.getInstance().connection();
		ResultSet rs = null;
		String sql = "SELECT NOME FROM CIDADE WHERE ESTADO_ID = "+id+" ORDER BY ID;";
		try {
			rs = conn.prepareStatement(sql).executeQuery();
			
			while(rs.next()){
				cidade.add(rs.getString("nome"));
			}
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void getCargo(ObservableList<String> cargo){

		Connection conn = FactoryDAO.getInstance().connection();
		ResultSet rs = null;
		String sql = "SELECT funcao FROM cargo ORDER BY ID;";
		try {
			rs = conn.prepareStatement(sql).executeQuery();
			
			while(rs.next()){
				cargo.add(rs.getString("funcao"));
			}
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}

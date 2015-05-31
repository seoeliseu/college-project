package br.com.salao.ValidacaoUtil;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.com.salao.factory.FactoryEntity;
import br.com.salao.resource.JDBCConnection;

public class ValidacaoUtil {

	public static boolean existeEmpresa(){
		JDBCConnection conn = FactoryEntity.getInstance().connection();
		ResultSet rs = null;
		String sql = "";
		sql += "SELECT COUNT(*) FROM EMPRESA";
		try {
			rs = conn.getConnection().prepareStatement(sql).executeQuery();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return rs != null;
	}
	
}

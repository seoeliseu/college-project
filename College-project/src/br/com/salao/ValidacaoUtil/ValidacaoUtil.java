package br.com.salao.ValidacaoUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.com.salao.factory.FactoryEntity;
import br.com.salao.resource.JDBCConnection;

public class ValidacaoUtil {

	public static boolean existeEmpresa() {
		JDBCConnection conn = FactoryEntity.getInstance().connection();
		ResultSet rs = null;
		String sql = "";
		sql += "SELECT COUNT(*) FROM EMPRESA";
		try {
			rs = conn.getConnection().prepareStatement(sql).executeQuery();
			while(rs.next()){
				if(rs.getInt(1) == 0){
					conn.close(conn.getConnection(), rs);
					return false;
				}
				else{
					conn.close(conn.getConnection(), rs);
					return true;
				}
			}
		} catch (SQLException e) {
			System.out.println("Code error: " + e.getErrorCode() + "\n"
					+ "Message: " + e.getMessage());
		}
		finally{
			conn.close(conn.getConnection(), rs);
		}
		return false;
	}

}

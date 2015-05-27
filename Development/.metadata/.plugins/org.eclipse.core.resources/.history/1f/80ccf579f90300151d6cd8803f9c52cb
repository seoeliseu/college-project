package br.com.salao.resource;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;

public class JDBCConnection {

	private static final String JDBC_URL="jdbc:mysql://localhost:3306/jdbcdb";
	private static final String JDBC_USER="root";
	private static final String JDBC_PASS="root";
	private static final String JDBC_DRIVER="com.mysql.jdbc.Driver";

	public static Connection getConnection(){

		Connection conn = null;

		try {

			Class.forName(JDBC_DRIVER);
			conn = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASS);

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return conn;

	}

	public static void close(Connection conn, PreparedStatement pstm, ResultSet rs){


		try {

			if(conn != null){
				conn.close();
			}
			
			if(pstm != null){
				pstm.close();
			}
			
			if(rs != null){
				rs.close();
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
	
	public static void main(String[] args){
		Connection conn = getConnection();
		PreparedStatement pstm = null;
		
		try {
			
			pstm = conn.prepareStatement("SELECT * FROM PESSOAS");
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally{
			close(conn, pstm, null);
		}
		
	}

}
package br.com.salao.factory;

import java.sql.Connection;

import br.com.salao.resource.JDBCConnection;

public class FactoryDAO {

	private static FactoryDAO factory = null;
	Connection conn = null;

	private FactoryDAO() {
	}

	public static FactoryDAO getInstance() {

		if(factory == null) return factory = new FactoryDAO();
		return factory;
	}

	public Connection connection() {

		if (conn == null) return new JDBCConnection().getConnection();
		return conn;
	}


}

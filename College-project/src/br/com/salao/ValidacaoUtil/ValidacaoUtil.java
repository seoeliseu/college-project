package br.com.salao.ValidacaoUtil;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import br.com.salao.factory.FactoryDAO;

public class ValidacaoUtil {

	public static boolean existeEmpresa() {
		Connection conn = FactoryDAO.getInstance().connection();
		ResultSet rs = null;
		String sql = "";
		sql += "SELECT COUNT(*) FROM EMPRESA";
		try {
			rs = conn.prepareStatement(sql).executeQuery();
			while(rs.next()){
				if(rs.getInt(1) == 0){
					conn.close();
					return false;
				}
				else{
					conn.close();
					return true;
				}
			}
		} catch (SQLException e) {
			System.out.println("Code error: " + e.getErrorCode() + "\n"
					+ "Message: " + e.getMessage());
		}
		return false;
	}
	
	public static void Alerta(String mensagem, AlertType alertType){
		Alert alert = new Alert(alertType,mensagem);
	    alert.setTitle("Mensagem");
	    alert.setHeaderText(null);
	    alert.show();
	}

}

package br.com.salao.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.com.salao.entity.ClienteEntity;
import br.com.salao.entity.EmpresaEntity;
import br.com.salao.factory.FactoryEntity;
import br.com.salao.interfaces.IDao;
import br.com.salao.resource.JDBCConnection;

public class EmpresaDAO implements IDao{

	private final String INSERT = " INSERT INTO ";
	private final String SELECT = " SELECT ";
	private final String FROM = " FROM ";
	private final String WHERE = " WHERE ";
	private final String UPDATE = " UPDATE ";

	@Override
	public void Excluir(Object objeto) {
		EmpresaEntity empresa = (EmpresaEntity)objeto;
	}

	@Override
	public void Alterar(Object objeto) {
		EmpresaEntity empresa = (EmpresaEntity)objeto;
	}

	@Override
	public void Inserir(Object objeto) {
		try {
			EmpresaEntity empresa = (EmpresaEntity)objeto;
			JDBCConnection conn = FactoryEntity.getInstance().connection();
			PreparedStatement pstm = null;
			ResultSet rs = null;
			conn.getConnection();
			String sql = "";
			sql+= INSERT+"empresa(nm_fantasia, raz_Social, cnpj, contatos_id, endereco_id)";
			sql+=	"VALUES (?,?,?,?,?)";
			pstm.setString(1, empresa.getNomeFantasia());
			pstm.setString(2, empresa.getRazaoSocial());
			pstm.setString(3, empresa.getCnpj());
			
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public Object Pesquisar(Object objeto) {
		EmpresaEntity empresa = (EmpresaEntity)objeto;
		return null;
	}

}

package br.com.salao.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Savepoint;

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
	private final String AND = " AND ";
	private final String OR = " OR ";

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
		
		Connection connection = FactoryEntity.getInstance().connection().getConnection();
		Savepoint savepoint = null;
		System.out.println("Passei aqui");
		try {
			
			EmpresaEntity empresa = (EmpresaEntity)objeto;
			
			PreparedStatement pstm = null;
			String insertContato = "";
			insertContato += INSERT+"contatos(telefone1, telefone2, email)";
			insertContato += "VALUES (?,?,?)";
			
			pstm = connection.prepareStatement(insertContato);
			
			savepoint = connection.setSavepoint("Save_point");
			
			pstm.setString(1, empresa.getContato().getTelefone1());
			pstm.setString(2, empresa.getContato().getTelefone2());
			pstm.setString(3, empresa.getContato().getEmail());
			
			pstm.execute();
			
			String insertEndereco = "";
			insertEndereco += INSERT+"endereco(cep, bairro, rua, numero, complemento, cidade_id)";
			insertEndereco += "VALUES (?,?,?,?,?,?)";
			
			pstm = connection.prepareStatement(insertEndereco);
			
			pstm.setString(1, empresa.getEndereco().getCep());
			pstm.setString(2, empresa.getEndereco().getBairro());
			pstm.setString(3, empresa.getEndereco().getRua());
			pstm.setString(4, empresa.getEndereco().getNumero());
			pstm.setString(5, empresa.getEndereco().getComplemento());
			pstm.setInt(6, empresa.getEndereco().getCidade());
			
			pstm.execute();
			
			String insertEmpresa = "";
			insertEmpresa+= INSERT+"empresa(nm_fantasia, raz_Social, cnpj, contatos_id, endereco_id)";
			insertEmpresa+=	"VALUES (?,?,?,?,?)";
			pstm = connection.prepareStatement(insertEmpresa);
			pstm.setString(1, empresa.getNomeFantasia());
			pstm.setString(2, empresa.getRazaoSocial());
			pstm.setString(3, empresa.getCnpj());
			
			ResultSet rs = connection.prepareStatement(SELECT+"contatos.id"+FROM+"contatos"+WHERE+"telefone1 = "+
			empresa.getContato().getTelefone1()).executeQuery();
			
			while(rs.next())pstm.setInt(4, rs.getInt("id"));
			
			rs = connection.prepareStatement(SELECT+"endereco.id"+FROM+"endereco"+WHERE
					+"endereco.cep = "+empresa.getEndereco().getCep()+AND+"endereco.bairro = "+
					empresa.getEndereco().getBairro().toString()+AND+"endereco.rua = "+
					empresa.getEndereco().getRua()+AND+"endereco.numero = "+
					empresa.getEndereco().getNumero()+AND+"endereco.complemento = "+
					empresa.getEndereco().getComplemento()+AND+"endereco.cidade_id = "+
					String.valueOf(empresa.getEndereco().getCidade())).executeQuery();
			
			while(rs.next())pstm.setInt(5, rs.getInt("id"));
			
			pstm.execute();
			
			connection.commit();
			
		} catch (SQLException e) {
			e.printStackTrace();			
			try {
				connection.rollback(savepoint);
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	}

	@Override
	public Object Pesquisar(Object objeto) {
		EmpresaEntity empresa = (EmpresaEntity)objeto;
		return null;
	}

}

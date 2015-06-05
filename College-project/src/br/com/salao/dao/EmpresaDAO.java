package br.com.salao.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Savepoint;

import br.com.salao.controller.ConfiguracaoController;
import br.com.salao.controller.ContatoController;
import br.com.salao.controller.EnderecoController;
import br.com.salao.entity.EmpresaEntity;
import br.com.salao.factory.FactoryDAO;
import br.com.salao.factory.FactoryEntity;
import br.com.salao.interfaces.IDao;

public class EmpresaDAO implements IDao {

	@Override
	public void Excluir(Object objeto) {
		EmpresaEntity empresa = (EmpresaEntity) objeto;
	}

	@Override
	public void Alterar(Object objeto) {
		EmpresaEntity empresa = (EmpresaEntity) objeto;
	}

	@Override
	public boolean Inserir(Object objeto) {

		Connection connection = FactoryDAO.getInstance().connection();
		Savepoint savepoint = null;
		PreparedStatement pstm = null;
		try {

			EmpresaEntity empresa = (EmpresaEntity) objeto;
			savepoint = connection.setSavepoint("Save_point");
			String insertContato = "";

			ContatoController controlContato = new ContatoController();
			controlContato.Inserir(empresa.getContato());

			EnderecoController controlEndereco = new EnderecoController();
			controlEndereco.Inserir(empresa.getEndereco());
			
			ConfiguracaoController configuracaoController = new ConfiguracaoController();
			configuracaoController.Inserir(empresa.getConfig());
			
			String insertEmpresa = "";
			insertEmpresa += INSERT
					+ "empresa(nm_fantasia, raz_Social, cnpj, contatos_id, endereco_id, configuracao_id_config)";
			insertEmpresa += "VALUES (?,?,?,?,?,?)";
			pstm = connection.prepareStatement(insertEmpresa);
			pstm.setString(1, empresa.getNomeFantasia());
			pstm.setString(2, empresa.getRazaoSocial());
			pstm.setString(3, empresa.getCnpj());

			int contato_id = new ContatoDAO().getId(empresa.getContato());

			pstm.setInt(4, contato_id);

			int endereco_id = new EnderecoDAO().getId(empresa.getEndereco());
			pstm.setInt(5, endereco_id);
			
			int configuracao_id = new ConfiguracaoDao().getId(empresa.getConfig());
			pstm.setInt(6, configuracao_id);
			
			pstm.execute();
			connection.commit();
			connection.close();
			pstm.close();
			return true;

		} catch (SQLException e) {
			e.printStackTrace();
			try {
				connection.rollback(savepoint);
				return false;
			} catch (SQLException e1) {
				e1.printStackTrace();
				return false;
			}
		}
	}

	@Override
	public Object Pesquisar(Object objeto) {
		EmpresaEntity empresa = (EmpresaEntity) objeto;
		return null;
	}

	@Override
	public int getId(Object objeto) {
		return 0;
	}

}

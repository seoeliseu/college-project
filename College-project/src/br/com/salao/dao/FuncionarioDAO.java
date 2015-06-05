package br.com.salao.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Savepoint;

import br.com.salao.controller.ContatoController;
import br.com.salao.controller.EnderecoController;
import br.com.salao.controller.UsuarioController;
import br.com.salao.entity.FuncionarioEntity;
import br.com.salao.factory.FactoryDAO;
import br.com.salao.factory.FactoryEntity;
import br.com.salao.interfaces.IDao;

public class FuncionarioDAO implements IDao{	
	@Override
	public void Excluir(Object objeto) {
		FuncionarioEntity funcionario = (FuncionarioEntity)objeto;
	}

	@Override
	public void Alterar(Object objeto) {
		FuncionarioEntity funcionario = (FuncionarioEntity)objeto;
	}

	@Override
	public boolean Inserir(Object objeto) {
		FuncionarioEntity funcionario = (FuncionarioEntity)objeto;
		
		Connection connection = FactoryDAO.getInstance().connection();
		Savepoint savepoint = null;
		System.out.println("Passei aqui FuncioDao");
		
		try{
		PreparedStatement pstm = null;
		
		ContatoController controlContato = new ContatoController();
		controlContato.Inserir(funcionario.getContato());
		
		EnderecoController controlEndereco = new EnderecoController();
		controlEndereco.Inserir(funcionario.getEndereco());
		
		UsuarioController uController = new UsuarioController();
		uController.Inserir(funcionario.getUsuario());
		
		String insertFuncionario = "";
		insertFuncionario+= INSERT+"funcionario(nome, ctps, rg, cpf, dtNascimento, dtAdmissao, "
				+ "status, prestaServico_funcionario, endereco_id, contatos_id, numeroPis, cargo_id, usuario_id)";
		insertFuncionario+=	"VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)";
		pstm = connection.prepareStatement(insertFuncionario);
		pstm.setString(1, funcionario.getNome());
		pstm.setString(2, funcionario.getCtps());
		pstm.setString(3, funcionario.getRg());
		pstm.setString(4, funcionario.getCpf());
		pstm.setInt(5, Integer.parseInt(funcionario.getDataDeNascimento()));
		pstm.setInt(6, Integer.parseInt(funcionario.getDataDeAdmissao()));
		pstm.setBoolean(7, funcionario.getStatusDoFuncionario());
		pstm.setBoolean(8, funcionario.getTemAgenda());	
		
		int endereco_id = new EnderecoDAO().getId(funcionario.getEndereco());
		int contato_id = new ContatoDAO().getId(funcionario.getContato());
		int usuario_id = new UsuarioDAO().getId(funcionario.getUsuario());
		
		pstm.setInt(9, endereco_id);
		pstm.setInt(10, contato_id);
		pstm.setString(11, funcionario.getPis());
		pstm.setInt(12, funcionario.getCargo());
		pstm.setInt(13, usuario_id);
		
		pstm.execute();
		connection.commit();
		connection.close();
		pstm.close();

		return true;
		}catch(SQLException e){
			
			try {
				connection.rollback(savepoint);
				return false;
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
				return false;
			}
		}
	}

	@Override
	public Object Pesquisar(Object objeto) {
		FuncionarioEntity funcionario = (FuncionarioEntity)objeto;
		return null;
	}

	@Override
	public int getId(Object objeto) {
		// TODO Auto-generated method stub
		return 0;
	}

}

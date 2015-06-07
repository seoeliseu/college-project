package br.com.salao.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.salao.controller.ContatoController;
import br.com.salao.controller.EnderecoController;
import br.com.salao.controller.UsuarioController;
import br.com.salao.entity.ServicoAgendadoEntity;
import br.com.salao.entity.ServicoEntity;
import br.com.salao.factory.FactoryDAO;
import br.com.salao.interfaces.IDao;

public class ServicoAgendadoDAO implements IDao{

	@Override
	public void Excluir(Object objeto) {
		ServicoAgendadoEntity produto = (ServicoAgendadoEntity)objeto;		
	}

	@Override
	public void Alterar(Object objeto) {
		ServicoAgendadoEntity produto = (ServicoAgendadoEntity)objeto;		
	}

	@Override
	public boolean Inserir(Object objeto) {
		ServicoAgendadoEntity servico = (ServicoAgendadoEntity)objeto;
		
		Connection connection = FactoryDAO.getInstance().connection();
		
		try{
			PreparedStatement pstm = null;
			
			String sql = INSERT+"servico_agendado(funcionario_id, cliente_id, produto_id, "
					+ "data, horaInicialPrevista, horaInicialReal, horaFinalPrevista, horaFinalReal, num_nota)"+VALUES+"(?,?,?,?,?,?,?,?,?)";
			pstm = connection.prepareStatement(sql);
			
			pstm.setInt(1, servico.getId_funcionario());
			pstm.setInt(2, servico.getId_cliente());
			pstm.setInt(3, servico.getId_servico());
			pstm.setInt(4, servico.getData());
			pstm.setInt(5, servico.getHora());
			pstm.setInt(6, servico.getHora());
			
			//Não implementado (valores falsos)
			pstm.setInt(7, 0);
			pstm.setInt(8, 0);
			pstm.setInt(9, 1);
			//********************************
			
			
			pstm.execute();
			connection.commit();
			connection.close();
			pstm.close();

			return true;
			}catch(SQLException e){
				
				try {
					connection.rollback();
					return false;
				} catch (SQLException e1) {
					e1.printStackTrace();
					return false;
				}
			}
	}

	@Override
	public Object Pesquisar(Object objeto) {
		ServicoAgendadoEntity produto = (ServicoAgendadoEntity)objeto;
		return null;
	}

	@Override
	public int getId(Object objeto) {
		return 0;
	}

}

package br.com.salao.factory;

import br.com.salao.controller.*;

public class FactoryController {

	private static FactoryController factory = null;
	
	private FactoryController() {
	}

	public static FactoryController getInstance() {

		if(factory == null) return factory = new FactoryController();
		return factory;
	}
	
	public AutenticaController autenticaController(){
		return new AutenticaController();
	}
	
	public CargoController cargoController(){
		return new CargoController();
	}
	
	public ClienteController clienteController(){
		return new ClienteController();
	}
	
	public ConfiguracaoController configuracaoController(){
		return new ConfiguracaoController();
	}
	
	public ContatoController contatoController(){
		return new ContatoController();
	}
	
	public EmpresaController empresaController(){
		return new EmpresaController();
	}
	
	public EnderecoController enderecoController(){
		return new EnderecoController();
	}
	
	public FuncionarioController funcionarioController(){
		return new FuncionarioController();
	}
	
	public ServicoAgendadoController servicoAgendadoController(){
		return new ServicoAgendadoController();
	}
	
	public ServicoController servicoController(){
		return new ServicoController();
	}
	
	public UsuarioController usuarioController(){
		return new UsuarioController();
	}
}

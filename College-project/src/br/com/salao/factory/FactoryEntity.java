package br.com.salao.factory;

import br.com.salao.entity.CargoEntity;
import br.com.salao.entity.ClienteEntity;
import br.com.salao.entity.ContatoEntity;
import br.com.salao.entity.EmpresaEntity;
import br.com.salao.entity.EnderecoEntity;
import br.com.salao.entity.FuncionarioEntity;
import br.com.salao.entity.ProdutoEntity;
import br.com.salao.entity.ServicoEntity;
import br.com.salao.entity.UsuarioEntity;
import br.com.salao.resource.JDBCConnection;

public class FactoryEntity {

	private static FactoryEntity factory = new FactoryEntity();
	private JDBCConnection conn = null;

	private FactoryEntity(){

		getInstance();
	}

	public static FactoryEntity getInstance() {

		return factory;
	}

	public JDBCConnection connection() {

		if(conn == null){

			return new JDBCConnection();
		}

		return conn;
	}

	public ClienteEntity clienteEntity(String nome,
			ContatoEntity contato, String dataDeNascimento,
			double creditoFidelidade) {
		return new ClienteEntity(nome, contato, dataDeNascimento,
				creditoFidelidade);
	}

	public ContatoEntity contato(String email, String telefone1,
			String telefone2) {
		return new ContatoEntity(email, telefone1, telefone2);
	}

	public EmpresaEntity empresaEntity(String razaoSocial,
			String nomeFantasia, String cnpj, ContatoEntity contato,
			EnderecoEntity endereco) {
		return new EmpresaEntity(razaoSocial, nomeFantasia, cnpj, contato,
				endereco);
	}

	public EnderecoEntity enderecoEntity(String pais, String estado,
			String cep, String cidade, String bairro, String rua,
			String numero, String complemento) {
		return new EnderecoEntity(pais, estado, cep, cidade, bairro, rua,
				numero, complemento);
	}

	public FuncionarioEntity funcionarioEntity(String nome, String cpf,
			String rg, CargoEntity cargo, ContatoEntity contato,
			EnderecoEntity endereco, String dataDeNascimento,
			String dataDeAdmissao, boolean statusDoFuncionario,
			boolean temAgenda, UsuarioEntity usuario) {
		return new FuncionarioEntity(nome, cpf, rg, cargo, contato, endereco,
				dataDeNascimento, dataDeAdmissao, statusDoFuncionario,
				temAgenda, usuario);
	}

	public ProdutoEntity produtoEntity(String nome, double valor, int tempo){
		return new ProdutoEntity(nome, valor, tempo);
	}

	public ServicoEntity servicoEntity(){
		return new ServicoEntity();
	}

	public UsuarioEntity usuarioEntity(String nomeDeUsuario, String senha, boolean tipo){
		return new UsuarioEntity(nomeDeUsuario, senha, tipo);
	}



}

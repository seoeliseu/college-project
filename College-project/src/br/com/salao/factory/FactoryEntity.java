package br.com.salao.factory;

import br.com.salao.entity.CargoEntity;
import br.com.salao.entity.ClienteEntity;
import br.com.salao.entity.ConfiguracaoEntity;
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
			EnderecoEntity endereco, ConfiguracaoEntity config) {
		return new EmpresaEntity(razaoSocial, nomeFantasia, cnpj, contato,
				endereco, config);
	}

	public EnderecoEntity enderecoEntity(int id_pais, int id_estado,
			String cep, int id_cidade, String bairro, String rua,
			String numero, String complemento) {
		return new EnderecoEntity(id_pais, id_estado, cep, id_cidade, bairro, rua,
				numero, complemento);
	}

	public FuncionarioEntity funcionarioEntity(String nome,String ctps, String cpf,
			String rg, int cargo_id, ContatoEntity contato,
			EnderecoEntity endereco, String dataDeNascimento,
			String dataDeAdmissao, boolean statusDoFuncionario,
			boolean temAgenda, UsuarioEntity usuario, String pis) {
		return new FuncionarioEntity(nome,ctps, cpf, rg, cargo_id, contato, endereco,
				dataDeNascimento, dataDeAdmissao, statusDoFuncionario,
				temAgenda, usuario, pis);
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

	public ConfiguracaoEntity configuracaoEntity(long hora_fechamento, float cred_aniversario,float cred_fidelidade){
		return new ConfiguracaoEntity(hora_fechamento, cred_aniversario, cred_fidelidade);
	}

}

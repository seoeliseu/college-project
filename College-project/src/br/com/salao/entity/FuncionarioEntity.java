package br.com.salao.entity;

import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleStringProperty;

public class FuncionarioEntity {

	private SimpleStringProperty nome;
	private SimpleStringProperty cpf;
	private SimpleStringProperty rg;
	private CargoEntity cargo;
	private ContatoEntity contato;
	private EnderecoEntity endereco;
	private SimpleStringProperty dataDeNascimento;
	private SimpleStringProperty dataDeAdmissao;
	private SimpleBooleanProperty statusDoFuncionario;
	private SimpleBooleanProperty temAgenda;
	private UsuarioEntity usuario;

	public FuncionarioEntity(String nome, String cpf, String rg,
			CargoEntity cargo, ContatoEntity contato, EnderecoEntity endereco,
			String dataDeNascimento, String dataDeAdmissao,
			boolean statusDoFuncionario, boolean temAgenda,
			UsuarioEntity usuario) {

		this.nome = new SimpleStringProperty(nome);
		this.cpf = new SimpleStringProperty(cpf);
		this.rg = new SimpleStringProperty(rg);
		this.cargo = cargo;
		this.contato = contato;
		this.endereco = endereco;
		this.dataDeNascimento = new SimpleStringProperty(dataDeNascimento);
		this.dataDeAdmissao = new SimpleStringProperty(dataDeAdmissao);
		this.statusDoFuncionario = new SimpleBooleanProperty(statusDoFuncionario);
		this.temAgenda = new SimpleBooleanProperty(temAgenda);
		this.usuario = usuario;
	}

	public ContatoEntity getContato() {
		return contato;
	}

	public void setContato(ContatoEntity contato) {
		this.contato = contato;
	}

	public String getNome() {
		return nome.get();
	}

	public void setNome(String nome) {
		this.nome.set(nome);
	}

	public String getCpf() {
		return cpf.get();
	}

	public void setCpf(String cpf) {
		this.cpf.set(cpf);
	}

	public String getRg() {
		return rg.get();
	}

	public void setRg(String rg) {
		this.rg.set(rg);
	}

	public CargoEntity getCargo() {
		return cargo;
	}

	public void setCargo(CargoEntity cargo) {
		this.cargo = cargo;
	}

	public EnderecoEntity getEndereco() {
		return endereco;
	}

	public void setEndereco(EnderecoEntity endereco) {
		this.endereco = endereco;
	}

	public String getDataDeNascimento() {
		return dataDeNascimento.get();
	}

	public void setDataDeNascimento(String dataDeNascimento) {
		this.dataDeNascimento.set(dataDeNascimento);
	}

	public String getDataDeAdmissao() {
		return dataDeAdmissao.get();
	}

	public void setDataDeAdmissao(String dataDeAdmissao) {
		this.dataDeAdmissao.set(dataDeAdmissao);
	}

	public boolean isStatusDoFuncionario() {
		return statusDoFuncionario.get();
	}

	public void setStatusDoFuncionario(boolean statusDoFuncionario) {
		this.statusDoFuncionario.set(statusDoFuncionario);
	}

	public boolean isTemAgenda() {
		return temAgenda.get();
	}

	public void setTemAgenda(boolean temAgenda) {
		this.temAgenda.set(temAgenda);
	}

	public UsuarioEntity getUsuario() {
		return usuario;
	}

	public void setUsuario(UsuarioEntity usuario) {
		this.usuario = usuario;
	}

}

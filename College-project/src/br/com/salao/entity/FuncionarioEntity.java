package br.com.salao.entity;

import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleStringProperty;

public class FuncionarioEntity {

	private SimpleStringProperty nome;
	private SimpleStringProperty ctps;
	private SimpleStringProperty cpf;
	private SimpleStringProperty pis;
	private SimpleStringProperty rg;
	private int cargo_id;
	private ContatoEntity contato;
	private EnderecoEntity endereco;
	private SimpleStringProperty dataDeNascimento;
	private SimpleStringProperty dataDeAdmissao;
	private SimpleBooleanProperty statusDoFuncionario;
	private SimpleBooleanProperty temAgenda;
	private UsuarioEntity usuario;

	public FuncionarioEntity(String nome,String ctps, String cpf, String rg,
			int cargo_id, ContatoEntity contato, EnderecoEntity endereco,
			String dataDeNascimento, String dataDeAdmissao,
			boolean statusDoFuncionario, boolean temAgenda,
			UsuarioEntity usuario, String pis) {

		this.nome = new SimpleStringProperty(nome);
		this.ctps = new SimpleStringProperty(ctps);
		this.cpf = new SimpleStringProperty(cpf);
		this.rg = new SimpleStringProperty(rg);
		this.cargo_id = cargo_id;
		this.contato = contato;
		this.endereco = endereco;
		this.dataDeNascimento = new SimpleStringProperty(dataDeNascimento);
		this.dataDeAdmissao = new SimpleStringProperty(dataDeAdmissao);
		this.statusDoFuncionario = new SimpleBooleanProperty(statusDoFuncionario);
		this.temAgenda = new SimpleBooleanProperty(temAgenda);
		this.usuario = usuario;
		this.pis = new SimpleStringProperty(pis);
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
	
	public String getCtps() {
		return ctps.get();
	}

	public void setCtps(String nome) {
		this.ctps.set(nome);
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

	public int getCargo() {
		return cargo_id;
	}

	public void setCargo(int cargo_id) {
		this.cargo_id = cargo_id;
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

	public boolean getStatusDoFuncionario() {
		return statusDoFuncionario.get();
	}

	public void setStatusDoFuncionario(boolean statusDoFuncionario) {
		this.statusDoFuncionario.set(statusDoFuncionario);
	}

	public boolean getTemAgenda() {
		return temAgenda.get();
	}

	public void setTemAgenda(boolean temAgenda) {
		this.temAgenda.set(temAgenda);
	}
	public String getPis() {
		return pis.get();
	}

	public void setPis(String temAgenda) {
		this.pis.set(temAgenda);
	}

	public UsuarioEntity getUsuario() {
		return usuario;
	}

	public void setUsuario(UsuarioEntity usuario) {
		this.usuario = usuario;
	}

}

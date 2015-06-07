package br.com.salao.entity;

import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class ClienteEntity {

	private SimpleStringProperty nome;
	private ContatoEntity contato;
	private SimpleStringProperty rg;
	private SimpleIntegerProperty dataDeNascimento;
	private SimpleDoubleProperty creditoFidelidade;
	private SimpleStringProperty cpf;
	
	private SimpleStringProperty email = new SimpleStringProperty();
	private SimpleStringProperty telefone1 = new SimpleStringProperty();
	private SimpleStringProperty telefone2 = new SimpleStringProperty();
	
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public ClienteEntity(String nome, ContatoEntity contato, String rg,
			int dataDeNascimento) {
		super();
		this.nome = new SimpleStringProperty(nome);
		this.contato = contato;
		this.rg = new SimpleStringProperty(rg);
		this.dataDeNascimento = new SimpleIntegerProperty(dataDeNascimento);
		this.creditoFidelidade = new SimpleDoubleProperty(0);
	}
	
	public ClienteEntity(String nome, ContatoEntity contato, String rg,
			int dataDeNascimento, double cred) {
		super();
		this.nome = new SimpleStringProperty(nome);
		this.contato = contato;
		this.rg = new SimpleStringProperty(rg);
		this.dataDeNascimento = new SimpleIntegerProperty(dataDeNascimento);
		this.creditoFidelidade = new SimpleDoubleProperty(cred);
	}

	public String getNome() {
		return this.nome.get();
	}

	public void setNome(String nome) {
		this.nome.set(nome);
	}

	public String getRg() {
		return this.rg.get();
	}

	public void setRg(String rg) {
		this.rg.set(rg);
	}

	public String getCpf() {
		return this.cpf.get();
	}

	public void setCpf(String cpf) {
		this.cpf.set(cpf);
	}

	public ContatoEntity getContato() {
		return this.contato;
	}

	public void setContato(ContatoEntity contato) {
		this.contato = contato;
	}

	public int getDataDeNascimento() {
		return this.dataDeNascimento.get();
	}

	public void setDataDeNascimento(int dataDeNascimento) {
		this.dataDeNascimento.set(dataDeNascimento);
	}

	public double getCreditoFidelidade() {
		return this.creditoFidelidade.get();
	}

	public void setCreditoFidelidade(double creditoFidelidade) {
		this.creditoFidelidade.set(creditoFidelidade);
	}
	
	public String getEmail() {
		return this.email.get();
	}

	public void setEmail(String email) {
		this.email.set(email);
	}

	public String getTelefone1() {
		return this.telefone1.get();
	}

	public void setTelefone1(String telefone1) {
		this.telefone1.set(telefone1);
	}

	public String getTelefone2() {
		return this.telefone2.get();
	}

	public void setTelefone2(String telefone2) {
		this.telefone2.set(telefone2);
	}
}

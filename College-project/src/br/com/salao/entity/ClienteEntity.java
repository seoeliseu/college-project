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

	public ClienteEntity(String nome, ContatoEntity contato, String rg,
			int dataDeNascimento) {
		super();
		this.nome = new SimpleStringProperty(nome);
		this.contato = contato;
		this.rg = new SimpleStringProperty(rg);
		this.dataDeNascimento = new SimpleIntegerProperty(dataDeNascimento);
		this.creditoFidelidade = new SimpleDoubleProperty(0);
	}

	// public ClienteEntity(String nome, String email, String rg, ContatoEntity
	// contato,
	// int dataDeNascimento, double creditoFidelidade) {
	// super();
	// this.nome = new SimpleStringProperty(nome);
	// this.rg = new SimpleStringProperty(rg);
	// this.contato = contato;
	// this.dataDeNascimento = new SimpleIntegerProperty(dataDeNascimento);
	// this.creditoFidelidade = new SimpleDoubleProperty(creditoFidelidade);
	// }
	//
	// public ClienteEntity(String nome, ContatoEntity contato,
	// int dataDeNascimento, double creditoFidelidade) {
	// super();
	// this.nome = new SimpleStringProperty(nome);
	// this.contato = contato;
	// this.dataDeNascimento = new SimpleIntegerProperty(dataDeNascimento);
	// this.creditoFidelidade = new SimpleDoubleProperty(creditoFidelidade);
	// }
	//
	// public ClienteEntity(String nome, int date) {
	// this.nome = new SimpleStringProperty(nome);
	// this.dataDeNascimento = new SimpleIntegerProperty(date);
	// }
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

}

package br.com.salao.entity;

import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleStringProperty;

public class ClienteEntity {

	private SimpleStringProperty nome;
	private SimpleStringProperty email;
	private ContatoEntity contato;
	private SimpleStringProperty dataDeNascimento;
	private SimpleDoubleProperty creditoFidelidade;

	public ClienteEntity(String nome, String email, ContatoEntity contato,
			String dataDeNascimento, double creditoFidelidade) {
		super();
		this.nome = new SimpleStringProperty(nome);
		this.email = new SimpleStringProperty(email);
		this.contato = contato;
		this.dataDeNascimento = new SimpleStringProperty(dataDeNascimento);
		this.creditoFidelidade = new SimpleDoubleProperty(creditoFidelidade);
	}

	public String getNome() {
		return this.nome.get();
	}

	public void setNome(String nome) {
		this.nome.set(nome);
	}

	public String getEmail() {
		return this.email.get(); 
	}

	public void setEmail(String email) {
		this.email.set(email);
	}

	public ContatoEntity getContato() {
		return this.contato;
	}

	public void setContato(ContatoEntity contato) {
		this.contato = contato;
	}

	public String getDataDeNascimento() {
		return this.dataDeNascimento.get();
	}

	public void setDataDeNascimento(String dataDeNascimento) {
		this.dataDeNascimento.set(dataDeNascimento);
	}

	public double getCreditoFidelidade() {
		return this.creditoFidelidade.get();
	}

	public void setCreditoFidelidade(double creditoFidelidade) {
		this.creditoFidelidade.set(creditoFidelidade);
	}

}

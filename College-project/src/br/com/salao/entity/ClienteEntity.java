package br.com.salao.entity;

import java.sql.Date;

import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleLongProperty;
import javafx.beans.property.SimpleStringProperty;

public class ClienteEntity {

	private SimpleStringProperty nome;
	private ContatoEntity contato;
	private SimpleLongProperty RG;
	private SimpleStringProperty dataDeNascimento;
	private SimpleDoubleProperty creditoFidelidade;



	public ClienteEntity(SimpleStringProperty nome,
			ContatoEntity contato, SimpleLongProperty rG,
			SimpleStringProperty dataDeNascimento) {
		super();
		this.nome = nome;
		this.contato = contato;
		RG = rG;
		this.dataDeNascimento = dataDeNascimento;
	}

	public ClienteEntity(String nome, String email, long RG, ContatoEntity contato,
			String dataDeNascimento, double creditoFidelidade) {
		super();
		this.nome = new SimpleStringProperty(nome);
		this.RG = new SimpleLongProperty(RG);
		this.contato = contato;
		this.dataDeNascimento = new SimpleStringProperty(dataDeNascimento);
		this.creditoFidelidade = new SimpleDoubleProperty(creditoFidelidade);
	}

	public ClienteEntity(String nome, ContatoEntity contato,
			String dataDeNascimento, double creditoFidelidade) {
		super();
		this.nome = new SimpleStringProperty(nome);
		this.contato = contato;
		this.dataDeNascimento = new SimpleStringProperty(dataDeNascimento);
		this.creditoFidelidade = new SimpleDoubleProperty(creditoFidelidade);
	}

	public ClienteEntity(String nome, Date date) {
		this.nome = new SimpleStringProperty(nome);
		this.dataDeNascimento = new SimpleStringProperty(date.toString());
	}
	public String getNome() {
		return this.nome.get();
	}

	public void setNome(String nome) {
		this.nome.set(nome);
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

package br.com.salao.entity;

import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class ProdutoEntity {

	private SimpleStringProperty nome;
	private SimpleDoubleProperty valor;
	private SimpleIntegerProperty tempo;

	public ProdutoEntity(String nome, double valor, int tempo) {

		this.nome = new SimpleStringProperty(nome);
		this.valor = new SimpleDoubleProperty(valor);
		this.tempo = new SimpleIntegerProperty(tempo);
	}

	public String getNome() {
		return nome.get();
	}

	public void setNome(String nome) {
		this.nome.set(nome);
	}

	public double getValor() {
		return valor.get();
	}

	public void setValor(double valor) {
		this.valor.set(valor);
	}

	public int getTempo() {
		return tempo.get();
	}

	public void setTempo(int tempo) {
		this.tempo.set(tempo);
	}

}

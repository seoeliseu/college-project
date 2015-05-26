package br.com.salao.entity;

import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class ServicoEntity {
	private SimpleStringProperty nome;
	private SimpleDoubleProperty valor;
	private SimpleIntegerProperty tempoMinutos;
	
	public String getNome() {
		return this.nome.get();
	}
	public void setNome(String nome) {
		this.nome.set(nome);
	}
	public double getValor() {
		return this.valor.get();
	}
	public void setValor(double valor) {
		this.valor.set(valor);
	}
	public int getTempoMinutos() {
		return this.tempoMinutos.get();
	}
	public void setTempoMinutos(short tempoMinutos) {
		this.tempoMinutos.set(tempoMinutos);
	}
	
}

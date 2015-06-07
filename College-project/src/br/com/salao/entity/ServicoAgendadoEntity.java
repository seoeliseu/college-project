package br.com.salao.entity;

import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;

public class ServicoAgendadoEntity {
	
	private int id_funcionario, id_servico, id_cliente;
	private SimpleIntegerProperty data = new SimpleIntegerProperty();
	private SimpleIntegerProperty hora = new SimpleIntegerProperty();
	private SimpleDoubleProperty valor = new SimpleDoubleProperty();
	public int getId_funcionario() {
		return id_funcionario;
	}
	public void setId_funcionario(int id_funcionario) {
		this.id_funcionario = id_funcionario;
	}
	public int getId_servico() {
		return id_servico;
	}
	public void setId_servico(int id_servico) {
		this.id_servico = id_servico;
	}
	public int getId_cliente() {
		return id_cliente;
	}
	public void setId_cliente(int id_cliente) {
		this.id_cliente = id_cliente;
	}
	
	public int getData() {
		return this.data.get();
	}
	public void setData(int data) {
		this.data.set(data);
	}
	
	public int getHora() {
		return this.hora.get();
	}
	public void setHora(int hora) {
		this.hora.set(hora);
	}
	
	public double getValor() {
		return this.valor.get();
	}
	public void setData(double valor) {
		this.valor.set(valor);
	}

}

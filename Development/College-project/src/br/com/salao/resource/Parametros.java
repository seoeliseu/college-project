package br.com.salao.resource;

import java.sql.Time;

public class Parametros {
	private float creditoFidelidade;
	private double creditoAniversario;
	private Time horaFechamento;
	
	
	public float getCreditoFidelidade() {
		return creditoFidelidade;
	}
	public void setCreditoFidelidade(float creditoFidelidade) {
		this.creditoFidelidade = creditoFidelidade;
	}
	public double getCreditoAniversario() {
		return creditoAniversario;
	}
	public void setCreditoAniversario(double creditoAniversario) {
		this.creditoAniversario = creditoAniversario;
	}
	public Time getHoraFechamento() {
		return horaFechamento;
	}
	public void setHoraFechamento(Time horaFechamento) {
		this.horaFechamento = horaFechamento;
	}
}

package br.com.salao.entity;

import javafx.beans.property.SimpleFloatProperty;
import javafx.beans.property.SimpleLongProperty;

public class ConfiguracaoEntity {
	private SimpleLongProperty hora_fechamento;
	private SimpleFloatProperty cred_aniversario;
	private SimpleFloatProperty cred_fidelidade;
	
	public ConfiguracaoEntity(long hora_fechamento, float cred_aniversario,float cred_fidelidade) {
		this.hora_fechamento = new SimpleLongProperty(hora_fechamento);
		this.cred_aniversario = new SimpleFloatProperty(cred_aniversario);
		this.cred_fidelidade = new SimpleFloatProperty(cred_fidelidade);
	}
	
	public long getHoraFechamento(){
		return hora_fechamento.get();
	}
	public void setHoraFechamento(long hora_fechamento){
		this.hora_fechamento.set(hora_fechamento);
	}
	public float getCredAniversario(){
		return cred_aniversario.get();
	}
	public void setCredAniversario(float cred_aniversario){
		this.cred_aniversario.set(cred_aniversario);
	}
	public float getCredFidelidade(){
		return cred_fidelidade.get();
	}
	public void setHoraFechamento(float cred_fidelidade){
		this.cred_fidelidade.set(cred_fidelidade);
	}
}

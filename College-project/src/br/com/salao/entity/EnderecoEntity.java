package br.com.salao.entity;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class EnderecoEntity {

	private SimpleIntegerProperty id_pais;
	private SimpleIntegerProperty id_estado;
	private SimpleStringProperty cep;
	private SimpleIntegerProperty id_cidade;
	private SimpleStringProperty bairro;
	private SimpleStringProperty rua;
	private SimpleStringProperty numero;
	private SimpleStringProperty complemento;

	public EnderecoEntity(int id_pais, int id_estado, String cep,
			int id_cidade, String bairro, String rua, String numero,
			String complemento) {
		
		this.id_pais = new SimpleIntegerProperty(id_pais);
		this.id_estado = new SimpleIntegerProperty(id_estado);
		this.cep = new SimpleStringProperty(cep);
		this.id_cidade = new SimpleIntegerProperty(id_cidade);
		this.bairro = new SimpleStringProperty(bairro);
		this.rua = new SimpleStringProperty(rua);
		this.numero = new SimpleStringProperty(numero);
		this.complemento = new SimpleStringProperty(complemento);
	}

	public int getPais() {
		return id_pais.get();
	}

	public void setPais(int id_pais) {
		this.id_pais.set(id_pais);
	}

	public int getEstado() {
		return id_estado.get();
	}

	public void setEstado(int id_estado) {
		this.id_estado.set(id_estado);
	}

	public String getCep() {
		return cep.get();
	}

	public void setCep(String cep) {
		this.cep.set(cep);
	}

	public int  getCidade() {
		return id_cidade.get();
	}

	public void setCidade(int id_cidade) {
		this.id_cidade.set(id_cidade);
	}

	public String getBairro() {
		return bairro.get();
	}

	public void setBairro(String bairro) {
		this.bairro.set(bairro);
	}

	public String getRua() {
		return rua.get();
	}

	public void setRua(String rua) {
		this.rua.set(rua);
	}

	public String getNumero() {
		return numero.get();
	}

	public void setNumero(String numero) {
		this.numero.set(numero);
	}

	public String getComplemento() {
		return complemento.get();
	}

	public void setComplemento(String complemento) {
		this.complemento.set(complemento);
	}

}

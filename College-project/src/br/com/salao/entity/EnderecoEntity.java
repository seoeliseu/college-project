package br.com.salao.entity;

import javafx.beans.property.SimpleStringProperty;

public class EnderecoEntity {

	private SimpleStringProperty pais;
	private SimpleStringProperty estado;
	private SimpleStringProperty cep;
	private SimpleStringProperty cidade;
	private SimpleStringProperty bairro;
	private SimpleStringProperty rua;
	private SimpleStringProperty numero;
	private SimpleStringProperty complemento;

	public EnderecoEntity(String pais, String estado, String cep,
			String cidade, String bairro, String rua, String numero,
			String complemento) {
		
		this.pais = new SimpleStringProperty(pais);
		this.estado = new SimpleStringProperty(estado);
		this.cep = new SimpleStringProperty(cep);
		this.cidade = new SimpleStringProperty(cidade);
		this.bairro = new SimpleStringProperty(bairro);
		this.rua = new SimpleStringProperty(rua);
		this.numero = new SimpleStringProperty(numero);
		this.complemento = new SimpleStringProperty(complemento);
	}

	public String getPais() {
		return pais.get();
	}

	public void setPais(String pais) {
		this.pais.set(pais);
	}

	public String getEstado() {
		return estado.get();
	}

	public void setEstado(String estado) {
		this.estado.set(estado);
	}

	public String getCep() {
		return cep.get();
	}

	public void setCep(String cep) {
		this.cep.set(cep);
	}

	public String getCidade() {
		return cidade.get();
	}

	public void setCidade(String cidade) {
		this.cidade.set(cidade);
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

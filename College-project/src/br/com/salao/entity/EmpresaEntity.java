package br.com.salao.entity;

import javafx.beans.property.SimpleStringProperty;

public class EmpresaEntity {
	private SimpleStringProperty nomeFantasia;
	private SimpleStringProperty razaoSocial;
	private SimpleStringProperty cnpj;
	private ContatoEntity contato;
	private EnderecoEntity endereco;

	public EmpresaEntity(String nomeFantasia, String razaoSocial, String cnpj,
			ContatoEntity contato, EnderecoEntity endereco) {
		
		this.nomeFantasia = new SimpleStringProperty(nomeFantasia);
		this.razaoSocial = new SimpleStringProperty(razaoSocial);
		this.cnpj = new SimpleStringProperty(cnpj);
		this.contato = contato;
		this.endereco = endereco;
	}

	public String getNomeFantasia() {
		return this.nomeFantasia.get();
	}

	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia.set(nomeFantasia);
	}

	public String getRazaoSocial() {
		return this.razaoSocial.get();
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial.set(razaoSocial);
	}

	public String getCnpj() {
		return this.cnpj.get();
	}

	public void setCnpj(String cnpj) {
		this.cnpj.set(cnpj);
	}

	public ContatoEntity getContato() {
		return this.contato;
	}

	public void setContato(ContatoEntity contato) {
		this.contato = contato;
	}

	public EnderecoEntity getEndereco() {
		return endereco;
	}

	public void setEndereco(EnderecoEntity endereco) {
		this.endereco = endereco;
	}

	
}

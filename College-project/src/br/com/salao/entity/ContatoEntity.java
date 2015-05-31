package br.com.salao.entity;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class ContatoEntity {

	private SimpleStringProperty email;
	private SimpleStringProperty telefone1;
	private SimpleStringProperty telefone2;
	private SimpleIntegerProperty ID;

	public ContatoEntity(String email, String telefone1, String telefone2) {

		this.email = new SimpleStringProperty(email);
		this.telefone1 = new SimpleStringProperty(telefone1);
		this.telefone2 = new SimpleStringProperty(telefone2);
	}

	public String getEmail() {
		return this.email.get();
	}

	public void setEmail(String email) {
		this.email.set(email);
	}

	public String getTelefone1() {
		return this.telefone1.get();
	}

	public void setTelefone1(String telefone1) {
		this.telefone1.get();
	}

	public String getTelefone2() {
		return this.telefone2.get();
	}

	public void setTelefone2(String telefone2) {
		this.telefone2.set(telefone2);
	}

	public int getID() {
		return this.ID.get();
	}

	public void setID(int iD) {
		this.ID.set(iD);
	}

}

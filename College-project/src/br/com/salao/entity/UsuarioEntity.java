package br.com.salao.entity;

import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleStringProperty;

public class UsuarioEntity {

	private SimpleStringProperty nomeDeUsuario;
	private SimpleStringProperty Senha;
	private SimpleBooleanProperty tipo;

	public UsuarioEntity(String nomeDeUsuario, String senha, boolean tipo) {
		this.nomeDeUsuario.set(nomeDeUsuario);
		this.Senha.set(senha);
		this.tipo.set(tipo);
	}

	public String getNomeDeUsuario() {
		return nomeDeUsuario.get();
	}

	public void setNomeDeUsuario(String nomeDeUsuario) {
		this.nomeDeUsuario.set(nomeDeUsuario);
	}

	public String getSenha() {
		return Senha.get();
	}

	public void setSenha(String senha) {
		this.Senha.set(senha);
	}

	public boolean getTipo() {
		return tipo.get();
	}

	public void setTipo(boolean tipo) {
		this.tipo.set(tipo);
	}

}

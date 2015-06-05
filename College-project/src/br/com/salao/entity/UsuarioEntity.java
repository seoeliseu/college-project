package br.com.salao.entity;

import br.com.salao.interfaces.IAutentica;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleStringProperty;

public class UsuarioEntity implements IAutentica{

	private SimpleStringProperty nomeDeUsuario;
	private SimpleStringProperty Senha;
	private SimpleBooleanProperty tipo;

	public UsuarioEntity(String nomeDeUsuario, String senha, boolean tipo) {
		this.nomeDeUsuario = new SimpleStringProperty(nomeDeUsuario);
		this.Senha = new SimpleStringProperty(senha);
		this.tipo = new SimpleBooleanProperty(tipo);
	}

	public UsuarioEntity(String nomeDeUsuario, String senha){
		this.nomeDeUsuario = new SimpleStringProperty(nomeDeUsuario);
		this.Senha = new SimpleStringProperty(senha);
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

	@Override
	public Object login(String user, String senha) {
		return null;
	}

	@Override
	public boolean logout() {
		return false;
	}

}

package br.com.salao.interfaces;

public interface IController {
	
	void Excluir(Object objeto);
	void Alterar(Object objeto);
	boolean Inserir(Object objeto);
	Object Pesquisar(Object objeto);
}

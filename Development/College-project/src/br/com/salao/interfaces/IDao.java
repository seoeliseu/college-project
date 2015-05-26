package br.com.salao.interfaces;

public interface IDao {

	void Salvar(Object objeto);
	void Alterar(Object objeto);
	void Inserir(Object objeto);
	Object Pesquisar(Object objeto);
}

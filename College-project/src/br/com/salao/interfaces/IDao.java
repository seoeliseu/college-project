package br.com.salao.interfaces;

public interface IDao {

	void Excluir(Object objeto);
	void Alterar(Object objeto);
	void Inserir(Object objeto);
	Object Pesquisar(Object objeto);
}

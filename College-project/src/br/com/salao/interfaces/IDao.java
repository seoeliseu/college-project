package br.com.salao.interfaces;

public interface IDao {
	
	final String INSERT = " INSERT INTO ";
	final String VALUES = " VALUES ";
	final String SELECT = " SELECT ";
	final String FROM = " FROM ";
	final String WHERE = " WHERE ";
	final String UPDATE = " UPDATE ";
	final String AND = " AND ";
	final String OR = " OR ";
	

	void Excluir(Object objeto);
	void Alterar(Object objeto);
	boolean Inserir(Object objeto);
	Object Pesquisar(Object objeto);
	int getId(Object objeto);
}

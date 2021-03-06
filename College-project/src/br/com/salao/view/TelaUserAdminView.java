package br.com.salao.view;

import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;

public class TelaUserAdminView extends VBox{
	public AnchorPane paneMenuBar;
	public MenuBar menuBar;
    public Menu mCadastrar, mEditar,mConsultar,mRelatorio;
    public MenuItem miAddCliente,miAddServico,miAddFuncionario, 
    miSetCliente, miSetServicoAgenda, miSetFuncionario,miSetServico, miSetEmpresa,miSetParamentros,
    	miFindCliente, miShowServicos, miShowAgendaGeral, miShowDadosUsuario,miFindFuncionario, 
    	miRelServicos;
	
	public TelaUserAdminView(){
		iniComponents();
		iniLayout();
	}
	
	private void iniComponents(){
		
		setPrefSize(1100, 660);
		paneMenuBar = new AnchorPane();
		paneMenuBar.setPrefSize(790, 50);
		
		menuBar = new MenuBar();
		
		mCadastrar = new Menu("Cadastro");
		mEditar = new Menu("Editar");
		mConsultar = new Menu("Consulta");
		mRelatorio = new Menu("Relat�rio");
		
		//Cadastros
		miAddCliente = new MenuItem("Novo cliente");
		miAddServico = new MenuItem("Servi�o");
		miAddFuncionario = new MenuItem("Funcion�rio");
		
		//Consultas
		miShowAgendaGeral = new MenuItem("Agendamentos");
		miShowDadosUsuario = new MenuItem("Dados de usu�rio");				
		miFindCliente = new MenuItem("Cliente");
		miShowServicos = new MenuItem("Servi�os");
		miFindFuncionario = new MenuItem("Funcion�rio");
		
		//Editar
		miSetCliente = new MenuItem("Cliente");
		miSetServicoAgenda = new MenuItem("Servi�o agendado");
		miSetServico = new MenuItem("Servi�o");
		miSetFuncionario = new MenuItem("Funcion�rio");
		miSetEmpresa = new MenuItem("Empresa");
		miSetParamentros = new MenuItem("Par�metros");
		
		//Rel�torios
		miRelServicos = new MenuItem("Faturamento");
		
		mCadastrar.getItems().addAll(miAddCliente,miAddServico,miAddFuncionario);
		mEditar.getItems().addAll(miSetCliente, miSetServicoAgenda,miSetServico,miSetFuncionario,miSetEmpresa,miSetParamentros);
		mConsultar.getItems().addAll(miFindCliente, miShowAgendaGeral, miShowServicos, miShowDadosUsuario, miFindFuncionario);
		mRelatorio.getItems().addAll(miRelServicos);
		
		menuBar.getMenus().addAll(mCadastrar,mEditar,mConsultar,mRelatorio);
		paneMenuBar.getChildren().add(menuBar);
		
		getChildren().addAll(paneMenuBar);
	}
	
	private void iniLayout(){
		menuBar.setLayoutX(0);
		menuBar.setLayoutY(0);
	}
}

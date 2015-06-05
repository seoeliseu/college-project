package br.com.salao.view;

import javafx.scene.control.Button;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.Separator;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;

public class TelaUserComumView extends VBox{
	public AnchorPane paneMenuBar,paneBody;
	public MenuBar menuBar;
    public Menu mCadastrar, mEditar,mConsultar;
    public MenuItem miAddCliente, miSetCliente, miSetServicoAgenda, miFindCliente, miListarServicos, miAgendaGeral,
    	miDadosUsuario;
    
    public Button btAgendamento, btListarServicos, btAddCliente, btSair;
    public Separator sepDownButtons;
	
	public TelaUserComumView(){
		iniComponents();
		iniLayout();
	}
	
	private void iniComponents(){
		
		setPrefSize(1100, 680);
		paneMenuBar = new AnchorPane();
		paneMenuBar.setPrefSize(790, 50);
		paneBody = new AnchorPane();
		paneBody.setPrefSize(790, 500);
		
		menuBar = new MenuBar();
		
		mCadastrar = new Menu("Cadastro");
		mEditar = new Menu("Editar");
		mConsultar = new Menu("Consulta");
		
		miAddCliente = new MenuItem("Novo cliente");
		miAgendaGeral = new MenuItem("Agendamentos");
		miDadosUsuario = new MenuItem("Dados de usuário");
		miFindCliente = new MenuItem("Cliente");
		miListarServicos = new MenuItem("Serviços");
		miSetCliente = new MenuItem("Dados de cliente");
		miSetServicoAgenda = new MenuItem("Serviço agendado");
		
		mCadastrar.getItems().add(miAddCliente);
		mEditar.getItems().addAll(miSetCliente, miSetServicoAgenda);
		mConsultar.getItems().addAll(miFindCliente, miAgendaGeral, miListarServicos, miDadosUsuario);
		
		btAgendamento = new Button("Agendamento");
		btListarServicos = new Button("Serviços");
		btAddCliente = new Button("Cadastrar cliente");
		btAgendamento.setPrefSize(150, 80);
		btListarServicos.setPrefSize(150, 80);
		btAddCliente.setPrefSize(150, 80);
		
		btSair = new Button("Sair");
		btSair.setPrefSize(80, 40);
		
		sepDownButtons = new Separator();
		sepDownButtons.setPrefSize(1070,25);
		
		menuBar.getMenus().addAll(mCadastrar,mEditar,mConsultar);
		paneMenuBar.getChildren().add(menuBar);
		
		paneBody.getChildren().addAll(btAgendamento,btListarServicos,btAddCliente,btSair,sepDownButtons);
		
		getChildren().addAll(paneMenuBar,paneBody);
		
	}
	
	private void iniLayout(){
		menuBar.setLayoutX(0);
		menuBar.setLayoutY(0);
		
		btAgendamento.setLayoutX(30);
		btAgendamento.setLayoutY(10);
		
		btListarServicos.setLayoutX(230);
		btListarServicos.setLayoutY(10);
		
		btAddCliente.setLayoutX(430);
		btAddCliente.setLayoutY(10);
		
		sepDownButtons.setLayoutX(15);
		sepDownButtons.setLayoutY(140);
		
		btSair.setLayoutX(1000);
		btSair.setLayoutY(10);
	}
}

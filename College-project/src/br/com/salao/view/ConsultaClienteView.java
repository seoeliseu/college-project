package br.com.salao.view;

import br.com.salao.entity.ClienteEntity;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class ConsultaClienteView extends AnchorPane{
	public Button btSair, btPesquisar, btAcessarCliente, btEditar, btCadastrarCliente, btDeletar;
	public TextField tfPesquisar;
	public TableView<ClienteEntity> tableCliente;
	private ObservableList<ClienteEntity> data;
	private TableColumn nomeCol, dateNasCol, rgCol, telOneCol, telTwoCol, emailCol, credCol;
	
	public ConsultaClienteView(){
		iniComponents();
		iniLayout();
	}
	
	private void iniComponents(){
		setPrefSize(1100, 660);
		
		btSair = new Button("Voltar");
		btSair.setPrefSize(100, 30);
		btPesquisar = new Button("Pesquisar");
		btAcessarCliente = new Button("Acessar");
		btAcessarCliente.setPrefSize(100, 30);
		btEditar = new Button("Editar");
		btEditar.setPrefSize(100, 30);
		btCadastrarCliente = new Button("+ Cliente");
		btCadastrarCliente.setPrefSize(100, 30);
		btDeletar = new Button("Excluir");
		btDeletar.setPrefSize(100, 30);
		
		tfPesquisar = new TextField();
		tfPesquisar.setPrefWidth(950);
		
		tableCliente = new TableView<ClienteEntity>();
		tableCliente.setPrefSize(1050, 400);
		
		nomeCol = new TableColumn<>("Nome");
		nomeCol.setMinWidth(400);
		
		dateNasCol = new TableColumn<>("Data de nascimento");
		dateNasCol.setMinWidth(150);
		rgCol = new TableColumn<>("RG");
		rgCol.setMinWidth(150);
		telOneCol = new TableColumn<>("Telefone fixo");
		telOneCol.setMinWidth(150);
		telTwoCol = new TableColumn<>("Telefone celular");
		telTwoCol.setMinWidth(150);
		emailCol = new TableColumn<>("Email");
		emailCol.setMinWidth(300);
		credCol = new TableColumn<>("Cr�dito");
		credCol.setMinWidth(150);
		
		tableCliente.getColumns().addAll(nomeCol,dateNasCol,rgCol,telOneCol,telTwoCol,emailCol,credCol);
		
		getChildren().addAll(tableCliente,btSair,tfPesquisar,btPesquisar, btAcessarCliente, btEditar,btCadastrarCliente,btDeletar);
		
		data = FXCollections.observableArrayList();
		tableCliente.setItems(data);
		
	}
	private void iniLayout(){
		btSair.setLayoutX(30);
		btSair.setLayoutY(5);
		
		tableCliente.setLayoutX(30);
		tableCliente.setLayoutY(70);
		
		tfPesquisar.setLayoutX(30);
		tfPesquisar.setLayoutY(40);
		
		btPesquisar.setLayoutX(1013);
		btPesquisar.setLayoutY(40);
		
		btAcessarCliente.setLayoutX(30);
		btAcessarCliente.setLayoutY(480);
		
		btEditar.setLayoutX(150);
		btEditar.setLayoutY(480);
		
		btCadastrarCliente.setLayoutX(270);
		btCadastrarCliente.setLayoutY(480);
		
		btDeletar.setLayoutX(390);
		btDeletar.setLayoutY(480);
	}
}
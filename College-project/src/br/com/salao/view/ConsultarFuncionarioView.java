package br.com.salao.view;

import br.com.salao.entity.FuncionarioEntity;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class ConsultarFuncionarioView extends AnchorPane{
	public Button btVoltar, btPesquisar, btCadastrarFuncionario, btExibirAllData, btEditar, btDeletar, btSetUser, btRemoveUser;
	public TextField tfPesquisar;
	private TableView<FuncionarioEntity> tableFuncionario;
	private TableColumn<FuncionarioEntity, String> nomeCol, cargoCol, telOneCol, telTwoCol;
	private ObservableList<FuncionarioEntity> data;
	
	public ConsultarFuncionarioView(){
		iniComponents();
		iniLayout();
	}
	private void iniComponents(){
		setPrefSize(1100, 660);
		
		btVoltar = new Button("Voltar");
		btVoltar.setPrefSize(120, 30);
		btPesquisar = new Button("Pesquisar");
		btCadastrarFuncionario = new Button("+ Funcionário");
		btCadastrarFuncionario.setPrefSize(120, 30);
		btExibirAllData = new Button("Todos os dados");
		btExibirAllData.setPrefSize(120, 30);
		btEditar = new Button("Editar");
		btEditar.setPrefSize(120, 30);
		btDeletar = new Button("Excluir");
		btDeletar.setPrefSize(120, 30);
		btSetUser = new Button("Cadastrar usuário");
		btSetUser.setPrefSize(120, 30);
		btRemoveUser = new Button("Remover usuário");
		btRemoveUser.setPrefSize(120, 30);
		
		tfPesquisar = new TextField();
		tfPesquisar.setPrefWidth(950);
		
		tableFuncionario = new TableView<FuncionarioEntity>();
		tableFuncionario.setPrefSize(1050, 400);
		
		nomeCol = new TableColumn<FuncionarioEntity, String>("Nome");
		nomeCol.setMinWidth(400);
		cargoCol = new TableColumn<FuncionarioEntity, String>("Cargo");
		cargoCol.setMinWidth(250);
		telOneCol = new TableColumn<FuncionarioEntity, String>("Telefone");
		telOneCol.setMinWidth(200);
		telTwoCol = new TableColumn<FuncionarioEntity, String>("Telefone");
		telTwoCol.setMinWidth(200);
		
		tableFuncionario.getColumns().addAll(nomeCol,cargoCol, telOneCol, telTwoCol);
		
		getChildren().addAll(tableFuncionario, btVoltar,tfPesquisar, btPesquisar, btCadastrarFuncionario, btExibirAllData, btEditar, btDeletar, btSetUser, btRemoveUser);
		
		data = FXCollections.observableArrayList();
		
		tableFuncionario.setItems(data);
	}
	private void iniLayout(){
		btVoltar.setLayoutX(30);
		btVoltar.setLayoutY(15);
		
		tfPesquisar.setLayoutX(30);
		tfPesquisar.setLayoutY(60);
		
		btPesquisar.setLayoutX(1013);
		btPesquisar.setLayoutY(60);
		
		tableFuncionario.setLayoutX(30);
		tableFuncionario.setLayoutY(90);
		
		btCadastrarFuncionario.setLayoutX(30);
		btCadastrarFuncionario.setLayoutY(510);
		
		btExibirAllData.setLayoutX(180);
		btExibirAllData.setLayoutY(510);
		
		btEditar.setLayoutX(330);
		btEditar.setLayoutY(510);
		
		btDeletar.setLayoutX(480);
		btDeletar.setLayoutY(510);
		
		btSetUser.setLayoutX(630);
		btSetUser.setLayoutY(510);
		
		btRemoveUser.setLayoutX(780);
		btRemoveUser.setLayoutY(510);
	}
}

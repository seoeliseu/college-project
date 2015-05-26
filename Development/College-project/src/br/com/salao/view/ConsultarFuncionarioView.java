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
		btVoltar = new Button("Voltar");
		btPesquisar = new Button("Pesquisar");
		btCadastrarFuncionario = new Button("+ Funcionário"); 
		btExibirAllData = new Button("Todos os dados");
		btEditar = new Button("Editar");
		btDeletar = new Button("Excluir");
		btSetUser = new Button("Cadastrar usuário");
		btRemoveUser = new Button("Remover usuário");
		
		tfPesquisar = new TextField();
		tfPesquisar.setPrefWidth(950);
		
		tableFuncionario = new TableView<FuncionarioEntity>();
		tableFuncionario.setPrefSize(1050, 400);
		
		nomeCol = new TableColumn<FuncionarioEntity, String>("Nome");
		cargoCol = new TableColumn<FuncionarioEntity, String>("Cargo");
		telOneCol = new TableColumn<FuncionarioEntity, String>("Telefone");
		telTwoCol = new TableColumn<FuncionarioEntity, String>("Telefone");
		
		
		tableFuncionario.getColumns().addAll(nomeCol,cargoCol, telOneCol, telTwoCol);
		
		getChildren().addAll(tableFuncionario, btVoltar,tfPesquisar, btPesquisar, btCadastrarFuncionario, btExibirAllData, btEditar, btDeletar, btSetUser, btRemoveUser);
		
		data = FXCollections.observableArrayList();
		
		tableFuncionario.setItems(data);
	}
	private void iniLayout(){
		btVoltar.setLayoutX(30);
		btVoltar.setLayoutY(0);
		
		tfPesquisar.setLayoutX(30);
		tfPesquisar.setLayoutY(30);
		
		btPesquisar.setLayoutX(1013);
		btPesquisar.setLayoutY(30);
		
		tableFuncionario.setLayoutX(30);
		tableFuncionario.setLayoutY(60);
		
		btCadastrarFuncionario.setLayoutX(30);
		btCadastrarFuncionario.setLayoutY(480);
		
		btExibirAllData.setLayoutX(130);
		btExibirAllData.setLayoutY(480);
		
		btEditar.setLayoutX(260);
		btEditar.setLayoutY(480);
		
		btDeletar.setLayoutX(330);
		btDeletar.setLayoutY(480);
		
		btSetUser.setLayoutX(400);
		btSetUser.setLayoutY(480);
		
		btRemoveUser.setLayoutX(540);
		btRemoveUser.setLayoutY(480);
	}
}

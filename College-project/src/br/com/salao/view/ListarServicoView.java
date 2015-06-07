package br.com.salao.view;

import br.com.salao.entity.ServicoEntity;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;

public class ListarServicoView extends AnchorPane{
	private AnchorPane paneBody;
	public Button btSair, btCadastrarServico, btDeletar, btEditar;
	public TableView<ServicoEntity> tableServico;
	private TableColumn<ServicoEntity, String> nomeServicoCol;
	private TableColumn<ServicoEntity, Double> valorCol;
	private TableColumn<ServicoEntity, Integer> timeCol;
	
	private ObservableList<ServicoEntity> data;
	
	public ListarServicoView(){
		iniComponents();
		iniLayout();
	}
	
	private void iniComponents(){
		setPrefSize(1100, 660);
		
		paneBody = new AnchorPane();
		paneBody.setPrefSize(790, 500);
		
		btSair = new Button("Voltar");
		btSair.setPrefSize(100, 30);
		btCadastrarServico = new Button("+ Servi�o");
		btCadastrarServico.setPrefSize(100, 30);
		btDeletar = new Button("Excluir");
		btDeletar.setPrefSize(100, 30);
		btEditar = new Button("Editar");
		btEditar.setPrefSize(100, 30);
		
		tableServico = new TableView<ServicoEntity>();
		tableServico.setPrefSize(1050, 400);
		nomeServicoCol = new TableColumn<ServicoEntity, String>("Servi�o");
		nomeServicoCol.setMinWidth(600);
		nomeServicoCol.setCellValueFactory(
                new PropertyValueFactory<ServicoEntity, String>("nome"));
		
		valorCol = new TableColumn<ServicoEntity, Double>("Valor");
		valorCol.setMinWidth(224);
		valorCol.setCellValueFactory(
                new PropertyValueFactory<ServicoEntity, Double>("valor"));
		timeCol = new TableColumn <ServicoEntity, Integer>("Tempo m�dio(min)");
		timeCol.setMinWidth(224);
		timeCol.setCellValueFactory(
                new PropertyValueFactory<ServicoEntity, Integer>("tempo"));
		
		data = FXCollections.observableArrayList();
		tableServico.setItems(data);
		
		tableServico.getColumns().addAll(nomeServicoCol,valorCol,timeCol);
		
		paneBody.getChildren().addAll(tableServico, btSair,btCadastrarServico, btDeletar, btEditar);
		getChildren().addAll(paneBody);
		
		data.add(new ServicoEntity("Unha mao",15, 45));
		data.add(new ServicoEntity("Unha p�",15, 45));
	}
	private void iniLayout(){
		btSair.setLayoutX(30);
		btSair.setLayoutY(20);
		
		tableServico.setLayoutX(30);
		tableServico.setLayoutY(60);
		
		btCadastrarServico.setLayoutX(30);
		btCadastrarServico.setLayoutY(480);
		
		btEditar.setLayoutX(150);
		btEditar.setLayoutY(480);
		
		btDeletar.setLayoutX(270);
		btDeletar.setLayoutY(480);
	}
}

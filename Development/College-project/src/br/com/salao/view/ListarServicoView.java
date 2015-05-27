package br.com.salao.view;

import br.com.salao.entity.ProdutoEntity;
import br.com.salao.entity.ServicoEntity;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
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
	public TableView<ProdutoEntity> tableServico;
	private TableColumn<ProdutoEntity, String> nomeServicoCol;
	private TableColumn<ProdutoEntity, Double> valorCol;
	private TableColumn<ProdutoEntity, Integer> timeCol;
	
	
	
	private ObservableList<ProdutoEntity> data;
	
	public ListarServicoView(){
		iniComponents();
		iniLayout();
	}
	
	private void iniComponents(){
		paneBody = new AnchorPane();
		paneBody.setPrefSize(790, 500);
		
		btSair = new Button("Voltar");
		btCadastrarServico = new Button("+ Serviço");
		btDeletar = new Button("Excluir");
		btEditar = new Button("Editar");
		
		tableServico = new TableView<ProdutoEntity>();
		tableServico.setPrefSize(1050, 400);
		nomeServicoCol = new TableColumn<ProdutoEntity, String>("Serviço");
		nomeServicoCol.setMinWidth(600);
		nomeServicoCol.setCellValueFactory(
                new PropertyValueFactory<ProdutoEntity, String>("nome"));
		
		valorCol = new TableColumn<ProdutoEntity, Double>("Valor");
		valorCol.setMinWidth(224);
		valorCol.setCellValueFactory(
                new PropertyValueFactory<ProdutoEntity, Double>("valor"));
		timeCol = new TableColumn <ProdutoEntity, Integer>("Tempo médio(min)");
		timeCol.setMinWidth(224);
		timeCol.setCellValueFactory(
                new PropertyValueFactory<ProdutoEntity, Integer>("tempo"));
		
		data = FXCollections.observableArrayList();
		tableServico.setItems(data);
		
		tableServico.getColumns().addAll(nomeServicoCol,valorCol,timeCol);
		
		paneBody.getChildren().addAll(tableServico, btSair,btCadastrarServico, btDeletar, btEditar);
		getChildren().addAll(paneBody);
		
		
		data.add(new ProdutoEntity("Unha mao",15, 45));
		data.add(new ProdutoEntity("Unha pé",15, 45));
	}
	private void iniLayout(){
		btSair.setLayoutX(30);
		btSair.setLayoutY(20);
		
		tableServico.setLayoutX(30);
		tableServico.setLayoutY(60);
		
		btCadastrarServico.setLayoutX(30);
		btCadastrarServico.setLayoutY(480);
		
		btEditar.setLayoutX(130);
		btEditar.setLayoutY(480);
		
		btDeletar.setLayoutX(210);
		btDeletar.setLayoutY(480);
	}
}

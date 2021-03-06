package br.com.salao.view;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import br.com.salao.entity.ClienteEntity;

public class ClienteEntityView extends AnchorPane{
	
	private Label lbTotalBruto, lbTotalDesconto;
	public Button btConsultaAgenda,  btVoltar, btAgendarServico, btExcluir, btEditar, btFaturar, btEmitirSegundaVia;
	public TextField tfTBruto, tfTDesconto;
	
	public TableView<ClienteEntity> tableCliente;
	public TableColumn colNome, colRg, colTelOne, colTelTwo;
	public ObservableList<ClienteEntity> dataCliente;
	
	public TableView tableServicosAgendados;
	public TableColumn colServico, colData, colHora, colValor;
	
	
	public ClienteEntityView() {
		iniComponents();
		iniLayout();
	}
	
	private void iniComponents(){
		lbTotalBruto = new Label("Total bruto: ");
		lbTotalDesconto = new Label("Total com desconto: ");
		
		btConsultaAgenda = new Button("Consultar Agenda");
		btConsultaAgenda.setPrefSize(150, 30);
		btVoltar = new Button("Voltar");
		btVoltar.setPrefSize(100, 30);
		btAgendarServico = new Button("+ Servi�o");
		btAgendarServico.setPrefSize(150, 30);
		btExcluir = new Button("Excluir");
		btExcluir.setPrefSize(150, 30);
		btEditar = new Button("Editar");
		btEditar.setPrefSize(150, 30);
		btFaturar = new Button("Faturar");
		btFaturar.setPrefSize(150, 30);
		
		btEmitirSegundaVia = new Button("Emitir 2� via pagamento");
		btEmitirSegundaVia.setPrefSize(200, 30);
		
		tfTBruto = new TextField();
		tfTBruto.setPrefWidth(80);
		tfTBruto.setEditable(false);
		tfTDesconto = new TextField();
		tfTDesconto.setPrefWidth(80);
		tfTDesconto.setEditable(false);
		
		tableCliente = new TableView<>();
		tableCliente.setPrefSize(700, 70);
		colNome = new TableColumn<>("Nome");
		colNome.setCellValueFactory(
                new PropertyValueFactory<ClienteEntity, String>("nome"));
		colNome.setMinWidth(310);
		
		colRg = new TableColumn<>("RG");
		colRg.setCellValueFactory(
                new PropertyValueFactory<ClienteEntity, String>("rg"));
		colRg.setMinWidth(130);
		
		colTelOne = new TableColumn<>("Telefone");
		colTelOne.setCellValueFactory(
                new PropertyValueFactory<ClienteEntity, String>("telefone1"));
		colTelOne.setMinWidth(130);
		
		colTelTwo = new TableColumn<>("Celular");
		colTelTwo.setCellValueFactory(
                new PropertyValueFactory<ClienteEntity, String>("telefone2"));
		colTelTwo.setMinWidth(130);
		
		tableServicosAgendados = new TableView<>();
		tableServicosAgendados.setPrefSize(700, 300);
		colServico = new TableColumn<>("Servi�o");
		colServico.setMinWidth(310);
		colData = new TableColumn<>("Data");
		colData.setMinWidth(130);
		colHora = new TableColumn<>("Hor�rio");
		colHora.setMinWidth(130);
		colValor = new TableColumn<>("Valor");
		colValor.setMinWidth(130);
		
		tableCliente.getColumns().addAll(colNome, colRg, colTelOne, colTelTwo);
		
		dataCliente = FXCollections.observableArrayList();
		tableCliente.setItems(dataCliente);
		
		tableServicosAgendados.getColumns().addAll(colServico, colData, colHora, colValor);
		
		setPrefSize(1100, 660);
		
		getChildren().addAll(lbTotalBruto, lbTotalDesconto, tfTBruto, tfTDesconto,
				btConsultaAgenda,  btVoltar, btAgendarServico, btExcluir, btEditar, btFaturar,
				tableCliente, tableServicosAgendados, btEmitirSegundaVia);
		
	}
	private void iniLayout(){
		
		btConsultaAgenda.setLayoutX(210);
		btConsultaAgenda.setLayoutY(80);
		
		btVoltar.setLayoutX(80);
		btVoltar.setLayoutY(80);
		
		tableCliente.setLayoutX(80);
		tableCliente.setLayoutY(140);
		
		tableServicosAgendados.setLayoutX(80);
		tableServicosAgendados.setLayoutY(200);
		
		btAgendarServico.setLayoutX(820);
		btAgendarServico.setLayoutY(200);
		
		btExcluir.setLayoutX(820);
		btExcluir.setLayoutY(245);
		
		btEditar.setLayoutX(820);
		btEditar.setLayoutY(290);
		
		btFaturar.setLayoutX(820);
		btFaturar.setLayoutY(335);
		
		lbTotalBruto.setLayoutX(620);
		lbTotalBruto.setLayoutY(515);
		
		tfTBruto.setLayoutX(700);
		tfTBruto.setLayoutY(510);
		
		lbTotalDesconto.setLayoutX(575);
		lbTotalDesconto.setLayoutY(555);
		
		tfTDesconto.setLayoutX(700);
		tfTDesconto.setLayoutY(550);
		
		btEmitirSegundaVia.setLayoutX(80);
		btEmitirSegundaVia.setLayoutY(510);
	}
	
	public void clienteEntity(ClienteEntity cli){
		this.dataCliente.add(0, cli);
	}
}

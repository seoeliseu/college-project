package br.com.salao.view;

import br.com.salao.resource.ConfDatePicker;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class ConsultaAgendamentosView extends AnchorPane{
	private Label lbFuncionario, lbDataInicial, lbDataFinal;
	public DatePicker dpDataInicial, dpDataFinal;
	public ComboBox cbFuncionario;
	public RadioButton rbTodos;
	public Button btVoltar, btPesquisar;
	public TextField tfPesquisar;
	
	public TableView tvAgendamentos;
	public TableColumn colCliente, colServico, colFuncionario, colData, colHoraInicial, colHoraFinal;
	private ObservableList data;
	
	public ConsultaAgendamentosView() {
		iniComponents();
		iniLayout();
	}
	
	private void iniComponents(){
		setPrefSize(1100, 660);
		
		tfPesquisar = new TextField();
		tfPesquisar.setPrefWidth(950);
		
		lbFuncionario = new Label("Funcion�rio: ");
		lbDataInicial = new Label("Data Inicial: ");
		lbDataFinal  = new Label("Data Final: ");
		
		dpDataInicial = new DatePicker();
		dpDataFinal = new DatePicker();
		ConfDatePicker.setConfDatePicker(dpDataInicial);
		ConfDatePicker.setConfDatePicker(dpDataFinal);
		
		cbFuncionario = new ComboBox<>();
		cbFuncionario.setPrefWidth(250);
		
		btVoltar = new Button("Voltar");
		btVoltar.setPrefSize(100, 30);
		btPesquisar = new Button("Pesquisar");
		
		rbTodos = new RadioButton("Todos");
		
		tvAgendamentos = new TableView<>();
		tvAgendamentos.setPrefSize(1050, 400);
		
		colCliente = new TableColumn<>("Cliente");
		colCliente.setMinWidth(200);
		colFuncionario = new TableColumn<>("Funcion�rio");
		colFuncionario.setMinWidth(200);
		colServico = new TableColumn<>("Servi�o");
		colServico.setMinWidth(200);
		colData = new TableColumn<>("Data");
		colData.setMinWidth(200);
		colHoraInicial = new TableColumn<>("Hor�rio Inicial");
		colHoraInicial.setMinWidth(200);
		colHoraFinal = new TableColumn<>("Hor�rio Final");
		colHoraFinal.setMinWidth(200);
		
		tvAgendamentos.getColumns().addAll(colCliente, colServico, colFuncionario,colData, colHoraInicial, colFuncionario);
		
		getChildren().addAll(lbFuncionario, lbDataInicial, lbDataFinal, dpDataInicial, dpDataFinal, cbFuncionario, rbTodos
				,btVoltar, btPesquisar, tvAgendamentos, tfPesquisar);
		
		data = FXCollections.observableArrayList();
		tvAgendamentos.setItems(data);
	}
	private void iniLayout(){
		btVoltar.setLayoutX(30);
		btVoltar.setLayoutY(5);		
		
		tfPesquisar.setLayoutX(30);
		tfPesquisar.setLayoutY(45);
		
		btPesquisar.setLayoutX(1013);
		btPesquisar.setLayoutY(45);
		
		lbFuncionario.setLayoutX(30);
		lbFuncionario.setLayoutY(90);
		
		cbFuncionario.setLayoutX(115);
		cbFuncionario.setLayoutY(85);
		
		lbDataInicial.setLayoutX(385);
		lbDataInicial.setLayoutY(90);
		dpDataInicial.setLayoutX(465);
		dpDataInicial.setLayoutY(85);
		
		lbDataFinal.setLayoutX(660);
		lbDataFinal.setLayoutY(90);
		dpDataFinal.setLayoutX(735);
		dpDataFinal.setLayoutY(85);
		
		rbTodos.setLayoutX(965);
		rbTodos.setLayoutY(90);
		rbTodos.setSelected(true);
		
		tvAgendamentos.setLayoutX(30);
		tvAgendamentos.setLayoutY(140);
	}
}

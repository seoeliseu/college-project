package br.com.salao.view;

import br.com.salao.resource.ConfDatePicker;
import br.com.salao.resource.MontaCombo;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class AgendarServicoView extends Application{
	public Stage stage;
	private Scene scene;
	private AnchorPane pane;
	private Label lbServico, lbFuncionario,lbData, lbHora;
	
	public Button btCadastrar, btCancelar;
	public DatePicker dpData;
	public TextField tfHora;
	public ComboBox cbServico, cbFuncionario;
	
	private int id_cliente;
	
	public static void main(String[] args) {
		launch(args);
	}
	
	public AgendarServicoView() {
		iniComponents();
		iniLayout();
	}
	
	@Override
	public void start(Stage stage) throws Exception {
		
		stage = this.stage;
		stage.setScene(scene);
		stage.setTitle("Agendamento de servi�o");
		stage.show();
	}
	
	private void iniComponents(){
		stage = new Stage();
		pane = new AnchorPane();
		pane.setPrefSize(600, 400);
		
		lbServico = new Label("Servi�o:* ");
		lbFuncionario = new Label("Funcion�rio:* ");
		lbData = new Label("Data:* ");
		lbHora = new Label("Hora:* ");
		
		dpData = new DatePicker();
		ConfDatePicker.setConfDatePicker(dpData);
		
		tfHora = new TextField();
		tfHora.setPrefWidth(100);
		
		cbServico = new ComboBox<>(new MontaCombo().getServico());
		cbServico.setPrefWidth(250);
		cbFuncionario = new ComboBox<>(new MontaCombo().getFuncionario());
		cbFuncionario.setPrefWidth(250);
		
		btCadastrar = new Button("Cadastrar");
		btCadastrar.setPrefSize(100, 30);

		btCancelar = new Button("Cancelar");
		btCancelar.setPrefSize(100, 30);
		
		pane.getChildren().addAll(lbServico, lbFuncionario,lbData, lbHora,cbServico, cbFuncionario,dpData,tfHora, btCadastrar, btCancelar);
		
		scene = new Scene(pane);
	}
	
	private void iniLayout(){
		lbServico.setLayoutX(80);
		lbServico.setLayoutY(80);
		
		cbServico.setLayoutX(140);
		cbServico.setLayoutY(75);
		
		lbFuncionario.setLayoutX(55);
		lbFuncionario.setLayoutY(135);
		
		cbFuncionario.setLayoutX(140);
		cbFuncionario.setLayoutY(130);
		
		lbData.setLayoutX(55);
		lbData.setLayoutY(190);
		
		dpData.setLayoutX(140);
		dpData.setLayoutY(185);
		
		lbHora.setLayoutX(340);
		lbHora.setLayoutY(190);
		
		tfHora.setLayoutX(390);
		tfHora.setLayoutY(185);
		
		btCadastrar.setLayoutX(150);
		btCadastrar.setLayoutY(300);
		
		btCancelar.setLayoutX(350);
		btCancelar.setLayoutY(300);
	}
	
	public void setClienteId(int id){
		this.id_cliente = id;
	}

	public int getId_cliente() {
		return id_cliente;
	}


}

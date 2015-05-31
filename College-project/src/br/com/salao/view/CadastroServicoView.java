package br.com.salao.view;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class CadastroServicoView extends AnchorPane{
	
	public Button btConfirmar, btCancelar;
	private Label lbServico, lbValor, lbTime;
	private TextField tfServico, tfValor, tfTime;
	
	public CadastroServicoView() {
		// TODO Auto-generated constructor stub
		iniComponets();
		iniLayout();
	}
	
	
	
	private void iniComponets(){
		lbServico = new Label("Servi�o: ");
		lbValor = new Label("Valor: ");
		lbTime = new Label("Tempo(min): ");
		
		tfServico = new TextField();
		tfTime = new TextField();
		tfValor = new TextField();
		
		btCancelar = new Button("Cancelar");
		btCancelar.setPrefSize(100, 30);
		btConfirmar = new Button("Confirmar");
		btConfirmar.setPrefSize(100, 30);
		
		setPrefSize(1100, 660);
		
		getChildren().addAll(lbServico,lbTime,lbValor,tfServico,tfTime,tfValor,btCancelar,btConfirmar);
	}
	private void iniLayout(){
		lbServico.setLayoutX(56);
		lbServico.setLayoutY(35);
		
		lbTime.setLayoutX(30);
		lbTime.setLayoutY(135);
		
		lbValor.setLayoutX(66);
		lbValor.setLayoutY(85);
		
		tfServico.setLayoutX(110);
		tfServico.setLayoutY(30);
		
		tfValor.setLayoutX(110);
		tfValor.setLayoutY(80);
		
		tfTime.setLayoutX(110);
		tfTime.setLayoutY(130);
		
		btCancelar.setLayoutX(275);
		btCancelar.setLayoutY(200);
		
		btConfirmar.setLayoutX(150);
		btConfirmar.setLayoutY(200);
	}

}
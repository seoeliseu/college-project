package br.com.salao.view;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class ConfiguracaoView extends AnchorPane{
	
	private Label lbCredFidel, lbCredNiver, lbFinalExpediente;
	public Button btConfirmar, btCancelar;
	public TextField tfCredFidel, tfCredNiver, tfFinalExpediente;
	
	
	public ConfiguracaoView() {
		iniComponents();
		iniLayout();
	}
	
	private void iniComponents(){
		
		lbCredFidel = new Label("Cr�dito fidelidade (%): ");
		lbCredNiver = new Label("Cr�dito anivers�rio (R$): ");
		lbFinalExpediente = new Label("Hor�rio final de expediente *: ");
		
		btCancelar = new Button("Cancelar");
		btCancelar.setPrefSize(100, 30);
		btConfirmar = new Button("Confirmar");
		btConfirmar.setPrefSize(100, 30);
		
		tfCredFidel  = new TextField();
		tfCredNiver = new TextField();
		tfFinalExpediente  =new TextField();
		
		getChildren().addAll(lbCredFidel, lbCredNiver, lbFinalExpediente, btConfirmar, btCancelar,
				tfCredFidel, tfCredNiver, tfFinalExpediente);
		
		setPrefSize(1100, 660);
	}
	private void iniLayout(){
		
		lbCredFidel.setLayoutX(200);
		lbCredFidel.setLayoutY(150);
		
		tfCredFidel.setLayoutX(340);
		tfCredFidel.setLayoutY(145);
		
		lbCredNiver.setLayoutX(190);
		lbCredNiver.setLayoutY(215);
		tfCredNiver.setLayoutX(340);
		tfCredNiver.setLayoutY(210);
		
		lbFinalExpediente.setLayoutX(160);
		lbFinalExpediente.setLayoutY(280);
		
		tfFinalExpediente.setLayoutX(340);
		tfFinalExpediente.setLayoutY(275);
		
		btCancelar.setLayoutX(475);
		btCancelar.setLayoutY(350);
		
		btConfirmar.setLayoutX(300);
		btConfirmar.setLayoutY(350);
	}
	
	

}

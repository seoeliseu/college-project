package br.com.salao.view;

import br.com.salao.resource.ConfDatePicker;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class RecuperarSenhaView extends AnchorPane{
	private Label lbCpf, lbDataNascimento;
	public TextField tfCpf;
	public DatePicker dpDataNascimento;
	public Button btConfirmar, btCancelar;
	
	public RecuperarSenhaView(){
		iniComponents();
		iniLayout();
	}
	
	private void iniComponents(){
		setPrefSize(500, 400);
		lbCpf = new Label("CPF:*");
		lbDataNascimento = new Label("Data de nascimento:*");
		tfCpf = new TextField();
		dpDataNascimento = new DatePicker();
		ConfDatePicker.setConfDatePicker(dpDataNascimento);
		
		btConfirmar = new Button("Confirmar");
		btConfirmar.setPrefSize(100, 30);
		btCancelar = new Button("Cancelar");
		btCancelar.setPrefSize(100, 30);
		
		getChildren().addAll(lbCpf,lbDataNascimento,tfCpf,dpDataNascimento,btConfirmar,btCancelar);
	}
	
	private void iniLayout(){
		lbCpf.setLayoutX(187);
		lbCpf.setLayoutY(100);
		lbDataNascimento.setLayoutX(100);
		lbDataNascimento.setLayoutY(150);
		tfCpf.setLayoutX(230);
		tfCpf.setLayoutY(95);
		
		dpDataNascimento.setLayoutX(230);
		dpDataNascimento.setLayoutY(145);
		
		btConfirmar.setLayoutX(100);
		btConfirmar.setLayoutY(270);
		
		btCancelar.setLayoutX(300);
		btCancelar.setLayoutY(270);
	}
}

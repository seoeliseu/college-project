package br.com.salao.view;

import br.com.salao.resource.ConfDatePicker;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class CadastroFuncionarioView extends AnchorPane {
	private Label lbNome, lbCTPS, lbRG, lbCPF, lbCargo, lbSalario, lbDataNasc,
			lbTelOne, lbTelTwo, lbEmail, lbPais, lbEstado, lbCep, lbCidade,
			lbBairro, lbRua, lbNumero, lbComplemento, lbUser, lbSenha;

	public TextField tfNome, tfCTPS, tfRG, tfCPF, tfSalario, tfTelOne,
			tfTelTwo, tfEmail, tfCep, tfBairro, tfRua, tfNumero, tfComplemento, tfUser;

	public Button btCadastrar, btCancelar;

	public ComboBox cbPais, cbEstado, cbCidade, cbCargo;

	public DatePicker dpDataNascimento;
	
	public PasswordField pfSenha;

	public CadastroFuncionarioView() {
		// TODO Auto-generated constructor stub
		iniComponents();
		iniLayout();
	}

	private void iniComponents() {

		lbNome = new Label("Nome:* ");
		lbCTPS = new Label("CTPS:* ");
		lbRG = new Label("RG:* ");
		lbCPF = new Label("CPF:* ");
		lbCargo = new Label("Cargo:* ");
		lbSalario = new Label("Sal�rio: ");
		lbDataNasc = new Label("Data de nascimento:* ");
		lbTelOne = new Label("Telefone: ");
		lbTelTwo = new Label("Celular: ");
		lbEmail = new Label("Email: ");
		lbPais = new Label("Pa�s:* ");
		lbEstado = new Label("Estado:* ");
		lbCep = new Label("CEP:* ");
		lbCidade = new Label("Cidade:* ");
		lbBairro = new Label("Bairro:* ");
		lbRua = new Label("Rua:* ");
		lbNumero = new Label("N�mero:* ");
		lbComplemento = new Label("Complemento: ");
		lbUser = new Label("Usu�rio: ");
		lbSenha = new Label("Senha: ");

		tfNome = new TextField();
		tfNome.setPrefWidth(400);

		tfCTPS = new TextField();
		tfCTPS.setPrefWidth(180);

		tfRG = new TextField();
		tfCPF = new TextField();
		tfSalario = new TextField();
		tfSalario.setPrefWidth(80);

		tfTelOne = new TextField();
		tfTelTwo = new TextField();
		tfEmail = new TextField();
		tfEmail.setPrefWidth(425);

		tfCep = new TextField();
		tfCep.setPrefWidth(150);

		tfBairro = new TextField();
		tfBairro.setPrefWidth(180);

		tfRua = new TextField();
		tfRua.setPrefWidth(250);

		tfNumero = new TextField();
		tfNumero.setPrefWidth(100);

		tfComplemento = new TextField();
		tfComplemento.setPrefWidth(510);
		
		tfUser = new TextField();
		pfSenha = new PasswordField();

		dpDataNascimento = new DatePicker();
		ConfDatePicker.setConfDatePicker(dpDataNascimento);
		
		cbPais = new ComboBox<>();
		cbPais.setPrefWidth(150);
		cbEstado = new ComboBox<>();
		cbEstado.setPrefWidth(150);
		cbCidade = new ComboBox<>();
		cbCidade.setPrefWidth(150);
		cbCargo = new ComboBox<>();
		cbCargo.setPrefWidth(180);
		
		

		btCadastrar = new Button("Cadastrar");
		btCadastrar.setPrefSize(100, 30);

		btCancelar = new Button("Cancelar");
		btCancelar.setPrefSize(100, 30);

		getChildren().addAll(lbNome, lbCTPS, lbRG, lbCPF, lbCargo, lbSalario,
				lbDataNasc, lbTelOne, lbTelTwo, lbEmail, lbPais, lbEstado,
				lbCep, lbCidade, lbBairro, lbRua, lbNumero, lbComplemento, lbSenha,  lbUser);
		getChildren().addAll(tfNome, tfCTPS, tfRG, tfCPF, tfSalario, tfTelOne,
				tfTelTwo, tfEmail, tfCep, tfBairro, tfRua, tfNumero,
				tfComplemento, pfSenha, tfUser);

		getChildren().addAll(dpDataNascimento, cbCargo, cbPais, cbEstado,
				cbCidade, btCadastrar, btCancelar);
		
		setPrefSize(1100, 660);
	}

	private void iniLayout() {
		lbNome.setLayoutX(120);
		lbNome.setLayoutY(100);
		
		tfNome.setLayoutX(180);
		tfNome.setLayoutY(95);
		
		lbDataNasc.setLayoutX(620);
		lbDataNasc.setLayoutY(100);
		
		dpDataNascimento.setLayoutX(750);
		dpDataNascimento.setLayoutY(95);
		
		lbCTPS.setLayoutX(125);
		lbCTPS.setLayoutY(145);
		
		tfCTPS.setLayoutX(180);
		tfCTPS.setLayoutY(140);
		
		lbRG.setLayoutX(390);
		lbRG.setLayoutY(145);
		
		tfRG.setLayoutX(430);
		tfRG.setLayoutY(140);
		
		lbCPF.setLayoutX(610);
		lbCPF.setLayoutY(145);
		
		tfCPF.setLayoutX(650);
		tfCPF.setLayoutY(140);
		
		lbCargo.setLayoutX(120);
		lbCargo.setLayoutY(190);
		
		cbCargo.setLayoutX(180);
		cbCargo.setLayoutY(185);
		
		lbTelOne.setLayoutX(390);
		lbTelOne.setLayoutY(190);
		
		tfTelOne.setLayoutX(455);
		tfTelOne.setLayoutY(185);
		
		lbTelTwo.setLayoutX(635);
		lbTelTwo.setLayoutY(190);
		
		tfTelTwo.setLayoutX(690);
		tfTelTwo.setLayoutY(185);
		
		lbEmail.setLayoutX(125);
		lbEmail.setLayoutY(235);
		
		tfEmail.setLayoutX(180);
		tfEmail.setLayoutY(230);
		
		lbSalario.setLayoutX(640);
		lbSalario.setLayoutY(235);
		
		tfSalario.setLayoutX(690);
		tfSalario.setLayoutY(230);
		
		lbPais.setLayoutX(130);
		lbPais.setLayoutY(280);
		
		cbPais.setLayoutX(180);
		cbPais.setLayoutY(275);
		
		lbEstado.setLayoutX(360);
		lbEstado.setLayoutY(280);
		
		cbEstado.setLayoutX(420);
		cbEstado.setLayoutY(275);
		
		lbCidade.setLayoutX(600);
		lbCidade.setLayoutY(280);
		
		cbCidade.setLayoutX(660);
		cbCidade.setLayoutY(275);
		
		lbCep.setLayoutX(130);
		lbCep.setLayoutY(325);
		
		tfCep.setLayoutX(180);
		tfCep.setLayoutY(320);
		
		lbBairro.setLayoutX(360);
		lbBairro.setLayoutY(325);
		
		tfBairro.setLayoutX(420);
		tfBairro.setLayoutY(320);
		
		lbRua.setLayoutX(630);
		lbRua.setLayoutY(325);
		
		tfRua.setLayoutX(680);
		tfRua.setLayoutY(320);
		
		lbNumero.setLayoutX(105);
		lbNumero.setLayoutY(370);
		
		tfNumero.setLayoutX(180);
		tfNumero.setLayoutY(365);
		
		lbComplemento.setLayoutX(315);
		lbComplemento.setLayoutY(370);
		
		tfComplemento.setLayoutX(420);
		tfComplemento.setLayoutY(365);
		
		lbUser.setLayoutX(110);
		lbUser.setLayoutY(415);
		
		tfUser.setLayoutX(180);
		tfUser.setLayoutY(410);
		
		lbSenha.setLayoutX(360);
		lbSenha.setLayoutY(415);
		
		pfSenha.setLayoutX(420);
		pfSenha.setLayoutY(410);
		
		btCadastrar.setLayoutX(400);
		btCadastrar.setLayoutY(560);
		
		btCancelar.setLayoutX(600);
		btCancelar.setLayoutY(560);
	}
}
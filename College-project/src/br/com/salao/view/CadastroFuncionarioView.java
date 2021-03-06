package br.com.salao.view;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import br.com.salao.controller.FuncionarioController;
import br.com.salao.factory.FactoryEntity;
import br.com.salao.resource.ConfDatePicker;
import br.com.salao.resource.MontaCombo;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
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
	lbBairro, lbRua, lbNumero, lbComplemento, lbUser, lbSenha, lbPis;

	public TextField tfNome, tfCTPS, tfRG, tfCPF, tfSalario, tfTelOne,
	tfTelTwo, tfEmail, tfCep, tfBairro, tfRua, tfNumero, tfComplemento, tfUser, tfPis;

	public Button btCadastrar, btCancelar;

	public ComboBox cbPais, cbEstado, cbCidade, cbCargo;

	public DatePicker dpDataNascimento;

	public PasswordField pfSenha;

	private FuncionarioController control;
	
	private ObservableList<String> pais;
	private ObservableList<String> estado;
	private ObservableList<String> cidade;
	private ObservableList<String> cargo;

	public CadastroFuncionarioView() {
		
		control = new FuncionarioController();
		pais = FXCollections.observableArrayList();
		estado = FXCollections.observableArrayList();
		cidade = FXCollections.observableArrayList();
		cargo = FXCollections.observableArrayList();
		new MontaCombo().getPais(pais);
		new MontaCombo().getCargo(cargo);
		iniComponents();
		iniLayout();
		iniListeners();
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
		lbPis = new Label("Pis: ");

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
		
		tfPis = new TextField();
		tfPis.setPrefWidth(120);
		
		tfUser = new TextField();
		pfSenha = new PasswordField();

		dpDataNascimento = new DatePicker();
		ConfDatePicker.setConfDatePicker(dpDataNascimento);

		cbPais = new ComboBox<>(pais);
		cbPais.setValue(pais.get(0));
		cbPais.setPrefWidth(150);
		cbEstado = new ComboBox<>(estado);
		cbEstado.setPrefWidth(150);
		cbCidade = new ComboBox<>(cidade);
		cbCidade.setPrefWidth(150);
		cbCargo = new ComboBox<>(cargo);
		cbCargo.setValue(cargo.get(0));
		cbCargo.setPrefWidth(180);

		btCadastrar = new Button("Cadastrar");
		btCadastrar.setPrefSize(100, 30);

		btCancelar = new Button("Cancelar");
		btCancelar.setPrefSize(100, 30);

		getChildren().addAll(lbNome, lbCTPS, lbRG, lbCPF, lbCargo, lbSalario,
				lbDataNasc, lbTelOne, lbTelTwo, lbEmail, lbPais, lbEstado,
				lbCep, lbCidade, lbBairro, lbRua, lbNumero, lbComplemento, lbSenha,  lbUser, lbPis);
		getChildren().addAll(tfNome, tfCTPS, tfRG, tfCPF, tfSalario, tfTelOne,
				tfTelTwo, tfEmail, tfCep, tfBairro, tfRua, tfNumero,
				tfComplemento, pfSenha, tfUser, tfPis);

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
		
		lbPis.setLayoutX(790);
		lbPis.setLayoutY(235);
		
		tfPis.setLayoutX(820);
		tfPis.setLayoutY(230);

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

	public boolean cadastrarFuncionario(){
		
		String[] dtNascimento = this.dpDataNascimento.getValue().toString().split("-");
		return control.Inserir(FactoryEntity.getInstance()
				.funcionarioEntity(
						this.tfNome.getText(),
						this.tfCTPS.getText(),
						this.tfCPF.getText(),
						this.tfRG.getText(),
						this.cbCargo.getSelectionModel()
						.getSelectedIndex() + 1,
						FactoryEntity.getInstance().contato(
								this.tfEmail.getText(),
								this.tfTelOne.getText(),
								this.tfTelTwo.getText()),
								FactoryEntity.getInstance().enderecoEntity(
										this.cbPais.getSelectionModel()
										.getSelectedIndex() + 1,
										this.cbEstado.getSelectionModel()
										.getSelectedIndex() + 1,
										this.tfCep.getText(),
										this.cbCidade.getSelectionModel()
										.getSelectedIndex() + 1,
										this.tfBairro.getText(),
										this.tfRua.getText(),
										this.tfNumero.getText(),
										this.tfComplemento.getText()),
										dtNascimento[0]+dtNascimento[1]+dtNascimento[2],
										new SimpleDateFormat("yyyyMMdd").format(Calendar
												.getInstance().getTime()),
												true,
												true,
												FactoryEntity.getInstance().usuarioEntity(
														this.tfUser.getText(),
														this.pfSenha.getText(), true), this.tfPis.getText()));
		
	}
	
	public void limpar(){
		
		for(int i = 0; i < getChildren().size(); i++ ){
			if(getChildren().get(i) instanceof TextField) {
				TextField x = (TextField)getChildren().get(i);
				x.clear();
			}
			
			if(getChildren().get(i) instanceof ComboBox) {
				ComboBox x = (ComboBox)getChildren().get(i);
				x.setValue("");
			}
		}
		this.dpDataNascimento.getEditor().clear();
	}
	
	private void iniListeners() {

		cbPais.focusedProperty().addListener(new ChangeListener<Boolean>() {
			public void changed(ObservableValue<? extends Boolean> arg0,
					Boolean oldPropertyValue, Boolean newPropertyValue) {
				estado.clear();
				if (!newPropertyValue)
					new MontaCombo().getEstado(estado, cbPais
							.getSelectionModel().getSelectedIndex() + 1);
			}
		});

		cbEstado.focusedProperty().addListener(
				new ChangeListener<Boolean>() {
					public void changed(
							ObservableValue<? extends Boolean> arg0,
							Boolean oldPropertyValue, Boolean newPropertyValue) {
						cidade.clear();
						if (!newPropertyValue)
							new MontaCombo()
						.getCidade(cidade, cbEstado
								.getSelectionModel()
								.getSelectedIndex() + 1);
					}
				});
	}
}

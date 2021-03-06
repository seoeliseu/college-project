/**
 * {
 * @author Eliseu Mendes de Morais
 * @version 1.0
 * 
 * Email: seoeliseu@gmail.com
 * https://github.com/seoeliseu
 * 
 * Classe respons�vel pela view de implanta��o do sistema.
 * }
 * **/

package br.com.salao.view;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.Separator;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import br.com.salao.controller.EmpresaController;
import br.com.salao.controller.FuncionarioController;
import br.com.salao.factory.FactoryEntity;
import br.com.salao.resource.ConfDatePicker;
import br.com.salao.resource.MontaCombo;

public class CadastroEmpresaView extends AnchorPane {

	private EmpresaController controlEmpresa;
	private FuncionarioController controlFuncionario;
	private ObservableList<String> pais;
	private ObservableList<String> estado;
	private ObservableList<String> cidade;
	private ObservableList<String> cargo;
	private final String restictToNumber = "[0-9:\\s]*";

	// Declara��o dos labels da empresa.
	private Label lbEmpresa, lbNomeFantasia, lbRazaoSocial, lbCNPJ,
	lbTelOneEmp, lbTelTwoEmp, lbEmailEmp, lbPaisEmp, lbEstadoEmp,
	lbCepEmp, lbCidadeEmp, lbBairroEmp, lbRuaEmp, lbNumeroEmp,
	lbComplementoEmp, lbCredNiver, lbCredFidel, lbFinalExpediente;

	// Declara��o dos labels do admin
	private Label lbAdmin, lbNome, lbCTPS, lbRG, lbCPF, lbCargo, lbSalario,
	lbDataNasc, lbTelOneAd, lbTelTwoAd, lbEmailAd, lbPaisAd,
	lbEstadoAd, lbCepAd, lbCidadeAd, lbBairroAd, lbRuaAd, lbNumeroAd,
	lbComplementoAd, lbUsuario, lbSenha, lbPis;

	public Button btCadastrar, btCancelar;

	public DatePicker dpDataNascimento;
	public ComboBox cbPaisEmp, cbEstadoEmp, cbCidadeEmp, cbPaisAd, cbEstadoAd,
	cbCidadeAd, cbCargoAd;

	public TextField tfNomeFantasia, tfRazaoSocial, tfCNPJ, tfTelOneEmp,
	tfTelTwoEmp, tfEmailEmp, tfCepEmp, tfBairroEmp, tfRuaEmp,
	tfNumeroEmp, tfComplementoEmp, tfCredNiver, tfCredFidel,
	tfFinalExpediente;

	public TextField tfNome, tfCTPS, tfRG, tfCPF, tfSalario, tfTelOneAd,
	tfTelTwoAd, tfEmailAd, tfCepAd, tfBairroAd, tfRuaAd, tfNumeroAd,
	tfComplementoAd, tfUsuario, tfPis;

	public PasswordField pfSenha;

	private Separator spEmpresa, spAdmin;

	public CadastroEmpresaView() {
		pais = FXCollections.observableArrayList();
		estado = FXCollections.observableArrayList();
		cidade = FXCollections.observableArrayList();
		cargo = FXCollections.observableArrayList();
		new MontaCombo().getPais(pais);
		new MontaCombo().getCargo(cargo);

		iniComponents();
		iniLayout();
		iniListeners();
		controlEmpresa = new EmpresaController();
		controlFuncionario = new FuncionarioController();
	}

	private void iniComponents() {

		lbEmpresa = new Label("Empresa");
		lbNomeFantasia = new Label("Nome Fantasia:* ");
		lbRazaoSocial = new Label("Raz�o social:* ");
		lbCNPJ = new Label("C.N.P.J:* ");
		lbTelOneEmp = new Label("Telefone: ");
		lbTelTwoEmp = new Label("Celular: ");
		lbEmailEmp = new Label("Email:");
		lbPaisEmp = new Label("Pa�s:* ");
		lbEstadoEmp = new Label("Estado:* ");
		lbCepEmp = new Label("CEP:* ");
		lbCidadeEmp = new Label("Cidade:* ");
		lbBairroEmp = new Label("Bairro:* ");
		lbRuaEmp = new Label("Rua:* ");
		lbNumeroEmp = new Label("N�mero:* ");
		lbComplementoEmp = new Label("Complemento: ");
		lbCredNiver = new Label("Cr�dito Anivers�rio: ");
		lbCredFidel = new Label("Cr�dito fidelidade: ");
		lbFinalExpediente = new Label("Hor�rio final de expediente:* ");

		lbAdmin = new Label("Administrador");
		lbNome = new Label("Nome:* ");
		lbCTPS = new Label("CTPS:* ");
		lbRG = new Label("RG:* ");
		lbCPF = new Label("CPF:* ");
		lbCargo = new Label("Cargo:* ");
		lbSalario = new Label("Sal�rio: ");
		lbDataNasc = new Label("Data de nascimento:* ");
		lbTelOneAd = new Label("Telefone: ");
		lbTelTwoAd = new Label("Celular: ");
		lbEmailAd = new Label("Email: ");
		lbPaisAd = new Label("Pa�s:* ");
		lbEstadoAd = new Label("Estado:* ");
		lbCepAd = new Label("CEP:* ");
		lbCidadeAd = new Label("Cidade:* ");
		lbBairroAd = new Label("Bairro:* ");
		lbRuaAd = new Label("Rua:* ");
		lbNumeroAd = new Label("N�mero:* ");
		lbComplementoAd = new Label("Complemento: ");
		lbPis = new Label("PIS: ");

		lbUsuario = new Label("Usu�rio: ");
		lbSenha = new Label("Senha: ");

		tfNomeFantasia = new TextField();
		tfNomeFantasia.setPrefWidth(500);

		tfRazaoSocial = new TextField();
		tfRazaoSocial.setPrefWidth(355);
		tfCNPJ = new TextField();
		tfTelOneEmp = new TextField();
		tfTelTwoEmp = new TextField();
		tfEmailEmp = new TextField();
		tfEmailEmp.setPrefWidth(325);

		tfCepEmp = new TextField();
		tfCepEmp.setPrefWidth(265);

		tfBairroEmp = new TextField();
		tfBairroEmp.setPrefWidth(220);

		tfRuaEmp = new TextField();
		tfRuaEmp.setPrefWidth(430);

		tfNumeroEmp = new TextField();
		tfNumeroEmp.setPrefWidth(185);

		tfComplementoEmp = new TextField();
		tfComplementoEmp.setPrefWidth(970);

		tfCredNiver = new TextField() {
			@Override
			public void replaceText(int start, int end, String text) {
				// If the replaced text would end up being invalid, then simply
				// ignore this call!
				if (text.matches(restictToNumber)) {
					super.replaceText(start, end, text);
				}

				verify();
			}

			@Override
			public void replaceSelection(String text) {
				if (text.matches(restictToNumber)) {
					super.replaceSelection(text);
					verify();
				}
			}

			private void verify() {
				if (getText().length() > 2) {
					setText(getText().substring(0, 2));
				}
			}
		};
		tfCredFidel = new TextField() {
			@Override
			public void replaceText(int start, int end, String text) {
				// If the replaced text would end up being invalid, then simply
				// ignore this call!
				if (text.matches(restictToNumber)) {
					super.replaceText(start, end, text);
				}

				verify();
			}

			@Override
			public void replaceSelection(String text) {
				if (text.matches(restictToNumber)) {
					super.replaceSelection(text);
					verify();
				}
			}

			private void verify() {
				if (getText().length() > 2) {
					setText(getText().substring(0, 2));
				}
			}
		};

		tfFinalExpediente = new TextField() {
			@Override
			public void replaceText(int start, int end, String text) {
				// If the replaced text would end up being invalid, then simply
				// ignore this call!
				if (text.matches(restictToNumber)) {
					super.replaceText(start, end, text);
				}
			}

			@Override
			public void replaceSelection(String text) {
				if (text.matches(restictToNumber)) {
					super.replaceSelection(text);

				}
			}

		};
		tfFinalExpediente.textProperty().addListener(
				new ChangeListener<String>() {
					@Override
					public void changed(
							final ObservableValue<? extends String> ov,
							final String oldValue, final String newValue) {
						if (tfFinalExpediente.getText().length() > 5) {
							String s = tfFinalExpediente.getText().substring(0,
									5);
							tfFinalExpediente.setText(s);
						}
					}
				});

		tfNome = new TextField();
		tfNome.setPrefWidth(290);

		tfCTPS = new TextField();
		tfCTPS.setPrefWidth(180);

		tfRG = new TextField();
		tfCPF = new TextField();
		tfSalario = new TextField();
		tfSalario.setPrefWidth(80);

		tfTelOneAd = new TextField();
		tfTelTwoAd = new TextField();
		tfEmailAd = new TextField();
		tfEmailAd.setPrefWidth(315);

		tfCepAd = new TextField();
		tfCepAd.setPrefWidth(265);

		tfBairroAd = new TextField();
		tfBairroAd.setPrefWidth(220);

		tfRuaAd = new TextField();
		tfRuaAd.setPrefWidth(420);

		tfNumeroAd = new TextField();
		tfNumeroAd.setPrefWidth(185);

		tfComplementoAd = new TextField();
		tfComplementoAd.setPrefWidth(970);

		tfUsuario = new TextField();
		pfSenha = new PasswordField();

		dpDataNascimento = new DatePicker();
		ConfDatePicker.setConfDatePicker(dpDataNascimento);

		tfPis = new TextField();
		tfPis.setPrefWidth(220);
		btCadastrar = new Button("Cadastrar");
		btCadastrar.setPrefSize(100, 30);

		btCancelar = new Button("Cancelar");
		btCancelar.setPrefSize(100, 30);

		spEmpresa = new Separator();
		spEmpresa.setPrefSize(1080, 25);
		spAdmin = new Separator();
		spAdmin.setPrefSize(1080, 25);

		cbPaisEmp = new ComboBox<>(pais);
		cbPaisEmp.setValue(pais.get(0));
		cbPaisEmp.setPrefWidth(150);

		cbEstadoEmp = new ComboBox<>(estado);
		cbEstadoEmp.setPrefWidth(150);

		cbCidadeEmp = new ComboBox<>(cidade);
		cbCidadeEmp.setPrefWidth(200);

		cbCargoAd = new ComboBox<>(cargo);
		cbCargoAd.setValue(cargo.get(0));
		cbCargoAd.setPrefWidth(200);

		cbPaisAd = new ComboBox<>(pais);
		cbPaisAd.setPrefWidth(150);

		cbEstadoAd = new ComboBox<>(estado);
		cbEstadoAd.setPrefWidth(150);

		cbCidadeAd = new ComboBox<>(cidade);
		cbCidadeAd.setPrefWidth(200);

		getChildren().addAll(lbEmpresa, lbNomeFantasia, lbRazaoSocial, lbCNPJ,
				lbTelOneEmp, lbTelTwoEmp, lbEmailEmp, lbPaisEmp, lbEstadoEmp,
				lbCepEmp, lbCidadeEmp, lbBairroEmp, lbRuaEmp, lbNumeroEmp,
				lbComplementoEmp, lbCredNiver, lbCredFidel, lbFinalExpediente);

		getChildren().addAll(lbAdmin, lbNome, lbCTPS, lbRG, lbCPF, lbCargo,
				lbSalario, lbDataNasc, lbTelOneAd, lbTelTwoAd, lbEmailAd,
				lbPaisAd, lbEstadoAd, lbCepAd, lbCidadeAd, lbBairroAd, lbRuaAd,
				lbNumeroAd, lbComplementoAd, lbUsuario, lbSenha,lbPis);

		getChildren().addAll(btCadastrar, btCancelar, cbPaisEmp, cbEstadoEmp,
				cbCidadeEmp, cbPaisAd, cbEstadoAd, cbCidadeAd, cbCargoAd,
				dpDataNascimento);

		getChildren().addAll(tfNomeFantasia, tfRazaoSocial, tfCNPJ,
				tfTelOneEmp, tfTelTwoEmp, tfEmailEmp, tfCepEmp, tfBairroEmp,
				tfRuaEmp, tfNumeroEmp, tfComplementoEmp, tfCredNiver,
				tfCredFidel, tfFinalExpediente);

		getChildren().addAll(tfNome, tfCTPS, tfRG, tfCPF, tfSalario,
				tfTelOneAd, tfTelTwoAd, tfEmailAd, tfCepAd, tfBairroAd,
				tfRuaAd, tfNumeroAd, tfComplementoAd, tfUsuario, pfSenha,tfPis);

		getChildren().addAll(spEmpresa, spAdmin);

		setPrefSize(1100, 650);

	}

	private void iniLayout() {

		lbEmpresa.setLayoutX(25);
		lbEmpresa.setLayoutY(30);

		spEmpresa.setLayoutX(10);
		spEmpresa.setLayoutY(40);

		lbNomeFantasia.setLayoutX(20);
		lbNomeFantasia.setLayoutY(75);

		tfNomeFantasia.setLayoutX(120);
		tfNomeFantasia.setLayoutY(70);

		lbRazaoSocial.setLayoutX(650);
		lbRazaoSocial.setLayoutY(75);

		tfRazaoSocial.setLayoutX(735);
		tfRazaoSocial.setLayoutY(70);

		lbCNPJ.setLayoutX(65);
		lbCNPJ.setLayoutY(110);

		tfCNPJ.setLayoutX(120);
		tfCNPJ.setLayoutY(105);

		lbTelOneEmp.setLayoutX(280);
		lbTelOneEmp.setLayoutY(110);

		tfTelOneEmp.setLayoutX(340);
		tfTelOneEmp.setLayoutY(105);

		lbTelTwoEmp.setLayoutX(505);
		lbTelTwoEmp.setLayoutY(110);

		tfTelTwoEmp.setLayoutX(555);
		tfTelTwoEmp.setLayoutY(105);

		lbEmailEmp.setLayoutX(720);
		lbEmailEmp.setLayoutY(110);

		tfEmailEmp.setLayoutX(765);
		tfEmailEmp.setLayoutY(105);

		lbPaisEmp.setLayoutX(80);
		lbPaisEmp.setLayoutY(145);

		cbPaisEmp.setLayoutX(120);
		cbPaisEmp.setLayoutY(140);

		lbEstadoEmp.setLayoutX(285);
		lbEstadoEmp.setLayoutY(145);

		cbEstadoEmp.setLayoutX(340);
		cbEstadoEmp.setLayoutY(140);

		lbCidadeEmp.setLayoutX(510);
		lbCidadeEmp.setLayoutY(145);

		cbCidadeEmp.setLayoutX(565);
		cbCidadeEmp.setLayoutY(140);

		lbCepEmp.setLayoutX(785);
		lbCepEmp.setLayoutY(145);

		tfCepEmp.setLayoutX(825);
		tfCepEmp.setLayoutY(140);

		lbBairroEmp.setLayoutX(70);
		lbBairroEmp.setLayoutY(180);

		tfBairroEmp.setLayoutX(120);
		tfBairroEmp.setLayoutY(175);

		lbRuaEmp.setLayoutX(355);
		lbRuaEmp.setLayoutY(180);

		tfRuaEmp.setLayoutX(395);
		tfRuaEmp.setLayoutY(175);

		lbNumeroEmp.setLayoutX(840);
		lbNumeroEmp.setLayoutY(180);

		tfNumeroEmp.setLayoutX(905);
		tfNumeroEmp.setLayoutY(175);

		lbComplementoEmp.setLayoutX(25);
		lbComplementoEmp.setLayoutY(215);

		tfComplementoEmp.setLayoutX(120);
		tfComplementoEmp.setLayoutY(210);

		lbCredNiver.setLayoutX(60);
		lbCredNiver.setLayoutY(250);

		tfCredNiver.setLayoutX(190);
		tfCredNiver.setLayoutY(245);

		lbCredFidel.setLayoutX(410);
		lbCredFidel.setLayoutY(250);

		tfCredFidel.setLayoutX(540);
		tfCredFidel.setLayoutY(245);

		lbFinalExpediente.setLayoutX(760);
		lbFinalExpediente.setLayoutY(250);

		tfFinalExpediente.setLayoutX(940);
		tfFinalExpediente.setLayoutY(245);

		lbAdmin.setLayoutX(25);
		lbAdmin.setLayoutY(295);

		spAdmin.setLayoutX(10);
		spAdmin.setLayoutY(305);

		lbNome.setLayoutX(70);
		lbNome.setLayoutY(330);

		tfNome.setLayoutX(120);
		tfNome.setLayoutY(325);

		lbCTPS.setLayoutX(430);
		lbCTPS.setLayoutY(330);

		tfCTPS.setLayoutX(480);
		tfCTPS.setLayoutY(325);

		lbRG.setLayoutX(695);
		lbRG.setLayoutY(330);

		tfRG.setLayoutX(730);
		tfRG.setLayoutY(325);

		lbCPF.setLayoutX(900);
		lbCPF.setLayoutY(330);

		tfCPF.setLayoutX(940);
		tfCPF.setLayoutY(325);

		lbCargo.setLayoutX(70);
		lbCargo.setLayoutY(365);

		cbCargoAd.setLayoutX(120);
		cbCargoAd.setLayoutY(360);

		lbSalario.setLayoutX(350);
		lbSalario.setLayoutY(365);

		tfSalario.setLayoutX(405);
		tfSalario.setLayoutY(360);

		lbDataNasc.setLayoutX(510);
		lbDataNasc.setLayoutY(365);

		dpDataNascimento.setLayoutX(635);
		dpDataNascimento.setLayoutY(360);

		lbPis.setLayoutX(840);
		lbPis.setLayoutY(365);

		tfPis.setLayoutX(870);
		tfPis.setLayoutY(360);

		lbTelOneAd.setLayoutX(55);
		lbTelOneAd.setLayoutY(400);

		tfTelOneAd.setLayoutX(120);
		tfTelOneAd.setLayoutY(395);

		lbTelTwoAd.setLayoutX(290);
		lbTelTwoAd.setLayoutY(400);

		tfTelTwoAd.setLayoutX(340);
		tfTelTwoAd.setLayoutY(395);

		lbEmailAd.setLayoutX(520);
		lbEmailAd.setLayoutY(400);

		tfEmailAd.setLayoutX(565);
		tfEmailAd.setLayoutY(395);

		lbPaisAd.setLayoutX(80);
		lbPaisAd.setLayoutY(435);

		cbPaisAd.setLayoutX(120);
		cbPaisAd.setLayoutY(430);

		lbEstadoAd.setLayoutX(285);
		lbEstadoAd.setLayoutY(435);

		cbEstadoAd.setLayoutX(340);
		cbEstadoAd.setLayoutY(430);

		lbCidadeAd.setLayoutX(510);
		lbCidadeAd.setLayoutY(435);

		cbCidadeAd.setLayoutX(565);
		cbCidadeAd.setLayoutY(430);

		lbCepAd.setLayoutX(785);
		lbCepAd.setLayoutY(435);

		tfCepAd.setLayoutX(825);
		tfCepAd.setLayoutY(430);

		lbBairroAd.setLayoutX(70);
		lbBairroAd.setLayoutY(470);

		tfBairroAd.setLayoutX(120);
		tfBairroAd.setLayoutY(465);

		lbRuaAd.setLayoutX(355);
		lbRuaAd.setLayoutY(470);

		tfRuaAd.setLayoutX(395);
		tfRuaAd.setLayoutY(465);

		lbNumeroAd.setLayoutX(840);
		lbNumeroAd.setLayoutY(470);

		tfNumeroAd.setLayoutX(905);
		tfNumeroAd.setLayoutY(465);

		lbComplementoAd.setLayoutX(25);
		lbComplementoAd.setLayoutY(505);

		tfComplementoAd.setLayoutX(120);
		tfComplementoAd.setLayoutY(500);

		lbUsuario.setLayoutX(60);
		lbUsuario.setLayoutY(545);

		lbSenha.setLayoutX(300);
		lbSenha.setLayoutY(545);

		tfUsuario.setLayoutX(120);
		tfUsuario.setLayoutY(540);

		pfSenha.setLayoutX(350);
		pfSenha.setLayoutY(540);

		btCadastrar.setLayoutX(400);
		btCadastrar.setLayoutY(590);

		btCancelar.setLayoutX(600);
		btCancelar.setLayoutY(590);

	}

	public boolean cadastrarEmpresa() {

		String[] hora = this.tfFinalExpediente.getText().split(":");
		String[] dtNascimento = this.dpDataNascimento.getValue().toString().split("-");
		if (controlEmpresa.Inserir(FactoryEntity.getInstance()
				.empresaEntity(
						this.tfRazaoSocial.getText(),
						this.tfNomeFantasia.getText(),
						this.tfCNPJ.getText(),
						FactoryEntity.getInstance().contato(
								this.tfEmailEmp.getText(),
								this.tfTelOneEmp.getText(),
								this.tfTelTwoEmp.getText()),
								FactoryEntity.getInstance().enderecoEntity(
										this.cbPaisEmp.getSelectionModel()
										.getSelectedIndex() + 1,
										this.cbEstadoEmp.getSelectionModel()
										.getSelectedIndex() + 1,
										this.tfCepEmp.getText(),
										this.cbCidadeEmp.getSelectionModel()
										.getSelectedIndex() + 1,
										this.tfBairroEmp.getText(),
										this.tfRuaEmp.getText(),
										this.tfNumeroEmp.getText(),
										this.tfComplementoEmp.getText()),
										FactoryEntity.getInstance().configuracaoEntity(Long.parseLong(
												hora[0]+hora[1]),
												Float.parseFloat(this.tfCredNiver.getText()),
												Float.parseFloat(this.tfCredFidel.getText())))))

			return controlFuncionario.Inserir(FactoryEntity.getInstance()
					.funcionarioEntity(
							this.tfNome.getText(),
							this.tfCTPS.getText(),
							this.tfCPF.getText(),
							this.tfRG.getText(),
							this.cbCargoAd.getSelectionModel()
							.getSelectedIndex() + 1,
							FactoryEntity.getInstance().contato(
									this.tfEmailAd.getText(),
									this.tfTelOneAd.getText(),
									this.tfTelTwoAd.getText()),
									FactoryEntity.getInstance().enderecoEntity(
											this.cbPaisAd.getSelectionModel()
											.getSelectedIndex() + 1,
											this.cbEstadoAd.getSelectionModel()
											.getSelectedIndex() + 1,
											this.tfCepAd.getText(),
											this.cbCidadeAd.getSelectionModel()
											.getSelectedIndex() + 1,
											this.tfBairroAd.getText(),
											this.tfRuaAd.getText(),
											this.tfNumeroAd.getText(),
											this.tfComplementoAd.getText()),
											dtNascimento[0]+dtNascimento[1]+dtNascimento[2],
											new SimpleDateFormat("yyyyMMdd").format(Calendar
													.getInstance().getTime()),
													true,
													true,
													FactoryEntity.getInstance().usuarioEntity(
															this.tfUsuario.getText(),
															this.pfSenha.getText(), true), this.tfPis.getText()));
		;
		return false;
	}

	private void iniListeners() {

		cbPaisEmp.focusedProperty().addListener(new ChangeListener<Boolean>() {
			public void changed(ObservableValue<? extends Boolean> arg0,
					Boolean oldPropertyValue, Boolean newPropertyValue) {
				estado.clear();
				if (!newPropertyValue)
					new MontaCombo().getEstado(estado, cbPaisEmp
							.getSelectionModel().getSelectedIndex() + 1);
			}
		});

		cbEstadoEmp.focusedProperty().addListener(
				new ChangeListener<Boolean>() {
					public void changed(
							ObservableValue<? extends Boolean> arg0,
							Boolean oldPropertyValue, Boolean newPropertyValue) {
						cidade.clear();
						if (!newPropertyValue)
							new MontaCombo()
						.getCidade(cidade, cbEstadoEmp
								.getSelectionModel()
								.getSelectedIndex() + 1);
					}
				});
	}
}

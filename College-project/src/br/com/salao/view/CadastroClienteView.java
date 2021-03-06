package br.com.salao.view;

import br.com.salao.controller.ClienteController;
import br.com.salao.factory.FactoryEntity;
import br.com.salao.resource.ConfDatePicker;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class CadastroClienteView extends AnchorPane {

	private Label lbNome, lbDataNascimento, lbRg, lbTelOne, lbTelTwo, lbEmail;
	public TextField tfNome, tfRg, tfTelOne, tfTelTwo, tfEmail;
	public DatePicker dpDataNascimento;
	public Button btCadastrar, btCancelar, btAtualizar;
	private ClienteController control;

	public CadastroClienteView() {
		iniComponents();
		iniLayout();
		control = new ClienteController();
	}

	private void iniComponents() {
		lbNome = new Label("Nome:*");
		lbDataNascimento = new Label("Data de nascimento:*");
		lbRg = new Label("RG: ");
		lbTelOne = new Label("Telefone: ");
		lbTelTwo = new Label("Telefone: ");
		lbEmail = new Label("Email: ");

		btCadastrar = new Button("Cadastrar");
		btCadastrar.setPrefSize(100, 30);
		btCancelar = new Button("Cancelar");
		btCancelar.setPrefSize(100, 30);
		btAtualizar = new Button("Atualizar");
		btAtualizar.setVisible(false);
		dpDataNascimento = new DatePicker();
		ConfDatePicker.setConfDatePicker(dpDataNascimento);

		tfNome = new TextField();
		tfNome.setPrefWidth(450);
		tfRg = new TextField();
		tfRg.setPrefWidth(200);
		tfTelOne = new TextField();
		tfTelOne.setPrefWidth(175);
		tfTelTwo = new TextField();
		tfTelTwo.setPrefWidth(200);
		tfEmail = new TextField();
		tfEmail.setPrefWidth(450);

		setPrefSize(1100, 660);

		getChildren().addAll(lbNome, lbDataNascimento, lbRg, lbTelOne,
				lbTelTwo, lbEmail, tfNome, dpDataNascimento, tfRg, tfTelOne,
				tfTelTwo, tfEmail, btCadastrar, btAtualizar, btCancelar);
	}

	private void iniLayout() {
		lbNome.setLayoutX(150);
		lbNome.setLayoutY(55);
		tfNome.setLayoutX(200);
		tfNome.setLayoutY(50);

		lbDataNascimento.setLayoutX(76);
		lbDataNascimento.setLayoutY(105);
		dpDataNascimento.setLayoutX(200);
		dpDataNascimento.setLayoutY(100);

		lbRg.setLayoutX(420);
		lbRg.setLayoutY(105);
		tfRg.setLayoutX(450);
		tfRg.setLayoutY(100);

		lbTelOne.setLayoutX(135);
		lbTelOne.setLayoutY(155);
		tfTelOne.setLayoutX(200);
		tfTelOne.setLayoutY(150);

		lbTelTwo.setLayoutX(392);
		lbTelTwo.setLayoutY(155);
		tfTelTwo.setLayoutX(450);
		tfTelTwo.setLayoutY(150);

		lbEmail.setLayoutX(152);
		lbEmail.setLayoutY(205);
		tfEmail.setLayoutX(200);
		tfEmail.setLayoutY(200);

		btCadastrar.setLayoutX(250);
		btCadastrar.setLayoutY(300);

		btCancelar.setLayoutX(400);
		btCancelar.setLayoutY(300);

		btAtualizar.setLayoutX(275);
		btAtualizar.setLayoutY(300);
	}

	public boolean cadastrarCliente() {
		String[] dtNascimento = this.dpDataNascimento.getValue().toString()
				.split("-");
		if(control.Inserir(FactoryEntity.getInstance().clienteEntity(this.tfNome.getText(), FactoryEntity.getInstance().contato(this.tfEmail.getText(),
				this.tfTelOne.getText(), this.tfTelTwo.getText()),
				this.tfRg.getText(), Integer.parseInt(dtNascimento[0] + dtNascimento[1] + dtNascimento[2])))) return true;;
						return false;
	}
	
	public void limpa(){
		this.tfEmail.clear();
		this.tfNome.clear();
		this.tfRg.clear();
		this.tfTelOne.clear();
		this.tfTelTwo.clear();
		this.dpDataNascimento.getEditor().clear();
	}
}

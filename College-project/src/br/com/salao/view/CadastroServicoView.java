package br.com.salao.view;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import br.com.salao.controller.ServicoController;
import br.com.salao.factory.FactoryEntity;

public class CadastroServicoView extends AnchorPane{

	public Button btConfirmar, btCancelar;
	private Label lbServico, lbValor, lbTime;
	private TextField tfServico, tfValor, tfTime;
	private ServicoController control;
	private final String restictToNumber = "[0-9\\s]*";

	public CadastroServicoView() {
		iniComponets();
		iniLayout();
		control = new ServicoController();
	}

	private void iniComponets(){
		lbServico = new Label("Serviço: ");
		lbValor = new Label("Valor: ");
		lbTime = new Label("Tempo(min): ");

		tfServico = new TextField();
		tfTime = new TextField() {
			@Override
			public void replaceText(int start, int end, String text) {
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
		
		tfTime.textProperty().addListener(
				new ChangeListener<String>() {
					@Override
					public void changed(
							final ObservableValue<? extends String> ov,
							final String oldValue, final String newValue) {
						if (tfTime.getText().length() > 3) {
							String s = tfTime.getText().substring(0,
									3);
							tfTime.setText(s);
						}
					}
				});
		
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

	public boolean cadastrarServico(){
		
		return control.Inserir(FactoryEntity.getInstance().servicoEntity(this.tfServico.getText(),
				Double.parseDouble(this.tfValor.getText()),
				Integer.parseInt(this.tfTime.getText())));
	}
	
public void limpar(){
		
		for(int i = 0; i < getChildren().size(); i++ ){
			if(getChildren().get(i) instanceof TextField) {
				TextField x = (TextField)getChildren().get(i);
				x.clear();
			}
		}
	}

}

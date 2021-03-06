/**
 * {
 * @author Eliseu Mendes de Morais
 * @version 1.0
 * 
 * Email: seoeliseu@gmail.com
 * https://github.com/seoeliseu
 * 
 * 
 * Classe view da autentica��o no sistema.
 * 
 * 
 * 
 * }**/

package br.com.salao.view;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import br.com.salao.controller.AutenticaController;
import br.com.salao.entity.UsuarioEntity;
import br.com.salao.interfaces.IAutentica;

public class LoginView extends AnchorPane{
	public Scene scene;
	private Label lbuser, lbpassword;
	public TextField tfuser;
	public PasswordField pfpassword;
	public Button btLogin, btQuit;
	public Hyperlink hlRecuperarSenha;
	
	public LoginView() {
		iniComponents();
		iniLayout();
	}
	
	private void iniComponents(){
		
		lbuser = new Label("Usu�rio:");
		lbpassword = new Label("Senha:");
		tfuser = new TextField();
		pfpassword = new PasswordField();
		hlRecuperarSenha = new Hyperlink("Esqueceu a senha?");
		btLogin = new Button("Acessar");
		btLogin.setPrefSize(100, 30);
		btQuit = new Button("Sair");
		btQuit.setPrefSize(100, 30);
		
		setStyle("-fx-background-color: linear-gradient( from 0% 0% to 0% 0%, #87CEFB 0%, #DCDCDC 100%);");
		setPrefSize(520, 450);
		getChildren().addAll(lbuser,tfuser,lbpassword,pfpassword,hlRecuperarSenha,btLogin,btQuit);
		
	}
	
	private void iniLayout(){
		lbuser.setLayoutX(80);
		lbuser.setLayoutY(105);
		tfuser.setLayoutX(150);
		tfuser.setLayoutY(100);
		
		lbpassword.setLayoutX(89);
		lbpassword.setLayoutY(155);
		pfpassword.setLayoutX(150);
		pfpassword.setLayoutY(150);
		
		hlRecuperarSenha.setLayoutX(190);
		hlRecuperarSenha.setLayoutY(180);
		
		btLogin.setLayoutX(130);
		btLogin.setLayoutY(280);
		btQuit.setLayoutX(270);
		btQuit.setLayoutY(280);
	}
	
	public Object login(){
		return new AutenticaController().login(tfuser.getText(), pfpassword.getText());
	}
	
	public IAutentica getUser(boolean tipo){
		return new UsuarioEntity(tfuser.getText(), pfpassword.getText(), tipo);
	}
	
}

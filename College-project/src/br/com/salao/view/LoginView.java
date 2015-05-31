/**
 * {
 * @author Eliseu Mendes de Morais
 * @version 1.0
 * 
 * Email: seoeliseu@gmail.com
 * https://github.com/seoeliseu
 * 
 * 
 * Classe view da autenticação no sistema.
 * 
 * 
 * 
 * }**/

package br.com.salao.view;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class LoginView extends AnchorPane{
	public Scene scene;
	private Label lbuser, lbpassword;
	public TextField tfuser;
	public PasswordField pfpassword;
	public Button btLogin, btQuit;
	public Hyperlink hlRecuperarSenha;
	
	public LoginView() {
		// TODO Auto-generated constructor stub
		iniComponents();
		iniLayout();
	}
	
	private void iniComponents(){
		
		lbuser = new Label("Usuário:");
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
	
}

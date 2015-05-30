package br.com.salao.view;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Principal extends Application {
	public final String LOGIN_VIEW = "login_view";

	private VBox panePrincipal;
	private Scene scene;

	private LoginView loginView;
	private TelaUserComumView userComumView;
	private TelaUserAdminView userAdminView;
	private RecuperarSenhaView recuperarSenhaView;
	private ListarServicoView listarServicoView;
	private ConsultaClienteView consultaClienteView;
	private ConsultarFuncionarioView consultarFuncionarioView;
	private CadastroEmpresaView cadastroEmpresaView;
	private CadastroFuncionarioView cadastroFuncionarioView;
	private CadastroClienteView cadastroClienteView;
	private CadastroServicoView cadastroServicoView;
	private AgendarServicoView agendarServicoView;
	private ClienteEntityView clienteEntityView;
	private ConfiguracaoView configuracaoView;

	private Stage stage;

	@Override
	public void start(Stage stage) throws Exception {
		// TODO Auto-generated method stub
		iniComponents();

		iniListenersLoginView();
		iniListenersTelaUserAdmin();
		iniListenersRecuperarSenhaView();
		iniListenersTelaUserComum();
		iniListenersCadastroClienteView();
		iniListenersCadastroFuncionarioView();
		iniListenersCadastroServicoView();
		
		iniListenersConsultaClienteView();
		iniListenersClienteEntityView();
		iniListenersListarServicosView();

		stage = this.stage;
		userComumView.menuBar.prefWidthProperty().bind(stage.widthProperty());
		userAdminView.menuBar.prefWidthProperty().bind(stage.widthProperty());

		stage.show();

	}

	public static void main(String[] args) {
		launch(args);
	}

	private void iniComponents() {
		stage = new Stage();
		stage.setResizable(false);
		prefTelaInicial();
		stage.setTitle("HAIRDITE");

		panePrincipal = new VBox();

		loginView = new LoginView();
		userComumView = new TelaUserComumView();
		userAdminView = new TelaUserAdminView();
		recuperarSenhaView = new RecuperarSenhaView();
		listarServicoView = new ListarServicoView();
		consultaClienteView = new ConsultaClienteView();
		consultarFuncionarioView = new ConsultarFuncionarioView();
		cadastroEmpresaView = new CadastroEmpresaView();
		cadastroFuncionarioView = new CadastroFuncionarioView();
		cadastroClienteView = new CadastroClienteView();
		cadastroServicoView = new CadastroServicoView();
		agendarServicoView = new AgendarServicoView();
		clienteEntityView = new ClienteEntityView();
		configuracaoView = new ConfiguracaoView();
		
//		stage.setX(5);
//		stage.setY(5);

		panePrincipal.getChildren().add(loginView);

		scene = new Scene(panePrincipal);

		stage.setScene(scene);

	}

	// Declara��o dos eventos da classe loginView
	private void iniListenersLoginView() {
		loginView.btLogin.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub
				goToTelaUserAdmin();
			}
		});

		loginView.btQuit.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
		});

		loginView.hlRecuperarSenha.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub
				goToRecuperarSenha();
			}
		});
	}

	// Fim do m�todos iniListenersLoginView
	// ***************************************************

	// Declara��o dos eventos da view do usu�rio administrador
	private void iniListenersTelaUserAdmin() {
		userAdminView.miAddServico.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub
				goToCadastroServico();
			}
		});

		userAdminView.miAddFuncionario
				.setOnAction(new EventHandler<ActionEvent>() {

					@Override
					public void handle(ActionEvent arg0) {
						// TODO Auto-generated method stub
						goToCadastroFuncionario();
					}
				});

		userAdminView.miAddCliente.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub
				goToCadastroCliente();
			}
		});
		
		userAdminView.miFindCliente.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub
				goToConsultarCliente();
			}
		});
	}

	// Eventos da classe cadastroClienteView
	private void iniListenersCadastroClienteView() {

		cadastroClienteView.btCancelar
				.setOnAction(new EventHandler<ActionEvent>() {

					@Override
					public void handle(ActionEvent arg0) {
						// TODO Auto-generated method stub
						goToUsersView();
					}
				});
	}
	
	// Eventos da classe cadastroFuncionarioView
	private void iniListenersCadastroFuncionarioView() {
		cadastroFuncionarioView.btCancelar
				.setOnAction(new EventHandler<ActionEvent>() {

					@Override
					public void handle(ActionEvent arg0) {
						// TODO Auto-generated method stub
						goToUsersView();
					}
				});
	}
	
	// Eventos da classe cadastroServicoView
	private void iniListenersCadastroServicoView() {
		cadastroServicoView.btCancelar
				.setOnAction(new EventHandler<ActionEvent>() {

					@Override
					public void handle(ActionEvent arg0) {
						// TODO Auto-generated method stub
						goToUsersView();
					}
				});
	}

	// Declara��o dos eventos da classe RecuperarSenhaView
	private void iniListenersRecuperarSenhaView() {

		recuperarSenhaView.btCancelar
				.setOnAction(new EventHandler<ActionEvent>() {

					@Override
					public void handle(ActionEvent arg0) {
						// TODO Auto-generated method stub
						goToLogin();
					}
				});
	}

	// Declara��o dos eventos da classe UserComumView
	private void iniListenersTelaUserComum() {

		userComumView.btSair.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub
				goToLogin();
			}
		});

		userComumView.btAddCliente.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub
				goToCadastroCliente();
			}
		});
		
		userComumView.btListarServicos.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub
				goToListarServicoView();
			}
		});
		
		userComumView.btAgendamento.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub
				goToConsultarCliente();
			}
		});

	}
	
	//Eventos classe cadastroEmpresaView
	private void iniListenersCadastroEmpresaView(){
		cadastroEmpresaView.btCancelar.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
		});
	}
	
	//Eventos da classe consultaClienteView
	private void iniListenersConsultaClienteView(){
		consultaClienteView.btSair.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub
				goToUsersView();
			}
		});
		
		consultaClienteView.btAcessarCliente.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub
				goToClienteEntityView();
			}
		});
	}
	
	private void iniListenersClienteEntityView(){
		clienteEntityView.btVoltar.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub
				goToConsultarCliente();
			}
		});
	}
	
	//Eventos da classe listarServicoView
	private void iniListenersListarServicosView(){
		listarServicoView.btSair.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub
				goToUsersView();
			}
		});
	}

	private void goToTelaUserComum() {
		panePrincipal.getChildren().remove(0);
		panePrincipal.getChildren().add(userComumView);
		stage.setWidth(userComumView.getPrefWidth());
		stage.setHeight(userComumView.getPrefHeight());
		stage.setX(5);
		stage.setY(5);
	}

	private void goToTelaUserAdmin() {
		panePrincipal.getChildren().remove(0);
		panePrincipal.getChildren().add(userComumView);
		userComumView.getChildren().remove(0);
		userComumView.getChildren().add(0, userAdminView.paneMenuBar);

		stage.setWidth(userComumView.getPrefWidth());
		stage.setHeight(userComumView.getPrefHeight());

		stage.setX(5);
		stage.setY(5);
	}

	private void goToRecuperarSenha() {
		panePrincipal.getChildren().remove(0);
		panePrincipal.getChildren().add(recuperarSenhaView);
		stage.setWidth(recuperarSenhaView.getPrefWidth());
		stage.setHeight(recuperarSenhaView.getPrefHeight());
	}

	private void goToLogin() {
		panePrincipal.getChildren().remove(0);
		panePrincipal.getChildren().add(loginView);
		stage.setWidth(loginView.getWidth());
		stage.setHeight(loginView.getHeight());
		stage.setX(300);
		stage.setY(100);
	}

	private void goToCadastroServico() {
		userComumView.getChildren().remove(1);
		userComumView.getChildren().add(1, cadastroServicoView);
	}

	private void goToCadastroFuncionario() {
		userComumView.getChildren().remove(1);
		userComumView.getChildren().add(1, cadastroFuncionarioView);
	}

	private void goToCadastroCliente() {
		userComumView.getChildren().remove(1);
		userComumView.getChildren().add(1, cadastroClienteView);
	}
	
	private void goToConsultarCliente(){
		userComumView.getChildren().remove(1);
		userComumView.getChildren().add(1, consultaClienteView);
	}
	private void goToListarServicoView(){
		userComumView.getChildren().remove(1);
		userComumView.getChildren().add(1, listarServicoView);
	}

	private void goToUsersView() {
		userComumView.getChildren().remove(1);
		userComumView.getChildren().add(1, userComumView.paneBody);
	}
	
	private void goToClienteEntityView(){
		userComumView.getChildren().remove(1);
		userComumView.getChildren().add(1,clienteEntityView);
	}

	private void prefTelaInicial() {
		stage.setX(300);
		stage.setY(100);
	}
}

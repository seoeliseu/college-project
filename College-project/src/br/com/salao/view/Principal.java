/**
 * {
 * @author Eliseu Mendes de Morais
 * @version 1.0
 * 
 * Email: seoeliseu@gmail.com
 * https://github.com/seoeliseu
 * 
 * Classe respons�vel pela transi��o e eventos das telas da aplica��o.
 * 
 * As valida��es dos campos � feita diretamente nas classes view.
 * 
 * 
 * }**/

package br.com.salao.view;

import java.sql.Date;

import com.sun.org.apache.bcel.internal.generic.INSTANCEOF;

import br.com.salao.ValidacaoUtil.ValidacaoUtil;
import br.com.salao.controller.*;
import br.com.salao.entity.ClienteEntity;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
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
	private ConsultaAgendamentosView consultaAgendamentosView;
	private int testSenha;

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
		iniListenersCadastroEmpresaView();

		iniListenersConsultaAgendamentosView();
		iniListenersConsultaFuncionarioView();

		iniListenersConsultaClienteView();
		iniListenersClienteEntityView();
		iniListenersAgendarServicoView();
		iniListenersListarServicosView();

		iniListenersConfiguracaoView();

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
		consultaAgendamentosView = new ConsultaAgendamentosView();
		agendarServicoView = new AgendarServicoView();

		if (ValidacaoUtil.existeEmpresa()) {
			stage.setWidth(loginView.getPrefWidth());
			stage.setHeight(loginView.getPrefHeight());
			panePrincipal.getChildren().add(loginView);
		} else {
			stage.setX(10);
			stage.setY(10);
			panePrincipal.getChildren().add(cadastroEmpresaView);
		}

		scene = new Scene(panePrincipal);
		stage.setScene(scene);

	}

	// Declara��o dos eventos da classe loginView
	private void iniListenersLoginView() {
		loginView.btLogin.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {

				Object valor = loginView.login();
				if(valor instanceof Boolean && (Boolean)valor == true){ 
					AutenticaController.usuarioLogado = loginView.getUser(true);
					goToTelaUserAdmin();
				}
				
				if(valor instanceof Boolean && (Boolean)valor == false){ 
					AutenticaController.usuarioLogado = loginView.getUser(false);
					goToTelaUserComum();
				} 
				
				if(valor instanceof Integer && (Integer)valor == -1){
					testSenha++;
					if(testSenha == 5) goToRecuperarSenha();
					loginView.tfuser.clear();
					loginView.pfpassword.clear();
					Alert alert = new Alert(AlertType.ERROR,"Usuario ou senha inv�lidos!");
				    alert.setTitle("Mensagem");
				    alert.setHeaderText(null);
				    alert.show();
				}
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

		userAdminView.miFindCliente
		.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub
				goToConsultarCliente();
			}
		});

		userAdminView.miShowAgendaGeral
		.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub
				goToConsultaAgendamentosView();
			}
		});

		userAdminView.miFindFuncionario
		.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub
				goToConsultarFuncionarioView();
			}
		});

		userAdminView.miSetParamentros
		.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub
				goToConfiguracaoView();
			}
		});
	}

	private void iniListenersConsultaFuncionarioView() {
		consultarFuncionarioView.btVoltar
		.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub
				goToUsersView();
			}
		});
	}

	private void iniListenersConsultaAgendamentosView() {
		consultaAgendamentosView.btVoltar
		.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub
				goToUsersView();
			}
		});
	}

	// Eventos da classe cadastroClienteView
	private void iniListenersCadastroClienteView() {

		cadastroClienteView.btCadastrar
		.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				ClienteController control = new ClienteController();
				@SuppressWarnings("deprecation")
				ClienteEntity cli = new ClienteEntity(
						cadastroClienteView.tfNome.getText().toString(),
						new Date(cadastroClienteView.dpDataNascimento
								.getValue().getYear(),
								cadastroClienteView.dpDataNascimento
								.getValue().getMonthValue(),
								cadastroClienteView.dpDataNascimento
								.getValue().getDayOfMonth()));
				control.Inserir(cli);
				System.out.println("passou aqui");
			}
		});

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

		userComumView.btListarServicos
		.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub
				goToListarServicoView();
			}
		});

		userComumView.btAgendamento
		.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub
				goToConsultarCliente();
			}
		});

	}

	// Eventos classe cadastroEmpresaView
	private void iniListenersCadastroEmpresaView() {

		cadastroEmpresaView.btCadastrar
		.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				if(cadastroEmpresaView.cadastrarEmpresa()){System.out.println("Implanta��o com sucesso"); goToLogin();}
			}
		});

		cadastroEmpresaView.btCancelar
		.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
		});
	}

	// Eventos da classe consultaClienteView
	private void iniListenersConsultaClienteView() {
		consultaClienteView.btSair.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub
				goToUsersView();
			}
		});

		consultaClienteView.btAcessarCliente
		.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub
				goToClienteEntityView();
			}
		});
	}

	// Eventos da classe clienteEntityView
	private void iniListenersClienteEntityView() {
		clienteEntityView.btVoltar.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub
				goToConsultarCliente();
			}
		});

		clienteEntityView.btAgendarServico
		.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub

				try {
					agendarServicoView.start(agendarServicoView.stage);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
	}

	// Eventos da classe AgendarServicoView
	private void iniListenersAgendarServicoView() {
		agendarServicoView.btCancelar
		.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub
				agendarServicoView.stage.close();
			}
		});
	}

	// Eventos da classe listarServicoView
	private void iniListenersListarServicosView() {
		listarServicoView.btSair.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub
				goToUsersView();
			}
		});
	}

	// Eventos da classe ConfiguracaoView
	private void iniListenersConfiguracaoView() {
		configuracaoView.btCancelar
		.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub
				goToUsersView();
			}
		});
	}

	// M�todos para setar as transi��es de telas
	private void goToTelaUserComum() {
		panePrincipal.getChildren().remove(0);
		panePrincipal.getChildren().add(userComumView);
		stage.setWidth(userComumView.getPrefWidth());
		stage.setHeight(userComumView.getPrefHeight());
		prefTelaUsers();
	}

	private void goToTelaUserAdmin() {
		panePrincipal.getChildren().remove(0);
		panePrincipal.getChildren().add(userComumView);
		userComumView.getChildren().remove(0);
		userComumView.getChildren().add(0, userAdminView.paneMenuBar);

		stage.setWidth(userComumView.getPrefWidth());
		stage.setHeight(userComumView.getPrefHeight());

		prefTelaUsers();
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
		stage.setWidth(loginView.getPrefWidth());
		stage.setHeight(loginView.getPrefHeight());
		prefTelaInicial();
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

	private void goToConsultarCliente() {
		userComumView.getChildren().remove(1);
		userComumView.getChildren().add(1, consultaClienteView);
	}

	private void goToListarServicoView() {
		userComumView.getChildren().remove(1);
		userComumView.getChildren().add(1, listarServicoView);
	}

	private void goToUsersView() {
		userComumView.getChildren().remove(1);
		userComumView.getChildren().add(1, userComumView.paneBody);
	}

	private void goToClienteEntityView() {
		userComumView.getChildren().remove(1);
		userComumView.getChildren().add(1, clienteEntityView);
	}

	private void goToConsultaAgendamentosView() {
		userComumView.getChildren().remove(1);
		userComumView.getChildren().add(1, consultaAgendamentosView);
	}

	private void goToConfiguracaoView() {
		userComumView.getChildren().remove(1);
		userComumView.getChildren().add(1, configuracaoView);
	}

	private void goToConsultarFuncionarioView() {
		userComumView.getChildren().remove(1);
		userComumView.getChildren().add(1, consultarFuncionarioView);
	}

	// Seta o layout X,Y inicial
	private void prefTelaInicial() {
		stage.setX(300);
		stage.setY(100);
	}

	private void prefTelaUsers() {
		stage.setX(10);
		stage.setY(10);
	}

}

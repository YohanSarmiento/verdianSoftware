package controlador;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.stage.Window;

public class HomeControlador {

	@FXML
	Image clie_logo = new Image (getClass().getResourceAsStream("/vista/icon/clie_logo.png"));
	@FXML
	ImageView clie_logo_view = new ImageView (clie_logo);
		
	@FXML
	Image trans_logo = new Image (getClass().getResourceAsStream("/vista/icon/trans_logo.png"));
	@FXML
	ImageView trans_logo_view = new ImageView (trans_logo);
	
	@FXML
	Image eval_logo = new Image (getClass().getResourceAsStream("/vista/icon/eval_logo.png"));
	@FXML
	ImageView eval_logo_view = new ImageView (eval_logo);
	
	@FXML
	Image ajus_logo = new Image (getClass().getResourceAsStream("/vista/icon/ajus_logo.png"));
	
	@FXML
	ImageView ajus_logo_view = new ImageView (ajus_logo);
	
	@FXML
	ImageView pass_logo_view = new ImageView (new Image (getClass().getResourceAsStream("/vista/icon/password_logo.png")));
	
	@FXML
	private void entrarClientes(ActionEvent event) throws IOException {
		
		Parent interfazClientes = FXMLLoader.load(getClass().getResource("/vista/clientes.fxml"));
		Scene escenaClientes = new Scene(interfazClientes);
		Window nodo = ((Node) event.getSource()).getScene().getWindow();
		Stage ventana = (Stage)(nodo);
		ventana.setScene(escenaClientes);
		ventana.show();
	}
	
	@FXML
	private void entrarTrans(ActionEvent event) throws IOException {
		
		Parent interfazTrans = FXMLLoader.load(getClass().getResource("/vista/transacciones.fxml"));
		Scene escenaTrans = new Scene(interfazTrans);
		Window nodo = ((Node) event.getSource()).getScene().getWindow();
		Stage ventana = (Stage)(nodo);
		ventana.setScene(escenaTrans);
		ventana.show();
	}
	
	@FXML
	private void entrarEvaluacion(ActionEvent event) throws IOException {
		Parent interfazEval = FXMLLoader.load(getClass().getResource("/vista/evaluacion.fxml"));
		Scene escenaEval = new Scene(interfazEval);
		Window nodo = ((Node) event.getSource()).getScene().getWindow();
		Stage ventana = (Stage)(nodo);
		ventana.setScene(escenaEval);
		ventana.show();
	}
	
   @FXML
    private void entrarPagos(ActionEvent event) throws IOException {
	  	Parent interfazPagos = FXMLLoader.load(getClass().getResource("/vista/pagos.fxml"));
		Scene escenaPagos = new Scene(interfazPagos);
		Window nodo = ((Node) event.getSource()).getScene().getWindow();
		Stage ventana = (Stage)(nodo);
		ventana.setScene(escenaPagos);
		ventana.show();
    }
   
   @FXML
   public void entrarAdmin(ActionEvent event) throws IOException {
	   Parent interfazAdmin = FXMLLoader.load(getClass().getResource("/vista/administracion.fxml"));
		Scene escenaAdmin = new Scene(interfazAdmin);
		Window nodo = ((Node) event.getSource()).getScene().getWindow();
		Stage ventana = (Stage)(nodo);
		ventana.setScene(escenaAdmin);
		ventana.show();
   }
	
}

package co.edu.uniquindio.poo.ViewController;
import java.net.URL;
import java.util.ResourceBundle;

import co.edu.uniquindio.poo.App;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class BienvenidoVC {

    private App app;
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btt_Administrador;

    @FXML
    private Button btt_Transaccion;

    @FXML
    private Button btt_Empleado;


    @FXML
    void abrirInicioSesion(ActionEvent event) {
        try {
            app.openAdministrador();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    @FXML
    void abrirEmpleado(ActionEvent event) {
        try {
            app.openEmpleado();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    @FXML
    void abrirTransaccion(ActionEvent event) {
        try {
            app.openCliente();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void setApp(App app) {
        this.app = app;
    }

    @FXML
    void initialize() {
        assert btt_Administrador != null : "fx:id=\"btt_Administrador\" was not injected: check your FXML file 'primary.fxml'.";
        assert btt_Transaccion != null : "fx:id=\"btt_Transaccion\" was not injected: check your FXML file 'primary.fxml'.";
        assert btt_Empleado != null : "fx:id=\"btt_Empleado\" was not injected: check your FXML file 'primary.fxml'.";

    }
}



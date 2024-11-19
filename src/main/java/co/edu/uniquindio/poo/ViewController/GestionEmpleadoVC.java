package co.edu.uniquindio.poo.ViewController;

 /**
 * Sample Skeleton for 'GestionCliente.fxml' Controller Class
 */

 import java.net.URL;
 import java.util.ResourceBundle;
 import javafx.event.ActionEvent;
 
  import co.edu.uniquindio.poo.App;

import co.edu.uniquindio.poo.Controller.EmpleadoCont;
import co.edu.uniquindio.poo.Model.Empleado;
import co.edu.uniquindio.poo.Model.Persona.PreguntaSeguridad;
import javafx.beans.property.SimpleObjectProperty;
 import javafx.beans.property.SimpleStringProperty;
 import javafx.collections.FXCollections;
 import javafx.collections.ObservableList;
 import javafx.fxml.FXML;
  import javafx.scene.control.Button;
  import javafx.scene.control.ComboBox;
  import javafx.scene.control.Label;
  import javafx.scene.control.TableColumn;
  import javafx.scene.control.TableView;
  import javafx.scene.control.TextField;

public class GestionEmpleadoVC {

    EmpleadoCont empleadoController;

    ObservableList<Empleado> listEmpleados = FXCollections.observableArrayList();
    Empleado selectedEmpleado;

    App app;


    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="lblNombre"
    private Label lblNombre; // Value injected by FXMLLoader

    @FXML // fx:id="lblRespuestaVerficacion"
    private Label lblRespuestaVerficacion; // Value injected by FXMLLoader

    @FXML // fx:id="lblPreguntaSeguridad"
    private Label lblPreguntaSeguridad; // Value injected by FXMLLoader

    @FXML // fx:id="txtEdad"
    private TextField txtEdad; // Value injected by FXMLLoader

    @FXML // fx:id="txtCedula"
    private TextField txtCedula; // Value injected by FXMLLoader

    @FXML // fx:id="tbcCorreo"
    private TableColumn<Empleado, String> tbcCorreo; // Value injected by FXMLLoader

    @FXML // fx:id="txtNombre"
    private TextField txtNombre; // Value injected by FXMLLoader

    @FXML // fx:id="tbcContraseñaCorreo"
    private TableColumn<Empleado, String> tbcContraseñaCorreo; // Value injected by FXMLLoader

    @FXML // fx:id="bttEliminarEmpleado"
    private Button bttEliminarEmpleado; // Value injected by FXMLLoader

    @FXML // fx:id="txtApellido"
    private TextField txtApellido; // Value injected by FXMLLoader

    @FXML // fx:id="bttLimpiar"
    private Button bttLimpiar; // Value injected by FXMLLoader

    @FXML // fx:id="bttAgregarEmpleado"
    private Button bttAgregarEmpleado; // Value injected by FXMLLoader

    @FXML // fx:id="bttModificarEmpleado"
    private Button bttModificarEmpleado; // Value injected by FXMLLoader

    @FXML // fx:id="txtContraseñaCorreo"
    private TextField txtContraseñaCorreo; // Value injected by FXMLLoader

    @FXML // fx:id="tbcApellido"
    private TableColumn<Empleado, String> tbcApellido; // Value injected by FXMLLoader

    @FXML // fx:id="tbEmpleado"
    private TableView<Empleado> tbEmpleado; // Value injected by FXMLLoader

    @FXML // fx:id="tbcCedula"
    private TableColumn<Empleado, String> tbcCedula; // Value injected by FXMLLoader

    @FXML // fx:id="txtCorreo"
    private TextField txtCorreo; // Value injected by FXMLLoader

    @FXML // fx:id="lblApellido"
    private Label lblApellido; // Value injected by FXMLLoader

    @FXML // fx:id="lblContraseñaCorreo"
    private Label lblContraseñaCorreo; // Value injected by FXMLLoader

    @FXML // fx:id="cmbxPreguntaSeguridad"
    private ComboBox<PreguntaSeguridad> cmbxPreguntaSeguridad; // Value injected by FXMLLoader

    @FXML // fx:id="lblCorreo"
    private Label lblCorreo; // Value injected by FXMLLoader

    @FXML // fx:id="lblEdad"
    private Label lblEdad; // Value injected by FXMLLoader

    @FXML // fx:id="txtRespuestaVerficacion"
    private TextField txtRespuestaVerficacion; // Value injected by FXMLLoader

    @FXML // fx:id="tbcEdad"
    private TableColumn<Empleado, String> tbcEdad; // Value injected by FXMLLoader

    @FXML // fx:id="lblCedula"
    private Label lblCedula; // Value injected by FXMLLoader

    @FXML // fx:id="tbcNombre"
    private TableColumn<Empleado, String> tbcNombre; // Value injected by FXMLLoader

    @FXML // fx:id="tbcRespuestaVerificacion"
    private TableColumn<Empleado, String> tbcRespuestaVerificacion; // Value injected by FXMLLoader

    

    @FXML
    void agregarEmpleado(ActionEvent event) {
        agregarEmpleado();

    }

    @FXML
    void modificarEmpleado(ActionEvent event) {
        modificarEmpleado();

    }

    @FXML
    void eliminarEmpleado(ActionEvent event) {
        eliminarEmpleado();

    }

    @FXML
    void limpiar(ActionEvent event) {

    }

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert lblNombre != null : "fx:id=\"lblNombre\" was not injected: check your FXML file 'GestionEmpleados.fxml'.";
        assert lblRespuestaVerficacion != null : "fx:id=\"lblRespuestaVerficacion\" was not injected: check your FXML file 'GestionEmpleados.fxml'.";
        assert lblPreguntaSeguridad != null : "fx:id=\"lblPreguntaSeguridad\" was not injected: check your FXML file 'GestionEmpleados.fxml'.";
        assert txtEdad != null : "fx:id=\"txtEdad\" was not injected: check your FXML file 'GestionEmpleados.fxml'.";
        assert txtCedula != null : "fx:id=\"txtCedula\" was not injected: check your FXML file 'GestionEmpleados.fxml'.";
        assert tbcCorreo != null : "fx:id=\"tbcCorreo\" was not injected: check your FXML file 'GestionEmpleados.fxml'.";
        assert txtNombre != null : "fx:id=\"txtNombre\" was not injected: check your FXML file 'GestionEmpleados.fxml'.";
        assert tbcContraseñaCorreo != null : "fx:id=\"tbcContraseñaCorreo\" was not injected: check your FXML file 'GestionEmpleados.fxml'.";
        assert bttEliminarEmpleado != null : "fx:id=\"bttEliminarEmpleado\" was not injected: check your FXML file 'GestionEmpleados.fxml'.";
        assert txtApellido != null : "fx:id=\"txtApellido\" was not injected: check your FXML file 'GestionEmpleados.fxml'.";
        assert bttLimpiar != null : "fx:id=\"bttLimpiar\" was not injected: check your FXML file 'GestionEmpleados.fxml'.";
        assert bttAgregarEmpleado != null : "fx:id=\"bttAgregarEmpleado\" was not injected: check your FXML file 'GestionEmpleados.fxml'.";
        assert bttModificarEmpleado != null : "fx:id=\"bttModificarEmpleado\" was not injected: check your FXML file 'GestionEmpleados.fxml'.";
        assert txtContraseñaCorreo != null : "fx:id=\"txtContraseñaCorreo\" was not injected: check your FXML file 'GestionEmpleados.fxml'.";
        assert tbcApellido != null : "fx:id=\"tbcApellido\" was not injected: check your FXML file 'GestionEmpleados.fxml'.";
        assert tbEmpleado != null : "fx:id=\"tbEmpleado\" was not injected: check your FXML file 'GestionEmpleados.fxml'.";
        assert tbcCedula != null : "fx:id=\"tbcCedula\" was not injected: check your FXML file 'GestionEmpleados.fxml'.";
        assert txtCorreo != null : "fx:id=\"txtCorreo\" was not injected: check your FXML file 'GestionEmpleados.fxml'.";
        assert lblApellido != null : "fx:id=\"lblApellido\" was not injected: check your FXML file 'GestionEmpleados.fxml'.";
        assert lblContraseñaCorreo != null : "fx:id=\"lblContraseñaCorreo\" was not injected: check your FXML file 'GestionEmpleados.fxml'.";
        assert cmbxPreguntaSeguridad != null : "fx:id=\"cmbxPreguntaSeguridad\" was not injected: check your FXML file 'GestionEmpleados.fxml'.";
        assert lblCorreo != null : "fx:id=\"lblCorreo\" was not injected: check your FXML file 'GestionEmpleados.fxml'.";
        assert lblEdad != null : "fx:id=\"lblEdad\" was not injected: check your FXML file 'GestionEmpleados.fxml'.";
        assert txtRespuestaVerficacion != null : "fx:id=\"txtRespuestaVerficacion\" was not injected: check your FXML file 'GestionEmpleados.fxml'.";
        assert tbcEdad != null : "fx:id=\"tbcEdad\" was not injected: check your FXML file 'GestionEmpleados.fxml'.";
        assert lblCedula != null : "fx:id=\"lblCedula\" was not injected: check your FXML file 'GestionEmpleados.fxml'.";
        assert tbcNombre != null : "fx:id=\"tbcNombre\" was not injected: check your FXML file 'GestionEmpleados.fxml'.";
        assert tbcRespuestaVerificacion != null : "fx:id=\"tbcRespuestaVerificacion\" was not injected: check your FXML file 'GestionEmpleados.fxml'.";

        empleadoController = new EmpleadoCont(App.concesionario);
        initView();
    }

      private void initView() {
        initDataBinding();

        // Obtiene la lista
        obtenerEmpleados();

        // Limpiar la tabla
        tbEmpleado.getItems().clear();

        // Agregar los elementos a la tabla
        tbEmpleado.setItems(listEmpleados);

        // Seleccionar elemento de la tabla
        listenerSelection();
    }

    @SuppressWarnings({ "rawtypes", "unchecked" })
     private void initDataBinding() {
        tbcNombre.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getNombre()));
        tbcApellido.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getApellidos()));
        tbcCedula.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getCedula()));
        tbcCorreo.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getCorreo()));
        tbcEdad.setCellValueFactory(cellData -> new SimpleObjectProperty(cellData.getValue().getEdad()));
        tbcContraseñaCorreo.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getContraseñaCorrreo()));
        tbcRespuestaVerificacion.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getRespuestaVerificacion()));
        // Usamos SimpleObjectProperty para manejar Double y Integer correctamente
    }

    private void obtenerEmpleados() {
        listEmpleados.addAll(empleadoController.obtenerListaEmpleados());
    }

    private void listenerSelection() {
        tbEmpleado.getSelectionModel().selectedItemProperty().addListener((obs, oldSelection, newSelection) -> {
            selectedEmpleado = newSelection;
            mostrarInformacionEmpleado(selectedEmpleado);
        });
    }



     private void mostrarInformacionEmpleado(Empleado empleado) {
        if (empleado != null) {
            txtNombre.setText(empleado.getNombre());
            txtApellido.setText(empleado.getApellidos());
            txtCedula.setText(empleado.getCedula());
            txtCorreo.setText(empleado.getCorreo());
            txtEdad.setText(String.valueOf(empleado.getEdad()));
            txtContraseñaCorreo.setText(empleado.getContraseñaCorrreo());
            txtRespuestaVerficacion.setText(empleado.getRespuestaVerificacion());
        }
    }


   private void agregarEmpleado() {
        Empleado empleado = buildEmpleado();
        if (empleadoController.crearEmpleado(empleado)) {
            listEmpleados.add(empleado);
            limpiarCamposEmpleado();
        }
    }


    private Empleado buildEmpleado() {
        // Obtener la edad de la caja de texto
        String edadText = txtEdad.getText();
        int edad = 0;
        try {
            edad = Integer.parseInt(edadText);
        } catch (NumberFormatException e) {
            System.out.println("Error: La edad ingresada no es válida.");
            return null; // O mostrar un mensaje de error
        }
    
        // Obtener la pregunta de seguridad seleccionada del ComboBox
        PreguntaSeguridad preguntaSeguridad = cmbxPreguntaSeguridad.getValue();
        if (preguntaSeguridad == null) {
            System.out.println("Error: Debe seleccionar una pregunta de seguridad.");
            return null; // O mostrar un mensaje de error
        }
    
        Empleado empleado = new Empleado(txtNombre.getText(), txtApellido.getText(), txtCorreo.getText(), txtContraseñaCorreo.getText(), txtRespuestaVerficacion.getText(), edad, txtCedula.getText(), preguntaSeguridad,  );
    
        return empleado;
    }
    


    private void eliminarEmpleado() {
        if (empleadoController.eliminarEmpleado(txtCedula.getText())) {
            listEmpleados.remove(selectedEmpleado);
            limpiarCamposEmpleado();
            limpiarSeleccion();
        }
    }

    private void modificarEmpleado() {

        if (selectedEmpleado != null &&
                empleadoController.modificarEmpleado(selectedEmpleado.getCedula(), buildEmpleado())) {

            int index = listEmpleados.indexOf(selectedEmpleado);
            if (index >= 0) {
                listEmpleados.set(index, buildEmpleado());
            }

            tbEmpleado.refresh();
            limpiarSeleccion();
            limpiarCamposEmpleado();
        }
    }


    private void limpiarSeleccion() {
        tbEmpleado.getSelectionModel().clearSelection();
        limpiarCamposEmpleado();
    }

    private void limpiarCamposEmpleado() {
        txtCedula.clear();
        txtNombre.clear();
        txtApellido.clear();
        txtCorreo.clear();
        txtEdad.clear();
        txtContraseñaCorreo.clear();
        txtRespuestaVerficacion.clear();
    }


     public void setApp(App app) {
        this.app = app;

        ObservableList<PreguntaSeguridad> options = FXCollections.observableArrayList(PreguntaSeguridad.values());
        cmbxPreguntaSeguridad.setItems(options);
   
        
    }
 }


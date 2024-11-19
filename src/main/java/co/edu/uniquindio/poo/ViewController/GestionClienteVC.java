
package co.edu.uniquindio.poo.ViewController;

 /**
 * Sample Skeleton for 'GestionCliente.fxml' Controller Class
 */

 import java.net.URL;
 import java.util.ResourceBundle;
 
  import co.edu.uniquindio.poo.App;
 import co.edu.uniquindio.poo.Controller.ClienteCont;
 import co.edu.uniquindio.poo.Model.Cliente;
import co.edu.uniquindio.poo.Model.Persona.PreguntaSeguridad;
import javafx.beans.property.SimpleObjectProperty;
 import javafx.beans.property.SimpleStringProperty;
 import javafx.collections.FXCollections;
 import javafx.collections.ObservableList;
 import javafx.event.ActionEvent;
 import javafx.fxml.FXML;
  import javafx.scene.control.Button;
  import javafx.scene.control.ComboBox;
  import javafx.scene.control.Label;
  import javafx.scene.control.TableColumn;
  import javafx.scene.control.TableView;
  import javafx.scene.control.TextField;

public class GestionClienteVC {

    ClienteCont clienteController;

    ObservableList<Cliente> listClientes = FXCollections.observableArrayList();
    Cliente selectedCliente;

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
    private TableColumn<Cliente, String> tbcCorreo; // Value injected by FXMLLoader

    @FXML // fx:id="bttModificarCliente"
    private Button bttModificarCliente; // Value injected by FXMLLoader

    @FXML // fx:id="txtNombre"
    private TextField txtNombre; // Value injected by FXMLLoader

    @FXML // fx:id="tbcContraseñaCorreo"
    private TableColumn<Cliente, String> tbcContraseñaCorreo; // Value injected by FXMLLoader

    @FXML // fx:id="txtApellido"
    private TextField txtApellido; // Value injected by FXMLLoader

    @FXML // fx:id="bttLimpiar"
    private Button bttLimpiar; // Value injected by FXMLLoader

    @FXML // fx:id="txtContraseñaCorreo"
    private TextField txtContraseñaCorreo; // Value injected by FXMLLoader

    @FXML // fx:id="bttEliminar"
    private Button bttEliminar; // Value injected by FXMLLoader

    @FXML // fx:id="tbcApellido"
    private TableColumn<Cliente, String> tbcApellido; // Value injected by FXMLLoader

    @FXML // fx:id="tbcCedula"
    private TableColumn<Cliente, String> tbcCedula; // Value injected by FXMLLoader

    @FXML // fx:id="txtCorreo"
    private TextField txtCorreo; // Value injected by FXMLLoader

    @FXML // fx:id="lblApellido"
    private Label lblApellido; // Value injected by FXMLLoader

    @FXML // fx:id="lblContraseñaCorreo"
    private Label lblContraseñaCorreo; // Value injected by FXMLLoader

    @FXML // fx:id="cmbxPreguntaSeguridad"
    private ComboBox<PreguntaSeguridad> cmbxPreguntaSeguridad; // Value injected by FXMLLoader

    @FXML // fx:id="bttAgregarCliente"
    private Button bttAgregarCliente; // Value injected by FXMLLoader

    @FXML // fx:id="lblCorreo"
    private Label lblCorreo; // Value injected by FXMLLoader

    @FXML // fx:id="lblEdad"
    private Label lblEdad; // Value injected by FXMLLoader

    @FXML // fx:id="txtRespuestaVerficacion"
    private TextField txtRespuestaVerficacion; // Value injected by FXMLLoader

    @FXML // fx:id="tbcEdad"
    private TableColumn<Cliente, String> tbcEdad; // Value injected by FXMLLoader

    @FXML // fx:id="lblCedula"
    private Label lblCedula; // Value injected by FXMLLoader

    @FXML // fx:id="tbcNombre"
    private TableColumn<Cliente, String> tbcNombre; // Value injected by FXMLLoader

    @FXML // fx:id="tbcRespuestaVerificacion"
    private TableColumn<Cliente, String> tbcRespuestaVerificacion; // Value injected by FXMLLoader

    @FXML // fx:id="tbClientes"
    private TableView<Cliente> tbClientes; // Value injected by FXMLLoader

    

    @FXML
    void agregarCliente(ActionEvent event) {
        agregarCliente();

    }

    @FXML
    void modificarCliente(ActionEvent event) {
        modificarCliente();

    }

    @FXML
    void eliminarCliente(ActionEvent event) {
        eliminarCliente();

    }

    @FXML
    void limpiar(ActionEvent event) {

    }

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert lblNombre != null : "fx:id=\"lblNombre\" was not injected: check your FXML file 'GestionCliente.fxml'.";
        assert lblRespuestaVerficacion != null : "fx:id=\"lblRespuestaVerficacion\" was not injected: check your FXML file 'GestionCliente.fxml'.";
        assert lblPreguntaSeguridad != null : "fx:id=\"lblPreguntaSeguridad\" was not injected: check your FXML file 'GestionCliente.fxml'.";
        assert txtEdad != null : "fx:id=\"txtEdad\" was not injected: check your FXML file 'GestionCliente.fxml'.";
        assert txtCedula != null : "fx:id=\"txtCedula\" was not injected: check your FXML file 'GestionCliente.fxml'.";
        assert tbcCorreo != null : "fx:id=\"tbcCorreo\" was not injected: check your FXML file 'GestionCliente.fxml'.";
        assert bttModificarCliente != null : "fx:id=\"bttModificarCliente\" was not injected: check your FXML file 'GestionCliente.fxml'.";
        assert txtNombre != null : "fx:id=\"txtNombre\" was not injected: check your FXML file 'GestionCliente.fxml'.";
        assert tbcContraseñaCorreo != null : "fx:id=\"tbcContraseñaCorreo\" was not injected: check your FXML file 'GestionCliente.fxml'.";
        assert txtApellido != null : "fx:id=\"txtApellido\" was not injected: check your FXML file 'GestionCliente.fxml'.";
        assert bttLimpiar != null : "fx:id=\"bttLimpiar\" was not injected: check your FXML file 'GestionCliente.fxml'.";
        assert txtContraseñaCorreo != null : "fx:id=\"txtContraseñaCorreo\" was not injected: check your FXML file 'GestionCliente.fxml'.";
        assert bttEliminar != null : "fx:id=\"bttEliminar\" was not injected: check your FXML file 'GestionCliente.fxml'.";
        assert tbcApellido != null : "fx:id=\"tbcApellido\" was not injected: check your FXML file 'GestionCliente.fxml'.";
        assert tbcCedula != null : "fx:id=\"tbcCedula\" was not injected: check your FXML file 'GestionCliente.fxml'.";
        assert txtCorreo != null : "fx:id=\"txtCorreo\" was not injected: check your FXML file 'GestionCliente.fxml'.";
        assert lblApellido != null : "fx:id=\"lblApellido\" was not injected: check your FXML file 'GestionCliente.fxml'.";
        assert lblContraseñaCorreo != null : "fx:id=\"lblContraseñaCorreo\" was not injected: check your FXML file 'GestionCliente.fxml'.";
        assert cmbxPreguntaSeguridad != null : "fx:id=\"cmbxPreguntaSeguridad\" was not injected: check your FXML file 'GestionCliente.fxml'.";
        assert bttAgregarCliente != null : "fx:id=\"bttAgregarCliente\" was not injected: check your FXML file 'GestionCliente.fxml'.";
        assert lblCorreo != null : "fx:id=\"lblCorreo\" was not injected: check your FXML file 'GestionCliente.fxml'.";
        assert lblEdad != null : "fx:id=\"lblEdad\" was not injected: check your FXML file 'GestionCliente.fxml'.";
        assert txtRespuestaVerficacion != null : "fx:id=\"txtRespuestaVerficacion\" was not injected: check your FXML file 'GestionCliente.fxml'.";
        assert tbcEdad != null : "fx:id=\"tbcEdad\" was not injected: check your FXML file 'GestionCliente.fxml'.";
        assert lblCedula != null : "fx:id=\"lblCedula\" was not injected: check your FXML file 'GestionCliente.fxml'.";
        assert tbcNombre != null : "fx:id=\"tbcNombre\" was not injected: check your FXML file 'GestionCliente.fxml'.";
        assert tbcRespuestaVerificacion != null : "fx:id=\"tbcRespuestaVerificacion\" was not injected: check your FXML file 'GestionCliente.fxml'.";
        assert tbClientes != null : "fx:id=\"tbClientes\" was not injected: check your FXML file 'GestionCliente.fxml'.";

        clienteController = new ClienteCont(App.concesionario);
        initView();

    }

    private void initView() {
        // Traer los datos del cliente a la tabla
        initDataBinding();

        // Obtiene la lista
        obtenerClientes();

        // Limpiar la tabla
        tbClientes.getItems().clear();

        // Agregar los elementos a la tabla
        tbClientes.setItems(listClientes);

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

    private void obtenerClientes() {
        listClientes.addAll(clienteController.obtenerListaClientes());
    }

    private void listenerSelection() {
        tbClientes.getSelectionModel().selectedItemProperty().addListener((obs, oldSelection, newSelection) -> {
            selectedCliente = newSelection;
            mostrarInformacionCliente(selectedCliente);
        });
    }



     private void mostrarInformacionCliente(Cliente cliente) {
        if (cliente != null) {
            txtNombre.setText(cliente.getNombre());
            txtApellido.setText(cliente.getApellidos());
            txtCedula.setText(cliente.getCedula());
            txtCorreo.setText(cliente.getCorreo());
            txtEdad.setText(String.valueOf(cliente.getEdad()));
            txtContraseñaCorreo.setText(cliente.getContraseñaCorrreo());
            txtRespuestaVerficacion.setText(cliente.getRespuestaVerificacion());
        }
    }


   private void agregarCliente() {
        Cliente cliente = buildCliente();
        if (clienteController.crearCliente(cliente)) {
            listClientes.add(cliente);
            limpiarCamposCliente();
        }
    }


    private Cliente buildCliente() {
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
    
        // Crear un nuevo cliente con los datos obtenidos
        Cliente cliente = new Cliente(txtNombre.getText(), txtApellido.getText(), txtCorreo.getText(), txtContraseñaCorreo.getText(), txtRespuestaVerficacion.getText(), edad, txtCedula.getText(), preguntaSeguridad );
    
        return cliente;
    }
    


    private void eliminarCliente() {
        if (clienteController.eliminarCliente(txtCedula.getText())) {
            listClientes.remove(selectedCliente);
            limpiarCamposCliente();
            limpiarSeleccion();
        }
    }

    private void modificarCliente() {

        if (selectedCliente != null &&
                clienteController.modificarCliente(selectedCliente.getCedula(), buildCliente())) {

            int index = listClientes.indexOf(selectedCliente);
            if (index >= 0) {
                listClientes.set(index, buildCliente());
            }

            tbClientes.refresh();
            limpiarSeleccion();
            limpiarCamposCliente();
        }
    }


    private void limpiarSeleccion() {
        tbClientes.getSelectionModel().clearSelection();
        limpiarCamposCliente();
    }

    private void limpiarCamposCliente() {
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


 package co.edu.uniquindio.poo.ViewController;
 /**
  * Sample Skeleton for 'GestionAdministrador.fxml' Controller Class
  */
 
  import java.net.URL;
 import java.util.ResourceBundle;
 
 import co.edu.uniquindio.poo.App;
 import co.edu.uniquindio.poo.Controller.AdministradorCont;
 import co.edu.uniquindio.poo.Model.Administrador;
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

  
  
  public class GestionAdministradorVC {
 
     AdministradorCont administradorCont;
     ObservableList<Administrador> listAdministradores = FXCollections.observableArrayList();
     Administrador selectedAdministrador;
 
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
    private TableColumn<Administrador, String> tbcCorreo; // Value injected by FXMLLoader

    @FXML // fx:id="txtNombre"
    private TextField txtNombre; // Value injected by FXMLLoader

    @FXML // fx:id="tbcContraseñaCorreo"
    private TableColumn<Administrador, String> tbcContraseñaCorreo; // Value injected by FXMLLoader

    @FXML // fx:id="txtApellido"
    private TextField txtApellido; // Value injected by FXMLLoader

    @FXML // fx:id="bttLimpiar"
    private Button bttLimpiar; // Value injected by FXMLLoader

    @FXML // fx:id="bttModificarAdministrador"
    private Button bttModificarAdministrador; // Value injected by FXMLLoader

    @FXML // fx:id="txtContraseñaCorreo"
    private TextField txtContraseñaCorreo; // Value injected by FXMLLoader

    @FXML // fx:id="tbAdministradores"
    private TableView<Administrador> tbAdministradores; // Value injected by FXMLLoader

    @FXML // fx:id="tbcApellido"
    private TableColumn<Administrador, String> tbcApellido; // Value injected by FXMLLoader

    @FXML // fx:id="tbcCedula"
    private TableColumn<Administrador, String> tbcCedula; // Value injected by FXMLLoader

    @FXML // fx:id="txtCorreo"
    private TextField txtCorreo; // Value injected by FXMLLoader

    @FXML // fx:id="lblApellido"
    private Label lblApellido; // Value injected by FXMLLoader

    @FXML // fx:id="lblContraseñaCorreo"
    private Label lblContraseñaCorreo; // Value injected by FXMLLoader

    @FXML // fx:id="cmbxPreguntaSeguridad"
    private ComboBox<PreguntaSeguridad> cmbxPreguntaSeguridad; // Value injected by FXMLLoader

    @FXML // fx:id="bttEliminarAdministrador"
    private Button bttEliminarAdministrador; // Value injected by FXMLLoader

    @FXML // fx:id="lblCorreo"
    private Label lblCorreo; // Value injected by FXMLLoader

    @FXML // fx:id="lblEdad"
    private Label lblEdad; // Value injected by FXMLLoader

    @FXML // fx:id="txtRespuestaVerficacion"
    private TextField txtRespuestaVerficacion; // Value injected by FXMLLoader

    @FXML // fx:id="tbcEdad"
    private TableColumn<Administrador, String> tbcEdad; // Value injected by FXMLLoader

    @FXML // fx:id="lblCedula"
    private Label lblCedula; // Value injected by FXMLLoader

    @FXML // fx:id="tbcNombre"
    private TableColumn<Administrador, String> tbcNombre; // Value injected by FXMLLoader

    @FXML // fx:id="bttAgregarAdministrador"
    private Button bttAgregarAdministrador; // Value injected by FXMLLoader

    @FXML // fx:id="tbcRespuestaVerificacion"
    private TableColumn<Administrador, String> tbcRespuestaVerificacion; // Value injected by FXMLLoader


    @FXML
    void agregarAdministrador(ActionEvent event) {
        agregarAdministrador();

    }

    @FXML
    void modificarAdministrador(ActionEvent event) {
        modificarAdministrador();

    }

    @FXML
    void eliminarAdministrador(ActionEvent event) {
        eliminarAdministrador();

    }

    @FXML
    void limpiar(ActionEvent event) {

    }

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert lblNombre != null : "fx:id=\"lblNombre\" was not injected: check your FXML file 'GestionAdministrador.fxml'.";
        assert lblRespuestaVerficacion != null : "fx:id=\"lblRespuestaVerficacion\" was not injected: check your FXML file 'GestionAdministrador.fxml'.";
        assert lblPreguntaSeguridad != null : "fx:id=\"lblPreguntaSeguridad\" was not injected: check your FXML file 'GestionAdministrador.fxml'.";
        assert txtEdad != null : "fx:id=\"txtEdad\" was not injected: check your FXML file 'GestionAdministrador.fxml'.";
        assert txtCedula != null : "fx:id=\"txtCedula\" was not injected: check your FXML file 'GestionAdministrador.fxml'.";
        assert tbcCorreo != null : "fx:id=\"tbcCorreo\" was not injected: check your FXML file 'GestionAdministrador.fxml'.";
        assert txtNombre != null : "fx:id=\"txtNombre\" was not injected: check your FXML file 'GestionAdministrador.fxml'.";
        assert tbcContraseñaCorreo != null : "fx:id=\"tbcContraseñaCorreo\" was not injected: check your FXML file 'GestionAdministrador.fxml'.";
        assert txtApellido != null : "fx:id=\"txtApellido\" was not injected: check your FXML file 'GestionAdministrador.fxml'.";
        assert bttLimpiar != null : "fx:id=\"bttLimpiar\" was not injected: check your FXML file 'GestionAdministrador.fxml'.";
        assert bttModificarAdministrador != null : "fx:id=\"bttModificarAdministrador\" was not injected: check your FXML file 'GestionAdministrador.fxml'.";
        assert txtContraseñaCorreo != null : "fx:id=\"txtContraseñaCorreo\" was not injected: check your FXML file 'GestionAdministrador.fxml'.";
        assert tbAdministradores != null : "fx:id=\"tbAdministradores\" was not injected: check your FXML file 'GestionAdministrador.fxml'.";
        assert tbcApellido != null : "fx:id=\"tbcApellido\" was not injected: check your FXML file 'GestionAdministrador.fxml'.";
        assert tbcCedula != null : "fx:id=\"tbcCedula\" was not injected: check your FXML file 'GestionAdministrador.fxml'.";
        assert txtCorreo != null : "fx:id=\"txtCorreo\" was not injected: check your FXML file 'GestionAdministrador.fxml'.";
        assert lblApellido != null : "fx:id=\"lblApellido\" was not injected: check your FXML file 'GestionAdministrador.fxml'.";
        assert lblContraseñaCorreo != null : "fx:id=\"lblContraseñaCorreo\" was not injected: check your FXML file 'GestionAdministrador.fxml'.";
        assert cmbxPreguntaSeguridad != null : "fx:id=\"cmbxPreguntaSeguridad\" was not injected: check your FXML file 'GestionAdministrador.fxml'.";
        assert bttEliminarAdministrador != null : "fx:id=\"bttEliminarAdministrador\" was not injected: check your FXML file 'GestionAdministrador.fxml'.";
        assert lblCorreo != null : "fx:id=\"lblCorreo\" was not injected: check your FXML file 'GestionAdministrador.fxml'.";
        assert lblEdad != null : "fx:id=\"lblEdad\" was not injected: check your FXML file 'GestionAdministrador.fxml'.";
        assert txtRespuestaVerficacion != null : "fx:id=\"txtRespuestaVerficacion\" was not injected: check your FXML file 'GestionAdministrador.fxml'.";
        assert tbcEdad != null : "fx:id=\"tbcEdad\" was not injected: check your FXML file 'GestionAdministrador.fxml'.";
        assert lblCedula != null : "fx:id=\"lblCedula\" was not injected: check your FXML file 'GestionAdministrador.fxml'.";
        assert tbcNombre != null : "fx:id=\"tbcNombre\" was not injected: check your FXML file 'GestionAdministrador.fxml'.";
        assert bttAgregarAdministrador != null : "fx:id=\"bttAgregarAdministrador\" was not injected: check your FXML file 'GestionAdministrador.fxml'.";
        assert tbcRespuestaVerificacion != null : "fx:id=\"tbcRespuestaVerificacion\" was not injected: check your FXML file 'GestionAdministrador.fxml'.";
        administradorCont = new AdministradorCont(App.concesionario);
        initView();
    }

     private void initView() {
       // Traer los datos del cliente a la tabla
       initDataBinding();

       // Obtiene la lista
       obtenerAdministradores();

       // Limpiar la tabla
       tbAdministradores.getItems().clear();

       // Agregar los elementos a la tabla
       tbAdministradores.setItems(listAdministradores);

       // Seleccionar elemento de la tabla
       listenerSelection();
   }

   @SuppressWarnings({ "rawtypes", "unchecked" })
   private void initDataBinding() {
       tbcNombre.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getNombre()));
       tbcApellido.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getApellidos()));
       tbcCedula.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getCedula()));
       tbcEdad.setCellValueFactory(cellData -> new SimpleObjectProperty(cellData.getValue().getEdad()));
       tbcCorreo.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getCorreo()));
       tbcContraseñaCorreo.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getContraseñaCorrreo()));
       tbcRespuestaVerificacion.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getRespuestaVerificacion()));


       // Usamos SimpleObjectProperty para manejar Double y Integer correctamente
   }

   private void obtenerAdministradores() {
       listAdministradores.addAll(administradorCont.obtenerListaAdministradores());
   }

   private void listenerSelection() {
       tbAdministradores.getSelectionModel().selectedItemProperty().addListener((obs, oldSelection, newSelection) -> {
           selectedAdministrador = newSelection;
           mostrarInformacionAdministrador(selectedAdministrador);
       });
   }



    private void mostrarInformacionAdministrador(Administrador administrador) {
       if (administrador != null) {
           txtNombre.setText(administrador.getNombre());
           txtApellido.setText(administrador.getApellidos());
           txtCedula.setText(administrador.getCedula());
           txtCorreo.setText(administrador.getCorreo());
           txtEdad.setText(String.valueOf(administrador.getEdad()));
           txtContraseñaCorreo.setText(administrador.getContraseñaCorrreo());
           txtRespuestaVerficacion.setText(administrador.getRespuestaVerificacion());
       }
   }


  private void agregarAdministrador() {
       Administrador administrador = buildAdministrador();
       if (administradorCont.crearAdministrador(administrador)) {
           listAdministradores.add(administrador);
           limpiarCamposAdministrador();
       }
   }


  private Administrador buildAdministrador() {
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
        Administrador administrador = new Administrador(txtNombre.getText(), txtApellido.getText(), txtCorreo.getText(), txtContraseñaCorreo.getText(), txtRespuestaVerficacion.getText(), edad, txtCedula.getText(), preguntaSeguridad );
    
        return administrador;
    }


   private void eliminarAdministrador() {
       if (administradorCont.eliminarAdministrador(txtCedula.getText())) {
           listAdministradores.remove(selectedAdministrador);
           limpiarCamposAdministrador();
           limpiarSeleccion();
       }
   }

   private void modificarAdministrador() {

       if (selectedAdministrador != null &&
               administradorCont.modificarAdministrador(selectedAdministrador.getCedula(), buildAdministrador())) {

           int index = listAdministradores.indexOf(selectedAdministrador);
           if (index >= 0) {
               listAdministradores.set(index, buildAdministrador());
           }

           tbAdministradores.refresh();
           limpiarSeleccion();
           limpiarCamposAdministrador();
       }
   }



   private void limpiarSeleccion() {
       tbAdministradores.getSelectionModel().clearSelection();
       limpiarCamposAdministrador();
   }

   private void limpiarCamposAdministrador() {
       
       txtNombre.clear();
       txtApellido.clear();
       txtCedula.clear();
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
    
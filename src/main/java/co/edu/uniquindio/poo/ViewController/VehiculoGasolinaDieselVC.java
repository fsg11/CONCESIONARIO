package co.edu.uniquindio.poo.ViewController;

import java.net.URL;
import java.time.Year;
import java.util.ArrayList;
import java.util.ResourceBundle;

import co.edu.uniquindio.poo.App;
import co.edu.uniquindio.poo.Controller.VehiculoGasolinaDieselCON;
import co.edu.uniquindio.poo.Model.BusGasolinaDiesel;
import co.edu.uniquindio.poo.Model.CamionGasolinaDiesel;
import co.edu.uniquindio.poo.Model.DeportivoGasolinaDiesel;
import co.edu.uniquindio.poo.Model.MotoGasolinaDiesel;
import co.edu.uniquindio.poo.Model.PickUpGasolinaDiesel;
import co.edu.uniquindio.poo.Model.SedanGasolinaDiesel;
import co.edu.uniquindio.poo.Model.SuvGasolinaDiesel;
import co.edu.uniquindio.poo.Model.VanGasolinaDiesel;
import co.edu.uniquindio.poo.Model.Vehiculo;
import co.edu.uniquindio.poo.Model.VehiculoGasolinaDiesel;
import co.edu.uniquindio.poo.Model.CamionElectrico.TipoCamion;
import co.edu.uniquindio.poo.Model.Vehiculo.TipoTransmision;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;

public class VehiculoGasolinaDieselVC {

    private App app;
    private VehiculoGasolinaDieselCON vehiculoGasolinaDieselCON;
    private Pane PaneSpecificFields;
    private VehiculoGasolinaDiesel selectedVehiculoGD;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TableColumn<VehiculoGasolinaDiesel, Integer> tbc_puertas;

    @FXML
    private CheckBox ckbx_ABSgd;

    @FXML
    private CheckBox ckbx_SensorColision;

    @FXML
    private TextField txt_CilindrajeGD;

    @FXML
    private TextField txt_CajaCargaGD;

    @FXML
    private TextField txt_ModeloGD;

    @FXML
    private TableColumn<VehiculoGasolinaDiesel, Integer> tbc_caballosGD;

    @FXML
    private TextField txt_BolsasAireGD;

    @FXML
    private TableColumn<VehiculoGasolinaDiesel, String> tbc_TipoVheiculoGD;

    @FXML
    private TableColumn<VehiculoGasolinaDiesel, String> tbc_MarcaGD;

    @FXML
    private TextField txt_CambiosGD;

    @FXML
    private TableColumn<VehiculoGasolinaDiesel, Integer> tbc_tiempoGD;

    @FXML
    private ComboBox<String> cmbx_GD;

    @FXML
    private Button btt_agregrarGD;

    @FXML
    private TableColumn<VehiculoGasolinaDiesel, Integer> tbc_VelocidadmaxGD;

    @FXML
    private TableColumn<VehiculoGasolinaDiesel, Integer> tbc_cilindrajeGD;

    @FXML
    private TableColumn<VehiculoGasolinaDiesel, Boolean> tbc_CamaraReversaGD;

    @FXML
    private CheckBox ckbx_VelocidadCruGD;

    @FXML
    private TableColumn<VehiculoGasolinaDiesel, Integer> tbc_ejesGD;

    @FXML
    private TextField txt_psajerosGD;

    @FXML
    private TableColumn<VehiculoGasolinaDiesel, Boolean> tbc_ABSgd;

    @FXML
    private TableColumn<VehiculoGasolinaDiesel, String> tbc_TipoCamionGD;

    @FXML
    private TextField txt_TiempoGD;

    @FXML
    private TableColumn<VehiculoGasolinaDiesel, Integer> tbc_cajaCargaGD;

    @FXML
    private TableColumn<VehiculoGasolinaDiesel, Boolean> tbc_SensorColisonGD;

    @FXML
    private Button btt_EliminarGD;

    @FXML
    private TableColumn<VehiculoGasolinaDiesel, Integer> tbc_bolsasGD;

    @FXML
    private TableView<VehiculoGasolinaDiesel> tb_vehiculosGD;

    @FXML
    private TableColumn<VehiculoGasolinaDiesel, Boolean> tbc_APCgd;

    @FXML
    private CheckBox ckbx_AireAcondicionado;

    @FXML
    private TableColumn<VehiculoGasolinaDiesel, Boolean> tbc_nuevoGD;

    @FXML
    private ComboBox<String> cmbx_TipoVehiculo;

    @FXML
    private TableColumn<VehiculoGasolinaDiesel, String> tbc_combustile;

    @FXML
    private TableColumn<VehiculoGasolinaDiesel, Boolean> tbc_aireAcondionadoGD;

    @FXML
    private CheckBox ckbx_4x4GD;

    @FXML
    private TableColumn<VehiculoGasolinaDiesel, Boolean> tbc_SensorTraficoGD;

    @FXML
    private CheckBox ckbx_SensorTrafico;

    @FXML
    private TableColumn<VehiculoGasolinaDiesel, String> tbc_ModeloGD;

    @FXML
    private TableColumn<VehiculoGasolinaDiesel, String> tbc_transmisionGD;

    @FXML
    private TextField txt_PuertasGD;

    @FXML
    private TableColumn<VehiculoGasolinaDiesel, Boolean> tbc_VelocidadcruGD;

    @FXML
    private ComboBox<TipoTransmision> cmbx_tipo;

    @FXML
    private ComboBox<TipoCamion> cmbx_TipoCamionGD;

    @FXML
    private CheckBox ckbx_APCgd;

    @FXML
    private Button btt_limpiarGD;

    @FXML
    private CheckBox too_nuevoGD;

    @FXML
    private TextField txt_VelocidadMaxGD;

    @FXML
    private TableColumn<VehiculoGasolinaDiesel, Integer> tbc_CambiosGD;

    @FXML
    private Button btt_ActualizarGD;

    @FXML
    private TableColumn<VehiculoGasolinaDiesel, Integer> tbc_pasajerosGD;

    @FXML
    private TextField txt_CaballosFuerzaGD;

    @FXML
    private TextField txt_ejesGD;

    @FXML
    private TextField txt_CapacidadCargaGD;

    @FXML
    private TextField txt_MarcaGD;

    @FXML
    private CheckBox ckbx_FrenosAireGD;

    @FXML
    private TableColumn<VehiculoGasolinaDiesel, Integer> tbc_CapacidadCarga;

    @FXML
    private TextField txt_placaGD;

    private ObservableList<VehiculoGasolinaDiesel> listVehiculos = FXCollections.observableArrayList();

    @FXML
    private TableColumn<VehiculoGasolinaDiesel, String> tbc_PlacaGD;

    @FXML
    void EliminarVehiculoGD(ActionEvent event) {

    }

    @FXML
    void AgregarVehiculoGD(ActionEvent event) {

    }

    @FXML
    void ActualizarVehiculoGD(ActionEvent event) {

    }

    @FXML
    void LimpiarGD(ActionEvent event) {

    }

    private void agregarCampoVelocidadMaxima() {
        // Crear una etiqueta para el campo
        Label label = new Label("Velocidad Máxima:");
        
        TextField textFieldVelocidadMaxima = new TextField();
    
        textFieldVelocidadMaxima.setPromptText("Ingrese la velocidad máxima");
        
        
        PaneSpecificFields.getChildren().addAll(label, textFieldVelocidadMaxima);
    }

    private void agregarCampoCapacidadCajaCarga() {
        agregarCampoEntero("Capacidad Caja Carga:");
    }
    
    private void agregarCampoNumeroPasajeros() {
        agregarCampoEntero("Número de Pasajeros:");
    }
    
    private void agregarCampoNumeroPuertas() {
        agregarCampoEntero("Número de Puertas:");
    }
    
    private void agregarCampoCapacidadMaletero() {
        agregarCampoEntero("Capacidad de Maletero:");
    }
    
    private void agregarCampoNumeroBolsasAire() {
        agregarCampoEntero("Número de Bolsas de Aire:");
    }
    
    private void agregarCampoCaballosFuerza() {
        agregarCampoEntero("Caballos de Fuerza:");
    }
    
    private void agregarCampoTiempo() {
        agregarCampoEntero("Tiempo:");
    }
    
    private void agregarCampoNumeroSalidasEmergencia() {
        agregarCampoEntero("Número de Salidas de Emergencia:");
    }
    
    private void agregarCampoNumeroEjes() {
        agregarCampoEntero("Número de Ejes:");
    }
    
    private void agregarCampoEntero(String labelText) {
        Label label = new Label(labelText);
        TextField textField = new TextField();
        textField.setPromptText("Ingrese " + labelText.toLowerCase());
        PaneSpecificFields.getChildren().addAll(label, textField);
    }

    private void agregarCampoAireAcondicionado() {
        agregarCampoBooleano("Aire Acondicionado");
    }
    
    private void agregarCampoCamaraReversa() {
        agregarCampoBooleano("Cámara Reversa");
    }
    
    private void agregarCampoVelocidadCrucero() {
        agregarCampoBooleano("Velocidad de Crucero");
    }
    
    private void agregarCampoABS() {
        agregarCampoBooleano("ABS");
    }
    
    private void agregarCampoSensoresColision() {
        agregarCampoBooleano("Sensores de Colisión");
    }
    
    private void agregarCampoSensoresTraficoCruzado() {
        agregarCampoBooleano("Sensores de Tráfico Cruzado");
    }
    
    private void agregarCampoAPC() {
        agregarCampoBooleano("APC");
    }
    
    private void agregarCampo4x4() {
        agregarCampoBooleano("4x4");
    }

    private void agregarcampoFrenosAire(){
        agregarCampoBooleano("frenoAire:");
    }
    
    private void agregarCampoBooleano(String labelText) {
        CheckBox checkBox = new CheckBox(labelText);
        PaneSpecificFields.getChildren().add(checkBox);
    }

    private void agregarCampoTipoCamion() {
        Label label = new Label("Tipo de Camión:");
        ComboBox<TipoCamion> comboBoxTipoCamion = new ComboBox<>();
        comboBoxTipoCamion.getItems().addAll(TipoCamion.values());
        PaneSpecificFields.getChildren().addAll(label, comboBoxTipoCamion);
    }

    private void actualizarCamposEspecificos() {
        PaneSpecificFields.getChildren().clear();
        String tipoVehiculo = cmbx_TipoVehiculo.getValue();

        switch (tipoVehiculo) {
            case "Moto":
                
                break;
            case "Sedan":
                agregarCampoNumeroPasajeros();
                agregarCampoNumeroPuertas();
                agregarCampoCapacidadMaletero();
                agregarCampoAireAcondicionado();
                agregarCampoCamaraReversa();
                agregarCampoVelocidadCrucero();
                agregarCampoNumeroBolsasAire();
                agregarCampoABS();
                agregarCampoSensoresColision();
                agregarCampoSensoresTraficoCruzado();
                agregarCampoAPC();
                break;
            case "Suv":
                agregarCampoNumeroPasajeros();
                agregarCampoNumeroPuertas();
                agregarCampoCapacidadMaletero();
                agregarCampoAireAcondicionado();
                agregarCampoCamaraReversa();
                agregarCampoVelocidadCrucero();
                agregarCampoNumeroBolsasAire();
                agregarCampoABS();
                agregarCampoSensoresColision();
                agregarCampoSensoresTraficoCruzado();
                agregarCampoAPC();
                agregarCampo4x4();
                break;
            case "Deportivo":
                agregarCampoNumeroPasajeros();
                agregarCampoNumeroPuertas();
                agregarCampoNumeroBolsasAire();
                agregarCampoCaballosFuerza();
                agregarCampoTiempo();
                break;
            case "Van":
                agregarCampoNumeroPasajeros();
                agregarCampoNumeroPuertas();
                agregarCampoCapacidadMaletero();
                agregarCampoAireAcondicionado();
                agregarCampoCamaraReversa();
                agregarCampoNumeroBolsasAire();
                agregarCampoABS();
                break;
            case "Bus":
                agregarCampoNumeroPasajeros();
                agregarCampoNumeroPuertas();
                agregarCampoCapacidadMaletero();
                agregarCampoAireAcondicionado();
                agregarCampoCamaraReversa();
                agregarCampoNumeroBolsasAire();
                agregarCampoABS();
                agregarCampoNumeroEjes();
                agregarCampoNumeroSalidasEmergencia();
                break;
            case "Camion":
                agregarCampoCapacidadCajaCarga();
                agregarCampoAireAcondicionado();
                agregarcampoFrenosAire();
                agregarCampoABS();
                agregarCampoNumeroEjes();
                agregarCampoTipoCamion();
                break;
            case "PickUp":
                agregarCampoNumeroPasajeros();
                agregarCampoNumeroPuertas();
                agregarCampoAireAcondicionado();
                break;
        }
    }

    @FXML
    void initialize() {
        assert tbc_puertas != null : "fx:id=\"tbc_puertas\" was not injected: check your FXML file 'VehiculoGasolinaDiesel.fxml'.";
        assert ckbx_ABSgd != null : "fx:id=\"ckbx_ABSgd\" was not injected: check your FXML file 'VehiculoGasolinaDiesel.fxml'.";
        assert ckbx_SensorColision != null : "fx:id=\"ckbx_SensorColision\" was not injected: check your FXML file 'VehiculoGasolinaDiesel.fxml'.";
        assert txt_CilindrajeGD != null : "fx:id=\"txt_CilindrajeGD\" was not injected: check your FXML file 'VehiculoGasolinaDiesel.fxml'.";
        assert txt_CajaCargaGD != null : "fx:id=\"txt_CajaCargaGD\" was not injected: check your FXML file 'VehiculoGasolinaDiesel.fxml'.";
        assert txt_ModeloGD != null : "fx:id=\"txt_ModeloGD\" was not injected: check your FXML file 'VehiculoGasolinaDiesel.fxml'.";
        assert tbc_caballosGD != null : "fx:id=\"tbc_caballosGD\" was not injected: check your FXML file 'VehiculoGasolinaDiesel.fxml'.";
        assert txt_BolsasAireGD != null : "fx:id=\"txt_BolsasAireGD\" was not injected: check your FXML file 'VehiculoGasolinaDiesel.fxml'.";
        assert tbc_TipoVheiculoGD != null : "fx:id=\"tbc_TipoVheiculoGD\" was not injected: check your FXML file 'VehiculoGasolinaDiesel.fxml'.";
        assert tbc_MarcaGD != null : "fx:id=\"tbc_MarcaGD\" was not injected: check your FXML file 'VehiculoGasolinaDiesel.fxml'.";
        assert txt_CambiosGD != null : "fx:id=\"txt_CambiosGD\" was not injected: check your FXML file 'VehiculoGasolinaDiesel.fxml'.";
        assert tbc_tiempoGD != null : "fx:id=\"tbc_tiempoGD\" was not injected: check your FXML file 'VehiculoGasolinaDiesel.fxml'.";
        assert cmbx_GD != null : "fx:id=\"cmbx_GD\" was not injected: check your FXML file 'VehiculoGasolinaDiesel.fxml'.";
        assert btt_agregrarGD != null : "fx:id=\"btt_agregrarGD\" was not injected: check your FXML file 'VehiculoGasolinaDiesel.fxml'.";
        assert tbc_VelocidadmaxGD != null : "fx:id=\"tbc_VelocidadmaxGD\" was not injected: check your FXML file 'VehiculoGasolinaDiesel.fxml'.";
        assert tbc_cilindrajeGD != null : "fx:id=\"tbc_cilindrajeGD\" was not injected: check your FXML file 'VehiculoGasolinaDiesel.fxml'.";
        assert tbc_CamaraReversaGD != null : "fx:id=\"tbc_CamaraReversaGD\" was not injected: check your FXML file 'VehiculoGasolinaDiesel.fxml'.";
        assert ckbx_VelocidadCruGD != null : "fx:id=\"ckbx_VelocidadCruGD\" was not injected: check your FXML file 'VehiculoGasolinaDiesel.fxml'.";
        assert tbc_ejesGD != null : "fx:id=\"tbc_ejesGD\" was not injected: check your FXML file 'VehiculoGasolinaDiesel.fxml'.";
        assert txt_psajerosGD != null : "fx:id=\"txt_psajerosGD\" was not injected: check your FXML file 'VehiculoGasolinaDiesel.fxml'.";
        assert tbc_ABSgd != null : "fx:id=\"tbc_ABSgd\" was not injected: check your FXML file 'VehiculoGasolinaDiesel.fxml'.";
        assert tbc_TipoCamionGD != null : "fx:id=\"tbc_TipoCamionGD\" was not injected: check your FXML file 'VehiculoGasolinaDiesel.fxml'.";
        assert txt_TiempoGD != null : "fx:id=\"txt_TiempoGD\" was not injected: check your FXML file 'VehiculoGasolinaDiesel.fxml'.";
        assert tbc_cajaCargaGD != null : "fx:id=\"tbc_cajaCargaGD\" was not injected: check your FXML file 'VehiculoGasolinaDiesel.fxml'.";
        assert tbc_SensorColisonGD != null : "fx:id=\"tbc_SensorColisonGD\" was not injected: check your FXML file 'VehiculoGasolinaDiesel.fxml'.";
        assert btt_EliminarGD != null : "fx:id=\"btt_EliminarGD\" was not injected: check your FXML file 'VehiculoGasolinaDiesel.fxml'.";
        assert tbc_bolsasGD != null : "fx:id=\"tbc_bolsasGD\" was not injected: check your FXML file 'VehiculoGasolinaDiesel.fxml'.";
        assert tb_vehiculosGD != null : "fx:id=\"tb_vehiculosGD\" was not injected: check your FXML file 'VehiculoGasolinaDiesel.fxml'.";
        assert tbc_APCgd != null : "fx:id=\"tbc_APCgd\" was not injected: check your FXML file 'VehiculoGasolinaDiesel.fxml'.";
        assert ckbx_AireAcondicionado != null : "fx:id=\"ckbx_AireAcondicionado\" was not injected: check your FXML file 'VehiculoGasolinaDiesel.fxml'.";
        assert tbc_nuevoGD != null : "fx:id=\"tbc_nuevoGD\" was not injected: check your FXML file 'VehiculoGasolinaDiesel.fxml'.";
        assert cmbx_TipoVehiculo != null : "fx:id=\"cmbx_TipoVehiculo\" was not injected: check your FXML file 'VehiculoGasolinaDiesel.fxml'.";
        assert tbc_combustile != null : "fx:id=\"tbc_combustile\" was not injected: check your FXML file 'VehiculoGasolinaDiesel.fxml'.";
        assert tbc_aireAcondionadoGD != null : "fx:id=\"tbc_aireAcondionadoGD\" was not injected: check your FXML file 'VehiculoGasolinaDiesel.fxml'.";
        assert ckbx_4x4GD != null : "fx:id=\"ckbx_4x4GD\" was not injected: check your FXML file 'VehiculoGasolinaDiesel.fxml'.";
        assert tbc_SensorTraficoGD != null : "fx:id=\"tbc_SensorTraficoGD\" was not injected: check your FXML file 'VehiculoGasolinaDiesel.fxml'.";
        assert ckbx_SensorTrafico != null : "fx:id=\"ckbx_SensorTrafico\" was not injected: check your FXML file 'VehiculoGasolinaDiesel.fxml'.";
        assert tbc_ModeloGD != null : "fx:id=\"tbc_ModeloGD\" was not injected: check your FXML file 'VehiculoGasolinaDiesel.fxml'.";
        assert tbc_transmisionGD != null : "fx:id=\"tbc_transmisionGD\" was not injected: check your FXML file 'VehiculoGasolinaDiesel.fxml'.";
        assert txt_PuertasGD != null : "fx:id=\"txt_PuertasGD\" was not injected: check your FXML file 'VehiculoGasolinaDiesel.fxml'.";
        assert tbc_VelocidadcruGD != null : "fx:id=\"tbc_VelocidadcruGD\" was not injected: check your FXML file 'VehiculoGasolinaDiesel.fxml'.";
        assert cmbx_tipo != null : "fx:id=\"cmbx_tipo\" was not injected: check your FXML file 'VehiculoGasolinaDiesel.fxml'.";
        assert cmbx_TipoCamionGD != null : "fx:id=\"cmbx_TipoCamionGD\" was not injected: check your FXML file 'VehiculoGasolinaDiesel.fxml'.";
        assert ckbx_APCgd != null : "fx:id=\"ckbx_APCgd\" was not injected: check your FXML file 'VehiculoGasolinaDiesel.fxml'.";
        assert btt_limpiarGD != null : "fx:id=\"btt_limpiarGD\" was not injected: check your FXML file 'VehiculoGasolinaDiesel.fxml'.";
        assert too_nuevoGD != null : "fx:id=\"too_nuevoGD\" was not injected: check your FXML file 'VehiculoGasolinaDiesel.fxml'.";
        assert txt_VelocidadMaxGD != null : "fx:id=\"txt_VelocidadMaxGD\" was not injected: check your FXML file 'VehiculoGasolinaDiesel.fxml'.";
        assert tbc_CambiosGD != null : "fx:id=\"tbc_CambiosGD\" was not injected: check your FXML file 'VehiculoGasolinaDiesel.fxml'.";
        assert btt_ActualizarGD != null : "fx:id=\"btt_ActualizarGD\" was not injected: check your FXML file 'VehiculoGasolinaDiesel.fxml'.";
        assert tbc_pasajerosGD != null : "fx:id=\"tbc_pasajerosGD\" was not injected: check your FXML file 'VehiculoGasolinaDiesel.fxml'.";
        assert txt_CaballosFuerzaGD != null : "fx:id=\"txt_CaballosFuerzaGD\" was not injected: check your FXML file 'VehiculoGasolinaDiesel.fxml'.";
        assert txt_ejesGD != null : "fx:id=\"txt_ejesGD\" was not injected: check your FXML file 'VehiculoGasolinaDiesel.fxml'.";
        assert txt_CapacidadCargaGD != null : "fx:id=\"txt_CapacidadCargaGD\" was not injected: check your FXML file 'VehiculoGasolinaDiesel.fxml'.";
        assert txt_MarcaGD != null : "fx:id=\"txt_MarcaGD\" was not injected: check your FXML file 'VehiculoGasolinaDiesel.fxml'.";
        assert ckbx_FrenosAireGD != null : "fx:id=\"ckbx_FrenosAireGD\" was not injected: check your FXML file 'VehiculoGasolinaDiesel.fxml'.";
        assert tbc_CapacidadCarga != null : "fx:id=\"tbc_CapacidadCarga\" was not injected: check your FXML file 'VehiculoGasolinaDiesel.fxml'.";
        assert txt_placaGD != null : "fx:id=\"txt_placaGD\" was not injected: check your FXML file 'VehiculoGasolinaDiesel.fxml'.";
        assert tbc_PlacaGD != null : "fx:id=\"tbc_PlacaGD\" was not injected: check your FXML file 'VehiculoGasolinaDiesel.fxml'.";

    }

    public Vehiculo buildVehiculo() {
        String marca = txt_MarcaGD.getText();
        String modelo = txt_ModeloGD.getText();
        String placa = txt_placaGD.getText();
        boolean nuevo = too_nuevoGD.isSelected(); 
        int cambios = Integer.parseInt(txt_CambiosGD.getText()); 
        int velocidadMaxima = Integer.parseInt(txt_VelocidadMaxGD.getText());
        int cilindraje = Integer.parseInt(txt_CilindrajeGD.getText());
        String tipoVehiculo = cmbx_TipoVehiculo.getValue();
        Enum TipoTransmision=cmbx_tipo.getValue();
        String GasolinaDiesel= cmbx_GD.getValue();

        switch (tipoVehiculo) {
            case "Moto":
                return new MotoGasolinaDiesel(placa, marca, nuevo, modelo, cambios, velocidadMaxima, cilindraje, null, null);
            
            case "Sedan":
            TextField textFieldNumPuertas = (TextField) PaneSpecificFields.getChildren().get(1);
            TextField textFieldNumPasajeros = (TextField) PaneSpecificFields.getChildren().get(2);
            TextField textFieldCapacidadMaletero = (TextField) PaneSpecificFields.getChildren().get(3);
            TextField textFieldNumBolsasAire = (TextField) PaneSpecificFields.getChildren().get(4);
            
            CheckBox checkBoxAireAcondicionado = (CheckBox) PaneSpecificFields.getChildren().get(5);
            CheckBox checkBoxCamaraReversa = (CheckBox) PaneSpecificFields.getChildren().get(6);
            CheckBox checkBoxVelocidadCrucero = (CheckBox) PaneSpecificFields.getChildren().get(7);
            CheckBox checkBoxABS = (CheckBox) PaneSpecificFields.getChildren().get(8);
            CheckBox checkBoxSensoresColision = (CheckBox) PaneSpecificFields.getChildren().get(9);
            CheckBox checkBoxSensoresTraficoCruzado = (CheckBox) PaneSpecificFields.getChildren().get(10);
            CheckBox checkBoxAPC = (CheckBox) PaneSpecificFields.getChildren().get(11);
            
            short numPuertas = Short.parseShort(textFieldNumPuertas.getText());
            short numPasajeros = Short.parseShort(textFieldNumPasajeros.getText());
            short capacidadMaletero = Short.parseShort(textFieldCapacidadMaletero.getText());
            short numBolsasAire = Short.parseShort(textFieldNumBolsasAire.getText());
            
            boolean aireAcondicionado = checkBoxAireAcondicionado.isSelected();
            boolean camaraReversa = checkBoxCamaraReversa.isSelected();
            boolean velocidadCrucero = checkBoxVelocidadCrucero.isSelected();
            boolean ABS = checkBoxABS.isSelected();
            boolean sensoresColision = checkBoxSensoresColision.isSelected();
            boolean sensoresTraficoCruzado = checkBoxSensoresTraficoCruzado.isSelected();
            boolean APC = checkBoxAPC.isSelected();
            

            return new SedanGasolinaDiesel(placa, marca, nuevo, modelo, cambios, velocidadMaxima, cilindraje, null, null, numPuertas, numBolsasAire, numPasajeros, capacidadMaletero, aireAcondicionado, camaraReversa, velocidadCrucero, sensoresColision, sensoresTraficoCruzado, APC, ABS);

            case "Suv":
        
            
            CheckBox checkBox4 = (CheckBox) PaneSpecificFields.getChildren().get(11);
            boolean Cuantr = checkBox4.isSelected();
            
            return new SuvGasolinaDiesel(placa, marca, nuevo, modelo, cambios, velocidadMaxima, cilindraje, null, null, numPuertas, numBolsasAire, numPasajeros, capacidadMaletero, aireAcondicionado, camaraReversa, velocidadCrucero, sensoresColision, sensoresTraficoCruzado, APC, ABS, Cuantr);
            
            case "Deportivo":
            TextField textFieldcaballos = (TextField) PaneSpecificFields.getChildren().get(1);
            TextField textFieldtiempo = (TextField) PaneSpecificFields.getChildren().get(1);

            short caballos = Short.parseShort(textFieldcaballos.getText());
            short Tiempo = Short.parseShort(textFieldtiempo.getText());

            return new DeportivoGasolinaDiesel(placa, marca, nuevo, modelo, cambios, velocidadMaxima, cilindraje, null, null, numPasajeros, numBolsasAire, numPuertas, caballos, Tiempo);
            
            case "PickUp":

            TextField textFieldCapacidadCajaCarga = (TextField) PaneSpecificFields.getChildren().get(1);
            short CapacidadcajaCarga = Short.parseShort(textFieldCapacidadCajaCarga.getText());

            return new PickUpGasolinaDiesel(placa, marca, nuevo, modelo, cambios, velocidadMaxima, cilindraje, null, null, numPasajeros, numPuertas, Tiempo, aireAcondicionado, camaraReversa, ABS, Cuantr, CapacidadcajaCarga);

            case "van":

            return new VanGasolinaDiesel(placa, marca, nuevo, modelo, cambios, velocidadMaxima, cilindraje, null, null, CapacidadcajaCarga, numPasajeros, numPuertas, camaraReversa, ABS, aireAcondicionado, capacidadMaletero);
            
            case "Bus":
            
            TextField textFieldEjes = (TextField) PaneSpecificFields.getChildren().get(1);
            short numejes = Short.parseShort(textFieldEjes.getText());

            TextField textFieldSalidaEmergenia = (TextField) PaneSpecificFields.getChildren().get(1);
            short Salidasemergencia = Short.parseShort(textFieldSalidaEmergenia.getText());
            
            return new BusGasolinaDiesel(placa, marca, nuevo, modelo, cambios, velocidadMaxima, cilindraje, null, null, CapacidadcajaCarga, numPasajeros, numPuertas, camaraReversa, ABS, aireAcondicionado, capacidadMaletero, numejes, Salidasemergencia);

            case "Camion" :
            ComboBox<TipoCamion> comboBoxTipoCamion = (ComboBox<TipoCamion>) PaneSpecificFields.getChildren().get(12);
            TipoCamion tipoCamion = comboBoxTipoCamion.getValue();

            return new CamionGasolinaDiesel(placa, marca, nuevo, modelo, cambios, velocidadMaxima, cilindraje, null, null, ABS, aireAcondicionado, Cuantr, CapacidadcajaCarga, Salidasemergencia, null);
            
            default:
                throw new IllegalArgumentException("Tipo de vehículo no válido");
        }
    }
    
    private void limpiarCamposVehiculo() {
        txt_placaGD.clear();
        txt_MarcaGD.clear();
        txt_ModeloGD.clear();
        too_nuevoGD.setSelected(false);
        txt_CambiosGD.clear();
        txt_VelocidadMaxGD.clear();
        txt_CilindrajeGD.clear();
        cmbx_GD.setValue(null);
        cmbx_tipo.setValue(null);
        if (cmbx_GD != null) {
            cmbx_GD.getSelectionModel().clearSelection();
        }
    }
    
    public void setApp(App app) {
        this.app = app;
    ArrayList <String> Tipocamion = new ArrayList<>();
    TipoCamion.add(""+TipoCamion.VOLQUETE)
    }
    private void initView() {
        initDataBinding();
        obtenerVehiculos();
        tb_vehiculosGD.setItems(listVehiculos);
        listenerSelection();
    }

    private void obtenerVehiculos() {
        listVehiculos.clear();
        listVehiculos.addAll(vehiculoGasolinaDieselCON.obtenerListVehiculoGasolinaDiesels());
    }

    private void listenerSelection() {
        tb_vehiculosGD.getSelectionModel().selectedItemProperty().addListener((obs, oldSelection, newSelection) -> {
            selectedVehiculoGD = newSelection;
            mostrarInformacionVehiculo(selectedVehiculoGD);
        });
    }

    private void mostrarInformacionVehiculo(VehiculoGasolinaDiesel vehiculoGasolinaDiesel) {
        if (vehiculoGasolinaDiesel != null) {
            txt_placaGD.setText(vehiculoGasolinaDiesel.getPlaca());
            txt_MarcaGD.setText(vehiculoGasolinaDiesel.getMarca());
            txt_ModeloGD.setText(vehiculoGasolinaDiesel.getModelo());
            too_nuevoGD.setSelected(vehiculoGasolinaDiesel.getNuevo());
            txt_CambiosGD.setText(String.valueOf(vehiculoGasolinaDiesel.getCambios()));
            txt_VelocidadMaxGD.setText(String.valueOf(vehiculoGasolinaDiesel.getVelocidadMaxima()));
            txt_CilindrajeGD.setText(String.valueOf(vehiculoGasolinaDiesel.getCilindraje()));
            cmbx_tipo.setValue(vehiculoGasolinaDiesel.getTipoTransmision());
            cmbx_GD.setValue(vehiculoGasolinaDiesel.getGasolinaDiesel());
        }
    }

    private void initDataBinding() {
    {
    
            tbc_MarcaGD.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getMarca()));
            tbc_ModeloGD.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getModelo()));
            tbc_PlacaGD.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getPlaca()));
        
            
            tbc_VelocidadmaxGD.setCellValueFactory(cellData -> new SimpleIntegerProperty(cellData.getValue().getVelocidadMaxima()).asObject());
            tbc_cilindrajeGD.setCellValueFactory(cellData -> new SimpleIntegerProperty(cellData.getValue().getCilindraje()).asObject());
            tbc_CambiosGD.setCellValueFactory(cellData -> new SimpleIntegerProperty(cellData.getValue().getCambios()).asObject());
            tbc_nuevoGD.setCellValueFactory(cellData -> new SimpleBooleanProperty(cellData.getValue().getNuevo()).asObject());
        
            // Vincular columnas de tipo Enum (usar como String)
            tbc_transmisionGD.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getTipoTransmision().toString()));
        
            // Vincular la lista de vehículos a la TableView
            tb_vehiculosGD.setItems(listVehiculos);
        }
        
    }

    
}



package co.edu.uniquindio.poo.Controller;


import java.time.Year;
import java.util.Collection;
import java.util.List;

import co.edu.uniquindio.poo.Model.BusGasolinaDiesel;
import co.edu.uniquindio.poo.Model.CamionGasolinaDiesel;
import co.edu.uniquindio.poo.Model.Concesionario;
import co.edu.uniquindio.poo.Model.DeportivoGasolinaDiesel;
import co.edu.uniquindio.poo.Model.MotoGasolinaDiesel;
import co.edu.uniquindio.poo.Model.PickUpGasolinaDiesel;
import co.edu.uniquindio.poo.Model.SedanGasolinaDiesel;
import co.edu.uniquindio.poo.Model.SuvGasolinaDiesel;
import co.edu.uniquindio.poo.Model.VanGasolinaDiesel;
import co.edu.uniquindio.poo.Model.Vehiculo;
import co.edu.uniquindio.poo.Model.Vehiculo.TipoTransmision;
import co.edu.uniquindio.poo.Model.VehiculoGasolinaDiesel;
import co.edu.uniquindio.poo.Model.CamionElectrico.TipoCamion;
import co.edu.uniquindio.poo.Model.VehiculoGasolinaDiesel.GasolinaDiesel;
import javafx.scene.Node;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;



public class VehiculoGasolinaDieselCON {

    Concesionario concesionario;

    public VehiculoGasolinaDieselCON(Concesionario concesionario){
        this.concesionario=concesionario;
    }

    public void agregarVehiculoGasolinaDiesel(String Placa,String marca, boolean Nuevo, String modelo, int cambios, int velocidadMaxima, int cilindraje,
            TipoTransmision tipoTransmision, GasolinaDiesel gasolinaDiesel,String tipo, List<Node> specificFields) {
        VehiculoGasolinaDiesel nuevoVehiculo = null;
        //Year anioFabricacion = Year.parse(año);
    
        switch (tipo) {
            case "Moto":
                 if (specificFields.get(1) instanceof ComboBox) {
                    nuevoVehiculo = new MotoGasolinaDiesel(Placa, marca, Nuevo, modelo, cambios, velocidadMaxima, cilindraje, tipoTransmision, gasolinaDiesel);
                }
                break;
            case "Sedan":
                if (specificFields.get(1) instanceof TextField && specificFields.get(2) instanceof TextField && specificFields.get(3) instanceof TextField && specificFields.get(4) instanceof CheckBox && specificFields.get(5) instanceof CheckBox && specificFields.get(6) instanceof CheckBox && specificFields.get(7) instanceof CheckBox && specificFields.get(8) instanceof CheckBox && specificFields.get(9) instanceof CheckBox && specificFields.get(10) instanceof CheckBox && specificFields.get(11) instanceof TextField) {
                    short numPuertas = Short.parseShort(((TextField) specificFields.get(1)).getText());
                    short numPasajeros = Short.parseShort(((TextField) specificFields.get(2)).getText());
                    short CapacidadMaletero = Short.parseShort(((TextField) specificFields.get(3)).getText());
                    boolean AireAcondicionado = ((CheckBox) specificFields.get(4)).isSelected();
                    boolean Camararversa = ((CheckBox) specificFields.get(5)).isSelected();
                    boolean velocidadCrucero = ((CheckBox) specificFields.get(6)).isSelected();
                    boolean ABS = ((CheckBox) specificFields.get(7)).isSelected();
                    boolean SensoresColision = ((CheckBox) specificFields.get(8)).isSelected();
                    boolean SensortraficoCruzado = ((CheckBox) specificFields.get(9)).isSelected();
                    short BolsasAire = Short.parseShort(((TextField) specificFields.get(11)).getText());
                    boolean APC = ((CheckBox) specificFields.get(10)).isSelected();
                    nuevoVehiculo = new SedanGasolinaDiesel(Placa, marca, Nuevo, modelo, cambios, velocidadMaxima, cilindraje, tipoTransmision, gasolinaDiesel, numPuertas, BolsasAire, numPasajeros, CapacidadMaletero, AireAcondicionado, Camararversa, velocidadCrucero, SensoresColision, SensortraficoCruzado, APC, ABS);
                }
                break;
            case "Suv":
                if (specificFields.get(1) instanceof TextField && specificFields.get(2) instanceof TextField && specificFields.get(3) instanceof TextField && specificFields.get(4) instanceof CheckBox && specificFields.get(5) instanceof CheckBox && specificFields.get(6) instanceof CheckBox && specificFields.get(7) instanceof CheckBox && specificFields.get(8) instanceof CheckBox && specificFields.get(9) instanceof CheckBox && specificFields.get(10) instanceof CheckBox && specificFields.get(11) instanceof TextField && specificFields.get(12) instanceof CheckBox) {
                    short numPuertas = Short.parseShort(((TextField) specificFields.get(1)).getText());
                    short numPasajeros = Short.parseShort(((TextField) specificFields.get(2)).getText());
                    short CapacidadMaletero = Short.parseShort(((TextField) specificFields.get(3)).getText());
                    boolean AireAcondicionado = ((CheckBox) specificFields.get(4)).isSelected();
                    boolean Camararversa = ((CheckBox) specificFields.get(5)).isSelected();
                    boolean velocidadCrucero = ((CheckBox) specificFields.get(6)).isSelected();
                    boolean ABS = ((CheckBox) specificFields.get(7)).isSelected();
                    boolean SensoresColision = ((CheckBox) specificFields.get(8)).isSelected();
                    boolean SensortraficoCruzado = ((CheckBox) specificFields.get(9)).isSelected();
                    boolean APC = ((CheckBox) specificFields.get(10)).isSelected();
                    short BolsasAire = Short.parseShort(((TextField) specificFields.get(11)).getText());
                    boolean Cuatrox4 = ((CheckBox) specificFields.get(12)).isSelected();
                    nuevoVehiculo = new SuvGasolinaDiesel(Placa, marca, Nuevo, modelo, cambios, velocidadMaxima, cilindraje, tipoTransmision, gasolinaDiesel, numPuertas, BolsasAire, numPasajeros, CapacidadMaletero, AireAcondicionado, Camararversa, velocidadCrucero, SensoresColision, SensortraficoCruzado, APC, ABS, Cuatrox4);
                }
                break;
            case "Deportivo":
                if (specificFields.get(1) instanceof TextField && specificFields.get(2) instanceof TextField && specificFields.get(3) instanceof TextField && specificFields.get(4) instanceof TextField && specificFields.get(5) instanceof TextField){
                    short numPasajeros = Short.parseShort(((TextField) specificFields.get(1)).getText());
                    short numPuertas = Short.parseShort(((TextField) specificFields.get(2)).getText());
                    short BolsasAire = Short.parseShort(((TextField) specificFields.get(3)).getText());
                    short CaballosFuerza = Short.parseShort(((TextField) specificFields.get(4)).getText());
                    short Tiempo = Short.parseShort(((TextField) specificFields.get(5)).getText());
                    nuevoVehiculo = new DeportivoGasolinaDiesel(Placa, marca, Nuevo, modelo, cambios, velocidadMaxima, cilindraje, tipoTransmision, gasolinaDiesel, numPasajeros, BolsasAire, numPuertas, CaballosFuerza, Tiempo);
                }
                break;
            case "PickUp" :
                if (specificFields.get(1) instanceof TextField && specificFields.get(2) instanceof TextField && specificFields.get(3) instanceof CheckBox && specificFields.get(4) instanceof CheckBox && specificFields.get(5) instanceof CheckBox && specificFields.get(6) instanceof TextField && specificFields.get(7) instanceof CheckBox && specificFields.get(8) instanceof TextField) {
                    short numPasajeros = Short.parseShort(((TextField) specificFields.get(1)).getText());
                    short numPuertas = Short.parseShort(((TextField) specificFields.get(2)).getText());
                    boolean AireAcondicionado = ((CheckBox) specificFields.get(3)).isSelected();
                    boolean Camararversa = ((CheckBox) specificFields.get(4)).isSelected();
                    boolean ABS = ((CheckBox) specificFields.get(5)).isSelected();
                    short BolsasAire = Short.parseShort(((TextField) specificFields.get(6)).getText());
                    boolean Cuatrox4 = ((CheckBox) specificFields.get(7)).isSelected();
                    short capacidadCajaCarga = Short.parseShort(((TextField) specificFields.get(8)).getText());
                    nuevoVehiculo = new PickUpGasolinaDiesel(Placa, marca, Nuevo, modelo, cambios, velocidadMaxima, cilindraje, tipoTransmision, gasolinaDiesel, numPasajeros, numPuertas, BolsasAire, AireAcondicionado, Camararversa, ABS, Cuatrox4, capacidadCajaCarga);
                }
                break;
            case "Van":
                if (specificFields.get(1) instanceof TextField && specificFields.get(2) instanceof TextField &&
                    specificFields.get(3) instanceof TextField && specificFields.get(4) instanceof CheckBox &&
                    specificFields.get(5) instanceof CheckBox && specificFields.get(6) instanceof TextField) {
                    
                    short numPasajeros = Short.parseShort(((TextField) specificFields.get(1)).getText());
                    short numPuertas = Short.parseShort(((TextField) specificFields.get(2)).getText());
                    short CapacidadMaletero = Short.parseShort(((TextField) specificFields.get(3)).getText());
                    boolean AireAcondicionado = ((CheckBox) specificFields.get(4)).isSelected();
                    boolean Camararversa = ((CheckBox) specificFields.get(5)).isSelected();
                    boolean ABS = ((CheckBox) specificFields.get(6)).isSelected();
                    short BolsasAire = Short.parseShort(((TextField) specificFields.get(7)).getText());
            
                    nuevoVehiculo = new VanGasolinaDiesel(Placa, marca, Nuevo, modelo, cambios, velocidadMaxima,
                        cilindraje, tipoTransmision, gasolinaDiesel, BolsasAire, numPasajeros, numPuertas, Camararversa,
                        ABS, AireAcondicionado, CapacidadMaletero);
                }
                break;
            
            case "Bus":
                if (specificFields.get(1) instanceof TextField && specificFields.get(2) instanceof TextField &&
                    specificFields.get(3) instanceof TextField && specificFields.get(4) instanceof CheckBox &&
                    specificFields.get(5) instanceof CheckBox && specificFields.get(6) instanceof TextField &&
                    specificFields.get(8) instanceof TextField && specificFields.get(9) instanceof TextField && specificFields.get(7) instanceof TextField) {
            
                    short numPasajeros = Short.parseShort(((TextField) specificFields.get(1)).getText());
                    short numPuertas = Short.parseShort(((TextField) specificFields.get(2)).getText());
                    short CapacidadMaletero = Short.parseShort(((TextField) specificFields.get(3)).getText());
                    boolean AireAcondicionado = ((CheckBox) specificFields.get(4)).isSelected();
                    boolean Camararversa = ((CheckBox) specificFields.get(5)).isSelected();
                    boolean ABS = ((CheckBox) specificFields.get(6)).isSelected();
                    short BolsasAire = Short.parseShort(((TextField) specificFields.get(7)).getText());
                    short numeroEjes = Short.parseShort(((TextField) specificFields.get(8)).getText());
                    short numeroSalidas = Short.parseShort(((TextField) specificFields.get(9)).getText());
            
                    nuevoVehiculo = new BusGasolinaDiesel(Placa, marca, Nuevo, modelo, cambios, velocidadMaxima,
                        cilindraje, tipoTransmision, gasolinaDiesel, BolsasAire, numPasajeros, numPuertas,
                        Camararversa, ABS, AireAcondicionado, CapacidadMaletero, numeroEjes, numeroSalidas);
                }
                break;
            
            case "Camion":
                if (specificFields.get(1) instanceof ComboBox &&
                    specificFields.get(2) instanceof TextField &&
                    specificFields.get(3) instanceof CheckBox &&
                    specificFields.get(4) instanceof CheckBox &&
                    specificFields.get(5) instanceof CheckBox &&
                    specificFields.get(8) instanceof TextField &&
                    specificFields.get(9) instanceof TextField) {
            
                    ComboBox<TipoCamion> comboBoxTipoCamion = (ComboBox<TipoCamion>) specificFields.get(1);
                    TipoCamion tipoCamion = comboBoxTipoCamion.getValue();
            
                    short numPuertas = Short.parseShort(((TextField) specificFields.get(2)).getText());
                    short capacidadCajaCarga = Short.parseShort(((TextField) specificFields.get(8)).getText());
                    boolean AireAcondicionado = ((CheckBox) specificFields.get(3)).isSelected();
                    boolean frenosAire = ((CheckBox) specificFields.get(4)).isSelected();
                    boolean ABS = ((CheckBox) specificFields.get(5)).isSelected();
                    short numeroEjes = Short.parseShort(((TextField) specificFields.get(9)).getText());
            
                    nuevoVehiculo = new CamionGasolinaDiesel(Placa, marca, Nuevo, modelo, cambios, velocidadMaxima,
                        cilindraje, tipoTransmision, gasolinaDiesel, ABS, AireAcondicionado, frenosAire, capacidadCajaCarga,
                        numeroEjes, null);
                }
                break;
            
        }
    
        if (nuevoVehiculo != null) {
            crearVehiculoGasolinaDiesel(nuevoVehiculo);
        } else {
            System.out.println("Error al crear el vehículo: verifique los datos de entrada.");
        }
    }

    public boolean crearVehiculoGasolinaDiesel(VehiculoGasolinaDiesel vehiculoGasolinaDiesel){
        return concesionario.agregarVehiculoGasolinaDiesel(vehiculoGasolinaDiesel);
    }

    public Collection<VehiculoGasolinaDiesel> obtenerListVehiculoGasolinaDiesels() {
        return concesionario.getVehiculoGasolinaDiesels();
    }

    public boolean eliminarVehiculoGasolinaDiesel(String placa) {
       return concesionario.eliminarVehiculoGasolinaDiesel(placa);
    }

    public boolean actualizarAuto(String placa, VehiculoGasolinaDiesel vehiculoGasolinaDiesel) {
       return concesionario.ActualizarVehiculoGasolinaDiesel(placa, vehiculoGasolinaDiesel);
    }
    
}

package co.edu.uniquindio.poo.Model;

public class VehiculoGasolinaDiesel extends Vehiculo{

    public GasolinaDiesel gasolinadiesel;
    public enum GasolinaDiesel{ 
        GASOLINA,DIESEL
    }
    public VehiculoGasolinaDiesel(String Placa,String marca, boolean Nuevo, String modelo, int cambios, int velocidadMaxima, int cilindraje,
            TipoTransmision tipoTransmision, GasolinaDiesel gasolinaDiesel) {
        super(marca, Nuevo, modelo, cambios, velocidadMaxima, cilindraje, tipoTransmision,Placa);
        this.gasolinadiesel=gasolinaDiesel;
    }
    public GasolinaDiesel getGasolinaDiesel() {
        return gasolinadiesel;
    }
    public void setGasolinaDiesel(GasolinaDiesel GasolinaDiesel) {
        this.gasolinadiesel = GasolinaDiesel;
    }
    @Override
    public String toString() {
        return "VehiculoGasolinaDiesel [" + super.toString() + "GasolinaDiesel=" + gasolinadiesel + "]";
    }   
}
package co.edu.uniquindio.poo.Model;

public class MotoGasolinaDiesel extends VehiculoGasolinaDiesel{
    

    public MotoGasolinaDiesel(String placa,String marca, boolean Nuevo, String modelo, int cambios, int velocidadMaxima, int cilindraje,
    TipoTransmision tipoTransmision, GasolinaDiesel GasolinaDiesel){
        super(placa,marca, Nuevo, modelo, cambios, velocidadMaxima, cilindraje, tipoTransmision, GasolinaDiesel);
    }

    @Override
    public String toString() {
        return "Moto [" + super.toString()+ "]";
    }
}

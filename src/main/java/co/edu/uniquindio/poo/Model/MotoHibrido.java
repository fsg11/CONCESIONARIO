package co.edu.uniquindio.poo.Model;

public class MotoHibrido extends VehiculoHibrido{

    public MotoHibrido (String placa,String marca, boolean nuevo, String modelo, int cambios, int velocidadMaxima, int cilindraje, TipoTransmision tipoTransmision, boolean enchufable, boolean hibridoLigero){
        super(placa,marca, nuevo, modelo, cambios, velocidadMaxima, cilindraje, tipoTransmision, enchufable, hibridoLigero);
    }

    @Override
    public String toString() {
        return "MotoHibrido []";
    }

    
    
}

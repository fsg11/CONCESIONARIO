package co.edu.uniquindio.poo.Model;


public class VehiculoHibrido extends Vehiculo {
    private boolean enchufable;
    private boolean hibridoLigero;

    public VehiculoHibrido(String Placa,String marca, boolean nuevo, String modelo, int cambios, int velocidadMaxima,
            int cilindraje, TipoTransmision tipoTransmision, boolean enchufable, boolean hibridoLigero) {
                super(marca, nuevo, modelo, cambios, velocidadMaxima, cilindraje, tipoTransmision,Placa);
                this.enchufable = enchufable;
        this.hibridoLigero = hibridoLigero;
    }

    public boolean isEnchufable() {
        return enchufable;
    }

    public void setEnchufable(boolean enchufable) {
        this.enchufable = enchufable;
    }

    public boolean isHibridoLigero() {
        return hibridoLigero;
    }

    public void setHibridoLigero(boolean hibridoLigero) {
        this.hibridoLigero = hibridoLigero;
    }

    @Override
    public String toString() {
        return "VehiculoHibrido [enchufable=" + enchufable + ", hibridoLigero=" + hibridoLigero + "]";
    }

    
    
}

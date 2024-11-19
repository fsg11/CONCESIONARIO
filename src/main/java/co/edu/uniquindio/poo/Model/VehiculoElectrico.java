package co.edu.uniquindio.poo.Model;

public class VehiculoElectrico extends Vehiculo {
   private String autonomiacargacompleta;
   private int tiempopromediocarga;

    public VehiculoElectrico(String placa,String marca,boolean Nuevo,String modelo,int cambios,int velocidadmaxima,int cilindraje,String autonomiacargacompleta,int tiempopromediocarga,TipoTransmision tipoTransmision){
        super(marca, Nuevo, modelo, cambios, velocidadmaxima, cilindraje, tipoTransmision,placa);
        this.autonomiacargacompleta=autonomiacargacompleta;
       this.tiempopromediocarga=tiempopromediocarga;
    
    }

    public String getAutonomiacargacompleta() {
        return autonomiacargacompleta;
    }

    public void setAutonomiacargacompleta(String autonomiacargacompleta) {
        this.autonomiacargacompleta = autonomiacargacompleta;
    }

    public int getTiempopromediocarga() {
        return tiempopromediocarga;
    }

    public void setTiempopromediocarga(int tiempopromediocarga) {
        this.tiempopromediocarga = tiempopromediocarga;
    }

    @Override
    public String toString() {
        return "Vehiculo_electrico [autonomiacargacompleta=" + autonomiacargacompleta + ", tiempopromediocarga="
                + tiempopromediocarga + "]";
    }

    

}

package co.edu.uniquindio.poo.Model;

public class MotoElectrico extends VehiculoElectrico {


    public MotoElectrico(String codigo,String marca,boolean estado,String modelo,int cambios,int velocidadmaxima,int cilindraje,String autonomiacargacompleta,int tiempopromediocarga,TipoTransmision tipoTransmision) {
        super(codigo,marca,estado,modelo,cambios,velocidadmaxima, cilindraje,autonomiacargacompleta,tiempopromediocarga,tipoTransmision);
    }

    @Override
    public String toString() {
        return "MotoElectrico [" + super.toString() +  "]";
    }
}

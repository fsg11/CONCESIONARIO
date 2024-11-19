package co.edu.uniquindio.poo.Model;

public class BusElectrico extends VanElectrico {
    private int numeroSalidasEmergencia;

    

    public BusElectrico(String placa, String marca, boolean estado, String modelo, int cambios, int velocidadmaxima,
            int cilindraje, String autonomiacargacompleta, int tiempopromediocarga, int numeropuertas,
            boolean aireAcondionado, boolean camaraReversa, int numeroBolsasAire, boolean ABS, double capacidadMaletero,
            TipoTransmision tipoTransmision, int numeroSalidasEmergencia) {
        super(placa, marca, estado, modelo, cambios, velocidadmaxima, cilindraje, autonomiacargacompleta,
                tiempopromediocarga, numeropuertas, aireAcondionado, camaraReversa, numeroBolsasAire, ABS,
                capacidadMaletero, tipoTransmision);
        this.numeroSalidasEmergencia = numeroSalidasEmergencia;
    }

    public int getNumeroSalidasEmergencia() {
        return numeroSalidasEmergencia;
    }

    public void setNumeroSalidasEmergencia(int numeroSalidasEmergencia) {
        this.numeroSalidasEmergencia = numeroSalidasEmergencia;
    }

    @Override
    public String toString() {
        return "Bus_e [numeroSalidasEmergencia=" + numeroSalidasEmergencia + "]";
    }

    


  

}

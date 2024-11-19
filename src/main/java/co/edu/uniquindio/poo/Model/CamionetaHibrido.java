package co.edu.uniquindio.poo.Model;

public class CamionetaHibrido extends SedanHibrido {

    private boolean cuatroXcuatro;

    

    public CamionetaHibrido(String Placa, String marca, boolean nuevo, String modelo, int cambios, int velocidadMaxima,
            int cilindraje, TipoTransmision tipoTransmision, boolean enchufable,
            boolean hibridoLigero, int numeroPasajeros, int numeroPuertas, double capacidadMaletero,
            boolean aireAcondicionado, boolean camaraReversa, boolean velocidadCrucero, int numeroBolsasAire,
            boolean aBS, boolean sensoresColision, boolean sensorTraficoCruzado, boolean asistentePermanenciaCarril,
            boolean cuatroXcuatro) {
        super(Placa, marca, nuevo, modelo, cambios, velocidadMaxima, cilindraje, tipoTransmision, enchufable,
                hibridoLigero, numeroPasajeros, numeroPuertas, capacidadMaletero, aireAcondicionado, camaraReversa,
                velocidadCrucero, numeroBolsasAire, aBS, sensoresColision, sensorTraficoCruzado,
                asistentePermanenciaCarril);
        this.cuatroXcuatro = cuatroXcuatro;
    }

    public boolean isCuatroXcuatro() {
        return cuatroXcuatro;
    }

    public void setCuatroXcuatro(boolean cuatroXcuatro) {
        this.cuatroXcuatro = cuatroXcuatro;
    }

    @Override
    public String toString() {
        return "CamionetaHibrido [cuatroXcuatro=" + cuatroXcuatro + "]";
    }


}

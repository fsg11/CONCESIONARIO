package co.edu.uniquindio.poo.Model;

public class SuvElectrico extends SedanElectrico {

    private boolean cuatroxcuatro;

    public SuvElectrico(String codigo, String marca, boolean estado, String modelo, int cambios, int velocidadmaxima, int cilindraje,
            String autonomiacargacompleta, int tiempopromediocarga, int numeroPasajeros, int numeroPuertas,
            double capacidadMaletero, boolean aireAcondionado, boolean camaraReversa, boolean velocidadCrucero,
            int numeroBolsasAire, boolean sensoresColision, boolean sensoresTraficoCruzado, boolean asistenciaPermanenciaCarril,    
            boolean aBS, boolean cuatroxcuatro,TipoTransmision tipoTransmision) {
                
            super(codigo, marca, estado, modelo, cambios, velocidadmaxima, cilindraje, autonomiacargacompleta, tiempopromediocarga,
                        numeroPasajeros, numeroPuertas, capacidadMaletero, aireAcondionado, camaraReversa, velocidadCrucero,
                        numeroBolsasAire, sensoresColision, sensoresTraficoCruzado, asistenciaPermanenciaCarril, aBS,tipoTransmision);
            this.cuatroxcuatro = cuatroxcuatro;
    }

    public boolean getcuatroxcuatro() {
        return cuatroxcuatro;
    }

    public void setcuatroxcuatro(boolean cuatroxcuatro) {
        this.cuatroxcuatro = cuatroxcuatro;
    }

    @Override
    public String toString() {
        return "Suv_e [todoterreno=" + cuatroxcuatro + "]";
    }
}

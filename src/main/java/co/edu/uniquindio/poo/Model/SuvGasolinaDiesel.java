package co.edu.uniquindio.poo.Model;

public class SuvGasolinaDiesel extends SedanGasolinaDiesel{

    private boolean CuatroxCuatro;

    

    public SuvGasolinaDiesel(String Placa, String marca, boolean Nuevo, String modelo, int cambios,
            int velocidadMaxima, int cilindraje, TipoTransmision tipoTransmision, GasolinaDiesel GasolinaDiesel,
            int numeroPuertas, int numeroBolsas, int numeroPasajeros, double capacidadMaletero,
            boolean aireAcondicionado, boolean camaraReversa, boolean velocidadCrucero, boolean sensoresDeColision,
            boolean traficoCruzado, boolean aPC, boolean aBS, boolean cuatroxCuatro) {
        super(Placa, marca, Nuevo, modelo, cambios, velocidadMaxima, cilindraje, tipoTransmision, GasolinaDiesel, numeroPuertas, numeroBolsas, numeroPasajeros, capacidadMaletero, aireAcondicionado, camaraReversa, velocidadCrucero, sensoresDeColision, traficoCruzado, aPC, aBS);
        CuatroxCuatro = cuatroxCuatro;
    }

    public boolean getCuatroxCuatro(){
        return CuatroxCuatro;
    }

    public void setCuatroxCuatro(boolean cuatroxCuatro){
        this.CuatroxCuatro=cuatroxCuatro;
    }

    @Override
    public String toString() {
        return "Camioneta_Suv" + super.toString() + "[CuatroxCuatro=" + CuatroxCuatro + "]";
    }   
}
package co.edu.uniquindio.poo.Model;

public class VanGasolinaDiesel extends VehiculoGasolinaDiesel{
    
    private int numeroBolsas,NumeroPasajeros,numeroPuertas;
    private boolean camaraReversa,ABS,aireAcondicionado;
    public double capacidadMaletero;
    

    public VanGasolinaDiesel(String placa,String marca, boolean Nuevo, String modelo, int cambios, int velocidadMaxima, int cilindraje,
            TipoTransmision tipoTransmision, GasolinaDiesel GasolinaDiesel, int numeroBolsas,
            int numeroPasajeros, int numeroPuertas, boolean camaraReversa, boolean aBS, boolean aireAcondicionado,
            double capacidadMaletero) {
        super(placa, marca, Nuevo, modelo, cambios, velocidadMaxima, cilindraje, tipoTransmision, GasolinaDiesel);
        this.numeroBolsas = numeroBolsas;
        NumeroPasajeros = numeroPasajeros;
        this.numeroPuertas = numeroPuertas;
        this.camaraReversa = camaraReversa;
        ABS = aBS;
        this.aireAcondicionado = aireAcondicionado;
        this.capacidadMaletero = capacidadMaletero;
    }

    public int getNumeroBolsas() {
        return numeroBolsas;
    }

    public void setNumeroBolsas(int numeroBolsas) {
        this.numeroBolsas = numeroBolsas;
    }

    public int getNumeroPasajeros() {
        return NumeroPasajeros;
    }

    public void setNumeroPasajeros(int numeroPasajeros) {
        this.NumeroPasajeros = numeroPasajeros;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    public boolean isCamaraReversa() {
        return camaraReversa;
    }

    public void setCamaraReversa(boolean camaraReversa) {
        this.camaraReversa = camaraReversa;
    }

    public boolean isABS() {
        return ABS;
    }

    public void setABS(boolean aBS) {
        this.ABS = aBS;
    }

    public boolean isAireAcondicionado() {
        return aireAcondicionado;
    }

    public void setAireAcondicionado(boolean aireAcondicionado) {
        this.aireAcondicionado = aireAcondicionado;
    }

    public double getCapacidadMaletero() {
        return capacidadMaletero;
    }

    public void setCapacidadMaletero(double capacidadMaletero) {
        this.capacidadMaletero = capacidadMaletero;
    }

    @Override
    public String toString() {
        return "Van" + super.toString() + "[numeroBolsas=" + numeroBolsas + ", NumeroPasajeros=" + NumeroPasajeros + ", numeroPuertas="
                + numeroPuertas + ", camaraReversa=" + camaraReversa + ", ABS=" + ABS + ", aireAcondicionado="
                + aireAcondicionado + ", capacidadMaletero=" + capacidadMaletero + "]";
    }
 
}

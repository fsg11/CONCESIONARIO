package co.edu.uniquindio.poo.Model;

public class SedanGasolinaDiesel extends VehiculoGasolinaDiesel {

    private int numeroPuertas,numeroBolsas;
    private int NumeroPasajeros;
    private double capacidadMaletero;
    private boolean aireAcondicionado, CamaraReversa, VelocidadCrucero, SensoresDeColision,TraficoCruzado,APC,ABS;
    
    
    

    public SedanGasolinaDiesel(String Placa, String marca, boolean Nuevo, String modelo, int cambios, int velocidadMaxima,
            int cilindraje, TipoTransmision tipoTransmision, GasolinaDiesel GasolinaDiesel, int numeroPuertas,
            int numeroBolsas, int numeroPasajeros, double capacidadMaletero, boolean aireAcondicionado,
            boolean camaraReversa, boolean velocidadCrucero, boolean sensoresDeColision, boolean traficoCruzado,
            boolean aPC, boolean aBS) {
        super(Placa, marca, Nuevo, modelo, cambios, velocidadMaxima, cilindraje, tipoTransmision, GasolinaDiesel);
        this.numeroPuertas = numeroPuertas;
        this.numeroBolsas = numeroBolsas;
        NumeroPasajeros = numeroPasajeros;
        this.capacidadMaletero = capacidadMaletero;
        this.aireAcondicionado = aireAcondicionado;
        CamaraReversa = camaraReversa;
        VelocidadCrucero = velocidadCrucero;
        SensoresDeColision = sensoresDeColision;
        TraficoCruzado = traficoCruzado;
        APC = aPC;
        ABS = aBS;
    }
    public int getNumeroPuertas() {
        return numeroPuertas;
    }
    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
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
        NumeroPasajeros = numeroPasajeros;
    }
    public double getCapacidadMaletero() {
        return capacidadMaletero;
    }
    public void setCapacidadMaletero(double capacidadMaletero) {
        this.capacidadMaletero = capacidadMaletero;
    }
    public boolean isAireAcondicionado() {
        return aireAcondicionado;
    }
    public void setAireAcondicionado(boolean aireAcondicionado) {
        this.aireAcondicionado = aireAcondicionado;
    }
    public boolean isCamaraReversa() {
        return CamaraReversa;
    }
    public void setCamaraReversa(boolean camaraReversa) {
        this.CamaraReversa = camaraReversa;
    }
    public boolean isVelocidadCrucero() {
        return VelocidadCrucero;
    }
    public void setVelocidadCrucero(boolean velocidadCrucero) {
        this.VelocidadCrucero = velocidadCrucero;
    }
    public boolean isSensoresDeColision() {
        return SensoresDeColision;
    }
    public void setSensoresDeColision(boolean sensoresDeColision) {
        this.SensoresDeColision = sensoresDeColision;
    }
    public boolean isTraficoCruzado() {
        return TraficoCruzado;
    }
    public void setTraficoCruzado(boolean traficoCruzado) {
        this.TraficoCruzado = traficoCruzado;
    }
    public boolean isAPC() {
        return APC;
    }
    public void setAPC(boolean aPC) {
        this.APC = aPC;
    }
    public boolean isABS() {
        return ABS;
    }
    public void setABS(boolean aBS) {
        this.ABS = aBS;
    }
    @Override
    public String toString() {
        return "Sedan" + super.toString()+"[numeroPuertas=" + numeroPuertas + ", numeroBolsas=" + numeroBolsas + ", NumeroPasajeros="
                + NumeroPasajeros + ", capacidadMaletero=" + capacidadMaletero + ", aireAcondicionado="
                + aireAcondicionado + ", CamaraReversa=" + CamaraReversa + ", VelocidadCrucero=" + VelocidadCrucero
                + ", SensoresDeColision=" + SensoresDeColision + ", TraficoCruzado=" + TraficoCruzado + ", APC=" + APC
                + ", ABS=" + ABS + "]";
    }
}
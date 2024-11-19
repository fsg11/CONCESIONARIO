package co.edu.uniquindio.poo.Model;

public class PickUpGasolinaDiesel extends VehiculoGasolinaDiesel {
    private int numeroPasajeros,numeroPuertas,numeroBolsas;
    private boolean aireAcondicionado,camaraReversa,ABS,CuatroxCuatro;
    private double CapaciadadCajaCarga;
    
    
    
    
    public PickUpGasolinaDiesel(String Placa, String marca, boolean Nuevo, String modelo, int cambios, int velocidadMaxima,
            int cilindraje, TipoTransmision tipoTransmision, GasolinaDiesel GasolinaDiesel, int numeroPasajeros,
            int numeroPuertas, int numeroBolsas, boolean aireAcondicionado, boolean camaraReversa, boolean aBS,
            boolean cuatroxCuatro, double capaciadadCajaCarga) {
        super(Placa, marca, Nuevo, modelo, cambios, velocidadMaxima, cilindraje, tipoTransmision, GasolinaDiesel);
        this.numeroPasajeros = numeroPasajeros;
        this.numeroPuertas = numeroPuertas;
        this.numeroBolsas = numeroBolsas;
        this.aireAcondicionado = aireAcondicionado;
        this.camaraReversa = camaraReversa;
        ABS = aBS;
        CuatroxCuatro = cuatroxCuatro;
        CapaciadadCajaCarga = capaciadadCajaCarga;
    }
    public int getNumeroPasajeros() {
        return numeroPasajeros;
    }
    public void setNumeroPasajeros(int numeroPasajeros) {
        this.numeroPasajeros = numeroPasajeros;
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
    public boolean isAireAcondicionado() {
        return aireAcondicionado;
    }
    public void setAireAcondicionado(boolean aireAcondicionado) {
        this.aireAcondicionado = aireAcondicionado;
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
    public boolean isCuatroxCuatro() {
        return CuatroxCuatro;
    }
    public void setCuatroxCuatro(boolean cuatroxCuatro) {
        this.CuatroxCuatro = cuatroxCuatro;
    }
    public double getCapaciadadCajaCarga() {
        return CapaciadadCajaCarga;
    }
    public void setCapaciadadCajaCarga(double capaciadadCajaCarga) {
        this.CapaciadadCajaCarga = capaciadadCajaCarga;
    }
    @Override
    public String toString() {
        return "PickUp" + super.toString()+ "[numeroPasajeros=" + numeroPasajeros + ", numeroPuertas=" + numeroPuertas + ", numeroBolsas="
                + numeroBolsas + ", aireAcondicionado=" + aireAcondicionado + ", camaraReversa=" + camaraReversa
                + ", ABS=" + ABS + ", CuatroxCuatro=" + CuatroxCuatro + ", CapaciadadCajaCarga=" + CapaciadadCajaCarga
                + "]";
    }  
}
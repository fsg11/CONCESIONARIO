package co.edu.uniquindio.poo.Model;

public class CamionGasolinaDiesel extends VehiculoGasolinaDiesel{
    private boolean ABS,aireAcondicionado,FrenosAire;
    private double CapacidadCarga;
    private int numeroEjes;
    public TipoCamion TipoCamion;
    public enum TipoCamion{
        VOLQUETE,PLATAFORMA
    }
    
    
    
    public CamionGasolinaDiesel(String Placa, String marca, boolean Nuevo, String modelo, int cambios, int velocidadMaxima,
            int cilindraje, TipoTransmision tipoTransmision, GasolinaDiesel GasolinaDiesel, boolean aBS,
            boolean aireAcondicionado, boolean frenosAire, double capacidadCarga, int numeroEjes,
            TipoCamion tipoCamion2) {
        super(Placa, marca, Nuevo, modelo, cambios, velocidadMaxima, cilindraje, tipoTransmision, GasolinaDiesel);
        ABS = aBS;
        this.aireAcondicionado = aireAcondicionado;
        FrenosAire = frenosAire;
        CapacidadCarga = capacidadCarga;
        this.numeroEjes = numeroEjes;
        TipoCamion = tipoCamion2;
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
    public boolean isFrenosAire() {
        return FrenosAire;
    }
    public void setFrenosAire(boolean frenosAire) {
        this.FrenosAire = frenosAire;
    }
    public double getCapacidadCarga() {
        return CapacidadCarga;
    }
    public void setCapacidadCarga(double capacidadCarga) {
        this.CapacidadCarga = capacidadCarga;
    }
    public int getNumeroEjes() {
        return numeroEjes;
    }
    public void setNumeroEjes(int numeroEjes) {
        this.numeroEjes = numeroEjes;
    }
    public TipoCamion getTipoCamion() {
        return TipoCamion;
    }
    public void setTipoCamion(TipoCamion tipoCamion) {
        this.TipoCamion = tipoCamion;
    }
    @Override
    public String toString() {
        return "Camion"+ super.toString()+ "[ABS=" + ABS + ", aireAcondicionado=" + aireAcondicionado + ", FrenosAire=" + FrenosAire
                + ", CapacidadCarga=" + CapacidadCarga + ", numeroEjes=" + numeroEjes + ", TipoCamion=" + TipoCamion
                + "]";
    }
}
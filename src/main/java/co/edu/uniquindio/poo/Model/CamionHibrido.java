package co.edu.uniquindio.poo.Model;


public class CamionHibrido extends VehiculoHibrido {
    private double capacidadCarga;
    private boolean aireAcondicionado;
    private boolean frenosAire;
    private boolean ABS;
    private int numeroEjes;
    private TipoCamion tipoCamion;

    

    public CamionHibrido(String Placa, String marca, boolean nuevo, String modelo, int cambios, int velocidadMaxima,
            int cilindraje, TipoTransmision tipoTransmision, boolean enchufable,
            boolean hibridoLigero, double capacidadCarga, boolean aireAcondicionado, boolean frenosAire, boolean aBS,
            int numeroEjes, TipoCamion tipoCamion) {
        super(Placa, marca, nuevo, modelo, cambios, velocidadMaxima, cilindraje, tipoTransmision, enchufable,
                hibridoLigero);
        this.capacidadCarga = capacidadCarga;
        this.aireAcondicionado = aireAcondicionado;
        this.frenosAire = frenosAire;
        ABS = aBS;
        this.numeroEjes = numeroEjes;
        this.tipoCamion = tipoCamion;
    }

    public double getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(double capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

    public boolean isAireAcondicionado() {
        return aireAcondicionado;
    }

    public void setAireAcondicionado(boolean aireAcondicionado) {
        this.aireAcondicionado = aireAcondicionado;
    }

    public boolean isFrenosAire() {
        return frenosAire;
    }

    public void setFrenosAire(boolean frenosAire) {
        this.frenosAire = frenosAire;
    }

    public boolean isABS() {
        return ABS;
    }

    public void setABS(boolean aBS) {
        ABS = aBS;
    }

    public int getNumeroEjes() {
        return numeroEjes;
    }

    public void setNumeroEjes(int numeroEjes) {
        this.numeroEjes = numeroEjes;
    }

    public TipoCamion getTipoCamion() {
        return tipoCamion;
    }

    public void setTipoCamion(TipoCamion tipoCamion) {
        this.tipoCamion = tipoCamion;
    }

    @Override
    public String toString() {
        return "CamionHibrido [capacidadCarga=" + capacidadCarga + ", aireAcondicionado=" + aireAcondicionado
                + ", frenosAire=" + frenosAire + ", ABS=" + ABS + ", numeroEjes=" + numeroEjes + ", tipoCamion="
                + tipoCamion + "]";
    }

    


    
}

package co.edu.uniquindio.poo.Model;


public class VanHibrido extends VehiculoHibrido {
    private int numeroPasajeros;
    private int numeroPuertas;
    private double capacidadMaletero;
    private boolean aireAcondicionado;
    private boolean camaraReversa;
    private int numeroBolsasAire;
    private boolean ABS;

    

    public VanHibrido(String Placa, String marca, boolean nuevo, String modelo, int cambios, int velocidadMaxima,
            int cilindraje, TipoTransmision tipoTransmision, boolean enchufable,
            boolean hibridoLigero, int numeroPasajeros, int numeroPuertas, double capacidadMaletero,
            boolean aireAcondicionado, boolean camaraReversa, int numeroBolsasAire, boolean aBS) {
        super(Placa, marca, nuevo, modelo, cambios, velocidadMaxima, cilindraje, tipoTransmision, enchufable,
                hibridoLigero);
        this.numeroPasajeros = numeroPasajeros;
        this.numeroPuertas = numeroPuertas;
        this.capacidadMaletero = capacidadMaletero;
        this.aireAcondicionado = aireAcondicionado;
        this.camaraReversa = camaraReversa;
        this.numeroBolsasAire = numeroBolsasAire;
        ABS = aBS;
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
        return camaraReversa;
    }

    public void setCamaraReversa(boolean camaraReversa) {
        this.camaraReversa = camaraReversa;
    }

    public int getNumeroBolsasAire() {
        return numeroBolsasAire;
    }

    public void setNumeroBolsasAire(int numeroBolsasAire) {
        this.numeroBolsasAire = numeroBolsasAire;
    }

    public boolean isABS() {
        return ABS;
    }

    public void setABS(boolean aBS) {
        ABS = aBS;
    }

    @Override
    public String toString() {
        return "VanHibrido [numeroPasajeros=" + numeroPasajeros + ", numeroPuertas=" + numeroPuertas
                + ", capacidadMaletero=" + capacidadMaletero + ", aireAcondicionado=" + aireAcondicionado
                + ", camaraReversa=" + camaraReversa + ", numeroBolsasAire=" + numeroBolsasAire + ", ABS=" + ABS + "]";
    }

    

    
}
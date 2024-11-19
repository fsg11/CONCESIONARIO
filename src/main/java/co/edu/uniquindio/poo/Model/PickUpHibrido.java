package co.edu.uniquindio.poo.Model;

public class PickUpHibrido extends VehiculoHibrido {
    private int numeroPasajeros;
    private int numeroPuertas;
    private boolean aireAcondicionado;
    private boolean camaraReversa;
    private int numeroBolsasAire;
    private boolean ABS;
    private boolean cuatroXcuatro;
    private double capacidadCajaCarga;

    

    public PickUpHibrido(String Placa, String marca, boolean nuevo, String modelo, int cambios, int velocidadMaxima,
            int cilindraje, TipoTransmision tipoTransmision, boolean enchufable,
            boolean hibridoLigero, int numeroPasajeros, int numeroPuertas, boolean aireAcondicionado,
            boolean camaraReversa, int numeroBolsasAire, boolean aBS, boolean cuatroXcuatro,
            double capacidadCajaCarga) {
        super(Placa, marca, nuevo, modelo, cambios, velocidadMaxima, cilindraje, tipoTransmision, enchufable,
                hibridoLigero);
        this.numeroPasajeros = numeroPasajeros;
        this.numeroPuertas = numeroPuertas;
        this.aireAcondicionado = aireAcondicionado;
        this.camaraReversa = camaraReversa;
        this.numeroBolsasAire = numeroBolsasAire;
        ABS = aBS;
        this.cuatroXcuatro = cuatroXcuatro;
        this.capacidadCajaCarga = capacidadCajaCarga;
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

    public boolean isCuatroXcuatro() {
        return cuatroXcuatro;
    }

    public void setCuatroXcuatro(boolean cuatroXcuatro) {
        this.cuatroXcuatro = cuatroXcuatro;
    }

    public double getCapacidadCajaCarga() {
        return capacidadCajaCarga;
    }

    public void setCapacidadCajaCarga(double capacidadCajaCarga) {
        this.capacidadCajaCarga = capacidadCajaCarga;
    }

    @Override
    public String toString() {
        return "PickUpHibrido [numeroPasajeros=" + numeroPasajeros + ", numeroPuertas=" + numeroPuertas
                + ", aireAcondicionado=" + aireAcondicionado + ", camaraReversa=" + camaraReversa
                + ", numeroBolsasAire=" + numeroBolsasAire + ", ABS=" + ABS + ", cuatroXcuatro=" + cuatroXcuatro
                + ", capacidadCajaCarga=" + capacidadCajaCarga + "]";
    }

    
    
}

package co.edu.uniquindio.poo.Model;

public class PickUpElectrico extends VehiculoElectrico {

    public int numeropasajeros;
    public int numeropuertas;
    public boolean aireAcondionado;
    public boolean camaraReversa;
    public int numerobolsasaire;
    public boolean ABS;
    public boolean cuatrox4;
    public double capacidadCajaCarga;

    public PickUpElectrico(String codigo, String marca, boolean cuatrox4, String modelo, int numerobolsasAire, int numeropasajeros,
            int numeropuertas, boolean aireAcondionado, boolean camaraReversa, int numerobolsasaire, boolean ABS, double capacidadCajaCarga,TipoTransmision tipoTransmision) {
        super(codigo, marca, cuatrox4, modelo, numerobolsasAire, numeropasajeros, numeropuertas, codigo, numerobolsasAire,tipoTransmision);
        this.numeropasajeros = numeropasajeros;
        this.numeropuertas = numeropuertas;
        this.aireAcondionado = aireAcondionado;
        this.camaraReversa = camaraReversa;
        this.numerobolsasaire = numerobolsasaire;
        this.ABS = ABS;
        this.cuatrox4 = cuatrox4;
        this.capacidadCajaCarga = capacidadCajaCarga;

    }

    public int getNumeropasajeros() {
        return numeropasajeros;
    }

    public void setNumeropasajeros(int numeropasajeros) {
        this.numeropasajeros = numeropasajeros;
    }

    public int getNumeropuertas() {
        return numeropuertas;
    }

    public void setNumeropuertas(int numeropuertas) {
        this.numeropuertas = numeropuertas;
    }

    public boolean isAireAcondionado() {
        return aireAcondionado;
    }

    public void setAireAcondionado(boolean aireAcondionado) {
        this.aireAcondionado = aireAcondionado;
    }

    public boolean isCamaraReversa() {
        return camaraReversa;
    }

    public void setCamaraReversa(boolean camaraReversa) {
        this.camaraReversa = camaraReversa;
    }

    public int getNumerobolsasaire() {
        return numerobolsasaire;
    }

    public void setNumerobolsasaire(int numerobolsasaire) {
        this.numerobolsasaire = numerobolsasaire;
    }

    public boolean isABS() {
        return ABS;
    }

    public void setABS(boolean aBS) {
        ABS = aBS;
    }

    public boolean isCuatrox4() {
        return cuatrox4;
    }

    public void setCuatrox4(boolean cuatrox4) {
        this.cuatrox4 = cuatrox4;
    }

    public double getCapacidadCajaCarga() {
        return capacidadCajaCarga;
    }

    public void setCapacidadCajaCarga(double capacidadCajaCarga) {
        this.capacidadCajaCarga = capacidadCajaCarga;
    }

    @Override
    public String toString() {
        return "Pick_up_e [numeropasajeros=" + numeropasajeros + ", numeropuertas=" + numeropuertas
                + ", aireAcondionado=" + aireAcondionado + ", camaraReversa=" + camaraReversa + ", numerobolsasaire="
                + numerobolsasaire + ", ABS=" + ABS + ", cuatrox4=" + cuatrox4 + ", capacidadCajaCarga="
                + capacidadCajaCarga + "]";
    }

    

}

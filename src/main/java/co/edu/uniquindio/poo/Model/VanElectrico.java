package co.edu.uniquindio.poo.Model;

public class VanElectrico extends VehiculoElectrico{
    public int numeropuertas;
    public boolean aireAcondionado;
    public boolean camaraReversa;
    public int numeroBolsasAire;
    public boolean ABS;
    public double capacidadMaletero;

    public VanElectrico(String placa, String marca, boolean estado, String modelo, int cambios, int velocidadmaxima, int cilindraje,
            String autonomiacargacompleta, int tiempopromediocarga, int numeropuertas, boolean aireAcondionado, boolean camaraReversa,
            int numeroBolsasAire, boolean ABS, double capacidadMaletero,TipoTransmision tipoTransmision) {
        super(placa, marca, estado, modelo, cambios, velocidadmaxima, cilindraje, autonomiacargacompleta, tiempopromediocarga,tipoTransmision);
        this.numeropuertas = numeropuertas;
        this.aireAcondionado = aireAcondionado;
        this.camaraReversa = camaraReversa;
        this.numeroBolsasAire = numeroBolsasAire;
        this.ABS = ABS;
        this.capacidadMaletero = capacidadMaletero;
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

    public double getCapacidadMaletero() {
        return capacidadMaletero;
    }

    public void setCapacidadMaletero(double capacidadMaletero) {
        this.capacidadMaletero = capacidadMaletero;
    }

    @Override
    public String toString() {
        return "Van_e [numeropuertas=" + numeropuertas + ", aireAcondionado=" + aireAcondionado + ", camaraReversa="
                + camaraReversa + ", numeroBolsasAire=" + numeroBolsasAire + ", ABS=" + ABS + ", capacidadMaletero="
                + capacidadMaletero + "]";
    }
}

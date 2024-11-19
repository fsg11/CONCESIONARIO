package co.edu.uniquindio.poo.Model;

public class SedanElectrico extends VehiculoElectrico {

    private int numeroPasajeros;
    private int numeroPuertas;
    private double capacidadMaletero;
    private boolean aireAcondionado;
    private boolean camaraReversa;
    private boolean velocidadCrucero;
    private int numeroBolsasAire;
    private boolean sensoresColision;
    private boolean sensoresTraficoCruzado;
    private boolean asistenciaPermanenciaCarril;
    private boolean ABS;

    public SedanElectrico(String codigo, String marca, boolean estado, String modelo, int cambios, int velocidadmaxima, int cilindraje,
            String autonomiacargacompleta, int tiempopromediocarga, int numeroPasajeros, int numeroPuertas, double capacidadMaletero,
            boolean aireAcondionado, boolean camaraReversa, boolean velocidadCrucero, int numeroBolsasAire, boolean sensoresColision,
            boolean sensoresTraficoCruzado, boolean asistenciaPermanenciaCarril, boolean aBS,TipoTransmision tipoTransmision) {
        super(codigo, marca, estado, modelo, cambios, velocidadmaxima, cilindraje, autonomiacargacompleta, tiempopromediocarga,tipoTransmision);
        this.numeroPasajeros = numeroPasajeros;
        this.numeroPuertas = numeroPuertas;
        this.capacidadMaletero = capacidadMaletero;
        this.aireAcondionado = aireAcondionado;
        this.camaraReversa = camaraReversa;

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

    public boolean isVelocidadCrucero() {
        return velocidadCrucero;
    }

    public void setVelocidadCrucero(boolean velocidadCrucero) {
        this.velocidadCrucero = velocidadCrucero;
    }

    public int getNumeroBolsasAire() {
        return numeroBolsasAire;
    }

    public void setNumeroBolsasAire(int numeroBolsasAire) {
        this.numeroBolsasAire = numeroBolsasAire;
    }

    public boolean isSensoresColision() {
        return sensoresColision;
    }

    public void setSensoresColision(boolean sensoresColision) {
        this.sensoresColision = sensoresColision;
    }

    public boolean isSensoresTraficoCruzado() {
        return sensoresTraficoCruzado;
    }

    public void setSensoresTraficoCruzado(boolean sensoresTraficoCruzado) {
        this.sensoresTraficoCruzado = sensoresTraficoCruzado;
    }

    public boolean isAsistenciaPermanenciaCarril() {
        return asistenciaPermanenciaCarril;
    }

    public void setAsistenciaPermanenciaCarril(boolean asistenciaPermanenciaCarril) {
        this.asistenciaPermanenciaCarril = asistenciaPermanenciaCarril;
    }

    public boolean isABS() {
        return ABS;
    }

    public void setABS(boolean aBS) {
        ABS = aBS;
    }

    @Override
    public String toString() {
        return "Sedan_e [numeroPasajeros=" + numeroPasajeros + ", numeroPuertas=" + numeroPuertas
                + ", capacidadMaletero=" + capacidadMaletero + ", aireAcondionado=" + aireAcondionado
                + ", camaraReversa=" + camaraReversa + ", velocidadCrucero=" + velocidadCrucero + ", numeroBolsasAire="
                + numeroBolsasAire + ", sensoresColision=" + sensoresColision + ", sensoresTraficoCruzado="
                + sensoresTraficoCruzado + ", asistenciaPermanenciaCarril=" + asistenciaPermanenciaCarril + ", ABS="
                + ABS + "]";
    }
}
package co.edu.uniquindio.poo.Model;

public class DeportivoHibrido extends VehiculoHibrido {
    private int numeroPasajeros;
    private int numeroPuertas;
    private int numeroBolsasAire;
    private int caballosFuerza;
    private int tiempo100Km;

    

    public DeportivoHibrido(String Placa, String marca, boolean nuevo, String modelo, int cambios, int velocidadMaxima,
            int cilindraje, TipoTransmision tipoTransmision, boolean enchufable,
            boolean hibridoLigero, int numeroPasajeros, int numeroPuertas, int numeroBolsasAire, int caballosFuerza,
            int tiempo100Km) {
        super(Placa, marca, nuevo, modelo, cambios, velocidadMaxima, cilindraje, tipoTransmision, enchufable,
                hibridoLigero);
        this.numeroPasajeros = numeroPasajeros;
        this.numeroPuertas = numeroPuertas;
        this.numeroBolsasAire = numeroBolsasAire;
        this.caballosFuerza = caballosFuerza;
        this.tiempo100Km = tiempo100Km;
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

    public int getNumeroBolsasAire() {
        return numeroBolsasAire;
    }

    public void setNumeroBolsasAire(int numeroBolsasAire) {
        this.numeroBolsasAire = numeroBolsasAire;
    }

    public int getCaballosFuerza() {
        return caballosFuerza;
    }

    public void setCaballosFuerza(int caballosFuerza) {
        this.caballosFuerza = caballosFuerza;
    }

    public int getTiempo100Km() {
        return tiempo100Km;
    }

    public void setTiempo100Km(int tiempo100Km) {
        this.tiempo100Km = tiempo100Km;
    }

    @Override
    public String toString() {
        return "DeportivoHibrido [numeroPasajeros=" + numeroPasajeros + ", numeroPuertas=" + numeroPuertas
                + ", numeroBolsasAire=" + numeroBolsasAire + ", caballosFuerza=" + caballosFuerza + ", tiempo100Km="
                + tiempo100Km + "]";
    }

    
}

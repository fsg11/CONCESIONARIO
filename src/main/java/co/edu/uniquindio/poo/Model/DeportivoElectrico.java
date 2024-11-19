package co.edu.uniquindio.poo.Model;

public class DeportivoElectrico extends VehiculoElectrico{

    public int numeropasajeros;
    public int numeropuertas;
    public int numerobolsasaire;
    public int caballosfuerza;
    public int tiempo;


    public DeportivoElectrico(String codigo, String marca, boolean estado, String modelo, int cambios, int velocidadmaxima, int cilindraje,
                       String autonomiacargacompleta, int tiempopromediocarga, int numeropasajeros, int numeropuertas, int numerobolsasaire,
                       int caballosfuerza, int tiempo,TipoTransmision tipoTransmision) {
        super(codigo, marca, estado, modelo, cambios, velocidadmaxima, cilindraje, autonomiacargacompleta, tiempopromediocarga,tipoTransmision);
        this.numeropasajeros = numeropasajeros;
        this.numeropuertas = numeropuertas;
        this.numerobolsasaire = numerobolsasaire;
        this.caballosfuerza = caballosfuerza;
        this.tiempo = 100;
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


    public int getNumerobolsasaire() {
        return numerobolsasaire;
    }


    public void setNumerobolsasaire(int numerobolsasaire) {
        this.numerobolsasaire = numerobolsasaire;
    }


    public int getCaballosfuerza() {
        return caballosfuerza;
    }


    public void setCaballosfuerza(int caballosfuerza) {
        this.caballosfuerza = caballosfuerza;
    }


    public int getTiempo() {
        return tiempo;
    }


    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }


    @Override
    public String toString() {
        return "Deportivo_e [numeropasajeros=" + numeropasajeros + ", numeropuertas=" + numeropuertas
                + ", numerobolsasaire=" + numerobolsasaire + ", caballosfuerza=" + caballosfuerza + ", tiempo=" + tiempo
                + "]";
    }

}

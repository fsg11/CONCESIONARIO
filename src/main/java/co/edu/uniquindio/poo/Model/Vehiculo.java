package co.edu.uniquindio.poo.Model;

public class Vehiculo {

    private String Marca;
    private boolean Nuevo;
    private String Modelo,Placa;
    private int cambios;
    private int VelocidadMaxima;
    private int Cilindraje;
    public TipoTransmision TipoTransmision;
    public enum TipoTransmision{
        mMANUAL, AUTOMATICA
    } 
    
    
    public Vehiculo(String marca, boolean nuevo, String modelo, int cambios, int velocidadMaxima, int cilindraje, TipoTransmision tipoTransmision,String Placa) {
        this.Marca = marca;
        this.Nuevo = nuevo;
        this.Modelo = modelo;
        this.cambios = cambios;
        this.VelocidadMaxima = velocidadMaxima;
        this.Cilindraje = cilindraje;
        this.TipoTransmision = tipoTransmision;
        this.Placa=Placa;
    }
    
    public String getMarca() {
        return Marca;
    }
    public void setMarca(String marca) {
        Marca = marca;
    }

    public String getPlaca() {
        return Placa;
    }
    public void setPlaca(String placa) {
        Placa = placa;
    }
    public boolean getNuevo() {
        return Nuevo;
    }
    public void setNuevo(boolean nuevo) {
        Nuevo = nuevo;
    }
    public String getModelo() {
        return Modelo;
    }
    public void setModelo(String modelo) {
        Modelo = modelo;
    }
    public int getCambios() {
        return cambios;
    }
    public void setCambios(int cambios) {
        this.cambios = cambios;
    }
    public int getVelocidadMaxima() {
        return VelocidadMaxima;
    }
    public void setVelocidadMaxima(int velocidadMaxima) {
        VelocidadMaxima = velocidadMaxima;
    }
    public int getCilindraje() {
        return Cilindraje;
    }
    public void setCilindraje(int cilindraje) {
        Cilindraje = cilindraje;
    }
    public TipoTransmision getTipoTransmision() {
        return TipoTransmision;
    }
    public void setTipoTransmision(TipoTransmision tipoTransmision) {
        TipoTransmision = tipoTransmision;
    }

    @Override
    public String toString() {
        return "Vehiculo [Marca=" + Marca + ", Nuevo=" + Nuevo + ", Modelo=" + Modelo + ", cambios=" + cambios
                + ", VelocidadMaxima=" + VelocidadMaxima + ", Cilindraje=" + Cilindraje + ", TipoTransmision="
                + TipoTransmision + ", Combustible=" + "]";
    }
}

package co.edu.uniquindio.poo.Model;

public class AlquilerVehiculo {
    
    private String codigo;
    private int diasAlquiler;
    private int precioAlquilerPorDia;
    public Cliente cliente;
    public Empleado empleado;
    public VehiculoGasolinaDiesel vehiculoGasolinaDiesel;
    public VehiculoElectrico vehiculoElectrico;
    public VehiculoHibrido vehiculoHibrido;

    public AlquilerVehiculo (String codigo, int diasAlquiler, int precioAlquilerPorDia,Cliente cliente, Empleado empleado,VehiculoGasolinaDiesel vehiculoGasolinaDiesel,VehiculoElectrico vehiculoElectrico,VehiculoHibrido vehiculoHibrido){
        this.codigo = codigo;
        this.diasAlquiler = diasAlquiler;
        this.precioAlquilerPorDia = precioAlquilerPorDia;
        this.cliente=cliente;
        this.empleado=empleado;
        this.vehiculoElectrico=vehiculoElectrico;
        this.vehiculoGasolinaDiesel=vehiculoGasolinaDiesel;
        this.vehiculoHibrido=vehiculoHibrido;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getDiasAlquiler() {
        return diasAlquiler;
    }

    public void setDiasAlquiler(int diasAlquiler) {
        this.diasAlquiler = diasAlquiler;
    }

    public int getPrecioAlquilerPorDia() {
        return precioAlquilerPorDia;
    }

    public void setPrecioAlquilerPorDia(int precioAlquilerPorDia) {
        this.precioAlquilerPorDia = precioAlquilerPorDia;
    }

    @Override
    public String toString() {
        return "AlquilerVehiculo [codigo=" + codigo + ", diasAlquiler=" + diasAlquiler + ", precioAlquilerPorDia="
                + precioAlquilerPorDia + "]";
    }
}

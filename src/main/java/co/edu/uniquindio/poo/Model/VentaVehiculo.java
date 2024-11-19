package co.edu.uniquindio.poo.Model;

public class VentaVehiculo {

    //collection VEHICULOS
    private String codigo;
    private int precioVenta;
    public Cliente cliente;
    public Empleado empleado;
    public VehiculoGasolinaDiesel vehiculoGasolinaDiesel;
    public VehiculoElectrico vehiculoElectrico;
    public VehiculoHibrido vehiculoHibrido;

    public  VentaVehiculo (String codigo, int precioVenta,Cliente cliente, Empleado empleado,VehiculoGasolinaDiesel vehiculoGasolinaDiesel,VehiculoElectrico vehiculoElectrico,VehiculoHibrido vehiculoHibrido){
        this.codigo = codigo;
        this.precioVenta = precioVenta;
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

    public int getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(int precioVenta) {
        this.precioVenta = precioVenta;
    }

    @Override
    public String toString() {
        return "VentaVehiculo [codigo=" + codigo + ", precioVenta=" + precioVenta + "]";
    }
}
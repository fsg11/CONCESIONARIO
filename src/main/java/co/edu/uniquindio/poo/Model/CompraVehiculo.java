package co.edu.uniquindio.poo.Model;

public class CompraVehiculo {

    private String codigo;
    private int precioVenta;
    private boolean revisionTecnicaAprobado;
    public Cliente cliente;
    public Empleado empleado;
    public VehiculoGasolinaDiesel vehiculoGasolinaDiesel;
    public VehiculoElectrico vehiculoElectrico;
    public VehiculoHibrido vehiculoHibrido;


    public CompraVehiculo (String codigo, int precioVenta, boolean revisionTecnicaAprobado,Cliente cliente, Empleado empleado,VehiculoGasolinaDiesel vehiculoGasolinaDiesel,VehiculoElectrico vehiculoElectrico,VehiculoHibrido vehiculoHibrido){
        this.codigo = codigo;
        this.precioVenta = precioVenta;
        this.revisionTecnicaAprobado = revisionTecnicaAprobado;
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

    public boolean isRevisionTecnicaAprobado() {
        return revisionTecnicaAprobado;
    }

    public void setRevisionTecnicaAprobado(boolean revisionTecnicaAprobado) {
        this.revisionTecnicaAprobado = revisionTecnicaAprobado;
    }

    @Override
    public String toString() {
        return "CompraVehiculo [codigo=" + codigo + ", precioVenta=" + precioVenta + ", revisionTecnicaAprobado="
                + revisionTecnicaAprobado + "]";
    }

    


}

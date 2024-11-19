package co.edu.uniquindio.poo.Model;

import java.time.LocalDate;

public class Transaccion {

    private String codigo;
    private LocalDate fechaRealizada;
    private String detalleTransaccion;
    private int monto;
    private boolean TransaccionRealizada;

    public Transaccion(String codigo, LocalDate fechaRealizada, String detalleTransaccion, int monto,
            boolean TransaccionRealizada) {

        this.codigo = codigo;
        this.fechaRealizada = fechaRealizada;
        this.detalleTransaccion = detalleTransaccion;
        this.monto = monto;
        this.TransaccionRealizada = TransaccionRealizada;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public LocalDate getFechaRealizada() {
        return fechaRealizada;
    }

    public void setFechaRealizada(LocalDate fechaRealizada) {
        this.fechaRealizada = fechaRealizada;
    }

    public String getDetalleTransaccion() {
        return detalleTransaccion;
    }

    public void setDetalleTransaccion(String detalleTransaccion) {
        this.detalleTransaccion = detalleTransaccion;
    }

    public int getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }

    public boolean isTransaccionRealizada() {
        return TransaccionRealizada;
    }

    public void setTransaccionRealizada(boolean transaccionRealizada) {
        TransaccionRealizada = transaccionRealizada;
    }

    @Override
    public String toString() {
        return "Transaccion [codigo=" + codigo + ", fechaRealizada=" + fechaRealizada + ", detalleTransaccion="
                + detalleTransaccion + ", monto=" + monto + ", TransaccionRealizada=" + TransaccionRealizada + "]";
    }

    

}

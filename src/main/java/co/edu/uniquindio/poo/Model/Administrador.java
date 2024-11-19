package co.edu.uniquindio.poo.Model;

import java.util.Collection;
import java.util.LinkedList;

public class Administrador extends Persona {

    public Collection<Empleado> empleados;
    public Collection<VehiculoElectrico> vehiculoElectricos;
    public Collection<VehiculoGasolinaDiesel> VehiculoGasolinaDiesels;
    public Collection<VehiculoHibrido> vehiculoHibridos;
    public Collection<Cliente> clientes;

    
    

    public Administrador(String nombre, String apellidos, String correo, String contraseñaCorrreo,
            String respuestaVerificacion, int edad, String cedula,
            PreguntaSeguridad preguntaSeguridad) {
        super(nombre, apellidos, correo, contraseñaCorrreo, respuestaVerificacion, edad, cedula, preguntaSeguridad);
        this.empleados = new LinkedList<>();
        this.vehiculoElectricos = new LinkedList<>();
        this.VehiculoGasolinaDiesels = new LinkedList<>();
        this.vehiculoHibridos =new LinkedList<>();
        this.clientes =new LinkedList<>();
    }


    @Override
    public String toString() {
        return "Administrador ["+ super.toString()+ "]";
    }
}

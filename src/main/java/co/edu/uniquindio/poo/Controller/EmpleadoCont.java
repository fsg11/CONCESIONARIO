package co.edu.uniquindio.poo.Controller;

import java.util.Collection;

import co.edu.uniquindio.poo.Model.Administrador;
import co.edu.uniquindio.poo.Model.Concesionario;
import co.edu.uniquindio.poo.Model.Empleado;

public class EmpleadoCont {

    Concesionario concesionario;

    public EmpleadoCont(Concesionario concesionario) {
        this.concesionario = concesionario;
    }


    public boolean crearEmpleado(Empleado empleado) {
        return concesionario.agregarEmpleado(empleado);
    }

    public Collection<Empleado> obtenerListaEmpleados() {
        return concesionario.getEmpleados();
    }

    public boolean eliminarEmpleado(String cedula) {
       return concesionario.eliminarEmpleado(cedula);
    }

    public boolean modificarEmpleado(String cedula, Empleado empleado) {
       return concesionario.actualizarEmpleado(cedula, empleado);
    }

    
}

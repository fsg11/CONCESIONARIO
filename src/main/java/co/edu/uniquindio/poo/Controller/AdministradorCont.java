package co.edu.uniquindio.poo.Controller;

import co.edu.uniquindio.poo.Model.Administrador;
import co.edu.uniquindio.poo.Model.Concesionario;
import java.util.Collection;


public class AdministradorCont {
   
    //instanciamos empresa para acceder a los metodos de alli de agregar.
    //esta clase ayudaría a mantener la separación entre la lógica del negocio y la interfaz de usuario.
    ////es el que conecta el modelo con el Viewcontroller

    Concesionario concesionario;

    public AdministradorCont(Concesionario concesionario) {
        this.concesionario = concesionario;
    }


    public boolean crearAdministrador(Administrador administrador) {
        return concesionario.agregarAdministrador(administrador);
    }

    public Collection<Administrador> obtenerListaAdministradores() {
        return concesionario.getAdministradores();
    }

    public boolean eliminarAdministrador(String cedula) {
       return concesionario.eliminarAdministrador(cedula);
    }

    public boolean modificarAdministrador(String cedula, Administrador administrador) {
       return concesionario.actualizarAdministrador(cedula, administrador);
    }

    
}


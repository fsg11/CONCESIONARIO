package co.edu.uniquindio.poo.Controller;

import co.edu.uniquindio.poo.Model.Concesionario;
import co.edu.uniquindio.poo.Model.Cliente;
import java.util.Collection;


public class ClienteCont {


    //instanciamos empresa para acceder a los metodos de alli de agregar.
    //esta clase ayudaría a mantener la separación entre la lógica del negocio y la interfaz de usuario.
    ////es el que conecta el modelo con el Viewcontroller

    Concesionario concesionario;

    public ClienteCont(Concesionario concesionario) {
        this.concesionario = concesionario;
    }


    public boolean crearCliente(Cliente cliente) {
        return concesionario.agregarCliente(cliente);
    }

    public Collection<Cliente> obtenerListaClientes() {
        return concesionario.getCliente();
    }

    public boolean eliminarCliente(String cedula) {
       return concesionario.eliminarCliente(cedula);
    }

    public boolean modificarCliente(String cedula, Cliente cliente) {
       return concesionario.actualizarCliente(cedula, cliente);
    }

    
}


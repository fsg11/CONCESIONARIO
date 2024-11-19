package co.edu.uniquindio.poo.Model;

public class Cliente extends Persona {


    public Cliente(String nombre, String apellidos, String correo, String contraseñaCorrreo,
            String respuestaVerificacion, int edad, String cedula,PreguntaSeguridad preguntaSeguridad) {
        super(nombre, apellidos, correo, contraseñaCorrreo, respuestaVerificacion, edad, cedula,preguntaSeguridad);
    }

    @Override
    public String toString() {
        return "Cliente ["+ super.toString()+ "]";
    }
}

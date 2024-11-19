package co.edu.uniquindio.poo.Model;

public class Empleado extends Persona{
    private boolean Activo;
    
    public Empleado(String nombre, String apellidos, String correo, String contraseñaCorrreo,
            String respuestaVerificacion, int edad, String cedula,
            PreguntaSeguridad preguntaSeguridad, boolean activo) {
        super(nombre, apellidos, correo, contraseñaCorrreo, respuestaVerificacion, edad, cedula, preguntaSeguridad);
        Activo = activo;
    }

    public boolean getActivo() {
        return Activo;
    }

    public void setActivo(boolean activo) {
        Activo = activo;
    }


    @Override
    public String toString() {
        return "Empleado [" + super.toString() + "Activo=" + Activo + "]";
    }  
}

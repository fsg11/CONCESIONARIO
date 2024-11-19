package co.edu.uniquindio.poo.Model;

public class Persona {
    private String nombre,apellidos,correo,contraseñaCorrreo, respuestaVerificacion,cedula;
    private int edad;
    public PreguntaSeguridad PreguntaSeguridad;

    public enum PreguntaSeguridad{
        Cual_es_el_nombre_de_su_mascota,Cual_es_su_color_favorito,Cual_es_su_sabor_favoorito_de_heLado,Cual_es_el_nombre_de_su_mejor_amigo
    }

    public Persona(String nombre, String apellidos, String correo, String contraseñaCorrreo,
            String respuestaVerificacion, int edad, String cedula,PreguntaSeguridad preguntaSeguridad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.correo = correo;
        this.contraseñaCorrreo = contraseñaCorrreo;
        this.respuestaVerificacion = respuestaVerificacion;
        this.edad = edad;
        this.cedula = cedula;
        this.PreguntaSeguridad=preguntaSeguridad;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellidos() {
        return apellidos;
    }
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    public String getCorreo() {
        return correo;
    }
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    public String getContraseñaCorrreo() {
        return contraseñaCorrreo;
    }
    public void setContraseñaCorrreo(String contraseñaCorrreo) {
        this.contraseñaCorrreo = contraseñaCorrreo;
    }
    public String getRespuestaVerificacion() {
        return respuestaVerificacion;
    }
    public void setRespuestaVerificacion(String respuestaVerificacion) {
        this.respuestaVerificacion = respuestaVerificacion;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public String getCedula() {
        return cedula;
    }
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public Enum<PreguntaSeguridad> getPreguntaSeguridad(){
        return PreguntaSeguridad;
    }

    public void setPreguntaSeguridad(PreguntaSeguridad preguntaSeguridad){
        this.PreguntaSeguridad=preguntaSeguridad;
    }
    @Override
    public String toString() {
        return "nombre=" + nombre + ", apellidos=" + apellidos + ", correo=" + correo + ", contraseñaCorrreo="
                + contraseñaCorrreo + ", respuestaVerificacion=" + respuestaVerificacion + ", edad=" + edad
                + ", cedula=" + cedula + ", PreguntaSeguridad=" + PreguntaSeguridad + "]";
    }
}

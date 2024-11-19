package co.edu.uniquindio.poo.Model;

import co.edu.uniquindio.poo.Model.Persona.PreguntaSeguridad;
import co.edu.uniquindio.poo.Model.Vehiculo.TipoTransmision;

public class App {
    public static void main(String[] args) {
        
        Concesionario UQ = new Concesionario("Concensionario UQ");

        Empleado empleado1 = new Empleado( "Juan", "Pérez","juan.perez@example.com", "contraseñaSegura123", "respuestaSecreta", 30,"123456789", PreguntaSeguridad.Cual_es_el_nombre_de_su_mascota,true );
        Empleado empleado2 = new Empleado("Ana","González","ana.gonzalez@example.com","contraseñaSegura456","respuestaSecreta2",28,"987654321",PreguntaSeguridad.Cual_es_el_nombre_de_su_mejor_amigo,true);

        Cliente cliente1 = new Cliente("Juan", "Pérez", "juan@example.com", "1234", "respuesta1", 25, "12345678", PreguntaSeguridad.Cual_es_su_color_favorito);
        Cliente cliente2 = new Cliente("María", "Gómez", "maria@example.com", "abcd", "respuesta2", 30, "87654321", PreguntaSeguridad.Cual_es_su_color_favorito);
        Cliente cliente3 = new Cliente("Carlos", "López", "carlos@example.com", "xyz123", "respuesta3", 35, "11223344", PreguntaSeguridad.Cual_es_su_color_favorito);

        Administrador admin1 = new Administrador("Ana", "Ramírez", "ana@example.com", "admin123", "respuestaAdmin1", 40, "98765432", PreguntaSeguridad.Cual_es_su_color_favorito);
        Administrador admin2 = new Administrador("Luis", "Torres", "luis@example.com", "secure123", "respuestaAdmin2", 45, "22334455", PreguntaSeguridad.Cual_es_su_color_favorito);
        Administrador admin3 = new Administrador("Sofía", "Martínez", "sofia@example.com", "pass2023", "respuestaAdmin3", 50, "66778899", PreguntaSeguridad.Cual_es_su_color_favorito);

        VehiculoElectrico Van = new VanElectrico("ASD549", "toyota", false, "1989", 2, 100, 120, "60%", 2, 4, true, false, 2, false, 1.5, TipoTransmision.AUTOMATICA);
        VehiculoElectrico Bus = new BusElectrico("SFR147", "toyota", false, "2009", 2, 100, 120, "70", 2, 4, true, false, 2, false, 1.5, TipoTransmision.AUTOMATICA,2);
        
        
        
        UQ.agregarAdministrador(admin1);
        
        System.out.println(UQ);
    
    }
}

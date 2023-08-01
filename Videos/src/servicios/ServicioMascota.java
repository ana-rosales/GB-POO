
package servicios;

import entidades.Mascota;
import java.util.Scanner;


/**
 * Entidad de servicio
 * Para delegar funciones de entidad 
 * 
 * @author Ana Pau
 */
public class ServicioMascota {
    private Scanner ent = new Scanner(System.in).useDelimiter("\n");
    
    //alt + enter importa
    public Mascota crearMascota(){
        
        System.out.println("Introducir nombre: ");
        String nombre = ent.next();
        
        System.out.println("Introducir apodo: ");
        String apodo = ent.next();
        
        System.out.println("Introducir tipo: ");
        String tipo = ent.next();
        
        return new Mascota(nombre,apodo,tipo);
        
        //return m;
    }
}

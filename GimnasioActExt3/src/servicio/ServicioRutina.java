
package servicio;

import entidad.Rutina;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Ana Paula
 */
public class ServicioRutina {
    private static final Scanner ent = new Scanner(System.in).useDelimiter("\n");
    
    /**
     * Metodo que crea una rutina.
     *
     * @return r
     */
    public static Rutina crearRutina() {
        Rutina r = new Rutina();       
        
        System.out.println();
        System.out.println("** INGRESAR RUTINA **");
        System.out.print("Nombre: ");
        r.setNombre(ent.next());
        System.out.print("Nivel de dificultad: ");
        r.setNivelDificultad(ent.nextInt());
        System.out.print("Duracion: ");
        r.setDuracion(ent.nextDouble());
        System.out.print("Descripción: ");
        r.setDescripcion(ent.next());

        return r;
    }
    
    /**
     * crearRutina(Rutina rutina): recibe un objeto de tipo Rutina y lo agrega
     * al sistema.
     * @param rutinas
     **/
    public void ingresarRutina(ArrayList<Rutina> rutinas){
        Rutina r = crearRutina();
        rutinas.add(r);
        int id = rutinas.indexOf(r);
        rutinas.get(id).setId(id + 1);
    }
    
    /**
     * obtenerRutinas(): devuelve una lista con todas las rutinas
     * registradas en el sistema.
     * @param rutinas
     **/
    public void obtenerRutinas(ArrayList<Rutina> rutinas){
        System.out.println();
        System.out.println("*** RUTINAS DISPONIBLES ***");
        for (Rutina rutina : rutinas) {
            System.out.println();
            System.out.println(rutina.getId() + "° RUTINA." );            
            System.out.println("Nombre: " + rutina.getNombre());
            System.out.println("Nivel: " + rutina.getNivelDificultad());
            System.out.println("Duración: " + rutina.getDuracion());
            System.out.println("Descripción: " + rutina.getDescripcion());
        }
    }
    
    /**
     * actualizarRutina(int id, String nombre, int
     * duracion, String nivelDificultad, String descripcion): recibe el
     * identificador de una rutina existente y los nuevos datos de la rutina, y
     * actualiza la información correspondiente en el sistema.
     * @param rutinas
     * @param id
     * @return encontrado
     **/
    public boolean actualizarRutina(ArrayList<Rutina> rutinas, int id){
        boolean encontrado = false;
        for (int i = 0; i < rutinas.size(); i++) {
            if (rutinas.get(i).getId() == id) {
                Rutina r = crearRutina();
                rutinas.set(i, r);
                rutinas.get(i).setId(id);
                encontrado = true;
            }
        }
        return encontrado;
    }
    
    /**
     * eliminarRutina(int id): recibe el identificador de una rutina existente y
     * la elimina del sistema. En el método principal (main
     * @param rutinas
     * @param id
     */
    public void eliminarRutina(ArrayList<Rutina> rutinas, int id){
        rutinas.removeIf(rutina->(rutina.getId() == id));
    }
}

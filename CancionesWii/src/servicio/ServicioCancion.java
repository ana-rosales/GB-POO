
package servicio;

import entidad.Cancion;
import java.util.Scanner;

/**
 * Desarrollar una clase Cancion con los siguientes atributos: titulo y autor.
 * Se deberá́ definir además dos constructores: uno vacío que inicializa el
 * titulo y el autor a cadenas vacías y otro que reciba como parámetros el
 * titulo y el autor de la canción. Se deberán además definir los métodos
 * getters y setters correspondientes.
 * 
 * @author Ana Paula
 */
public class ServicioCancion {
    Scanner ent = new Scanner(System.in);
    
    public Cancion agregarCancion(){
        Cancion c = new Cancion();
        
        System.out.println();
        System.out.println("** AGREGAR CANCION **");
        System.out.print("Titulo: ");
        c.setTitulo(ent.nextLine());
        System.out.print("Autor: ");
        c.setAutor(ent.nextLine());
        
        return c;
    }
    
    public void reproducirCancion(Cancion c){
        System.out.println();
        System.out.println("** REPRODUCIENDO **");
        System.out.println(c.getTitulo() + " de " + c.getAutor());
    }
}

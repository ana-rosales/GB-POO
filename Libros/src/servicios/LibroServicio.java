/**
 * Crear un método para cargar un libro pidiendo los datos al usuario y
 * luego informar mediante otro método el número de ISBN, el título, el autor del libro y el
 * numero de páginas.
 */
package servicios;

import java.util.Scanner;
import entidad.Libro;

/**
 *
 * @author Ana Paula
 */
public class LibroServicio {
    Scanner ent = new Scanner(System.in);
    
    public Libro cargarLibro(){
        Libro lib = new Libro();
        
        System.out.print("Introduzca el ISBN del libro: ");
        lib.setISBN(ent.nextInt());
        ent.nextLine();
        System.out.print("Introduzca el titulo del libro: ");
        lib.setTitulo(ent.nextLine());
        System.out.print("Introduzca el autor del libro: ");
        lib.setAutor(ent.nextLine());
        System.out.print("Introduzca el numero de paginas del libro: ");
        lib.setNoPag(ent.nextInt());
        
        return lib;
    }
    
    public void mostrarInfoLibro(Libro lib){
        System.out.println("Información del libro seleccionado:");
        System.out.println(lib.toString());
    }
}

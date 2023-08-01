/**
 * Programa Nespresso. Desarrolle una clase Cafetera con los atributos capacidadMaxima
 * (la cantidad máxima de café que puede contener la cafetera) y cantidadActual (la
 * cantidad actual de café que hay en la cafetera). Implemente, al menos, los siguientes
 * métodos:
 *  Constructor predeterminado o vacío
 *  Constructor con la capacidad máxima y la cantidad actual
 *  Métodos getters y setters.
 *  Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad
 * máxima.
 *  Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el
 * tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la
 * cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El
 * método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
 * cuanto quedó la taza.
 *  Método vaciarCafetera(): pone la cantidad de café actual en cero.
 *  Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo
 * recibe y se añade a la cafetera la cantidad de café indicada.
 */
package main;

import java.util.Scanner;
import servicios.CafeteraServicio;
import entidad.Cafetera;

/**
 *
 * @author Ana Paula
 */
public class Nespresso {

    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        
        CafeteraServicio cafeService = new CafeteraServicio();
        
        System.out.println("Ingresar cafetera:");
        Cafetera miNespresso = cafeService.nuevaCafetera();
        
        System.out.println();
        System.out.println("Cafetera hasta ahora: ");
        cafeService.estadoCafetera(miNespresso);
        
        System.out.println();
        System.out.println("Llenar la cafetera:");
        cafeService.llenarCafetera(miNespresso);
        
        System.out.println();
        System.out.println("Cafetera hasta ahora: ");
        cafeService.estadoCafetera(miNespresso);
        
        System.out.println();
        System.out.println("Servir taza:");
        System.out.print("Tamanio de la taza: ");
        cafeService.servirTaza(ent.nextDouble(), miNespresso);
        
        System.out.println();
        System.out.println("Cafetera hasta ahora: ");
        cafeService.estadoCafetera(miNespresso);
        
        System.out.println();
        System.out.println("Vaciar cafetera:");
        cafeService.vaciarCafetera(miNespresso);
        
        System.out.println();
        System.out.println("Cafetera hasta ahora: ");
        cafeService.estadoCafetera(miNespresso);
        
        System.out.println();
        System.out.println("Agregar cafe:");
        System.out.print("Cantidad a agregar: ");
        cafeService.agregarCafe(ent.nextDouble(), miNespresso);
    }
    
}

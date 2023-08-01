
package servicios;

import entidades.Ahorcado;
import java.util.Scanner;

/**
 *
 * @author Ana Paula
 */
public class ServicioAhorcado {
    Scanner ent = new Scanner(System.in);
    
    /**
     * Metodo crearJuego(): le pide la palabra al usuario y cantidad de jugadas
     * máxima. Con la palabra del usuario, pone la longitud de la palabra, como
     * la longitud del vector. Después ingresa la palabra en el vector, letra
     * por letra, quedando cada letra de la palabra en un índice del vector. Y
     * también, guarda en cantidad de jugadas máximas, el valor que ingresó el
     * usuario y encontradas en 0.
     */
    public Ahorcado crearJuego(){
        Ahorcado a = new Ahorcado();
        System.out.println("** NUEVO JUEGO **");
        System.out.println("Ingrese lo que se indica:");
        System.out.print("Palabra a adivinar: ");
        a.setPalabra(ent.nextLine());
        System.out.print("No. de jugadas máxima: ");
        a.setMaxJuegadas(ent.nextInt());
        a.setFaltantes(a.longitud());
        ent.nextLine();
        return a;
    }
    
    /**
     * Método juego(): el método juego se encargará de llamar todos los métodos
     * previamente mencionados e informará cuando el usuario descubra toda la
     * palabra o se quede sin intentos. Este método se llamará en el main.
     */
    public void juego(){
        System.out.println("\\\\*** AHORCADO ***//");
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("\t\tJUEGO NUEVO");
        System.out.println();
        System.out.println("\tPresione ENTER para continuar...");
        ent.nextLine();
        Ahorcado current = crearJuego();
        System.out.println();
        do {
            System.out.println("--------------------------");
            System.out.print("Ingrese una letra = ");
            if(current.encontradas(ent.nextLine())){
                System.out.println("Letra encontrada!");
            }else{
                System.out.println("Esa letra no esta :(");
            }
            current.intentos();
        } while (current.getMaxJuegadas()>0 && current.getFaltantes()>0);
        
        System.out.println();
        if(current.getFaltantes()==0){
            System.out.println("PALABRA ENCONTRADA!");
            System.out.println(current.getPalabra().toString());
        } else if(current.getMaxJuegadas() == 0) {
            System.out.println("INTENTOS AGOTADOS :(");
        }
    }
    
}

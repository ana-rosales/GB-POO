
package main;

import java.util.Scanner;
import servicios.ServicioAhorcado;

/**
 * Atributos, un vector con la palabra a buscar, la cantidad de letras
 * encontradas y la cantidad jugadas máximas que puede realizar el usuario.
 * 
 * @author Ana Paula
 */
public class JuegoAhorcado {

    public static void main(String[] args) {
        boolean salir;
        Scanner ent = new Scanner(System.in);
        ServicioAhorcado sa = new ServicioAhorcado();
        
        do {            
            sa.juego();
            System.out.println();
            System.out.print("Quiere salir? (S/N): ");
            salir = ent.nextLine().equalsIgnoreCase("S");
        } while(!salir);
        
    }
    
}

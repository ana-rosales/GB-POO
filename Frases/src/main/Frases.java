/**
 * En el main se creará el objeto y se le pedirá al usuario que ingrese
 * una frase que puede ser una palabra o varias palabras separadas por un espacio en
 * blanco y a través de los métodos set, se guardará la frase y la longitud de manera
 * automática según la longitud de la frase ingresada.
 */

package main;

import servicio.CadenaServicio;
import java.util.Scanner;
import entidad.Cadena;

/**
 *
 * @author Ana Paula
 */
public class Frases {
    Scanner ent = new Scanner(System.in);
    
    public static void main(String[] args) {
        System.out.println("-- FRASES --");
        CadenaServicio cadenaService = new CadenaServicio();
        
        Cadena frase = cadenaService.nuevaCadena();
        cadenaService.mostrarLongitud(frase);
        cadenaService.infoCadena(frase);
        cadenaService.encontrarCaracter(frase);
        cadenaService.compararCadenas(frase);
        cadenaService.unirCadenas(frase);
        cadenaService.reemplazarCaracter(frase);
    }
    
}

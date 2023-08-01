
package main;

import java.util.Scanner;

/**
 *
 * @author Ana Paula
 */
public class ServicioRaices {
    Scanner ent = new Scanner(System.in);
    public Raices ingresarFormula(){
        System.out.println();
        System.out.println("** INGRESANDO FORMULA **");
        System.out.println("Inserte la formula: ");
        System.out.print("a=");
        double a = ent.nextDouble();
        System.out.print("b=");
        double b = ent.nextDouble();
        System.out.print("c=");
        double c = ent.nextDouble();
        Raices r = new Raices(a, b, c);
        return r;
    }
    
    /**
     *  Método calcular(): esté método llamará tieneRaices() y a tieneRaíz(), y
     * mostrará por pantalla las posibles soluciones que tiene nuestra ecuación
     * con los métodos obtenerRaices() o obtenerRaiz(), según lo que devuelvan
     * nuestros métodos y en caso de no existir solución, se mostrará un
     * mensaje.
     * @param r
     */
    public void calcular(Raices r) {
        System.out.println("** MOSTRANDO SOLUCIONES **");
        System.out.println("Formula: " + r.formula() + ".");
        if (r.tieneRaices()) {
            r.obtenerRaices();
        } else if (r.tieneRaiz()) {
            r.obtenerRaiz();
        } else {
            System.out.println("No hay solución.");
        }
    }
    
   
}

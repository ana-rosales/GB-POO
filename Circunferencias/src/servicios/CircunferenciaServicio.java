/**
 * Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de
 * tipo real. A continuación, se deben crear los siguientes métodos:
 * c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo del
 * objeto.
 * d) Método area(): para calcular el área de la circunferencia (Area = π ∗ radio2).
 * e) Método perimetro(): para calcular el perímetro (Perimetro = 2 ∗ π ∗ radio).
 */
package servicios;

import entidad.Circunferencia;
import java.util.Scanner;

/**
 *
 * @author Ana Paula
 */
public class CircunferenciaServicio {
    Scanner ent = new Scanner(System.in);
    public Circunferencia crearCircunferencia(){
        System.out.println("Ingrese el radio de la circunferencia: ");
        Circunferencia circ = new Circunferencia(ent.nextDouble());
        
        return circ;
    }
    
    public double area(Circunferencia circ){
        double area = Math.PI * Math.pow(circ.getRadio(), 2);
        return area;        
    }
    
    public double perimetro(Circunferencia circ){
        double perimetro = 2 * Math.PI * circ.getRadio();
        return perimetro;
    }
}

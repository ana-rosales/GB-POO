/**
 * Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de
 * tipo real. A continuación, se deben crear los siguientes métodos:
 * a) Método constructor que inicialice el radio pasado como parámetro.
 * b) Métodos get y set para el atributo radio de la clase Circunferencia.
 * c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo del
 * objeto.
 * d) Método area(): para calcular el área de la circunferencia (Area = π ∗ radio2).
 * e) Método perimetro(): para calcular el perímetro (Perimetro = 2 ∗ π ∗ radio).
 */
package main;
import entidad.Circunferencia;
import servicios.CircunferenciaServicio;

/**
 *
 * @author Ana Paula
 */
public class Circunferencias {

    public static void main(String[] args) {
        CircunferenciaServicio circService = new CircunferenciaServicio();
        Circunferencia circulo = circService.crearCircunferencia();
        double area, perimetro;
        
        area = circService.area(circulo);
        perimetro = circService.perimetro(circulo);
        System.out.println("El area del circulo ingresado es: " + area);
        System.out.println("El perimetro del circulo ingresado es: " + perimetro);
    }
    
}

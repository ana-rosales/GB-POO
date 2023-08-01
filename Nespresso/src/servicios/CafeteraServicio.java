/**
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
package servicios;

import entidad.Cafetera;
import java.util.Scanner;
/**
 *
 * @author Jibda
 */
public class CafeteraServicio {

    Scanner ent = new Scanner(System.in);

    public Cafetera nuevaCafetera() {
        Cafetera cafe = new Cafetera();
        System.out.print("Indique la capadidad máxima de la cafetera (mililitros): ");
        cafe.setCapacidadMaxima(ent.nextDouble());
        cafe.setCantidadActual(0);
        return cafe;
    }
    
    public void llenarCafetera(Cafetera cafe){
        cafe.setCantidadActual(cafe.getCapacidadMaxima());
    }
    
    public void servirTaza(double taza, Cafetera cafe){
        double restante = cafe.getCantidadActual();
        if(restante < taza){
            System.out.println("No se llenó la taza.");
            System.out.println("La tasa se llenó " + restante + " mL.");
            cafe.setCantidadActual(0);
        } else {
            System.out.println("Se llenó la taza.");
            System.out.println("Total consumido " + taza + " mL.");
            cafe.setCantidadActual(restante - taza);
        }
    }
    
    public void vaciarCafetera(Cafetera cafe) {
        cafe.setCantidadActual(0);
    }
    
    public void agregarCafe(double cantidad, Cafetera cafe){
        double actual = cafe.getCantidadActual();
        double max = cafe.getCapacidadMaxima();
        if((actual + cantidad) > max){
            cafe.setCantidadActual(max);
        } else {
            cafe.setCantidadActual(actual + cantidad);
        }
    }
    
    public void estadoCafetera(Cafetera cafe){
        double actual = cafe.getCantidadActual();
        double max = cafe.getCapacidadMaxima();
        System.out.println("La cafetera tiene " + actual + "/" + max + " mL de café.");
    }
}

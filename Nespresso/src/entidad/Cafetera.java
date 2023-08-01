/**
 * Programa Nespresso. Desarrolle una clase Cafetera con los atributos capacidadMaxima
 * (la cantidad máxima de café que puede contener la cafetera) y cantidadActual (la
 * cantidad actual de café que hay en la cafetera). Implemente, al menos, los siguientes
 * métodos:
 *  Constructor predeterminado o vacío
 *  Constructor con la capacidad máxima y la cantidad actual
 *  Métodos getters y setters.
 */
package entidad;

/**
 *
 * @author Ana Paula
 */
public class Cafetera {
    private double capacidadMaxima;
    private double cantidadActual;

    public Cafetera(double capacidadMaxima, double cantidadActual) {
        this.capacidadMaxima = capacidadMaxima;
        this.cantidadActual = cantidadActual;
    }

    public Cafetera() {
    }

    public double getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(double capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public double getCantidadActual() {
        return cantidadActual;
    }

    public void setCantidadActual(double cantidadActual) {
        this.cantidadActual = cantidadActual;
    }
    
}

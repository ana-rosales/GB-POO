/**
 * Crear una clase Rectángulo que modele rectángulos por medio de un atributo privado
 * base y un atributo privado altura. Se deberán además definir los métodos getters,
 * setters y constructores correspondientes.
 */
package entidad;

/**
 *
 * @author Ana Paula
 */
public class Rectangulo {
    private double base;
    private double altura;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public Rectangulo() {
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
}

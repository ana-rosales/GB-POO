/**
 * Crear una clase Rectángulo que modele rectángulos por medio de un atributo privado
 * base y un atributo privado altura. La clase incluirá un método para crear el rectángulo
 * con los datos del Rectángulo dados por el usuario. También incluirá un método para
 * calcular la superficie del rectángulo y un método para calcular el perímetro del
 * rectángulo. Por último, tendremos un método que dibujará el rectángulo mediante
 * asteriscos usando la base y la altura. Se deberán además definir los métodos getters,
 * setters y constructores correspondientes.
 */
package main;

import servicios.RectanguloServicio;
import entidad.Rectangulo;
/**
 *
 * @author Ana Paula
 */
public class Rectangulos {

    public static void main(String[] args) {
        RectanguloServicio rectService = new RectanguloServicio();
        
        Rectangulo miRectangulo = rectService.crearRectangulo();
        double sup = rectService.superficie(miRectangulo);
        double per = rectService.perimetro(miRectangulo);
        System.out.println("Superficie del rectangulo: " + sup);
        System.out.println("Perímetro del rectangulo: " + per);
        System.out.println("Dibujo del rectángulo:");
        rectService.dibujarRectangulo(miRectangulo);
        
    }
    
}

/**
 * La clase incluirá un método para crear el rectángulo
 * con los datos del Rectángulo dados por el usuario. También incluirá un método para
 * calcular la superficie del rectángulo y un método para calcular el perímetro del
 * rectángulo. Por último, tendremos un método que dibujará el rectángulo mediante
 * asteriscos usando la base y la altura.
 */
package servicios;

import java.util.Scanner;
import entidad.Rectangulo;
/**
 *
 * @author Ana Paula
 */
public class RectanguloServicio {
    Scanner ent = new Scanner(System.in);
    
    public Rectangulo crearRectangulo(){
        Rectangulo rect = new Rectangulo();
        System.out.print("Ingrese la base del rectángulo: ");
        rect.setBase(ent.nextDouble());
        System.out.print("Ingrese la altura del rectángulo: ");
        rect.setAltura(ent.nextDouble());
        return rect;
    }
    
    public double superficie(Rectangulo rect){
        double sup = rect.getBase()*rect.getAltura();
        return sup;
    }

    public double perimetro(Rectangulo rect) {
        double per = (rect.getBase() + rect.getAltura()) * 2;
        return per;
    }
    
    public void dibujarRectangulo(Rectangulo rect){
        double base = rect.getBase();
        double altura = rect.getAltura();        
        for (int i = 0; i < base; i++) {
            for (int j = 0; j < altura; j++) {
                if(i == 0 || i == base-1 || j == 0 || j == altura-1){
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}

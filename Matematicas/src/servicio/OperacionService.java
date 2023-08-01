
package servicio;

import entidad.Operacion;
import java.util.Scanner;

/**
 * Funciones de funcionalidad xd para la entidad operación, toma en cuenta las
 * necesidades del main. En el main se creará el objeto y se usará el Math.random
 * para generar los dos números y se guardaran en el objeto con su respectivos set.
 * 
 * @author Ana Paula
 */
public class OperacionService {
    Scanner ent = new Scanner(System.in);
    
    public Operacion crearOperacion() {
        Operacion op = new Operacion();
        double num = Math.random() * 100;
        op.setNum1(num);
        num = Math.random() * 100;
        op.setNum2(num);
        return op;
    }
    
    public void infoOperacion(Operacion op){
        System.out.println();
        System.out.println("Número 1: " + op.getNum1());
        System.out.println("Número 2: " + op.getNum2());
        System.out.println("Mayor: " + op.devolverMayor());
        System.out.println("Menor: " + op.devolverMenor());
        System.out.println("Potencia del mayor: " + op.calcularPotencia());
        System.out.println("Raiz cuadrada del menor: " + op.calculaRaiz());
    }
}

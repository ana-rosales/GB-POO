
package servicio;

import entidad.Puntos;
import java.util.Scanner;

/**
 * Generar un objeto puntos usando un método crearPuntos() que le pide al
 * usuario los dos números y los ingresa en los atributos del objeto.
 * @author Ana Paula
 */
public class ServicioPuntos {
    Scanner ent = new Scanner(System.in);
    
    public Puntos crearPuntos(){
        Puntos p = new Puntos();
        
        System.out.println();
        System.out.println("** INGRESANDO PUNTOS **");
        System.out.println("Ingrese las coordenadas del primer punto (x,y):");
        p.setX1(ent.nextDouble());
        p.setY1(ent.nextDouble());
        System.out.println("Ingrese las coordenadas del segundo punto (x,y):");
        p.setX2(ent.nextDouble());
        p.setY2(ent.nextDouble());
        
        return p;
    }
    
    public void mostrarDistancia(Puntos p){
        System.out.println();
        System.out.println("** MOSTRANDO DISTANCIA **");
        mostrarPar(p);
        double distancia = p.distanciaPuntos();
        System.out.println("Distancia entre puntos: " + distancia);
    }
    
    public void mostrarPar(Puntos p){
        System.out.print("P1(" + p.getX1() + "," + p.getY1() + ") ");
        System.out.println("P2(" + p.getX2() + "," + p.getY2() + ")");
    }
}

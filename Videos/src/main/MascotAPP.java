
package main;

import entidades.Mascota;
import java.util.Scanner;
import servicios.ServicioMascota;

/**
 * problematica
 * objetos necesarios
 * logica necesaria
 *
 * Creación de entidades
 * Constructores
 * Encapsulación (Protección del código)
 * * SETTERS
 * * GETTERS
 * Espacio de memoria para cada objeto
 * TO STRING
 * SERVICE
 * Pso de parámetros
 * * por valor (copia)
 * * por referencia (original)
 * 
 * @author Ana Pau
 */
public class MascotAPP {

    public static void main(String[] args) {
        
        Scanner ent = new Scanner(System.in);
        ServicioMascota sm= new ServicioMascota();
        
        Mascota m1 = sm.crearMascota();
        
        
        System.out.println(m1.toString());
        
        m1 = null; //se elimina automáticamente
                   //elimina lo que ya no vuelve a usarse
//        Mascota m1 = new Mascota("Fernando Chiquito", "chikito", "Perro");
//        m1.setNombre("Pepe Chiquito");
//        m1.pasear(100, 2);
        
//        System.out.println(m1.apodo + " " + m1.edad + " " + m1.tipo + " " + m1.color);

//        m1.apodo = "Chiquito";
//        m1.nombre = ent.next();
//        m1.tipo = "Perro";
//        m1.edad = 14;
//        m1.raza = "Beagle";
//        m1.cola = true;
//        m1.color = "Tricolor";
        
//        
//        Mascota m3 = new Mascota();        
    }
    
    public static void modificador(int num, Mascota m){
        num =100;
        m.setApodo("Mascota Referencia");
    }
    
}

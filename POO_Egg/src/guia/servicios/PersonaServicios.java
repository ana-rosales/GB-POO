/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia.servicios;
import guia.entidad.Persona;
import java.util.Scanner;

/**
 *
 * @author Ana Paula
 */
public class PersonaServicios {
    Scanner ent = new Scanner(System.in);
    
    public Persona crearPersona(){
        Persona nuevaPersona = new Persona();
        
        System.out.print("Ingrese el nombre de la persona:");
        nuevaPersona.setNombre(ent.nextLine());
        System.out.print("Ingrese la edad de la persona: ");
        nuevaPersona.setEdad(ent.nextInt());
        System.out.print("La persona es finada? ");
        nuevaPersona.setEsFinado(ent.nextBoolean());
        
        return nuevaPersona;
    }
    
    public void mostrarPersona(Persona persona){
        System.out.println("Datos de la persona seleccionada:");
        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Edad: " + persona.getEdad());
        System.out.println("Es finado: " + persona.esFinado());
    }
}

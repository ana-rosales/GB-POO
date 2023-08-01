/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia.main;

import guia.entidad.Persona;
import guia.servicios.PersonaServicios;

/**
 *
 * @author Jibda
 */
public class POOMain {
    public static void main(String[] args) {
        Persona ana = new Persona();
        Persona maggy = new Persona("Maggiiii", 20, false);
        //Persona exp = new Persona; --> tiene que usarse constructor

        ana.setNombre("Ana");
        System.out.println(ana.getNombre());
        System.out.println(maggy.getEdad());
        
        PersonaServicios personaServicio = new PersonaServicios();
        Persona yahir = personaServicio.crearPersona();        
        personaServicio.mostrarPersona(yahir);
        
    }
}

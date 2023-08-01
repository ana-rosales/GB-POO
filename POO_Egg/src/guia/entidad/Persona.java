/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia.entidad;

/**
 *
 * @author Jibda
 */
public class Persona {
    public String nombre;
    public int edad;
    public boolean esFinado;
    
    public Persona() {
    }
    
    public Persona(String nombre, int edad, boolean esFinado) {
        this.nombre = nombre;
        this.edad = edad;
        this.esFinado = esFinado;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean esFinado() {
        return esFinado;
    }

    public void setEsFinado(boolean esFinado) {
        this.esFinado = esFinado;
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import entidad.Movil;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Jibda
 */
public class MovilService {
    Scanner ent = new Scanner(System.in).useDelimiter("\n");
    
    /**
     *  Método cargarCelular(): se solicita al usuario que ingrese los datos
     * necesarios para instanciar un objeto Celular y poder cargarlo en nuestro
     * programa.
     */
    public Movil cargarCelular(){
        Movil m = new Movil();
        
        System.out.println();
        System.out.println("**  CARGAR TELÉFONO **");
        System.out.println("Ingrese los siguientes datos:");
        System.out.print("Marca: ");
        String marca = ent.next();
        System.out.print("Precio: ");
        double precio = ent.nextDouble();
        System.out.print("Modelo: ");
        String modelo = ent.next();
        System.out.print("Memoria RAM: ");
        int RAM = ent.nextInt();
        System.out.print("Almacenamiento: ");
        int almacenamiento = ent.nextInt();
        System.out.print("Codigo (n n n n n n n): ");
        int[] codigo = m.ingresarCodigo();
        
        m = new Movil(marca, precio, modelo, RAM, almacenamiento, codigo);
        
        return m;
    }
    
    public void mostrarCelular(Movil m){
        System.out.println();
        System.out.println("** MOSTRANDO TELÉFONO **");
        System.out.println("Marca: " + m.getMarca());
        System.out.println("Precio: " + m.getPrecio());
        System.out.println("Modelo: " + m.getModelo());
        System.out.println("Memoria RAM: " + m.getMemoriaRAM());
        System.out.println("Almacenamiento: " + m.getAlmacenamiento());
        System.out.println("Código: " + Arrays.toString(m.getCodigo()));
    }

}

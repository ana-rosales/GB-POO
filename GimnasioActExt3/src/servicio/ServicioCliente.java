package servicio;

import entidad.Cliente;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Ana Pua
 */
public class ServicioCliente {
    private static final Scanner ent = new Scanner(System.in).useDelimiter("\n");

    /**
     * Metodo que crea un cliente.
     *
     * @return c
     */
    public static Cliente crearCliente() {
        Cliente c = new Cliente();

        System.out.println();
        System.out.println("** INGRESAR USUARIO **");
        System.out.print("Nombre: ");
        c.setNombre(ent.next());
        System.out.print("Edad: ");
        c.setEdad(ent.nextInt());
        System.out.print("Altura: ");
        c.setAltura(ent.nextDouble());
        System.out.print("Peso: ");
        c.setPeso(ent.nextDouble());
        System.out.print("Objetivo: ");
        c.setObjetivo(ent.next());

        return c;
    }

    /**
     * registrarCliente: lo registra en el sistema. 
     *
     * @param clientes
     *
     */
    public void ingresarCliente(ArrayList<Cliente> clientes) {
        Cliente c = crearCliente();
        clientes.add(c);
        int id = clientes.indexOf(c);
        clientes.get(id).setId(id + 1);
    }
    
    /**
     * obtenerClientes(): devuelve una lista con todos los clientes registrados
     * en el sistema.
     * 
     */
    public void obtenerClientes(ArrayList<Cliente> clientes){
        System.out.println();
        System.out.println("** LOS CLIENTES **");
        for (Cliente cliente : clientes) {
            System.out.println();
            System.out.println(cliente.getId() + "° CLIENTE." );            
            System.out.println("Nombre: " + cliente.getNombre());
            System.out.println("Edad: " + cliente.getEdad());
            System.out.println("Peso: " + cliente.getPeso());
            System.out.println("Altura: " + cliente.getAltura());
            System.out.println("Objetivo: " + cliente.getObjetivo());
        }
    }    
    
    /**
     * actualizarCliente(int id, String nombre, int edad, double altura, double
     * peso, String objetivo): recibe el identificador de un cliente existente y
     * los nuevos datos del cliente, y actualiza la información correspondiente
     * en el sistema.
     *
     */
    public boolean actualizarCliente(ArrayList<Cliente> clientes, int id) {
        boolean encontrado = false;
        for (int i = 0; i < clientes.size(); i++) {
            if (clientes.get(i).getId() == id) {
                Cliente c = crearCliente();
                clientes.set(i, c);
                clientes.get(i).setId(id);
                encontrado = true;
            }
        }
        return encontrado;
    }

    /**
     * eliminarCliente(int id): recibe el identificador de un cliente existente
     * y lo elimina del sistema
     */
    public void eliminarCliente(ArrayList<Cliente> clientes, int id) {
        clientes.removeIf(cliente->(cliente.getId() == id));
    }
}

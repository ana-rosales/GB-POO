package main;

import entidad.Cliente;
import entidad.Rutina;
import java.util.ArrayList;
import java.util.Scanner;
import servicio.ServicioCliente;
import servicio.ServicioRutina;

/**
 * - Crea al menos cinco clientes con datos ficticios. - Crea al menos cinco
 * rutinas con datos ficticios. - Registra los clientes creados en el sistema
 * utilizando el método correspondiente del servicio de clientes. - Agrega las
 * rutinas creadas al sistema utilizando el método correspondiente del servicio
 * de rutinas. - Obtén la lista de todos los clientes registrados y muéstralos
 * por pantalla. - Obtén la lista de todas las rutinas registradas y muéstralas
 * por pantalla. - Realiza una actualización en uno de los clientes existentes y
 * muestra la lista de clientes actualizada. - Realiza una actualización en una
 * de las rutinas existentes y muestra la lista de rutinas actualizada. -
 * Elimina uno de los clientes existentes y muestra la lista de clientes final.
 * - Elimina una de las rutinas existentes y muestra la lista de rutinas final.
 *
 * @author Ana Pau
 */
public class GimnasioActExt3 {

    private static Scanner ent = new Scanner(System.in).useDelimiter("\n");
    private static ServicioCliente sc = new ServicioCliente();
    private static ServicioRutina sr = new ServicioRutina();
    private static ArrayList<Cliente> clientes = new ArrayList<>();
    private static ArrayList<Rutina> rutinas = new ArrayList<>();
    private static Cliente c = null;
    private static Rutina r = null;

    public static void main(String[] args) {
        System.out.println("**\\_ SMART FIT _/**");
        boolean encontrado, salir;
        String salirChar;
        int opc;
        int id;

        do {
            salir = false;
            System.out.println();
            System.out.println("Elija una opción:");
            System.out.println("1. Registro de usuario.");
            System.out.println("2. Registro de rutina.");
            System.out.println("3. Todos los clientes.");
            System.out.println("4. Todas las rutinas.");
            System.out.println("5. Actualizar usuario.");
            System.out.println("6. Actualizar rutina.");
            System.out.println("7. Eliminar usuario.");
            System.out.println("8. Eliminar rutina.");
            System.out.println("9. SALIR.");
            opc = ent.nextInt();
            ent.nextLine();
            System.out.println();
            switch (opc) {
                case 1:
                    sc.ingresarCliente(clientes);
                    System.out.println("Cliente creado!");
                    break;
                case 2:
                    sr.ingresarRutina(rutinas);
                    System.out.println("Rutina creada!");
                    break;
                case 3:
                    if (!(clientes.isEmpty())) {
                        sc.obtenerClientes(clientes);
                    } else {
                        System.out.println("No se ha creado ningun cliente.");
                    }
                    break;
                case 4:
                    if (!(rutinas.isEmpty())) {
                        sr.obtenerRutinas(rutinas);
                    } else {
                        System.out.println("No se ha creado ninguna rutina.");
                    }
                    break;
                case 5:
                    System.out.println("** ELIJA UN CLIENTE **");
                    id = elegir();
                    encontrado = sc.actualizarCliente(clientes, id);
                    if (encontrado) {
                        System.out.println("Cliente actualizado.");
                    } else {
                        System.out.println("El cliente indicado no existía.");
                    }
                    break;
                case 6:
                    System.out.println("** ELIJA UNA RUTINA **");
                    id = elegir();
                    encontrado = sr.actualizarRutina(rutinas, id);
                    if(encontrado){
                        System.out.println("Rutina actualizado.");
                    } else {
                        System.out.println("El cliente indicado no existía.");
                    }
                    break;
                case 7:
                    System.out.println("** ELIJA UN CLIENTE **");
                    id = elegir();
                    sc.eliminarCliente(clientes, id);
                    System.out.println("Eliminación completada");
                    break;
                case 8:
                    System.out.println("** ELIJA UNA RUTINA **");
                    id = elegir();
                    sr.eliminarRutina(rutinas, id);
                    System.out.println("Eliminación completada");
                    break;
                case 9:
                    System.out.println("** HASTA PRONTO!! **");
                    salir = true;
                default:
                    System.out.println("Ingrese una opción válida");
            }
            System.out.println();
        } while (salir == false);
    }

    public static int elegir() {
        System.out.print("Id: ");
        int id = ent.nextInt();
        ent.nextLine();
        return id;
    }

}

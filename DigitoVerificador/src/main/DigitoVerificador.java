
package main;

import entidad.NIF;
import java.util.Arrays;
import java.util.Scanner;
import servicio.ServicioNIF;

/**
 *
 * @author Ana Paula
 */
public class DigitoVerificador {

    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        System.out.println("** DEPARTAMENTO FISCAL **");
        ServicioNIF sNIF = new ServicioNIF();
        NIF[] personas = null;
        NIF dni = null;
        char salir;
        int opc;

        do {
            salir = 'N';
            System.out.println();
            System.out.println("Elija una opción:");
            System.out.println("1. Agregar DNI.");
            System.out.println("2. Todos los DNI.");
            opc = ent.nextInt();
            ent.nextLine();
            System.out.println();
            switch (opc) {
                case 1:
                    dni = sNIF.crearNif();
                    if (personas == null) {
                        personas = new NIF[1];
                        personas[0] = dni;
                    } else {
                        //REDIMENCIONANDO ARREGLO
                        int l = personas.length;
                        NIF[] temp = personas;
                        personas = null;
                        personas = new NIF[l + 1];
                        System.arraycopy(temp, 0, personas, 0, temp.length);
                        personas[personas.length - 1] = dni;
                        System.out.println(Arrays.toString(personas));
                    }
                    System.out.println("DNI agregado.");
                    break;
                case 2:
                    if (!(personas == null)) {
                        todosDNI(personas, personas.length);
                    } else {
                        System.out.println("No se ha agregado ningun DNI.");
                    }
                    break;
                default:
                    System.out.println("Ingrese una opción válida");
            }
            System.out.println();
            System.out.print("Desea salir? s/n:");
            salir = ent.nextLine().toUpperCase().charAt(0);
        } while (salir == 'N');
    }

    public static void todosDNI(NIF[] personas, int n) {
        System.out.println();
        System.out.println("** DNI INGRESADOS **");
        for (int i = 0; i < personas.length; i++) {
            System.out.println((i + 1) + ". " + personas[i].NIFCompleto() + ".");
        }
    }
    
}

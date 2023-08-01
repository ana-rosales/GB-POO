package matematicas;

import java.util.Scanner;
import entidad.Operacion;
import servicio.OperacionService;

/**
 * En el main se creará el objeto y se usará el Math.random para generar los dos
 * números y se guardaran en el objeto con su respectivos set.
 *
 * @author Ana Paula
 */
public class Matematicas {

    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        OperacionService ops = new OperacionService();
        char salir = 'N';
        Operacion op = null;
        int opc;

        do {
            System.out.println("** MATEMATICA **");
            System.out.println("1. Crear operacion nueva.");
            System.out.println("2. Mostrar informacion de operacion.");
            System.out.println("3. Eliminar operacion.");
            opc = ent.nextInt();
            switch (opc) {
                case 1:
                    op = ops.crearOperacion();
                    System.out.println("Operacion creada exitosamente!");
                    break;
                case 2:
                    if (op != null) {
                        ops.infoOperacion(op);
                    } else {
                        System.out.println("Operacion no creada.");
                    }
                    break;
                case 3:
                    if (op != null) {
                        op = null;
                    } else {
                        System.out.println("Operacion no creada.");
                    }
                    break;
                default:
                    System.out.println("Seleccione una opción correcta.");
            }
            System.out.println();
            System.out.println("Quiere salir del programa? S/N");
            ent.nextLine();
            salir = ent.nextLine().toUpperCase().charAt(0);
        } while (salir == 'N');

    }

}

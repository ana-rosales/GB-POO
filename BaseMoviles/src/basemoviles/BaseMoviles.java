
package basemoviles;

import entidad.Movil;
import java.util.Arrays;
import java.util.Scanner;
import servicio.MovilService;

/**
 *
 * @author Ana Pau
 */
public class BaseMoviles {

    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        System.out.println("** CURSOS **");
        MovilService ms = new MovilService();
        Movil[] inventario = null;
        Movil m = null;
        char salir;
        int opc;

        do {
            salir = 'N';
            System.out.println();
            System.out.println("Elija una opción:");
            System.out.println("1. Cargar movil.");
            System.out.println("2. Información de movil.");
            opc = ent.nextInt();
            ent.nextLine();
            System.out.println();
            switch (opc) {
                case 1:
                    m = ms.cargarCelular();
                    if(inventario == null){
                        inventario = new Movil[1];
                        inventario[0] = m;
                    } else {
                        //REDIMENCIONANDO ARREGLO
                        int l = inventario.length;
                        Movil[] temp = inventario;
                        inventario = null;
                        inventario = new Movil[l+1];
                        System.arraycopy(temp, 0, inventario, 0, temp.length);
                        inventario[inventario.length-1] = m;
                        System.out.println(Arrays.toString(inventario));
                    }
                    System.out.println("Movil cargado.");
                    break;
                case 2:
                    if (!(inventario == null)) {
                        m = seleccionarMovil(inventario, ent);
                        ms.mostrarCelular(m);
                    } else {
                        System.out.println("No se ha creado ningun movil.");
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
    
    public static void infoMovil(Movil[] inventario, int n) {
        System.out.println();
        System.out.println("MOSTRANDO LOS CURSOS:");
        for (int i = 0; i < inventario.length; i++) {
            System.out.println((i + 1) + ". " + inventario[i].getMarca() + " " + inventario[i].getModelo() + " " + Arrays.toString(inventario[i].getCodigo()) + ".");
        }
    }

    public static Movil seleccionarMovil(Movil[] inventario, Scanner ent) {
        infoMovil(inventario, inventario.length);
        System.out.println("Seleccione alguno:");
        int i = ent.nextInt();
        ent.nextLine();
        return inventario[i - 1];
    }
    
}

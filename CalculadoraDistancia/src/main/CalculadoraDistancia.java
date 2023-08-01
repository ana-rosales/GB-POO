
package main;

import java.util.Arrays;
import java.util.Scanner;
import servicio.ServicioPuntos;
import entidad.Puntos;

/**
 *
 * @author Ana Pau
 */
public class CalculadoraDistancia {

    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        System.out.println("**-- DISTANCIA ENTRE PUNTOS --**");
        ServicioPuntos sp = new ServicioPuntos();
        Puntos[] puntos = null;
        Puntos p = null;
        char salir;
        int opc;

        do {
            salir = 'N';
            System.out.println();
            System.out.println("Elija una opción:");
            System.out.println("1. Agregar puntos.");
            System.out.println("2. Puntos guardados.");
            System.out.println("3. Calcular distancia.");
            opc = ent.nextInt();
            ent.nextLine();
            System.out.println();
            switch (opc) {
                case 1:
                    p = sp.crearPuntos();
                    if (puntos == null) {
                        puntos = new Puntos[1];
                        puntos[0] = p;
                    } else {
                        //REDIMENCIONANDO ARREGLO
                        int l = puntos.length;
                        Puntos[] temp = puntos;
                        puntos = null;
                        puntos = new Puntos[l + 1];
                        System.arraycopy(temp, 0, puntos, 0, temp.length);
                        puntos[puntos.length - 1] = p;
                        System.out.println(Arrays.toString(puntos));
                    }
                    System.out.println("Par de puntos agregados.");
                    break;
                case 2:
                    if (!(puntos == null)) {
                        listaPuntos(puntos,sp, puntos.length);
                    } else {
                        System.out.println("No se ha agregado ningun par de puntos.");
                    }
                    break;
                case 3:
                    if (!(puntos == null)) {
                        p = seleccionarPar(puntos,sp,ent);
                        sp.mostrarDistancia(p);
                    } else {
                        System.out.println("No se ha agregado ningun par de puntos.");
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
    
    public static void listaPuntos(Puntos[] puntos, ServicioPuntos sp, int n) {
        System.out.println();
        System.out.println("** LISTA DE PUNTOS **");
        for (int i = 0; i < puntos.length; i++) {
            sp.mostrarPar(puntos[i]);
        }
    }

    public static Puntos seleccionarPar(Puntos[] puntos, ServicioPuntos sp, Scanner ent) {
        listaPuntos(puntos,sp,puntos.length);
        System.out.println("Elegir par:");
        int i = ent.nextInt();
        ent.nextLine();
        return puntos[i - 1];
    }
    
}

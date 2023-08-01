package main;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Ana Paula
 */
public class FormulaCuadratica {

    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        System.out.println("** FORMULAS CUADRATICA **");
        ServicioRaices sr = new ServicioRaices();
        Raices[] raices = null;
        Raices r = null;
        char salir;
        int opc;

        do {
            salir = 'N';
            System.out.println();
            System.out.println("Elija una opción:");
            System.out.println("1. Agregar formula.");
            System.out.println("2. Todas las formulas.");
            System.out.println("3. Calcular raices.");
            opc = ent.nextInt();
            ent.nextLine();
            System.out.println();
            switch (opc) {
                case 1:
                    r = sr.ingresarFormula();
                    if (raices == null) {
                        raices = new Raices[1];
                        raices[0] = r;
                    } else {
                        //REDIMENCIONANDO ARREGLO
                        int l = raices.length;
                        Raices[] temp = raices;
                        raices = null;
                        raices = new Raices[l + 1];
                        System.arraycopy(temp, 0, raices, 0, temp.length);
                        raices[raices.length - 1] = r;
                        System.out.println(Arrays.toString(raices));
                    }
                    System.out.println("Formula agregada.");
                    break;
                case 2:
                    if (!(raices == null)) {
                        todasFormulas(raices, raices.length);
                    } else {
                        System.out.println("No se ha agregado ninguna formula.");
                    }
                    break;
                case 3:
                    if (!(raices == null)) {
                        r = seleccionarFormula(raices, ent);
                        sr.calcular(r);
                    } else {
                        System.out.println("No se ha agregado ninguna formula.");
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

    public static void todasFormulas(Raices[] raices, int n) {
        System.out.println();
        System.out.println("** FORMULAS INGRESADAS **");
        for (int i = 0; i < raices.length; i++) {
            System.out.println((i + 1) + ". " + raices[i].formula() + ".");
        }
    }

    public static Raices seleccionarFormula(Raices[] raices, Scanner ent) {
        todasFormulas(raices, raices.length);
        System.out.println("Elegir formula:");
        int i = ent.nextInt();
        ent.nextLine();
        return raices[i - 1];
    }
}

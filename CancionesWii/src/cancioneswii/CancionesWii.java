
package cancioneswii;

import entidad.Cancion;
import java.util.Arrays;
import java.util.Scanner;
import servicio.ServicioCancion;

/**
 * Desarrollar una clase Cancion con los siguientes atributos: titulo y autor.
 * Se deberá́ definir además dos constructores: uno vacío que inicializa el
 * titulo y el autor a cadenas vacías y otro que reciba como parámetros el
 * titulo y el autor de la canción. Se deberán además definir los métodos
 * getters y setters correspondientes.
 * 
 * @author Ana Paula
 */
public class CancionesWii {

    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        System.out.println("** PLAY LIST **");
        ServicioCancion sc = new ServicioCancion();
        Cancion[] playlist = null;
        Cancion c = null;
        char salir;
        int opc;

        do {
            salir = 'N';
            System.out.println();
            System.out.println("Elija una opción:");
            System.out.println("1. Agregar cancion.");
            System.out.println("2. Lista de reproduccion.");
            System.out.println("3. Reproducir canción.");
            opc = ent.nextInt();
            ent.nextLine();
            System.out.println();
            switch (opc) {
                case 1:
                    c = sc.agregarCancion();
                    if (playlist == null) {
                        playlist = new Cancion[1];
                        playlist[0] = c;
                    } else {
                        //REDIMENCIONANDO ARREGLO
                        int l = playlist.length;
                        Cancion[] temp = playlist;
                        playlist = null;
                        playlist = new Cancion[l + 1];
                        System.arraycopy(temp, 0, playlist, 0, temp.length);
                        playlist[playlist.length - 1] = c;
                        System.out.println(Arrays.toString(playlist));
                    }
                    System.out.println("Cancion agregada.");
                    break;
                case 2:
                    if (!(playlist == null)) {
                        queue(playlist, playlist.length);
                    } else {
                        System.out.println("No se ha agregado ninguna cancion.");
                    }
                    break;
                case 3:
                    if (!(playlist == null)) {
                        c = seleccionarCancion(playlist, ent);
                        sc.reproducirCancion(c);
                    } else {
                        System.out.println("No se ha agregado ninguna cancion.");
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
    
    public static void queue(Cancion[] playlist, int n) {
        System.out.println();
        System.out.println("** PLAY LIST **");
        for (int i = 0; i < playlist.length; i++) {
            System.out.println((i + 1) + ". " + playlist[i].getTitulo() + ", " + playlist[i].getAutor() + ".");
        }
    }

    public static Cancion seleccionarCancion(Cancion[] playlist, Scanner ent) {
        queue(playlist, playlist.length);
        System.out.println("Elegir cancion:");
        int i = ent.nextInt();
        ent.nextLine();
        return playlist[i - 1];
    }
    
}

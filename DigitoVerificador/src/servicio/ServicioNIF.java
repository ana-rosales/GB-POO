
package servicio;

import entidad.NIF;
import java.util.Scanner;

/**
 *
 * @author Ana Paula
 */
public class ServicioNIF {
    Scanner ent = new Scanner(System.in);
    
    /**
     *  Método crearNif(): le pide al usuario el DNI y con ese DNI calcula la
     * letra que le corresponderá. Una vez calculado, le asigna la letra que le
     * corresponde según el resultado del calculo.     *
     */
    public NIF crearNif() {
        NIF dni = new NIF();
        System.out.println();
        System.out.println("** CREACION DE DNI **");
        System.out.print("Ingrese su DNI: ");
        dni.setDNI(ent.nextLong());
        dni.setLetra(dni.digitoVerificador());
        System.out.println("Tu NIF es: " + dni.NIFCompleto());
        return dni;
    }
    
}

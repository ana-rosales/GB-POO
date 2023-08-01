
package arreglos;
import libana.MisFunciones;
import java.util.Arrays;

/**
 * Realizar un programa en Java donde se creen dos arreglos: el primero será un
 * arreglo A de 50 números reales, y el segundo B, un arreglo de 20 números,
 * también reales. El programa deberá inicializar el arreglo A con números
 * aleatorios y mostrarlo por pantalla. Luego, el arreglo A se debe ordenar de
 * menor a mayor y copiar los primeros 10 números ordenados al arreglo B de 20
 * elementos, y rellenar los 10 últimos elementos con el valor 0.5. Mostrar los
 * dos arreglos resultantes: el ordenado de 50 elementos y el combinado de 20.
 * 
 * @author Jibda
 */
public class Arreglos {

    public static void main(String[] args) {
        double[] A = new double[50];
        double[] B = new double[20];
        
        for (int i = 0; i < 50; i++) {
            Arrays.fill(A,i,i+1, Math.random() * 100);
        }
        
        System.out.println("Arreglo A:");
        System.out.println(Arrays.toString(A));
        
        System.out.println();
        System.out.println("Ordenar A:");
        Arrays.sort(A);
        System.out.println(Arrays.toString(A));
        
        System.out.println();
        System.out.println("Llenando B:");
        for (int i = 0; i < 20; i++) {
            if(i<10){
                Arrays.fill(B, i, i + 1, A[i]);
            } else {
                Arrays.fill(B,i,i+1, 0.5);
            }
        }
        System.out.println(Arrays.toString(B));
        
    }
    
}

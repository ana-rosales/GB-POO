/**
 * A continuación, en la clase main hacer lo siguiente:
 * Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos
 * los métodos para cada objeto, deberá comprobar si la persona está en su peso ideal,
 * tiene sobrepeso o está por debajo de su peso ideal e indicar para cada objeto si la
 * persona es mayor de edad.
 * Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad en
 * distintas variables, para después en el main, calcular un porcentaje de esas 4 personas
 * cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos, por encima, y
 * también calcularemos un porcentaje de cuantos son mayores de edad y cuantos menores
 */
package main;

import java.util.Scanner;
import servicios.PersonaServicio;
import entidad.Persona;
import java.util.Date;

/**
 *
 * @author Ana Paula
 */
public class Personas {

    public static void main(String[] args) {
        PersonaServicio persService = new PersonaServicio();
        Scanner ent = new Scanner(System.in);
        int n, bajos, normales, altos, mayores, menores;
        bajos = normales = altos = mayores = menores = 0;

        do {
            System.out.print("Cantidad de personas a ingresar: ");
            n = ent.nextInt();
        } while (n <= 0);
        ent.nextLine();

        Persona[] personas = new Persona[n];

        System.out.println();
        System.out.println("Ingrese a las personas:");
        for (int i = 0; i < n; i++) {
            personas[i] = persService.crearPersona();
            int IMC = personas[i].calcularIMC();
            boolean mayor = personas[i].esMayorDeEdad();
            if (IMC < 0) {
                System.out.println("Baja de peso.");
                bajos++;
            } else if (IMC == 0) {
                System.out.println("Con peso normal.");
                normales++;
            } else {
                System.out.println("Con sobrepeso.");
                altos++;
            }
            if (mayor) {
                System.out.println("Mayor de edad.");
                mayores++;
            } else {
                System.out.println("Menor de edad.");
                menores++;
            }
        }
        
        System.out.println();
        System.out.println("Presione cualquier tecla para continuar");
        ent.nextLine();

        double porcentajeBajos = (bajos * 100) / n;
        double porcentajeNormales = (normales * 100) / n;
        double porcentajeAltos = (altos * 100) / n;
        double porcentajeMayores = (mayores * 100) / n;
        double pordentajeMenores = (menores * 100) / n;

        System.out.println();
        System.out.println("INFORMACIÓN DE PESOS DE PERSONAS.");
        System.out.println("El total de personas fue: " + n);
        System.out.println("Bajos de peso: " + porcentajeBajos + "%.");
        System.out.println("Pesos normales: " + porcentajeNormales + "%.");
        System.out.println("Sobrepesos: " + porcentajeAltos + "%.");
        System.out.println("Mayores de edad: " + porcentajeMayores + "%.");
        System.out.println("Menores de edad: " + pordentajeMenores + "%.");
        System.out.println();
        System.out.println("Presione cualquier tecla para continuar");
        ent.nextLine();

        Persona menor = personas[0];
        for (int i = 0; i < n; i++) {
            System.out.println();
            System.out.println("INFORMACIÓN DE PERSONA UNO.");
            persService.mostrarPersona(personas[i]);
            if(personas[i].menorQue(menor)){
                menor = personas[i];
            }
            System.out.println("Presione cualquier tecla para continuar");
            ent.nextLine();
        }
        
        System.out.println("LA PERSONA MAS CHIQUITA ES: " + menor.getNombre() + " con " + menor.getEdad() + " anios de edad.");

    }

}

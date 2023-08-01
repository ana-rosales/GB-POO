
package servicios;

import entidad.Persona;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Ana Paula
 */
public class PersonaServicio {

    Scanner ent = new Scanner(System.in);

    /**
     * Metodo crearPersona(): el método crear persona, le pide los valores
     * de los atributos al usuario y después se le asignan a sus respectivos
     * atributos para llenar el objeto Persona. Además, comprueba que el sexo
     * introducido sea correcto, es decir, H, M o O. Si no es correcto se deberá
     * mostrar un mensaje
     * @return p
     */
    public Persona crearPersona() {
        System.out.println();
        System.out.println("Ingrese los datos de la persona: ");
        System.out.print("Nombre: ");
        String nombre = ent.nextLine();
        Date fecha = ingresarFecha();
        char sexo;
        do {
            System.out.print("Sexo (H, M, O): ");
            sexo = ent.nextLine().charAt(0);
        } while (!(sexo == 'H' || sexo == 'M' || sexo == 'O'));
        System.out.print("Peso (kg): ");
        double peso = ent.nextDouble();
        System.out.print("Altura (m): ");
        float altura = ent.nextFloat();
        ent.nextLine();
        
        Persona p = new Persona(nombre, fecha, sexo, peso, altura);
        return p;
    }
    
    /**
     * Metodo mostrarPersona(): este método muestra la persona creada en el
     * método anterior.
     * @return 
     */
    public void mostrarPersona(Persona p){
        System.out.println();
        System.out.println("INFORMACIÓN DE LA PERSONA.");
        System.out.println("Nombre: " + p.getNombre());
        System.out.println("Fecha de nacimiento: " + p.getFechaNac());
        System.out.println("Sexo: " + p.getSexo());
        System.out.println("Peso: " + p.getPeso());
        System.out.println("Altura: " + p.getAltura());
    }
    
    
    
    
    public Date ingresarFecha(){
        Date fechaUsu;
        int dia, mes, anio;
        String[] fecha;
        boolean invalida;

        dia = mes = anio = 0;
        do {
            invalida = false;
            System.out.print("Fecha de nacimiento (dd/mm/aaaa): ");
            fecha = ent.nextLine().split("/");

            //validar que sí sea una fecha
            if (fecha.length != 3) {
                invalida = true;
                System.out.println("Fecha inváilda.");
            } else {
                dia = Integer.parseInt(fecha[0]);
                mes = Integer.parseInt(fecha[1]);
                anio = Integer.parseInt(fecha[2]);
                //validar día mes menor a 12
                if (mes < 1 || mes > 12) {
                    invalida = true;
                    System.out.println("Mes inválido.");
                } //validar dia menor a 30,31 o 28
                else if (tiene31dias(mes)) {
                    if (dia < 1 || dia > 31) {
                        invalida = true;
                        System.out.println("Dia inválido.");
                    }
                } else if (mes == 2) {
                    if (dia < 1 || dia > 28) {
                        invalida = true;
                        System.out.println("Dia inválido.");
                    }
                } else {
                    if (dia < 1 || dia > 30) {
                        invalida = true;
                        System.out.println("Dia inválido.");
                    }
                }
            }
        } while (invalida == true);
        
        anio -= 1900;
        mes -= 1;

        fechaUsu = new Date(anio, mes, dia);
        return fechaUsu;
    }
    
    public static boolean tiene31dias(int mes) {
        boolean tiene31dias;
        if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
            tiene31dias = true;
        } else {
            tiene31dias = false;
        }
        return tiene31dias;
    }
}


package main;

import entidad.Curso;
import java.util.Arrays;
import servicio.CursoService;
import java.util.Scanner;

/**
 * Un profesor particular está dando cursos para grupos de cinco alumnos y
 * necesita un programa para organizar la información de cada curso.
 * 
 * APRENDI
 * REDIMENSIONAR UN ARREGLO
 * 
 * @author Ana Paula
 */
public class Cursos {

    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        System.out.println("** CURSOS **");
        CursoService cs = new CursoService();
        Curso[] cursos = null;
        Curso c = null;
        char salir;
        int opc;
        
        do {       
            salir = 'N';
            System.out.println();
            System.out.println("Elija una opción:");
            System.out.println("1. Crear un curso.");
            System.out.println("2. Mostrar curso.");
            System.out.println("3. Ganancia semanal de curso.");
            System.out.println("4. Mostrar cursos disponibles.");
            opc = ent.nextInt();
            ent.nextLine();
            System.out.println();
            switch(opc){
                case 1:
                    c = Curso.crearCurso(ent);
                    if(cursos == null){
                        cursos = new Curso[1];
                        cursos[0] = c;
                    } else {
                        //REDIMENCIONANDO ARREGLO
                        int l = cursos.length;
                        Curso[] temp = cursos;
                        cursos = null;
                        cursos = new Curso[l+1];
                        System.arraycopy(temp, 0, cursos, 0, temp.length);
                        cursos[cursos.length-1] = c;
                        System.out.println(Arrays.toString(cursos));
                    }
                    System.out.println("Curso creado");
                    break;
                case 2:
                    if(!(cursos == null)){
                        c = seleccionarCurso(cursos, ent);
                        cs.mostrarCurso(c);
                    } else {
                        System.out.println("No se ha creado ningun curso.");
                    }
                    break;
                case 3:
                    if(!(cursos == null)){
                        c = seleccionarCurso(cursos, ent);
                        cs.mostrarGanancia(c);
                    }else {
                        System.out.println("No se ha creado ningun curso.");
                    }
                    break;
                case 4:
                    if(!(cursos == null)){
                        mostrarCursos(cursos, cursos.length);
                    }else {
                        System.out.println("No se ha creado ningun curso.");
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
    
    public static void mostrarCursos(Curso[] cursos, int n){
        System.out.println();
        System.out.println("MOSTRANDO LOS CURSOS:");
        for (int i = 0; i < cursos.length; i++) {
            System.out.println((i+1) + ". " + cursos[i].getNombreCurso() + ".");
        }
    }
    
    public static Curso seleccionarCurso(Curso[] cursos, Scanner ent){
        mostrarCursos(cursos, cursos.length);
        System.out.println("Seleccione alguno:");
        int i = ent.nextInt();
        ent.nextLine();
        return cursos[i-1];
    }
    
}

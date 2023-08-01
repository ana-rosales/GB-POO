package servicio;

import entidad.Curso;
import java.util.Arrays;

/**
 *
 * @author Ana Pau
 */
public class CursoService {

    public void mostrarCurso(Curso c) {
        System.out.println();
        System.out.println("MOSTRAR CURSO.");
        System.out.println("Nombre: " + c.getNombreCurso());
        System.out.println("Horas al dia: " + c.getHorasXDia());
        System.out.println("Dias a la semana: " + c.getDiasXSemana());
        System.out.println("Turno: " + c.getTurno());
        System.out.println("Precio por hora: $" + c.getPrecioXHora());
        System.out.println("Nombre de los alumnos: " + Arrays.deepToString(c.getAlumnos()));
    }

    public void mostrarGanancia(Curso c) {
        double ganancia = c.calcularGananciaSemamal();
        System.out.println("La ganancia semanal es: $" + ganancia);
    }
}

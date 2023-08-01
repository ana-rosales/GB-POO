
package entidad;

import java.util.Scanner;

/**
 * Crearemos una clase entidad llamada Curso, cuyos atributos serán:
 * nombreCurso, cantidadHorasPorDia, cantidadDiasPorSemana, turno (mañana o
 * tarde), precioPorHora y alumnos. Donde alumnos es un arreglo de tipo String
 * de dimensión 5 (cinco), donde se alojarán los nombres de cada alumno.
 * @author Jibda
 */
public class Curso {
    private String nombreCurso;
    private int horasXDia;
    private int diasXSemana;
    private String turno;
    private double precioXHora;
    private String[] alumnos;

    public Curso(String nombreCurso, int horasXDia, int diasXSemana, String turno, double precioXHora, String[] alumnos) {
        this.nombreCurso = nombreCurso;
        this.horasXDia = horasXDia;
        this.diasXSemana = diasXSemana;
        this.turno = turno;
        this.precioXHora = precioXHora;
        this.alumnos = alumnos;
    }

    public Curso() {
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public int getHorasXDia() {
        return horasXDia;
    }

    public void setHorasXDia(int horasXDia) {
        this.horasXDia = horasXDia;
    }

    public int getDiasXSemana() {
        return diasXSemana;
    }

    public void setDiasXSemana(int diasXSemana) {
        this.diasXSemana = diasXSemana;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public double getPrecioXHora() {
        return precioXHora;
    }

    public void setPrecioXHora(double precioXHora) {
        this.precioXHora = precioXHora;
    }

    public String[] getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(String[] alumnos) {
        this.alumnos = alumnos;
    }
    
    /**
     * A continuación, se implementarán los siguientes métodos:
     */
    
    /**
     *  método cargarAlumnos():
     * este método le permitirá al usuario ingresar los alumnos que asisten a
     * las clases. Nosotros nos encargaremos de almacenar esta información en un
     * arreglo e iterar con un bucle, solicitando en cada repetición que se
     * ingrese el nombre de cada alumno.
     */
    public static String[] cargarAlumnos(Scanner ent, int noAl){
        String[] alumnos = new String[noAl];
        for (int i = 0; i < noAl; i++) {
            System.out.print("Ingrese el nombre del " + (i+1) + "° alumno:");
            alumnos[i] = ent.nextLine();
        }
        return alumnos;
    }
    
    /**
     *  Método crearCurso(): el método crear
     * curso, le pide los valores de los atributos al usuario y después se le
     * asignan a sus respectivos atributos para llenar el objeto Curso. En este
     * método invocaremos al método cargarAlumnos() para asignarle valor al
     * atributo alumnos
     */
    public static Curso crearCurso(Scanner ent){
        System.out.println();
        System.out.println("CREACION DE NUEVO CURSO.");
        System.out.print("Nombre del curso: ");
        String nombreCurso = ent.nextLine();
        System.out.print("Horas al dia: ");
        int horasXDia = ent.nextInt();
        System.out.print("Dias a la semana: ");
        int diasXSemana = ent.nextInt();
        ent.nextLine();
        System.out.print("Turno: ");
        String turno = ent.nextLine();
        System.out.print("Precio por hora: ");
        double precioXHora = ent.nextDouble();
        System.out.print("Cantidad de alumnos: ");
        int noAl = ent.nextInt();
        ent.nextLine();
        System.out.println("Nombre de los alumnos: ");
        String[] alumnos = cargarAlumnos(ent,noAl);
        Curso c = new Curso(nombreCurso, horasXDia, diasXSemana, turno, precioXHora, alumnos);
        return c;
    }
    
    /**
     *  Método calcularGananciaSemanal(): este método se
     * encarga de calcular la ganancia en una semana por curso. Para ello, se
     * deben multiplicar la cantidad de horas por día, el precio por hora, la
     * cantidad de alumnos y la cantidad de días a la semana que se repite el
     * encuentro.
     */
    public double calcularGananciaSemamal(){
        double ganancia = this.horasXDia * this.precioXHora * this.alumnos.length * this.diasXSemana;
        return ganancia;
    }
}

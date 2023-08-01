package main;

import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

/**
 * Pongamos de lado un momento el concepto de POO, ahora vamos a trabajar solo
 * con la clase Date. En este ejercicio deberemos instanciar en el main, una
 * fecha usando la clase Date, para esto vamos a tener que crear 3 variables,
 * dia, mes y anio que se le pedirán al usuario para poner el constructor del
 * objeto Date. Una vez creada la fecha de tipo Date, deberemos mostrarla y
 * mostrar cuantos años hay entre esa fecha y la fecha actual, que se puede
 * conseguir instanciando un objeto Date con constructor vacío.
 *
 * @author Jibda
 */
public class Fechas {

    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        Date fechaUsu, fechaActual;
        int dia, mes, anio;
        String[] fecha;
        boolean invalida;

        dia = mes = anio = 0;

        do {
            invalida = false;
            System.out.println();
            System.out.println("Ingrese una fecha (dd/mm/aaaa): ");
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
        fechaActual = new Date();

        System.out.println("Fecha de usuario: " + fechaUsu);
        System.out.println("Fecha actual: " + fechaActual);

        int anioActual = fechaActual.getYear();
        int anioUsu = fechaUsu.getYear();
        int diferencia;

        if (anioActual > anioUsu) {
            diferencia =  anioActual - anioUsu;
        } else if(anioActual < anioUsu){
            diferencia = anioUsu - anioActual;
        } else {
            diferencia = 0;
        }

        System.out.println("Entre la primera fecha y la segunda hay " + diferencia + " anios.");
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

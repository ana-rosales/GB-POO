package servicios;

import java.util.Scanner;
import entidad.Operacion;

/*
 * Crear una clase llamada Operacion que tenga como atributos privados numero1 y
 * numero2. A continuación, se deben crear los siguientes métodos:
 * d) Método para crearOperacion(): que le pide al usuario los dos números y los guarda
 * en los atributos del objeto.
 * e) Método sumar(): calcular la suma de los números y devolver el resultado al main.
 * f) Método restar(): calcular la resta de los números y devolver el resultado al main
 * g) Método multiplicar(): primero valida que no se haga una multiplicación por cero, si
 * fuera a multiplicar por cero, el método devuelve 0 y se le informa al usuario el error.
 * Si no, se hace la multiplicación y se devuelve el resultado al main
 * h) Método dividir(): primero valida que no se haga una división por cero, si fuera a pasar
 * una división por cero, el método devuelve 0 y se le informa al usuario el error se le
 * informa al usuario. Si no, se hace la división y se devuelve el resultado al main.
 */

/**
 *
 * @author Jibda
 */
public class OperacionServicio {
    Scanner ent = new Scanner(System.in);
    
    public Operacion crearOperacion(){
        Operacion op = new Operacion();
        System.out.print("Ingrese el primer numero: ");
        op.setNum1(ent.nextInt());
        System.out.print("Ingrese el segundo numero: ");
        op.setNum2(ent.nextInt());
        System.out.println();
        return op;
    }
    
    public int sumar(Operacion op){
        int suma = op.getNum1() + op.getNum2();
        return suma;
    }
    public int restar(Operacion op){
        int resta = op.getNum1() - op.getNum2();
        return resta;
    }
    public int multiplicar(Operacion op){
        int mult;
        if(op.getNum1() == 0 || op.getNum2() == 0){
            mult = 0;
        } else {
            mult = op.getNum1() * op.getNum2();
        }        
        return mult;
    }
    public int dividir(Operacion op){
        int div;
        if(op.getNum2() == 0){
            System.out.println("No se puede dividir entre cero.");
            div = 0;
        }else{
            div = op.getNum1() / op.getNum2();
        }
        return div;
    }
}

/**
 * Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los atributos:
 * numeroCuenta (entero), el DNI del cliente (entero largo) y el saldo actual (entero).
 * c) Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.
 * d) Método ingresar(double ingreso): el método recibe una cantidad de dinero a ingresar
 * y se la sumara a saldo actual.
 * e) Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y se
 * la restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se
 * pondrá el saldo actual en 0.
 * f) Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar que el
 * usuario no saque más del 20%.
 * g) Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
 * h) Método consultarDatos(): permitirá mostrar todos los datos de la cuenta
 */
package servicios;

import java.util.Scanner;
import entidad.Cuenta;
/**
 *
 * @author Jibda
 */
public class CuentaServicios {
    Scanner ent = new Scanner(System.in);
    
    public Cuenta crearCuenta(){
        Cuenta cuenta = new Cuenta();
        System.out.print("Ingrese el número de cuenta del cliente: ");
        cuenta.setNumCuenta(ent.nextInt());
        System.out.print("Ingrese el DNI del cliente: ");
        cuenta.setDNI(ent.nextLong());
        System.out.print("Ingrese el saldo actual del cliente: ");
        cuenta.setSaldo(ent.nextInt());
        return cuenta;
    }
    
    public void ingresar(double ingreso, Cuenta cuenta){
        int saldoActual = cuenta.getSaldo();
        double nuevoSaldo = Double.parseDouble(String.valueOf(saldoActual)) + ingreso;
        saldoActual = (int)Math.round(nuevoSaldo);
        cuenta.setSaldo(saldoActual);
    }
    
    public void retirar(double retiro, Cuenta cuenta){
        int saldoActual = cuenta.getSaldo();
        double nuevoSaldo;
        if(saldoActual<retiro){
            nuevoSaldo = 0;
        } else {
            nuevoSaldo = Double.parseDouble(String.valueOf(saldoActual)) - retiro;
        }
        saldoActual = (int)Math.round(nuevoSaldo);
        cuenta.setSaldo(saldoActual);        
    }
    
    public void extraxionRapida(double retiro, Cuenta cuenta){
        int saldoActual = cuenta.getSaldo();
        double veintePorciento = saldoActual * 0.20;
        
        if(retiro <= veintePorciento){
            double nuevoSaldo;
            nuevoSaldo = Double.parseDouble(String.valueOf(saldoActual)) - retiro;
            saldoActual = (int) Math.round(nuevoSaldo);
            cuenta.setSaldo(saldoActual);
        } else {
            System.out.println("No puede retirar más del 20%. Gracias.");
        }
    }
    
    public void consultarSaldo(Cuenta cuenta){
        System.out.println("Consulta saldo de cuenta:");
        System.out.println("El saldo: " + cuenta.getSaldo());
    }
    
    public void consultarDatos(Cuenta cuenta){
        System.out.println("Consulta datos de cuenta:");
        System.out.println("Numero de cuenta: " + cuenta.getNumCuenta());
        System.out.println("DNI de cliente: " + cuenta.getDNI());
        System.out.println("Saldo de la cuenta: " + cuenta.getSaldo());
    }
}

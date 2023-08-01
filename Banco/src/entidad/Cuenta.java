/**
 * Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los atributos:
 * numeroCuenta (entero), el DNI del cliente (entero largo) y el saldo actual (entero).
 * Las operaciones asociadas a dicha clase son:
 * a) Constructor por defecto y constructor con DNI, saldo, número de cuenta e interés.
 * b) Agregar los métodos getters y setters correspondientes
 */
package entidad;

/**
 *
 * @author Ana Paula
 */
public class Cuenta {
    private int numCuenta;
    private long DNI;
    private int saldo;

    public Cuenta(int numCuenta, long DNI, int saldo) {
        this.numCuenta = numCuenta;
        this.DNI = DNI;
        this.saldo = saldo;
    }

    public Cuenta() {
    }

    public int getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(int numCuenta) {
        this.numCuenta = numCuenta;
    }

    public long getDNI() {
        return DNI;
    }

    public void setDNI(long DNI) {
        this.DNI = DNI;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
    
}

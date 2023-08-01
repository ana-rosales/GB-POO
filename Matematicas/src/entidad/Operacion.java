
package entidad;

/**
 * Realizar una clase llamada Matemática que tenga como atributos dos números
 * reales con los cuales se realizarán diferentes operaciones matemáticas. La
 * clase deber tener un constructor vacío, parametrizado y get y set.
 * 
 * @author Jibda
 */
public class Operacion {
    
    private double num1;
    private double num2;

    public Operacion(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public Operacion() {
    }

    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }
    
    /**
     * Deberá además comportarse de la siguiente manera:
     */
    
    /** 
     * a) Método devolverMayor() para retornar cuál de los dos atributos tiene
     * el mayor valor
     * @return mayor
     */
    public double devolverMayor() {
        double mayor = Math.max(this.num1, this.num2);
        return mayor;
    }
    
    /** 
     * a) Método devolverMenor() para retornar cuál de los dos atributos tiene
     * el menor valor
     * @return menor
     */
    public double devolverMenor(){
        double menor = Math.min(this.num1, this.num2);
        return menor;
    }
    
    
    /** 
     * b) Método calcularPotencia() para calcular la potencia del
     * mayor valor de la clase elevado al menor número. Previamente se deben
     * redondear ambos valores.
     * @return potencia
     */
    public double calcularPotencia(){
        double potencia = Math.pow(devolverMayor(), devolverMenor());
        return potencia;
    }
    
    /**
     * c) Método calculaRaiz(), para calcular la raíz
     * cuadrada del menor de los dos valores. Antes de calcular la raíz cuadrada
     * se debe obtener el valor absoluto del número.
     */
    public double calculaRaiz(){
       double menor = devolverMenor();
       double abs = Math.abs(menor);
       double raiz = Math.sqrt(abs);
       return raiz;
    }
}

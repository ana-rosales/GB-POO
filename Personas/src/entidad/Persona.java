/**
 * Realizar una clase llamada Persona que tenga los siguientes atributos: nombre, edad,
 * sexo ('H' hombre, 'M' mujer, 'O' otro), peso y altura. Si el alumno desea añadir algún otro
 * atributo, puede hacerlo. Los métodos que se implementarán son:
 *  Un constructor por defecto.
 *  Un constructor con todos los atributos como parámetro.
 *  Métodos getters y setters de cada atributo.
 */
package entidad;

import java.util.Date;

/**
 *
 * @author Ana Paula
 */
public class Persona {
    private String nombre;
    private Date fechaNac;
    private long edad;
    private char sexo;
    private double peso;
    private float altura;

    public Persona(String nombre, Date fechaNac, char sexo, double peso, float altura) {
        this.nombre = nombre;
        this.fechaNac = fechaNac;
        this.edad = calcularEdad();
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    public Persona() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaNac() {
        return this.fechaNac;
    }

    public void setFechaNac(Date fechaNac) {
        this.fechaNac = fechaNac;
        this.edad = calcularEdad();
    }
    
    public long getEdad() {
        return this.edad;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
    
    /**
     * Método calcularIMC(): calculara si la persona está en su peso ideal (peso
     * en kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor
     * que 20, significa que la persona está por debajo de su peso ideal y la
     * función devuelve un -1. Si la fórmula da por resultado un número entre 20
     * y 25 (incluidos), significa que la persona está en su peso ideal y la
     * función devuelve un 0. Finalmente, si el resultado de la fórmula es un
     * valor mayor que 25 significa que la persona tiene sobrepeso, y la función
     * devuelve un 1.
     *
     * @param p
     * @return resultado
     */
    public int calcularIMC() {
        double IMC = this.peso / Math.pow(this.altura, 2);
        int resultado;
        if (IMC < 20) {
            resultado = -1;
        } else if (IMC >= 20 && IMC <= 25) {
            resultado = 0;
        } else {
            resultado = 1;
        }
        return resultado;
    }
    
    /**
     * Método esMayorDeEdad(): indica si la persona es mayor de edad. La función
     * devuelve un booleano.
     *
     * @return esMayor
     */
    public boolean esMayorDeEdad() {
        boolean esMayor = true;
        if (calcularEdad() < 18) {
            esMayor = false;
        }
        return esMayor;
    }
    
    /**
     * Agregar a la clase el método menorQue(int edad) que recibe como parámetro
     * otra edad y retorna true en caso de que el receptor tenga menor edad que
     * la persona que se recibe como parámetro, o false en caso contrario.
     */
    public boolean menorQue(Persona p) {
        boolean esMenor = true;
        if(p.getEdad() < this.edad){
            esMenor = false;
        }
        return esMenor;
    }
    
    /**
     * Escribir un método calcularEdad() a partir de la fecha de nacimiento
     * ingresada. Tener en cuenta que para conocer la edad de la persona también
     * se debe conocer la fecha actual.
     * @return 
     */
    public long calcularEdad(){
        Date fechaActual = new Date();
        long actual = fechaActual.getTime();
        long nacim = this.fechaNac.getTime();
        long edadMilis = actual - nacim;
        long edadHoras = edadMilis/3600000;
        long edad = edadHoras/8760;
        return edad;
    }
    
}

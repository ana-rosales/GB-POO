/**
 * Crear una entidad Movil con los atributos
 * marca, precio, modelo, memoriaRam, almacenamiento y codigo. El atributo código será
 * un arreglo numérico de dimensión 7 (siete) donde cada subíndice alojará un número
 * correspondiente al código.
 */
package entidad;

import java.util.Scanner;

/**
 *
 * @author Ana Pau
 */
public class Movil {
    private String marca;
    private double precio;
    private String modelo;
    private int memoriaRAM;
    private int almacenamiento;
    private int[] codigo = new int[7];

    public Movil(String marca, double precio, String modelo, int memoriaRAM, int almacenamiento, int[] codigo) {
        this.marca = marca;
        this.precio = precio;
        this.modelo = modelo;
        this.memoriaRAM = memoriaRAM;
        this.almacenamiento = almacenamiento;
        this.codigo = codigo;
    }

    public Movil() {
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getMemoriaRAM() {
        return memoriaRAM;
    }

    public void setMemoriaRAM(int memoriaRAM) {
        this.memoriaRAM = memoriaRAM;
    }

    public int getAlmacenamiento() {
        return almacenamiento;
    }

    public void setAlmacenamiento(int almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public int[] getCodigo() {
        return codigo;
    }

    public void setCodigo(int[] codigo) {
        this.codigo = codigo;
    }
    
    /**
     *  Método ingresarCodigo(): este método permitirá ingresar el código
     * completo de siete números de un celular. Para ello, puede utilizarse un bucle
     * repetitivo
     */
    public int[] ingresarCodigo(){
        Scanner ent = new Scanner(System.in);
        for (int i = 0; i < codigo.length; i++) {
            codigo[i] = Integer.parseInt(ent.next());
        }
        return codigo;
    }
    
    
}

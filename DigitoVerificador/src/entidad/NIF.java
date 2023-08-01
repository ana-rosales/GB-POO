/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

/**
 * Los atributos serán el número de DNI (entero largo) y la letra (String o
 * char) que le corresponde.
 * 
 * @author Jibda
 */
public class NIF {
    private long DNI;
    private char letra;
    private final static char[] LETRAS = {'T','R','W','A','G','M','Y','F','P',
                                            'D','X','B','N','J','Z','S','Q','V',
                                            'H','L','C','K','E'};
    
    public NIF(long DNI, char letra) {
        this.DNI = DNI;
        this.letra = letra;
    }

    public NIF() {
    }

    public long getDNI() {
        return DNI;
    }

    public void setDNI(long DNI) {
        this.DNI = DNI;
    }

    public char getLetra() {
        return letra;
    }

    public void setLetra(char letra) {
        this.letra = letra;
    }
    
    /**
     * Dispondrá de los siguientes métodos:
     **/
    
    /**
     * La letra correspondiente al dígito verificador se calculará a traves de
     * un método que funciona de la siguiente manera: Para calcular la letra se
     * toma el resto de dividir el número de DNI por 23 (el resultado debe ser
     * un número entre 0 y 22). El método debe buscar en un array (vector) de
     * caracteres la posición que corresponda al resto de la división para
     * obtener la letra correspondiente.
     */
    public char digitoVerificador(){
        int pos = Math.toIntExact(DNI%23);
        return LETRAS[pos];
    }
    
    /**
     *  Método mostrar(): que nos permita mostrar el NIF (ocho dígitos, un guion
     * y la letra en mayúscula; por ejemplo: 00395469-F).
     */
    public String NIFCompleto() {
        return DNI + "-" + letra;
    }
}

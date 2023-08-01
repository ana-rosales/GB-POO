/**
 * Realizar una clase llamada Cadena que tenga como atributos una frase (de tipo de
 * String) y su longitud. Deberá además implementar los
 * siguientes métodos:
 */

package entidad;

/**
 * Una entidad tiene características y comportamiento.
 * 
 * @author Ana Paula
 */
public class Cadena {
    private String frase;
    private int longitud;

    public Cadena(String frase, int longitud) {
        this.frase = frase;
        this.longitud = frase.length();
    }

    public Cadena() {
    }

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
        this.longitud = frase.length();
    }

    public int getLongitud() {
        return longitud;
    }
    
    /**
     * Los comportamientos de una cadena es lo que sabe hacer una cadena.
     */
    
    //
    /**
     * Sabe cuántas vocales tiene.
     * @return 
     */
    public int cantidadVocales(){
        int vocales = 0;
        
        for (int i = 0; i < longitud; i++) {
            if(esVocal(this.frase.charAt(i))){
                vocales++;
            }
        }
        return vocales;
    }
    
    /**
     * Se invierte a sí misma.
     * @return 
     */
    public String invertirFrase(){
        String invertida = "";
        for (int i = longitud-1; i > 0; i--) {
            invertida = invertida.concat(frase.substring(i-1, i));
        }
        return invertida;
    }
    
    /**
     * Sabe si una letra se repite dentro de ella.
     * @param a
     * @return repeat
     */
    public int vecesRepetido(char a){
        char mayusA = String.valueOf(a).toUpperCase().charAt(0);
       
        int repeat = 0;
        for (int i = 0; i < longitud; i++) {
            char current = this.frase.charAt(i);
            if(current == mayusA || current == a){
                repeat++;
            }
        }
        
        return repeat;
    }
    
    /**
     * Sabe si su longitud es parecida a la de otra cadena.
     * No distingue de mayusculas ni minusculas.
     * @param frase
     * @return iguales
     */
    public boolean compararCon(String frase){
        String temp = aMayus();
        frase = frase.toUpperCase();
        
        boolean iguales = false;
        if(this.frase.equals(frase)){
            iguales = true;
        }
        
        this.frase = temp;
        return iguales;
    }
    
    /**
     * Puede juntarse con otras frases.
     * @param frase 
     */
    public void unirseA(String frase){
        this.frase = this.frase.concat(frase);
        System.out.println(this.frase);
    }
    
    /**
     * Puede modificar algunas letras.
     * No distingue de mayusculas y minusculas.
     * @param a
     * @param b 
     */
    public void reemplazar(char a, char b){
        char mayusA = String.valueOf(a).toUpperCase().charAt(0);
        char mayusB = String.valueOf(b).toUpperCase().charAt(0);
        this.frase = this.frase.replace(a, b);
        this.frase = this.frase.replace(mayusA, mayusB);
    }
    
    /**
     * Sabe qué caracteres o grupos de caracteres la componen.
     * Tampoco distingue de mayusculas o minusculas.
     * @param a
     * @return existe
     */
    public boolean contiene(String a){
        String mayusA = String.valueOf(a).toUpperCase();
        boolean existe = false;
        if(frase.contains(a) || frase.contains(mayusA)){
            existe = true;
        }
        return existe;
    }
    
    /**
     * Sabe si alguna de sus letras es vocal.
     * @param a
     * @return vocal
     */
    public boolean esVocal(char a){
        boolean vocal = false;
        if(a == 'A' || a == 'E' || a == 'I' || a == 'O' || a == 'U' ||
           a == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'u'){
            vocal = true;
        }
        return vocal;
    }
    
    /**
     * Se convierte a sí misma a mayúsculas y guarda su estado anterior.
     * @return 
     */
    public String aMayus(){
        String temp = this.frase;
        this.frase = this.frase.toUpperCase();
        return temp;
    }
    
}

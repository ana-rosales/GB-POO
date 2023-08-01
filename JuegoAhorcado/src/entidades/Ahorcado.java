
package entidades;

import java.util.ArrayList;

/**
 * Atributos: un vector con la palabra a buscar, la cantidad de letras
 * encontradas y la cantidad jugadas máximas que puede realizar el usuario.
 * 
 * @author Ana Paula
 */
public class Ahorcado {
    private ArrayList<String> palabra = new ArrayList<>();
    private int encontradas;
    private int faltantes;
    private int maxJuegadas;

    public Ahorcado(ArrayList<String> palabra, int encontradas, int maxJuegadas) {
        this.encontradas = encontradas;
        this.maxJuegadas = maxJuegadas;
    }

    public Ahorcado() {
    }

    public ArrayList<String> getPalabra() {
        return palabra;
    }

    public void setPalabra(ArrayList<String> palabra) {
        this.palabra = palabra;
    }
    
    public void setPalabra(String palabra){
        for (int i = 0; i < palabra.length(); i++) {
            this.palabra.add(palabra.substring(i, i+1));
        }
    }

    public int getEncontradas() {
        return encontradas;
    }

    public void setEncontradas(int encontradas) {
        this.encontradas = encontradas;
    }

    public int getMaxJuegadas() {
        return maxJuegadas;
    }

    public void setMaxJuegadas(int maxJuegadas) {
        this.maxJuegadas = maxJuegadas;
    }
    
    public int getFaltantes() {
        return faltantes;
    }

    public void setFaltantes(int faltantes) {
        this.faltantes = faltantes;
    }
    
    /**
     * Método longitud(): muestra la longitud de la palabra que se debe
     * encontrar. Nota: buscar como se usa el vector.length.
     */
    public int longitud(){
        return palabra.size();
    }
    
    /**
     * Método buscar(letra): este método recibe una letra dada por el usuario y
     * busca sila letra ingresada es parte de la palabra o no. También informará
     * si la letra estaba o no.
     */
    public boolean buscar(String letra){
        boolean existe = false;
        if(palabra.contains(letra)){
            existe = true;
        }
        return existe;
    }
    
    /**
     * Método encontradas(letra): que reciba una letra ingresada por el usuario
     * y muestre cuantas letras han sido encontradas y cuantas le faltan. Este
     * método además deberá devolver true si la letra estaba y false si la letra
     * no estaba, ya que, cada vez que se busque una letra que no esté, se le
     * restará uno a sus oportunidades.
     */
    public boolean encontradas(String letra) {
        if(buscar(letra)){
            encontradas += vecesRepetida(letra);
            faltantes-=vecesRepetida(letra);
            System.out.println("Letras encontradas: " + encontradas);
            System.out.println("Letras faltantes: " + faltantes);
            return true;
        }else{
            maxJuegadas--;
            return false;
        }
    }
    
    /**
     * Método intentos(): para mostrar cuantas oportunidades le queda al
     * jugador.
     */
    public void intentos(){
        System.out.println("Oportunidades restantes: " + maxJuegadas);
    }
    
    public int vecesRepetida(String letra){
        int repetida = 0;
        for (String string : palabra) {
            if(string.equals(letra)){
                repetida++;
            }
        }
        return repetida;
    }

    
    
    
}

package servicio;

/**
 * El servicio de cadenas implementa funciones para manipular las acciones y 
 * características de cada objeto cadena.
 */

import entidad.Cadena;
import java.util.Scanner;
/**
 *
 * @author Jibda
 */
public class CadenaServicio {
    Scanner ent = new Scanner(System.in);
    
    public Cadena nuevaCadena(){
        Cadena c = new Cadena();
        System.out.println();
        System.out.println("NUEVA FRASE:");
        System.out.print("Ingrese la frase: ");
        c.setFrase(ent.nextLine());
        return c;
    }
    
    public void mostrarLongitud(Cadena c){
        int longitud = c.getLongitud();
        System.out.println();
        System.out.println("+ La longitud de la cadena es = " + longitud);
    }
    
    public void infoCadena(Cadena c){
        System.out.println();
        System.out.println("INFORMACIÓN DE LA CADENA:");
        mostrarLongitud(c);
        int vocales = c.cantidadVocales();
        System.out.println("+ Vocales = " + vocales);
        String invertida = c.invertirFrase();
        System.out.println("+ Frase invertida = " + invertida);
        
    }
    
    public void encontrarCaracter(Cadena c){
        System.out.println();
        System.out.println("BUSQUEDA DE CARACTER:");
        System.out.println("Ingrese el caracter a buscar: ");
        String a = ent.nextLine();
        if(c.contiene(a)){
            int aparece = c.vecesRepetido(a.charAt(0));
            System.out.println("El caracter EXISTE.");
            System.out.println("Aparece " + aparece + " veces.");
        } else {
            System.out.println("R = El caracter NO EXISTE.");
        }
    }
    
    public void compararCadenas(Cadena c){
        System.out.println();
        System.out.println("COMPARANDO LA CADENA:");
        System.out.println("Ingrese la cadena a comparar:");
        String frase = ent.nextLine();
        if(c.compararCon(frase)){
            System.out.println("Las frases son iguales.");
        }else if(c.contiene(frase)){
            System.out.println("La frase ingresada esta dentro de la frase inicial.");
        }else{
            System.out.println("Las frases son diferentes.");
        }
    }
    
    public void unirCadenas(Cadena c){
        System.out.println();
        System.out.println("UNIR A LA CADENA:");
        System.out.println("Ingrese la cadena a unir:");
        String frase = ent.nextLine();
        c.unirseA(frase);
        System.out.println("Frase resultante = " + c.getFrase());
    }
    
    public void reemplazarCaracter(Cadena c){
        System.out.println();
        System.out.println("SUSTITUIR CARACTER EN CADENA:");
        System.out.println("Ingrese el caracter a sustituir:");
        String a = ent.nextLine();
        if(c.contiene(a)){
            System.out.println("Ingrese el caracter sustituto:");
            char b = ent.nextLine().charAt(0);
            c.reemplazar(a.charAt(0), b);
        }
        System.out.println("Resultado del reemplazo: " + c.getFrase());
    }
}

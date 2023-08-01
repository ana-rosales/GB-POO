
package main;

/**
 * Tendremos los 3 coeficientes como atributos, llamémosles a, b y c. Hay que
 * insertar estos 3 valores para construir el objeto a través de un método
 * constructor.
 * 
 * @author Ana Paula
 */
public class Raices {
    private double a;
    private double b;
    private double c;

    public Raices(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }
    
    /**
     * Luego, las operaciones que se podrán realizar son las siguientes:
     **/
    
    /** 
     *  Método getDiscriminante(): devuelve el valor del discriminante (double).
     * El discriminante tiene la siguiente formula: (b^2)-4*a*c
     * @return discriminante
     **/
    public double getDiscriminante(){
        return Math.pow(b, 2) - 4*a*c;
    }
    
    /**
     *  Método tieneRaices(): devuelve un booleano indicando si tiene dos soluciones,
     * para que esto ocurra, el discriminante debe ser mayor o igual que 0.
     * @return dosSoluciones
     **/
    public boolean tieneRaices(){
        boolean dosSoluciones = false;
        if(getDiscriminante() >= 0){
            dosSoluciones = true;
        }
        return dosSoluciones;
    }
    
    /**
     *  Método tieneRaiz(): devuelve un booleano indicando si tiene una única
     * solución, para que esto ocurra, el discriminante debe ser igual que 0.
     * @return unaSolucion
     **/
    public boolean tieneRaiz(){
        boolean unaSolucion = false;
        if(getDiscriminante() == 0){
            unaSolucion = true;
        }
        return unaSolucion;
    }
    
    /**
     *  Método obtenerRaices(): llama a tieneRaíces() y si devolvió́ true,
     * imprime las 2 posibles soluciones.
     * 
     * Formula ecuación 2o grado: (-b±√((b^2)-(4*a*c)))/(2*a)
     **/
    public void obtenerRaices(){
        if(tieneRaices()){
            double x1 = (-b + Math.sqrt(getDiscriminante()))/2*a;
            double x2 = (-b - Math.sqrt(getDiscriminante()))/2*a;
            System.out.println("X1 = " + x1);
            System.out.println("X2 = " + x2);
        }
    }
    
    /**
     *  Método obtenerRaiz(): llama a tieneRaiz() y si devolvió́ true imprime
     * una única raíz. Es en el caso en que se tenga una única solución posible.
     **/
    public void obtenerRaiz(){
        if(tieneRaiz()){
            double x = (-b + Math.sqrt(getDiscriminante()))/2*a;
            System.out.println("X = " + x);
        }
    }
    
    public String formula(){
        return "(" + a + ") + (" + b + ") + (" + c + ")";
    }
    
}

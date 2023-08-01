
package libana;

import java.util.Scanner;

/**
 *
 * @author Ana Paula
 */
public class MisFunciones {

    /*
        - La función de contar digitos está en el programa DigitosVector17
        - La función de buscar submatriz está en el programa MatrizEnMatriz
    */
    
    public static void inicializarVector(int[] a, int n, int valdef) {
        for (int i = 0; i < n; i++) {
            a[i] = valdef;
        }
    }

    public static void inicializarMatriz(int[][] a, int n, int m, int valdef) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = valdef;
            }
        }
    }
    
    public static void inicializarMatriz(String[][] a, int n, int m, String valdef) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = valdef;
            }
        }
    }

    public static void llenarVector(int[] a, int n) {
        for (int i = 0; i < n; i++) {
            a[i] = i;
        }
    }

    public static void llenarVector(int[] a, int n, int max) {
        for (int i = 0; i < n; i++) {
            //numero aleatorio entre 0 y 9
            a[i] = (int) (Math.random() * max);
        }
    }
    
    public static void llenarVector(double[] a, int n, int max) {
        for (int i = 0; i < n; i++) {
            //numero aleatorio entre 0 y 9
            a[i] = (double) (Math.random() * max);
        }
    }
    
    public static void llenarVector(String[] a, String[] opc, int n, int m){
        for (int i = 0; i < n; i++) {
            //valor aleatorio del arreglo opc
            a[i] = opc[(int) (Math.random() * m)];
        }
    }

    public static void llenarMatriz(int[][] a, int n, int m, int max) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                //numero aleatorio entre 0 y 9
                a[i][j] = (int) (Math.random() * max);
            }

        }
    }
    
    public static void llenarMatriz(float[][] a, int n, int m, int max) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                //numero aleatorio entre 0 y 9
                a[i][j] = (float) (Math.random() * max);
            }

        }
    }

    public static void ingresarVector(float[] a, int n) {
        Scanner ent = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
                System.out.print("[" + i + "] =");
                a[i] = ent.nextFloat();
        }
    }
    
    public static void ingresarVector(int[] a, int n) {
        Scanner ent = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
                System.out.print("[" + i + "] =");
                a[i] = ent.nextInt();
        }
    }
    
    public static void ingresarVector(String[] a, int n) {
        Scanner ent = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.print("[" + i + "] =");
            a[i] = ent.nextLine();
        }
    }
    
    public static void ingresarMatriz(int[][] a, int n, int m) {
        Scanner ent = new Scanner(System.in);
        System.out.println("Ingrese los valores de su matriz:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("[" + i + "][" + j + "] =");
                a[i][j] = ent.nextInt();
            }
            System.out.println();
        }
    }
    
    public static void matrizMagica(int[][] a, int n) {
        Scanner ent = new Scanner(System.in);
        System.out.println("Ingrese los valores de su matriz (entre 1 y 9):");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                do{
                    System.out.print("[" + i + "][" + j + "] =");
                a[i][j] = ent.nextInt();
                }while(a[i][j] < 1 || a[i][j] > 9);
            }
            System.out.println();
        }
    }

    public static void imprimirVector(int[] a, int n) {
        for (int elem : a) {
            System.out.print("[" + elem + "]");
        }
        System.out.println();
    }
    
    public static void imprimirVector(double[] a, int n) {
        for (double elem : a) {
            System.out.print("[" + elem + "]");
        }
        System.out.println();
    }
    
    public static void imprimirVector(String[] a, int n) {
        for (String elem : a) {
            System.out.print("[" + elem + "]");
        }
        System.out.println();
    }

    public static void imprimirMatriz(int[][] a, int n, int m) {
        for (int[] fila : a) {
            for (int elem : fila) {
                System.out.print("[" + elem + "]");
            }
            System.out.println();
        }
    }
    
     public static void imprimirMatriz(float[][] a, int n, int m) {
        for (float[] fila : a) {
            for (float elem : fila) {
                System.out.print("[" + elem + "]");
            }
            System.out.println();
        }
    }
     
    public static void imprimirMatriz(String[][] a, int n, int m) {
        for (String[] fila : a) {
            for (String elem : fila) {
                System.out.print("[" + elem + "]");
            }
            System.out.println();
        }
    }

    public static void transpuesta(int[][] original, int[][] transpuesta, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                transpuesta[i][j] = original[j][i];
            }
        }
    }
    
    public static void matrizNegativa(int[][] original, int[][] neg, int n, int m){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                neg[i][j] = -original[i][j];
            }
        }
    }
    
    public static boolean compararVectores(int[] vector1, int[] vector2, int n) {
        boolean iguales = true;
        int i = 0;
        do{
            if (vector1[i] != vector2[i]) {
                iguales = false;
            }
            i++;
        }while (i<n && iguales);
        
        
        return iguales;
    }
    
    public static boolean compararMatrices(int[][] matriz1, int[][] matriz2, int n, int m){
        boolean iguales = true;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(matriz1[i][j] != matriz2[i][j]){
                    iguales = false;
                }
            }
        }
        return iguales;
    }
    
    public static float sumarVector(float[] a, int n){
        float suma = 0;        
        for (float elem : a) {
            suma += elem;
        }
        return suma;
    }
    
    public static int sumarVector(int[] a, int n){
        int suma = 0;        
        for (int elem : a) {
            suma += elem;
        }
        return suma;
    }
}

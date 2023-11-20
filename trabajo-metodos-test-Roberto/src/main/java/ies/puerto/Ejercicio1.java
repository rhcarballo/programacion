package ies.puerto;

import java.util.Scanner;

/**
 * Programa que crea un triangulo equilatero segun el numero de filas y columnas que introduzca el usuario.
 * Ademas imprime el propio triangulo. Y si el valor de las filas o columnas es mayor o menor que 0, pide otros valores.
 */

public class Ejercicio1 {

    public static void main (String[] args){
    }

    Scanner scanner = new Scanner(System.in);


    /**
     * Funcion que crea el triangulo equilatero bajo una serie de condiciones.
     */
    public void crearTriangulo(){
        int numeroFilas= scanner.nextInt();
        int numeroColumnas= scanner.nextInt();
        int[][] triangulo = new int[numeroFilas][numeroColumnas];

        if ((numeroFilas <= 0) || (numeroColumnas <= 0)){
            System.out.println("Los valores introducidos no son validos.");
        }

        for(int i = 1; i < triangulo.length; i++){
            for(int j = 1; j< triangulo.length; j++){
                triangulo [numeroFilas-i][numeroColumnas-j] = 1;
            }
        }
    }

    /**
     * Funcion que imprime el triangulo equilatero.
     * @param triangulo
     * @return
     */
    public String imprimirTriangulo(int[][] triangulo){
        for(int i = 0; i < triangulo.length; i++){
            for(int j = 0; j < triangulo.length; j++){
                return ""+triangulo[i][j];
            }
        }

        return "";
    }
}

package ies.puerto;

/**
 * @author rhcarballo
 * Dado un valor específico, encuentra su posición en el array o indica si no está presente.
 */

public class Ejercicio6 {

    public int[][] matrizTraspuesta (int[][] array){
        int[][] traspuesta = new int[array.length][array.length];

        for(int i = 0; i <= array.length; i++){
            for(int j = 0; j <= array.length; j++){
                traspuesta[j][i] = array[i][j];
            }
        }

        return traspuesta;
    }

}











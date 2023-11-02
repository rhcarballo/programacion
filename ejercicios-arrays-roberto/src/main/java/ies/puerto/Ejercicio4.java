package ies.puerto;

/**
 * @author rhcarballo
 * Imprime los números pares de un array de enteros.
 */

public class Ejercicio4 {

    public int[] mostrarPares(int[] array){
        int[] pares = new int[array.length];
        int contador = 0;

        for (int i = 0; i < array.length; i++){
            if (array[i] % 2 == 0){
                pares = array[i];
                
            }
        }

        return pares;
    }
        
}

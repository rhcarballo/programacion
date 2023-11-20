package ies.puerto;

/**
 * @author rhcarballo
 * Imprime los números pares de un array de enteros.
 */

public class Ejercicio4copy {

    public int[] numerosPares (int[] array){
        int[] pares = new int[array.length];
        for(int i = 0; i <= array.length; i++){
            if(array[i] % 2 == 0){
                pares[i] = array[i];
            }
            System.out.println(pares[i]);
        }
        
        return pares;
    }
        
}

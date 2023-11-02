package ies.puerto;

/**
 * @author rhcarballo
 * Encuentra el valor máximo y mínimo en un array de enteros.
 */

public class Ejercicio3 {

    public int valorMaximo (int[] array){
        int maximo = array[0];
        for (int i = 1; i < array.length; i++ ){
            if (array[i] > maximo){
                maximo = array[i];
            }
        }
        
        return maximo;
    }
    
    public int valorMinimo (int[] array){
        int minimo = array[0];
        for (int i = 0; i < array.length; i++ ){
            if (array[i] < minimo){
                minimo = array[i];
            }
        }
        
        return minimo;
     }
        
}

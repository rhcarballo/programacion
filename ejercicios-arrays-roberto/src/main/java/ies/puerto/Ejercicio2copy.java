package ies.puerto;

/**
 * @author rhcarballo
 * Calcula el promedio de los elementos en un array de números en punto flotante.
 */

public class Ejercicio2copy {

    public float promedioElementos (float[] array){
        float suma = 0;
        float promedio = 0;

        for(int i = 0; i <= array.length; i++){
            suma += array[i];
        }
        
        promedio = suma/array.length;

        return promedio;
    }   
        
}

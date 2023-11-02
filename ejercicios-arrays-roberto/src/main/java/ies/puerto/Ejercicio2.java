package ies.puerto;

/**
 * @author rhcarballo
 * Calcula el promedio de los elementos en un array de números en punto flotante.
 */

public class Ejercicio2 {

    public float promedioNumeros(float[] array) {
        float suma = 0;
        float promedio;

        for (int i=0; i < array.length; i++){
            suma += array[i];
        }
        promedio = suma / array.length;
        return promedio;
            
    }    
        
}

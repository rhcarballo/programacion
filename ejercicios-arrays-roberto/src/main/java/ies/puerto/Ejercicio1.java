package ies.puerto;

/**
 * @author rhcarballo
 * Escribe un programa que calcule la suma de todos los elementos en un array de enteros.
 */

public class Ejercicio1 {

    public int sumarNumeros(int[] array) {
        int suma = 0;

        for (int i = 0; i < array.length; i++) {
            suma += array[i];
        }
        return suma;
            
    }    
        
}

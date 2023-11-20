package ies.puerto;

/**
 * @author rhcarballo
 * Dado un valor específico, encuentra su posición en el array o indica si no está presente.
 */

public class Ejercicio5copy {

   public int encontrarElemento(int numero, int[] array){
        int elemento = 0;

        for(int i = 0; i <= array.length; i++){
            if(numero == array[i]){
                elemento = i;
            }else{
                System.out.println("El elemento "+numero+" no está presente en el array.");
            }
        }
        return elemento;
   }

}











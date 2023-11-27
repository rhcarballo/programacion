package ies.puerto;

public class Ejercicio4Break {

    /**
     * Escribe un programa que encuentre el primer número negativo en un array, utilizando break.
     */

    public static void main(String[] args){
    
    }

    public float encontrarNegativo(){
        float[] array = {1, 5, -6, 8, 20};
        float numeroEncontrado = 0;

        for(int i = 0; i < array.length; i++){
            if (array[i] < 0){
                numeroEncontrado = array[i];
                System.out.println("El numero negativo del array es:"+numeroEncontrado);
                break;
            }
        }

        return numeroEncontrado;
    }
}

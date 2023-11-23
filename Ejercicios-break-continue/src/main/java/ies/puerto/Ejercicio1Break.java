package ies.puerto;

/**
 * @author rhcarballo
 */

public class Ejercicio1Break {

    /**
     * Escribe un programa que encuentre el primer número divisible por 7 y 5 entre 1 y 100 (inclusive), utilizando break.
     */

    public static void main(String[] args){


        for(int i = 1; i <= 100; i++){
            if ((i % 5 == 0) && (i % 7 == 0)){
                System.out.println("El numero buscado es: "+i);
                break;
            }
        }
    }
}

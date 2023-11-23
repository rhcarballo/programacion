package ies.puerto;

public class Ejercicio3Break {
    /**
     * Escribe un programa que busque el número 7 en un array, utilizando break.
     */

    public static void main(String[] args){
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for(int i : array){
            if (i == 7){
                System.out.println("La posición del número 7 en el array es: "+(i-1));
                break;
            }
        }
    }

}

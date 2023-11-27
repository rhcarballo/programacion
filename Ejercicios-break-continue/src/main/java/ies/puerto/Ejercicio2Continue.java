package ies.puerto;

public class Ejercicio2Continue {

    /**
     * Escribe un programa que imprima todos los números impares del 1 al 20, usando continue para omitir los números pares.
     */

    public static void main(String[] args){

        for(int i = 0; i <= 20; i++){          
            if(i % 2 == 0){
                System.out.println("Numero par encontrado, continuamos con la iteración.");
                continue;
            }

            System.out.println("Numeros del 1 al 20 excepto los numeros pares: "+i);
        
        }

    }

}

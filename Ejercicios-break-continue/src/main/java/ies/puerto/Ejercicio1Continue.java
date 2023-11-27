package ies.puerto;

public class Ejercicio1Continue {

    /**
     * Escribe un programa que imprima los números del 1 al 20, pero omita la impresión de los números que son múltiplos de 3 utilizando continue.
     */

    public static void main(String[] args){

        for(int i = 0; i <= 20; i++){          
            if(i % 3 == 0){
                System.out.println("Multiplo de 3 encontrado, continuamos con la iteración");
                continue;
            }

            System.out.println("Numeros del 1 al 20 sin los múltiplos de 3: "+i);
        
        }

    }
}

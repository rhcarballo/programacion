package ies.puerto;

public class Ejercicio4Continue {

    /**
     * Escribe un programa que busque y cuente los números mayores que 50 en un array, usando continue para omitir los números menores o iguales a 50.
     */

    public static void main(String[] args){
        int[] numeros = {40, 60, 30, 80, 50, 45, 70};
        int mostrarNumero = 0;

        for(int i = 0; i <= numeros.length; i++){
            if((i < 50) || (i == 50)){
                System.out.println("Numero menor o igual a 50 encontrado.");
                continue;
            }

            mostrarNumero = numeros[i];

            System.out.println(""+mostrarNumero);

        }
    }

}

package ies.puerto;

public class Ejercicio3Continue {

    /**
     * Escribe un programa que sume todos los números pares del 1 al 10, usando continue para omitir los números impares.
     */

    public static void main(String[] args){
        int suma = 0;

        for(int i = 0; i <= 10; i++){
            if(i % 2 != 0){
                System.out.println("Numero impar encontrado, seguimos con la suma");
                continue;
            }

            suma += i;
            System.out.println(""+suma);
            
        }
        
    }

}

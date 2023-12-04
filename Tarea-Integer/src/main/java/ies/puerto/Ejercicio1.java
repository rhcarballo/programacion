package ies.puerto;

import java.util.Scanner;

/**
 * Crea un programa que tome un número entero como entrada y verifique si es par o impar 
 * utilizando los métodos de la clase Integer. 
 * Controla las exeption que pudiera generar.
 */

public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero = scanner.nextInt();
        boolean esPar = true;

        
            if (numero % 2 == 0){
                esPar = true;
                System.out.println(numero+" es par");
            }else{
                esPar = false;
                System.out.println(numero+" es impar");
            }
        
    }


}

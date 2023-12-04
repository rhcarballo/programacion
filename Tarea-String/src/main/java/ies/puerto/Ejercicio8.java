package ies.puerto;

import java.util.Scanner;

/**
 * Implementa un programa que convierta una cadena de texto a minúsculas y otra a mayúsculas.
 */

public class Ejercicio8 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);


        String frase1 = scanner.nextLine();
        String frase2 = scanner.nextLine();

        String minusculasAMayusculas = frase1.toUpperCase(); 
        String mayusculasAMinusculas = frase2.toLowerCase(); 

        System.out.println(""+minusculasAMayusculas);
        System.out.println(""+mayusculasAMinusculas);

        scanner.close();
    }
}

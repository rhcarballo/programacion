package ies.puerto;

import java.util.Scanner;

/**
 * Escribe un programa que convierta un número entero en una cadena de texto y 
 * viceversa utilizando los métodos de la clase Integer.
 */

public class Ejercicio2 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Elija una opción, (1) cambiar numero a texto. (2) Cambiar numero escrito en texto a numero.");
        int opcion = scanner.nextInt();

    }

    public String cambiarACadena(){
        Integer integerValue = Integer.valueOf(scanner.nextInt());
        String stringValue = integerValue.toString(); 

        return stringValue;
    }

    public int cambiarAInteger(){
        String str = scanner.nextLine();
        int numero = Integer.parseInt(str); 

        return numero;
    }




}

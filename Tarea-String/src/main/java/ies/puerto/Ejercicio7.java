package ies.puerto;

/**
 * Desarrolla un programa que elimine los espacios en blanco al principio y al final de una cadena de texto.
 */

public class Ejercicio7 {
    public static void main(String[] args){
        String str = "    Hola, estoy programando.     ";
        
        String strSinEspacios = str.trim(); 

        System.out.println(""+strSinEspacios);
    }
}

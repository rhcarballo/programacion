package ies.puerto;

/**
 * Desarrolla un programa que cuente el nḿero de vocales en una cadena de texto.
 */

public class Ejercicio3 {

    public static void main(String[] args){
        String str = "Viva España, viva el rey, viva el ejército";
        int numeroVocales = 0;

        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);

            if ((ch == 'a') || (ch == 'e') || (ch == 'i') || (ch == 'o') || (ch == 'u')){
                numeroVocales++;

            }

        }
        System.out.println(""+numeroVocales);
    }
}

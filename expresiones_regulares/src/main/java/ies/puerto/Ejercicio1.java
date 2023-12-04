package ies.puerto;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Crea un programa que valide si una cadena esuna direccion de correo electronico.
 * Valida utilizando expresiones regulares.
 */

public class Ejercicio1 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escribe una dirección de correo para verificarla");
        String correo = scanner.nextLine();

        String regex = "^[a-z0-9]+@[a-z]+.[a-z]{3}";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(correo);

        if(matcher.matches()){
            System.out.println("La dirección de correo es valida");
        }else {
            System.out.println("La dirección de correo no es valida");
        }

        /**
         * Pattern.matches(regex,correo); Es lo mismo que lo de arriba pero de otra forma
         */

    }
}

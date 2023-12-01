package ies.puerto;

import java.util.Calendar;

/**
 * Crear un programa que reste 2 meses a la fecha actual utilizando la clase Calendar.
 */

public class Ejercicio5 {

    public static void main(String[] args){
        
        Calendar calendar = Calendar.getInstance();

        int año = calendar.get(Calendar.YEAR);
        int mes = (calendar.get(Calendar.MONTH) + 1) - 2;
        int dia = calendar.get(Calendar.DAY_OF_MONTH);


        System.out.println("Dentro de 10 días será el: " + dia + "-" + mes + "-" + año);

    }

}

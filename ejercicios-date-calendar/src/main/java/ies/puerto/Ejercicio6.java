package ies.puerto;

import java.util.Date;


/**
 * Crear un programa que reste 2 meses a la fecha actual utilizando la clase Calendar.
 */

public class Ejercicio6 {

    

    public static void main(String[] args){
        Date fechaActual = new Date();
        Date fecha2 = new Date();

        if (fechaActual == fecha2){
            System.out.println("Las fechas son iguales");
        }else{
            System.out.println("Las fechas son diferentes.");
        }

        System.out.println("La fecha actual es: "+ fechaActual);
    }



}

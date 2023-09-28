package ies.puerto;

import java.util.Scanner;

/**
 * Clase que realiza el ejercicio numero 1 de las tareas
 */
public class Main {
    public static void main(String[] args){

        int valorA;
        int valorB;

        Scanner lectura = new Scanner (System.in);


        //Bloque 2: verifica si los valores son iguales

        do{
            //Bloque 1: Pide por pantalla valor y asigna valor

            System.out.println("Ingrese el valor de la variable A: ");
            valorA = lectura.nextInt();
            System.out.println("valor de la variable A:"+valorA);

            System.out.println("Ingrese el valor de la variable B: ");
            valorB = lectura.nextInt();
            System.out.println("valor de la variable B:"+valorB);
            //Bloque 2: verifica si los valores son iguales
        } while (valorA == valorB);

        //Bloque 3: verifica si A > B

        if(valorA == valorB) {
            System.out.printf("Los valores introducidos son iguales");
        } else {
            if (valorA > valorB){
                System.out.printf("El valor de A es mayor");
            } else {
                System.out.printf("El valor de B es mayor");
            }
        }

        //Bloque 4: Muestra por pantalla el valor mayor

    }
}
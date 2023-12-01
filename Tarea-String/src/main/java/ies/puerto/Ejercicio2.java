package ies.puerto;


/**
 * desarrolla un programa que compare dos cadenas de texto e
 * indique si son iguales o diferentes.
 */

public class Ejercicio2 {

    public static void main(String[] args){
        String str = "Viva España, viva el rey, viva el ejército";
        String str2 = "Viva el Rey, viva el orden y la ley";

        boolean esIgual = str.equals(str2);

        if (str == str2){
            System.out.println("str y str2 son iguales");
        }else{
            System.out.println("str y str2 son diferentes");
        }
    }
}

package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Ejercicio5Test {

    Ejercicio5 ejercicio5 = new Ejercicio5();



    @Test
    public void saberSiEsPrimoTrueOk (){
        int numero = 13;
        boolean primoOk = true;
        boolean primo = ejercicio5.saberSiEsPrimo(numero);
        Assertions.assertEquals(primoOk, primo, "El numero es primo");
    }   

     @Test
    public void saberSiEsPrimoFalseOk (){
        int numero = 4;
        boolean primoOk = false;
        boolean primo = ejercicio5.saberSiEsPrimo(numero);
        Assertions.assertEquals(primoOk, primo, "El numero NO es primo");
    }   

}

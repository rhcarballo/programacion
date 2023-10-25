package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Ejercicio2Test {
    Ejercicio2 ejercicio2 = new Ejercicio2();

    @Test
    public void determinarNumeroPositivo82OkTest(){
        double numero = 82;
        boolean resultadoOk = true;
        boolean positivo = ejercicio2.determinarNumeroPositivo(82);
        Assertions.assertEquals(resultadoOk, positivo, "No es el resultado esperado.");
    }

    @Test
    public void determinarNumeroParImpar82OkTest(){
        double numero = 82; 
        boolean resultadoOK = true;
        boolean par = ejercicio2.determinarNumeroParImpar(82);
        Assertions.assertEquals(resultadoOK, par, "No es el resultado esperado");
    }
}

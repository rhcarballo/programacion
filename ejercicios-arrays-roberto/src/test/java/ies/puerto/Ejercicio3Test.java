package ies.puerto;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Ejercicio3Test{

    Ejercicio3 ejercicio3 = new Ejercicio3();

    @Test
    public void valorMaximoOkTest(){
        int [] array = {20, 80, 30, 10, 190};
        int maximo = ejercicio3.valorMaximo(array);
        int maximoOk = 190;

        Assertions.assertEquals(maximoOk, maximo, "No es el resultado esperado");
    }

    @Test
    public void valorMinimoOkTest(){
        int [] array = {20, 80, 30, 10, 190};
        int minimo = ejercicio3.valorMinimo(array);
        int minimoOk = 10;

        Assertions.assertEquals(minimoOk, minimo, "No es el resultado esperado");
    }

}


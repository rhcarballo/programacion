package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Ejercicio4Test{

    Ejercicio4 ejercicio4 = new Ejercicio4();

    @Test
    public void mostrarParesOk2Test (){
        int[] array = {1, 2, 3, 4, 5, 6};
        int[] pares = ejercicio4.mostrarPares(array);
        int[] paresOk = {2, 4, 6};

        Assertions.assertEquals(paresOk, pares,"No es el resultado esperado");
    }

}


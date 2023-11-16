package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Ejercicio4Test{

    Ejercicio4 ejercicio4 = new Ejercicio4();

    @Test
    public void mostrarParesOkTest (){
        int[] array = {1, 2, 3, 4, 5, 6};
        int[] paresOk = {0, 2, 0, 4, 0,  6};
        int[] pares = ejercicio4.obtenerPares(array);
        
    
        Assertions.assertArrayEquals(paresOk, pares);
    }

}


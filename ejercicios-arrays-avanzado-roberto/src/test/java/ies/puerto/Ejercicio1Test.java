package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Ejercicio1Test{

    Ejercicio1 ejercicio1 = new Ejercicio1();


    @Test
    public void sumarNumerosOkTest() {
        int[] array = {1, 2, 3, 4, 5};
        int sumaOk = 15;
        int suma = ejercicio1.sumarNumeros(array);
        Assertions.assertEquals(sumaOk, suma, "No es el resultado esperado");
        
    }






















}


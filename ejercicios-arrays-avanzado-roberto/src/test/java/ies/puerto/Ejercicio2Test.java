package ies.puerto;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Ejercicio2Test{

    Ejercicio2 ejercicio2 = new Ejercicio2();

    @Test
    public void sumarNumerosOkTest() {
        float[] array = {1.5f, 2.5f, 3.5f, 4.5f, 5.5f};
        float promedio = ejercicio2.promedioNumeros(array);
        float promedioOk = 3.5f;
        Assertions.assertEquals(promedioOk, promedio, "No es el resultado esperado.");
        
    }

}


package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Ejercicio7Test {

    @Test
    public void testOK() {

        Ejercicio7 ejercicio7 = new Ejercicio7();

            String resultado = "";
            String resultadoOk = "Lunes";

            resultado = ejercicio7.calcularDiaSemana(1);
            Assertions.assertEquals(resultadoOk, resultado, "No se ha obtenido el resultado esperado");

    }
}

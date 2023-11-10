package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Ejercicio3Test{

    Ejercicio3 notasExamenes = new Ejercicio3();

    @Test
    public void clasificarNotasIfTestOk(){
        double nota = 8.45;
        String resultadoOk = "Notable";
        String resultado = notasExamenes.clasificarNotasIf(nota);
        Assertions.assertEquals(resultadoOk, resultado, "No es el resultado esperado");
    }

    @Test
    public void clasificarNotasSwitchTestOk(){
        double nota = 4.05;
        String resultadoOk = "Suspenso";
        String resultado = notasExamenes.clasificarNotasSwitch(nota);
        Assertions.assertEquals(resultadoOk, resultado, "No es el resultado esperado");
    }

    
}

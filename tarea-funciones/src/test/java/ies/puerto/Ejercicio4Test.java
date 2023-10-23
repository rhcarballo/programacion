package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class Ejercicio4Test {

    Ejercicio4 ejercicio4 = new Ejercicio4();
    

    @Test
    public void determinarValorMayorDosValoresOk(){
    int numeroA = 6;
    int numeroB = 8;
    int mayorOk = 8;
    int mayor =ejercicio4.maximoDeDosValores(numeroA, numeroB);
    Assertions.assertEquals(mayorOk, mayor, "No se ha obtenido el resultado esperado");
    }
    

    @Test
    public void determinarValorMayorTresValoresOk(){
        int numeroC = 26;
        int maximoDeDosValores;
        int mayorOk = numeroC;
        int mayor = ejercicio4.maximoDeTresValores(maximoDeDosValores, numeroC);
        Assertions.assertEquals(mayorOk, mayor, "No es el resultado esperado");
    }
    
}
package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Ejercicio3Test {
    Ejercicio3 ejercicio3 = new Ejercicio3();

    @Test
    public void mostrarNumeroOkTest(){
        int numero1 = 33;
        int numero2 = 47;
        int numero3 = 90;
        int numero4 = 7;
        int numero5 = 26;

        

    }
    
    
    
    
    @Test
    public int sumarNumerosOkTest (){
        int numero1 = 33;
        int numero2 = 47;
        int numero3 = 90;
        int numero4 = 7;
        int numero5 = 26;
        int resultadoOk = 203;
        int resultado = ejercicio3.sumaNumeros(numero1, numero2, numero3, numero4, numero5);
        Assertions.assertEquals(resultadoOk, resultado, "No es el resultado esperado.");

        return resultado;
    }
    @Test
    public int numeroMayorAMenorOkTest (){
        int numero1 = 33;
        int numero2 = 47;
        int numero3 = 90;
        int numero4 = 7;
        int numero5 = 26;
        int resultadoOk = 90;
        int mayor = ejercicio3.numeroMayorAMenor(numero1, numero2, numero3, numero4, numero5);
        Assertions.assertEquals(resultadoOk, mayor, "No es el resultado esperado.");
    }

}
package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Ejercicio5Test{

    Ejercicio5 ejercicio5 = new Ejercicio5();

    @Test
    public void buscarElementoOkTest (){
        int numero = 5;
        int [] array = {1, 2, 3, 4, 5, 6, 7};
        int elementook = 4;
        int elemento = ejercicio5.buscarElemento(numero, array);
    
        Assertions.assertEquals(elementook, elemento, "No es el resultado esperado");

    }
    


}


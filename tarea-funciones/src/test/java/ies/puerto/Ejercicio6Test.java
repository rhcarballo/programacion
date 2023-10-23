package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Ejercicio6Test {

    Ejercicio6 ejercicio6 = new Ejercicio6();

    @Test
    public void calcularCelsius356Ok (){
        double fahrenheit = 356;
        double celsiusOk = 180;
        double celsius = ejercicio6.calcularCelsius(fahrenheit);
        Assertions.assertEquals(celsiusOk, celsius, "No es el resultado esperado");
    }

    @Test
    public void calcularCelsius149Ok (){
        double fahrenheit = 149;
        double celsiusOk = 65;
        double celsius = ejercicio6.calcularCelsius(fahrenheit);
        Assertions.assertEquals(celsiusOk, celsius, "No es el resultado esperado");
    }

}
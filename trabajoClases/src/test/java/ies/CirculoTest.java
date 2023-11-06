package src.test.java.ies;

public class CirculoTest {
    
    Circulo circulo = new Circulo();

    @Test 
    public void areaCirculo1Ok(){
        int radio = 2;
        double pi = 3.14;
        double resultadoOK = 12.56;
        double resultado = circulo.areaCirculo(radio);

        Assertions.assertEquals(resultadoOK, resultado, "No es el resultado esperado");
    }

    @Test 
    public void areaCirculo2Ok(){
        int radio = 12;
        double pi = 3.14;
        double resultadoOK = 75.36;
        double resultado = circulo.areaCirculo(radio);

        Assertions.assertEquals(resultadoOK, resultado, "No es el resultado esperado");
    }
}


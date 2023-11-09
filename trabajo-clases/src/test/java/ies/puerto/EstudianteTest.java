package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EstudianteTest {

    Estudiante estudiante = new Estudiante();
    Estudiante estudiante1 = new Estudiante("Antonio", 23, "Ingenieria informatica", 4.5);
    Estudiante estudiante2 = new Estudiante("Laura", 20, "Ingenieria civil", 6);

    @Test
    public void aprobadoSiNo1OkTest(){
        boolean aprobadoOk = false;
        boolean aprobado = estudiante1.aprobadoSiNo();
        Assertions.assertEquals(aprobadoOk, aprobado, "No es el resultado esperado");
    }

    @Test
    public void aprobadoSiNo2OkTest(){
        boolean aprobadoOk = true;
        boolean aprobado = estudiante2.aprobadoSiNo();
        Assertions.assertEquals(aprobadoOk, aprobado, "No es el resultado esperado");
    }

}

package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class EstudianteTest {

    Estudiante estudiante;
    String nombre;
    int edad;
    String carrera;
    double promedio = 9.5;

    @BeforeEach

    public void beforeEach(){
        estudiante = new Estudiante(nombre, edad, carrera, promedio);
    }

    @Test
    public void constructorTestOk(){
        Estudiante estudiante = new Estudiante(nombre, edad, carrera, promedio);
        Assertions.assertEquals(nombre, estudiante.getNombre(), "No se ha obtenido el resultado esperado");
        Assertions.assertEquals(edad, estudiante.getEdad(), "no se ha obtenido el resultado esperado");
        Assertions.assertEquals(carrera, estudiante.getCarrera(), "No es el resultado esperado");
        Assertions.assertEquals(promedio, estudiante.getPromedio(), "No es el resultado esperado");
        
    }
    @Test
    public void setNombreTestOk(){
        String miNombre = "Javier";
        estudiante.setNombre(miNombre);
        Assertions.assertEquals(miNombre, estudiante.getNombre(), "No es el resultado esperado");
        
    }
    @Test
    public void setEdadTestOk(){
        int miEdad = 55;
        estudiante.setEdad(miEdad);
        Assertions.assertEquals(miEdad, estudiante.getEdad(), "No es el resultado esperado");
        
    }
    
    @Test
    public void setCarreraTestOk(){
        String miCarrera= "Ingeniería informática";
        estudiante.setCarrera(miCarrera);
        Assertions.assertEquals(miCarrera, estudiante.getCarrera(), "No es el resultado esperado");
        
    }

    @Test
    public void setPromedioTestOk(){
        double miPromedio = 8.5;
        estudiante.setPromedio(miPromedio);
        Assertions.assertEquals(miPromedio, estudiante.getPromedio(), "No es el resultado esperado");
        
    }




    @Test
    public void aprobadoSiNo1OkTest(){
        boolean aprobadoOk = true;
        boolean aprobado = estudiante.aprobadoSiNo();
        Assertions.assertEquals(aprobadoOk, aprobado, "No es el resultado esperado");
    }


}

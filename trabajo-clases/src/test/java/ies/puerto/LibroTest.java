package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
public class LibroTest {

    int añoPublicacion = 2022;
    String autor;
    String titulo;
    Libro libro;

    @BeforeEach

    public void beforeEach(){
        libro = new Libro(autor, titulo, añoPublicacion);
    }

    @Test
    public void constructorTestOk(){
        Libro milibro = new Libro(null, null, añoPublicacion);
        Assertions.assertEquals(autor, libro.getAutor(), "No se ha obtenido el resultado esperado");
        Assertions.assertEquals(titulo, milibro.getTitulo(), "no se ha obtenido el resultado esperado");
        Assertions.assertEquals(añoPublicacion, libro.getAñOPublicacion(), "No es el resultado esperado");
        
    }

    @Test
    public void setTituloTestOk(){
        String miTitulo = "Otro titulo";
        libro.setTitulo(miTitulo);
        Assertions.assertEquals(miTitulo, libro.getTitulo(), "No se ha obtenido el resultado esperado");
    }

    @Test
    public void setAutorTestOk(){
        String miAutor = "Otro autor";
        libro.setAutor(miAutor);
        Assertions.assertEquals(miAutor, libro.getAutor(), "No se ha obtenido el resultado esperado");
    }

     @Test
    public void setAñOPublicacionTestOk(){
        int otroAño = 2000;
        libro.setAñOPublicacion(otroAño);
        Assertions.assertEquals(otroAño, libro.getAñOPublicacion(), "No se ha obtenido el resultado esperado");
    }    

    @Test
    public void imprimirTestOk(){
        String resultadoOk = "Titilo:"+titulo+", autor:"+autor+", año:"+añoPublicacion+".";
        Assertions.assertEquals(resultadoOk, libro.imprimir(), "No se ha obtenido el resultado esperado");
    }
}

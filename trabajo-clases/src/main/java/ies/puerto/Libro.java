package ies.puerto;

public class Libro {
    private String titulo;
    private String autor;
    private int añoPublicacion;

    /**
     * Getters/Setters de la clase
     */
    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return this.autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAñOPublicacion() {
        return this.añoPublicacion;
    }

    public void setAñOPublicacion(int añoPublicacion) {
        this.añoPublicacion = añoPublicacion;
    }

    /**
     * Constructor por defecto de la clase
     */

    public Libro(){
    }


    /**
     * Constructor con paramteros autor, titulo y añoPublicacion
     * @param autor del libro
     * @param titulo del libro
     * @param añoPublicacion del libro
     */

    public Libro(String autor, String titulo, int añoPublicacion){
        this.autor = autor;
        this.titulo = titulo;
        this.añoPublicacion = añoPublicacion;
    }


    /**
     * Función para imprimir
     * @return datos de los libros a los que se le han aplicado objetos
     */
    public String imprimir() {
        String resultado = "";
        resultado = "Titilo:"+titulo+", autor:"+autor+", año:"+añoPublicacion+".";

        return resultado;
        
    }

    /**
     * Funcion que llama a "imprimir" para mostrar los datos de los libros modificados
     * @return
     */

}

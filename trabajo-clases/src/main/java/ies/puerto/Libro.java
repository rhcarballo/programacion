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
     * Constructor con parámetro autor
     * @param autor del libro
     */

    public Libro(String autor){
        this.autor = autor;
    }


    /**
     * Constructor con parametro autor y titulo
     * @param autor del libro
     * @param titulo del libro
     */

    public Libro(String autor, String titulo){
        this.autor = autor;
        this.titulo = titulo;
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
     * Manipulacion de objetos
     */
    Libro libro1 = new Libro("J.K.Rowling", "Harry Potter y el cáliz de fuego", 2000);
    Libro libro2 = new Libro("Gabriel Garcia Marquez", "Cien años de soledad", 1967);

    /**
     * Función para imprimir
     * @return datos de los libros a los que se le han aplicado objetos
     */
    public String imprimir() {

        return "Nombre;" + titulo + "Edad:" + autor + "Email:" + añoPublicacion;
    }

    /**
     * Funcion que llama a "imprimir" para mostrar los datos de los libros modificados
     * @return
     */
    public String mostrardatos(){
        return libro1.imprimir() + libro2.imprimir();
    }
}

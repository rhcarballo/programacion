package ies.puerto;

/**
 * @author rhcarballo
 */
public class Persona {

    public String nombre;
    public int edad;
    public String email;
    public int telefono;


    /**
     * Getters/Setters de la clase
     */
    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }


    /**
     * Metodo para imprimir
     * @return lo que hay que devolver.
     */
    public String imprimir() {

        return "Nombre;" + nombre + "Edad:" + edad + "Email:" + email + "Telefono" + telefono;
    }


    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getTelefono() {
        return this.telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }


    /**
     * Constructor por defecto de la clase
     */

    public Persona(){
    }

    /**
     * Constructor con el parámetro nombre.
     * @param nombre de la persona.
     */
    public Persona(String nombre){
        this.nombre = nombre;
    }

    /**
     * Constructor de la clase con el parametro nombre y edad
     * @param nombre de la persona
     * @param edad de la persona
     */
    public Persona(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    /**
     * Constructor de la clase con el parametro nombre, edad y email
     * @param nombre de la persona
     * @param edad de la persona
     * @param email de la persona
     */
    public Persona(String nombre, int edad, String email){
        this.nombre = nombre;
        this.edad = edad;
        this.email = email;
    }

    /**
     * Constructor de la clase con el parametro nombre, edad, email y telefono
     * @param nombre de la persona
     * @param edad de la persona
     * @param email de la persona
     * @param telefono de la persona
     */
    public Persona(String nombre, int edad, String email, int telefono){
        this.nombre = nombre;
        this.edad = edad;
        this.email = email;
        this.telefono = telefono;
    }


    /**
     * Manipulación de objetos de persona1 y persona2
     */
    
    

}

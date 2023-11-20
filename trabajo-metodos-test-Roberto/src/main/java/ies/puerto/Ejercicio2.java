package ies.puerto;

/**
 * @author Roberto Hernandez Carballo
 * Crear una clase que represente la informacion de un Estudiante.
 */

public class Ejercicio2 {
    Ejercicio2 Estudiante = new Ejercicio2();
    private String nombre;
    private int edad;
    private double peso;
    private double altura;

    /**
     * Getters y Setters de la clase.
     * @return
     */
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    /**
     * Constructor por defecto de la clase
     */
    public void Estudiante(){
    }

    /**
     * Constructir de la clase con todos sus parametros.
     * @param nombre del estudiante
     * @param edad del estudiante
     * @param peso del estudiante
     * @param altura del estudiante
     */
    public void Estudiante(String nombre, int edad, double peso, double altura){
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.altura = altura;
    }


    public double calcularIMC(double peso, double altura){
        double imc = 0;

        imc = peso / (altura * altura);

        return imc;
    }


    public String mostrarInformacion(String nombre, int edad, double peso, double altura, double imc){
        return "El estudiante se llama: "+nombre+", su edad es de "+edad+" años, tiene un peso de "+peso+"Kg, tiene una altura de "+altura+" metros, y su IMC es de "+imc+".";
    }


}

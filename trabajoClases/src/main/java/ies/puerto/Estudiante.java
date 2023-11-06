public class Estudiante{
    private String nombre;
    private int edad;
    private String carrera;
    private double promedio;

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

    public String getCarrera() {
        return this.carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public double getPromedio() {
        return this.promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    
    
    /**
     * Constructor de la clase
     */
    public Estudiante(){
    }

    /**
     * Constructor con parametro nombre
     * @param nombre del estudiante
     */
    public Estudiante(String nombre){
        this.nombre = nombre;
    }

        /**
         * Constructor con parametro nombre y edad
         * @param nombre del estudiante
         * @param edad del estudiante
         */
    public Estudiante(String nombre, int edad){
        this.nombre=nombre;
        this.edad=edad;
    }


    /**
     * Constructor con parametro nombre, edad y carrera
     * @param nombre
     * @param edad
     * @param carrera
     */
    public Estudiante(String nombre, int edad, String carrera){
        this.nombre=nombre;
        this.edad=edad;
        this.carrera=carrera;
    }

    /**
     * Constructor con parametro nombre, edad, carrera y promedio
     * @param nombre
     * @param edad
     * @param carrera
     * @param promedio
     */
    public Estudiante(String nombre, int edad, String carrera, double promedio){
        this.nombre=nombre;
        this.edad=edad;
        this.carrera=carrera;
        this.promedio=promedio;
    }

    public String mostrarInformacion(){
        return "Nombre de estudiante: " + nombre + "Edad: " + edad + "Carrera: " + carrera + "Promedio notas: " + promedio;
    }

    public boolean aprobadoSiNo (double promedio){
        boolean aprobado = true;

        if (promedio <= 5){
            aprobado = false;
        }
        
        return aprobado;
        
    }


    Estudiante estudiante1 = new Estudiante("Antonio", 23, "Ingenieria informatica", 9.5);
    Estudiante estudiante2 = new Estudiante("Laura", 20, "Ingenieria civil", 9);
    




}

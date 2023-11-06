package ies.puerto;

public class Circulo {
    private double radio;


    /**
     * Getters/Setters de la clase
     */

    public double getRadio() {
        return this.radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    /**
     * Funcion que calcula el area del circulo
     * @param radio
     * @return resultado
     */
    public double areaCirculo(){
        double pi = 3.14;
        double resultado = 0;
        resultado = pi * (radio*radio);
        return resultado;
    }

    /**
     * funcion que halla la circunferencia del circulo
     * @param radio del circulo
     * @return circunferencia
     */
    public double circunfrenciaCirculo(){
        double diametro = radio * 2;
        double circunferencia = 0;
        double pi = 3.14;

        circunferencia = pi*diametro;

        return circunferencia;
    }


    /**
     * Constructor por defecto de la clase
     */

    public Circulo(){
    }

    /**
     * Constructor con el parametro radio
     * @param radio del circulo
     */

    public Circulo(double radio){
        this.radio = radio;
    }

    public String mostrarDatos(){
        return "Radio: " + radio;
    }


}

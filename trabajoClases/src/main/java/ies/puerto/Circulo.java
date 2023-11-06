

public class Circulo{
    private int radio;


        /**
         * Getters/Setters de la clase
         */

    public int getRadio() {
        return this.radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

        /**
         * Funcion que calcula el area del circulo
         * @param radio
         * @return resultado
         */
    public double areaCirculo(int radio){
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
    public double circunfrenciaCirculo(int radio){
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

    public Circulo(int radio){
        this.radio = radio;
    }

    public String mostrarDatos(){
        return "Radio: " + radio;
    }

    Circulo circulo1 = new Circulo(2); 
    Circulo circulo2 = new Circulo(12);

}
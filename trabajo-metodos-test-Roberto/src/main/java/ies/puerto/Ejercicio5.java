package ies.puerto;

/**
 * @author Roberto Hernandez Carballo
 * Programa que calcula el mes del año con un numero de entrada, con dos metodos.
 */
public class Ejercicio5 {

    /**
     * Metodo que calcula el mes del año con un metodo If
     * @param numero parametro de entrada
     * @return mes
     */
    public String calcularMesIf(int numero){
        String mes = "Enero";

        if((numero < 1) || (numero > 12)) {
            return "No es un numero valido, debe ser entre 1 y 12.";
        }else if(numero==1){
            mes = "Enero";

        }else if(numero==2){
            mes = "Febrero";

        }else if(numero==3){
            mes = "Marzo";

        }else if(numero==4){
            mes = "Abril";

        }else if(numero==5){
            mes = "Mayo";

        }else if(numero==6){
            mes = "Junio";

        }else if(numero==7){
            mes = "Julio";

        }else if(numero==8){
            mes = "Agosto";

        }else if(numero==9){
            mes = "Septiembre";

        }else if(numero==10){
            mes = "Octubre";

        }else if(numero==11){
            mes = "Noviembre";

        }else{
            mes = "Diciembre";

        }
        return mes;
    }

    public String calcularMesSwitch(int numero){
        String mes = "";
        switch(numero) {
            case 1:
                mes = "Enero";
                break;

            case 2:
                mes = "Febrero";
                break;

            case 3:
                mes = "Marzo";
                break;

            case 4:
                mes = "Abril";
                break;

            case 5:
                mes = "Mayo";
                break;

            case 6:
                mes = "Junio";
                break;

            case 7:
                mes = "Julio";
                break;

            case 8:
                mes = "Agosto";
                break;

            case 9:
                mes = "Septiembre";
                break;

            case 10:
                mes = "Octubre";
                break;

            case 11:
                mes = "Nomviembre";
                break;

            case 12:
                mes = "Diciembre";


            default:
                System.out.println("El numero introducido no es valido.");
        }

        return mes;
    }
}

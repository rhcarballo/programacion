package ies.puerto;

public class Ejercicio2 {

    public boolean determinarNumeroPositivo (double numero){
        boolean positivo = true;
    
        if (numero > 0) {
            return positivo ;
        } else {
           
            positivo = false;
          return positivo;
        }
    }

    public boolean determinarNumeroParImpar (double numero){
        boolean par = true;

        if (numero % 2 == 0){
            return par;
        }else{
            par = false;
            return par;
        }
    }

    

}


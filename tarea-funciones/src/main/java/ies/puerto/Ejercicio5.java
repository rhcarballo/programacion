package ies.puerto;

public class Ejercicio5 {
    public static void main(String[] args) {

    }

    public boolean saberSiEsPrimo(int numero){
        boolean primo = true;
        
        for(int i = 2; i <= numero; i++){
            if (numero % i == 0){
                return false;
            } else {
               return true;
            }

        }




        return true;
    }
}
package ies.puerto;

public class Ejercicio5 {
    public static void main(String[] args) {

    }

    public boolean saberSiEsPrimo(int numero){
        boolean primo = true;
        
        for(int i = 2; i <= numero; i++){
            if (numero % i == 0){
                primo = false;
            } else {
                primo = true;
            }

        }




        return primo;
    }
}
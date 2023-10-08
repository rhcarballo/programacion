
import java.util.Scanner;

public class Ejercicio4 {

    /**
     * Descripcion del algoritmo
     * Escribe un programa en Java que verifique si un número es palíndromo. Se debe solicitar el número por teclado.
     */

    public static void main(String[] args) {

        System.out.println("Introduzca un número, se verificará que sea palíndromo o no:");
        Scanner lectura = new Scanner (System.in);

        int n = lectura.nextInt();

        if (espalindromo(n)) {
            System.out.println("El número es palíndromo.");
        } else{
            System.out.println("El número no es palíndromo.");
        } 
    }

    public static boolean espalindromo(int n) {
        int reverso = 0;

        while (n != 0) {
            int digito = n % 10;
            reverso = reverso * 10 + digito;
            n = n / 10;
        }

        return reverso == n;
        
    }

}

/**
 * @author rhcarballo
 * Ejercicio numero 2
 */
public class Ejercicio1 {

    /**
     * Descripcion del algoritmo
     * Desarrolle un algoritmo que permita leer un valor cualquiera N y escriba si dicho número es par o impar.
     */
    public static void main(String[] args) {

        int n;

        Scanner lectura = new Scanner (System.in);
        
        System.out.println("Ingrese un valor n: ");
        n = lectura.nextInt();

        if (n+1){
            System.out.printf("El valor es par")
        }else {
            System.out.printf("El valor es impar")
        }
        
    }
}
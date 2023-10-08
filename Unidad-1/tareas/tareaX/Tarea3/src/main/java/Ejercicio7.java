    /**
 * author rhcarballo
 */

import java.util.Scanner; 

public class Ejercicio7 {

    /**
     * Descripcion del algoritmo
     * 7. Imprimir el nombre del día de la semana correspondiente a un número ingresado por el usuario utilizando una estructura switch.
     * El día a verificar se debe de pedir por teclado.
     */
    public static void main(String[] args) {

        Scanner lectura = new Scanner(System.in);


        System.out.println("Ingrese el número del día de la semana del 1 al 7: ");
        int n = lectura.nextInt();


		switch(n) {
			
			case 1:
            
				System.out.println("Lunes");
				break;

			case 2:			
				System.out.println("Martes");
				break;
		
			case 3:
				System.out.println("Miércoles");
				break;
		
			case 4:
				System.out.println("Jueves");
				break;
            
            case 5:
                System.out.println("Viernes");
                break;
            
            case 6:
                System.out.println("Sábado");
                break;
            
            case 7:
                System.out.println("Domingo");
                break;

			default:
				System.out.println("El valor introducido no es válido.");
                break;
                
		} 

    }
}
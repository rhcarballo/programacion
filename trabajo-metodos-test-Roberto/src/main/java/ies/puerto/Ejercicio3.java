package ies.puerto;

import java.util.Scanner;

/**
 * @author Roberto Hernandez Carballo
 * Clase que te crea las fichas del domino, permite modificar fichas especificas y las muestra.
 */

public class Ejercicio3 {

    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){

    }

    /**
     * Funcion que crea todas las fichas del domino segun la imagen.
     * @return ficha
     */
    public String[][] domino (){
        String[][] ficha= new String[7][7];
        ficha[0][0] = "0:0";
        ficha[0][1] = "0:1";
        ficha[0][2] = "0:2";
        ficha[0][3] = "0:3";
        ficha[0][4] = "0:4";
        ficha[0][5] = "0:5";
        ficha[0][6] = "0:6";

        ficha[1][0] = "0";
        ficha[1][1] = "1:1";
        ficha[1][2] = "1:2";
        ficha[1][3] = "1:3";
        ficha[1][4] = "1:4";
        ficha[1][5] = "1:5";
        ficha[1][6] = "1:6";

        ficha[2][0] = "0";
        ficha[2][1] = "0";
        ficha[2][2] = "2:2";
        ficha[2][3] = "2:3";
        ficha[2][4] = "2:4";
        ficha[2][5] = "2:5";
        ficha[2][6] = "2:6";

        ficha[3][0] = "0";
        ficha[3][1] = "0";
        ficha[3][2] = "0";
        ficha[3][3] = "3:3";
        ficha[3][4] = "3:4";
        ficha[3][5] = "3:5";
        ficha[3][6] = "3:6";

        ficha[4][0] = "0";
        ficha[4][1] = "0";
        ficha[4][2] = "0";
        ficha[4][3] = "0";
        ficha[4][4] = "4:3";
        ficha[4][5] = "4:5";
        ficha[4][6] = "4:6";

        ficha[5][0] = "0";
        ficha[5][1] = "0";
        ficha[5][2] = "0";
        ficha[5][3] = "0";
        ficha[5][4] = "0";
        ficha[5][5] = "5:5";
        ficha[5][6] = "5:6";

        ficha[6][0] = "0";
        ficha[6][1] = "0";
        ficha[6][2] = "0";
        ficha[6][3] = "0";
        ficha[6][4] = "0";
        ficha[6][5] = "0";
        ficha[6][6] = "6:6";

        mostrarDomino(ficha);
        return ficha;
    }

    /**
     * Funcion que imprime el array ficha en su estado actual incluso si ha sido modificada
     * @param ficha
     * @return ficha en su estado actual.
     */
    public String mostrarDomino(String[][] ficha){
        String mensaje = "Las fichas de domino son:"+ficha;
        return mensaje;
    }

    /**
     * Funcion que lee a partir de un escaner las cifras de la fila y la columna que se quieren modificar, y las modifica por el valor X:X en formato de texto.
     * @param ficha
     * @return
     */
    public String[][] modificarDomino(String[][] ficha){
        int numFila = scanner.nextInt();
        int numColumna = scanner.nextInt();
        String valorParaSustituir = scanner.next();

        ficha[numFila][numColumna]=valorParaSustituir;

        mostrarDomino(ficha);
        return ficha;
    }
}

package ies.puerto;

import java.util.Scanner;

public class Ejercicio3 {

    /**
     * - Ejercicio3. Realiza un programa que contenga los suficientes métodos para: pedir 5 números, mostrar los 5 números, muestra la suma y los muestra en orden creciente y en orden decreciente.
     */

     
     public int sumaNumeros (int numero1, int numero2, int numero3, int numero4, int numero5){
        int resultado = numero1+numero2+numero3+numero4+numero5;

        return resultado;
     }
     
    
     
     
     public int numeroMayorAMenor (int numero1, int numero2, int numero3, int numero4, int numero5){
        int mayor = numero5;
        if ((numero1 > numero2)&& (numero1 > numero3) && (numero1 > numero4) && (numero1 > numero5)){
            mayor = numero1;
        } else if ((numero2 > numero1)&& (numero2 > numero3) && (numero2 > numero4) && (numero2 > numero5)){
            mayor = numero2;
        } else if ((numero3 > numero1)&& (numero3 > numero2) && (numero3 > numero4) && (numero3 > numero5)){
            mayor = numero3;
        } else if ((numero4 > numero1)&& (numero4 > numero2) && (numero4 > numero3) && (numero4 > numero5)){
            mayor = numero4;
        }
        return mayor;
     } 

     public void mostrarNumero (){
        Scanner lectura = new Scanner(System.in);

        int numero1 = lectura.nextInt();
        int numero2 = lectura.nextInt();
        int numero3 = lectura.nextInt();
        int numero4 = lectura.nextInt();
        int numero5 = lectura.nextInt();
        
        System.out.println(numero1);
        System.out.println(numero2);
        System.out.println(numero3);
        System.out.println(numero4);
        System.out.println(numero5);
        

        lectura.close();
     }
}

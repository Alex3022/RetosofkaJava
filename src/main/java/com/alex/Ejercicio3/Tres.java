package com.alex.Ejercicio3;

import java.util.Scanner;

public class Tres {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;
        System.out.println( " ingrese un numero mayor a cero ");
        do {
             numero = teclado.nextInt();
            if ( numero >= 0 )
                break;




        }while ( true);
        System.out.println( " El numero es mayor a cero " + numero );
    }
}

package com.alex.Ejercicio4;

import java.util.Locale;
import java.util.Scanner;

public class Cuatro {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println( " ingrese un dia de la semana ");
        String dia = teclado.nextLine().toLowerCase();


        switch (dia){
            case "lunes":
                System.out.println(dia + " es laboral ");
                break;

            case "martes":
                System.out.println( dia + " es laboral");
                break;

            case "miercoles":
                System.out.println( dia + " es laboral ");
                break;

            case "jueves":
                System.out.println( dia + " es laboral ");
                break;

            case "viernes":
                System.out.println( dia + " eslaboral ");
                break;


            default:
                System.out.println(  dia + " no es un dia pero problamente sea laboral ");
                break;
        }
    }
}

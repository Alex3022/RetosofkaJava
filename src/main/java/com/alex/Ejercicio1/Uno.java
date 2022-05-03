package com.alex.Ejercicio1;

import java.util.Scanner;

public class Uno {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println( " ingrese un radio ");
        String radio = teclado.nextLine();
        double R,area;
        R = Double.parseDouble(radio);
        area = Math.PI*Math.pow(R,2);

        System.out.println( " El area del circulo es " + area);


    }


}

package com.alex.Ejercicio2;

import java.util.Scanner;

public class Dos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println( " ingrese el valor base del producto");
        double precioB = Double.parseDouble(teclado.nextLine());
        double Iva = 0.21;
        precioB = precioB * Iva + precioB;

        System.out.println( " el valor de producto con IVA es " + precioB );


    }
}

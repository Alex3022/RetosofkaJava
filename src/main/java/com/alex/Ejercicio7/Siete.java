package com.alex.Ejercicio7;

import java.util.Scanner;

public class Siete {
    public static void main(String[] args) {

        Scanner teclado = new Scanner( System.in);

        System.out.println(" programa que pide numeros y ordena");
        System.out.println( " indique la cantidad de numeros : ");
        int tamamo  =  teclado.nextInt();
        int [] numeros = new int [tamamo];
        for ( int i = 0; i < tamamo; i++){
            System.out.println(" ingresar el valor en la posicion " + i + " : ");
            numeros [i] = teclado.nextInt();

        }
        System.out.println(" vector desordenado :" );
        System.out.println( " [");
        for ( int i = 0; i < tamamo; i++){
            System.out.println( " " +numeros[i]);
        }
        System.out.println("]");
        for (int i = 0; i < tamamo; i++){
            for ( int j = 0; j<tamamo -1; j++){
                int elementoActual = numeros [j];
                int elementoSiguente = numeros [j+1];
                if (elementoActual<elementoSiguente){
                    numeros [j]= elementoSiguente;
                    numeros [j + 1] = elementoActual;

                }
            }
        }
        System.out.println( " vector ordenado desendiente : ");
        System.out.println( " [");
        for ( int i = 0; i < tamamo; i++){
            System.out.println("" + numeros[i]);
        }
        System.out.println(" ]");
    }
}


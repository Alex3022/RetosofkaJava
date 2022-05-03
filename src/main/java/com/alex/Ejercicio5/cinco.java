package com.alex.Ejercicio5;

import java.util.Scanner;

public class cinco {
    public static void main(String[] args) {

        int conta1 = 0, conta2 = 0, conta3 = 0, conta4 = 0, conta5 = 0;

        System.out.println(" ingrese una frase ");
        Scanner teclado = new Scanner(System.in);
        String frase = teclado.nextLine();
        int length = frase.length();

        for (int i = 0; i < frase.length(); i++) {
            char caracter = frase.charAt(i);
            if (caracter == 'a') {
                conta1++;


            }
            if (caracter == 'e')
            {
                conta2++;

            }
            if (caracter == 'i')
            {
                conta3++;


            }
            if (caracter == 'o')
            {
                conta4++;
            }
            if (caracter == 'u')
            {
                conta5++;
            }

        }
        System.out.println( " mostrar la cantidad de vocales "  + conta1 +  " a " + conta2 + " e " + conta3 + " i " + conta4 +
                " o " + conta5 + " u ");
        System.out.println("Longitud frase es:" + frase.length() );
    }
}






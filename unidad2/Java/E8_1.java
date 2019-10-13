package com.company;

import java.util.Scanner;

public class E8_1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("introduce un numero ");
        float numero = teclado.nextFloat();
        while ( numero != 0 ){
            if (numero % 2 == 0) {
                System.out.println("es par");
            }
            if ( numero > 0 ){
                System.out.println("es positivo");
            }
            System.out.println("el cuadrdo es " + Math.pow( numero, 2 ) );
            System.out.println("introduce un numero ");
            numero = teclado.nextFloat();
        }



    }
}

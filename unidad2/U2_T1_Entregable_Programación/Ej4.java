package com.company;

import java.util.Scanner;

public class Ej4 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        System.out.println( "Indroduce la altura de la letra U ");
        int altura = teclado.nextInt();
        int medio = (altura/2) +1;
        int primera = medio;
        int segunda = primera + 6;
        boolean movimiento = true;
        if ( altura % 2 != 0 && altura >= 3) {
            for ( int i = 1; i <= altura; i++ ) {
                for (  int dibujar = 1; dibujar <= ( altura * 2 ); dibujar++ ) {
                    if ( dibujar == primera || dibujar == segunda) {
                        System.out.print("*");
                    }
                    else {
                        System.out.print( " " );
                    }
                }
                if ( primera == 1 ) {
                    movimiento = false;
                }
                if ( primera == medio ) {
                    movimiento = true;
                }
                if ( movimiento) {
                    primera--;
                    segunda = primera + 6 ;
                }
                else {
                    primera++;
                    segunda = primera + 6 ;
                }
                System.out.println("");
            }
        }
        else {
            System.out.print( "Se necesita un numero impar igual o mayor a 3" );
        }
    }
}

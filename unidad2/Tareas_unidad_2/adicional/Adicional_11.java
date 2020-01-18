package com.company;

import java.util.Scanner;

public class Adicional_11 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        System.out.println( "Indroduce la altura de la letra X ");
        int altura = teclado.nextInt();
        int contador_ast = 1;
        int contador_des = altura;
        if ( ( altura % 2 ) != 0 && altura >= 3 ) {
            for ( int i = 0; i < altura; i++ ) {
                    for (  int dibujar_primero = 1; dibujar_primero <= altura; dibujar_primero++ ) {
                        if ( dibujar_primero == contador_ast || dibujar_primero == contador_des) {
                            System.out.print(" *");
                        }
                        else {
                            System.out.print( "  " );
                        }
                    }
                    contador_ast++;
                    contador_des--;
                System.out.println("");
            }
        }
        else {
            System.out.print( "Se necesita un numero impar igual o mayor a 3" );
        }

    }
}

package com.company;

import java.util.Scanner;
public class E8_9 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int alturamax = 0;
        int arbol = 0;
        int arbolmax = 0;
        int altura = 0;
        while ( altura != -1  ){
            System.out.println("¿cuandos centimetros mide el arbol de alto? ");
            altura = teclado.nextInt();
                if ( altura > alturamax ){
                    alturamax = altura;
                    arbolmax = arbol;
                }
            System.out.println("el mas alto es el arbol " + arbolmax  + " mide " + alturamax + " centimetros");
            arbol++;
        }
    }
}

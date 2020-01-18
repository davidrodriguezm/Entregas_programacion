package com.company;

import java.util.Scanner;

public class E4_4 {
    public static void main(String[]args){
        Scanner teclado = new Scanner(System.in);
        System.out.print("introduce un numero decimal ");
        float numero = teclado.nextFloat();
        System.out.print("el entero mas proximo es  " + Math.round(numero));
    }
}

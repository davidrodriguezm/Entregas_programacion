package com.company;

import java.util.Scanner;

public class E3_3 {
    public static void main(String[]args){
        Scanner teclado = new Scanner(System.in);
        System.out.print("introduce un numero ");
        double numero1 = teclado.nextDouble();
        System.out.print("¿introduce el divisor? ");
        double divisor = teclado.nextDouble();
        System.out.print("el resultado es " + (numero1 / divisor));

    }
}

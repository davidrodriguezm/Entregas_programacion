package com.company;

import java.util.Scanner;

public class E6_3 {
    public static void main(String[]args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("introduce un número entero ");
        int numero = teclado.nextInt();
        int par;
        if (numero % 2 == 0) {
            par = 1;
        }
        else {
            par = 0;
        }
        System.out.println("el valor de par es " + par);
        par = numero % 2 == 0 ? 1 : 0;
        System.out.print("el valor de par es " + par);
    }
}

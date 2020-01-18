package com.company;

import java.util.Scanner;

public class E4_2 {
    public static void main(String[]args){
        Scanner teclado = new Scanner(System.in);
        System.out.print("introduce una nota ");
        int numero1 = teclado.nextInt();
        System.out.print("introduce otra nota ");
        int numero2 = teclado.nextInt();
        double media = (double)(numero1 + numero2) / 2;
        System.out.print("la media es  " + media);
    }
}

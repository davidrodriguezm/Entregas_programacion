package com.company;

import java.util.Scanner;

public class E3_4 {
    public static void main(String[]args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("¿cuantas millas?");
        float millas = (float) teclado.nextDouble();

        System.out.print("son " + (millas * 1.609) + " km");
    }
}

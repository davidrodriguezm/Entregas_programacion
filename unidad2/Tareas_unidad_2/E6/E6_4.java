package com.company;

import java.util.Scanner;

public class E6_4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("introduce un número ");
        byte numero1 = teclado.nextByte();
        System.out.print("introduce otro número ");
        byte numero2 = teclado.nextByte();
        byte menor;
        if (numero1 < numero2) {
            menor = numero1;
        }
        else {
            menor = numero2;
        }
        System.out.println("el valor del menor es " + menor);

        menor = numero1 > numero2 ? numero2 : numero1;
        System.out.println("el valor del menor es " + menor);
    }
}

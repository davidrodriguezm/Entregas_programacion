package com.company;

import java.util.Scanner;

public class E6_2 {
    public static void main(String[]args){
        Scanner teclado = new Scanner(System.in);
        System.out.print("introduce el número de mes ");
        int numero = teclado.nextInt();
        switch (numero) {
            case 1:
                System.out.print("uno ");
                break;
            case 2:
                System.out.print("dos ");
                break;
            case 3:
                System.out.print("tres ");
                break;
            case 4:
                System.out.print("cuatro ");
                break;
            case 5:
                System.out.print("cinco ");
                break;
            case 6:
                System.out.print("seis ");
                break;
            case 7:
                System.out.print("siete ");
                break;
            case 8:
                System.out.print("ocho ");
                break;
            case 9:
                System.out.print("nueve ");
                break;
            case 10:
                System.out.print("diez ");
                break;
        }
    }
}

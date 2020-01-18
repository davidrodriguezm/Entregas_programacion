package com.company;

import java.util.Scanner;

public class E3_2 {
    public static void main(String[]args){
        Scanner teclado = new Scanner(System.in);
        System.out.print("¿año de nacimiento? ");
        short nacimiento = (short) teclado.nextInt();
        System.out.print("¿año actual? ");
        short actual = (short) teclado.nextInt();
        System.out.print("tiene ");
        System.out.print(actual - nacimiento);
        System.out.print(" años");
    }
}
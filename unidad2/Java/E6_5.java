package com.company;

import java.util.Scanner;

public class E6_5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("dime el valor del radio ");
        float radio = teclado.nextFloat();
        System.out.println("1.Calcular diámetro  2.Calcular perímetro  3.Calcular área");
        int menu = teclado.nextInt();
        double resultado;
        double pi = Math.PI;
        switch (menu) {
            case 1:
                resultado = 2 * radio;
                System.out.print("el diametro es " + resultado);
                break;
            case 2:
                resultado = 2 * pi * radio;
                System.out.print("el perimetro es " + resultado);
                break;
            case 3:
                resultado = pi * radio * radio;
                System.out.print("el area es " + resultado);
                break;
        }

    }
}

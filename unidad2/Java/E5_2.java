package com.company;

import java.util.Scanner;

public class E5_2 {
    public static void main(String[]args){
        Scanner teclado = new Scanner(System.in);
        System.out.print("introduce el número 12 ");
        int numero = teclado.nextInt();
        if (numero == 12){
            System.out.print("correcto es doce ");
        }else{
            System.out.print("incorrecto no es doce ");
        }

    }
}

package com.company;

import java.util.Scanner;

public class E5_3 {
    public static void main(String[]args){
        Scanner teclado = new Scanner(System.in);
        System.out.print("introduce el número ");
        int numero = teclado.nextInt();
        if (numero %2 == 0){
            System.out.print("no es impar ");
        }else{
            System.out.print("es impar ");
        }

    }
}

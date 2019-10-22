package com.company;

import java.util.Scanner;

public class E5_1 {
    public static void main(String[]args){
        Scanner teclado = new Scanner(System.in);
        System.out.print("introduce un numero para ver si es positivo ");
        int numero = teclado.nextInt();
        if (numero > 0){
            System.out.print("es positivo ");
        }else{
            System.out.print("no es positivo ");
        }

    }
}

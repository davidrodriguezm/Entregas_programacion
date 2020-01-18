package com.company;

import java.util.Scanner;

public class E6_1 {
    public static void main(String[]args){
        Scanner teclado = new Scanner(System.in);
        System.out.print("introduce el número de mes ");
        int mes = teclado.nextInt();
        switch (mes){
            case 1:
                System.out.print("enero ");
                break;
            case 2:
                System.out.print("febrero ");
                break;
            case 3:
                System.out.print("marzo ");
                break;
            case 4:
                System.out.print("abril ");
                break;
            case 5:
                System.out.print("mayo ");
                break;
            case 6:
                System.out.print("junio ");
                break;
            case 7:
                System.out.print("julio ");
                break;
            case 8:
                System.out.print("agosto ");
                break;
            case 9:
                System.out.print("setiembre ");
                break;
            case 10:
                System.out.print("octubre ");
                break;
            case 11:
                System.out.print("noviembre ");
                break;
            case 12:
                System.out.print("diciembre ");
                break;
        }


    }
}

package com.company;

import java.util.Scanner;

public class E2_3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("primer numero");
        int PrimerNumero = teclado.nextInt();

        System.out.print("divisor numero");
        int Segundonumero = teclado.nextInt();

        System.out.print("el resultado de dividir es: ");
        System.out.print(PrimerNumero / Segundonumero);

    }
}

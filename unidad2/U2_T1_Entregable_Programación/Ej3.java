package com.company;

import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa un número entero positivo");
        long numero = scanner.nextLong();
        String binario = "";
        if (numero > 0) {
            while (numero > 0) {
                if (numero % 2 == 0) {
                    binario = "0" + binario;
                } else {
                    binario = "1" + binario;
                }
                numero = (int) numero / 2;
            }
        } else if (numero == 0) {
            binario = "0";
        } else {
            binario = "No se pudo convertir el numero. Solo números enteros positivos";
        }
        System.out.println("El número convertido a binario es: " + binario);


    }
}

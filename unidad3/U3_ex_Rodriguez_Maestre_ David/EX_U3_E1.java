package Exsamen;

import java.util.Arrays;

public class EX_U3_E1 {
    public static void main(String[] args) {
        final int tam_tabla = 9;
        int con_tabla = tam_tabla - 1;
        int tabla[][] = new int[tam_tabla][tam_tabla];
        for (int fila = 0; fila < tam_tabla; fila++) {
            for (int columna = 0; columna < tam_tabla ; columna++) {
                tabla[fila][columna] = (int) Math.floor(Math.random() * ( 900 - 500 + 1) + 500);
            }
        }
        int max = 0;
        int min = 900;
        int suma = 0;
        int con_num = 0;
        for (int fila = (tam_tabla -1); fila >= 0; fila--) {
            for (int columna = 0; columna < tam_tabla ; columna++) {
                if ( columna == con_tabla) {
                    System.out.print( tabla[fila][columna] + " ");
                    min = min < tabla[fila][columna] ? min :  tabla[fila][columna];
                    max = max > tabla[fila][columna] ? max :  tabla[fila][columna];
                    suma = suma + tabla[fila][columna];
                    con_num++;
                } else {
                    System.out.print( "    ");
                }
            }
            con_tabla--;
            System.out.println();
        }
        float media = (float)suma / con_num;
        System.out.println("El minimo es: " + min);
        System.out.println("El maximo es: " + max);
        System.out.println("La media es: " + media);
    }
}

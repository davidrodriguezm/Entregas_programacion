package Exsamen;

import java.util.Arrays;
import java.util.Scanner;

public class EX_U3_E4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        for (int r = 0; r < 2 ; r++) {
            System.out.println("Introduce tamaño del array");
            int tama_array = teclado.nextInt();
            int numeros[] = new int[tama_array];
            System.out.println("Introduce los numeros");
            for (int i = 0; i <tama_array ; i++) {
                numeros[i] = teclado.nextInt();
            }
            System.out.print("El array es: ");
            System.out.println( Arrays.toString( numeros ));
            System.out.print("Los numeros capicuas son: ");
            System.out.println( Arrays.toString( filtraCapicuas(numeros )) );
        }

    }
    static int[] filtraCapicuas(int original[]) {
        int array_copia[] = original;
        int num_capicua = 0;
        int sin_capicua[] = {-1};
        for (int i = 0; i < original.length; i++) {
            boolean es_capicua = false;
            int cifra = 0;
            int inverso = 0;
            int copia_num = original[i];
            while (copia_num != 0){
                cifra = copia_num % 10;
                inverso = inverso * 10 + cifra;
                copia_num = copia_num / 10;
            }
            if( original[i] == inverso){
                es_capicua = true;
            }
            if (es_capicua) {
                array_copia[num_capicua] = original[i];
                num_capicua++;
            }
        }
        if (num_capicua > 0) {
            return Arrays.copyOf(array_copia, num_capicua);
        } else {
            return sin_capicua;
        }
    }
}

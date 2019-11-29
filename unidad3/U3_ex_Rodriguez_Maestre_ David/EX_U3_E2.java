package Exsamen;

import java.util.Scanner;

public class EX_U3_E2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        for (int i = 0; i < 2; i++) {
            System.out.println("Introduce el numero a");
            long a = teclado.nextLong();
            System.out.println("Introduce el numero b");
            long b = teclado.nextLong();
            System.out.println("El numero unido es: ");
            System.out.println( juntaNumeros( a, b ) );
        }
    }
    static long juntaNumeros(long a, long b) {
        long longitud = 0;
        long copia_b = b;
        long resultado = 0;
        do {
            copia_b = copia_b / 10;
            longitud++;
        } while ( copia_b > 0 );
        resultado = b + ( a * (long)Math.pow(10 , longitud));
        return resultado;
    }
}

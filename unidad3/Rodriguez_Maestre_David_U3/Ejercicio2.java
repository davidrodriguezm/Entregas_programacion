import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        final int calumnas = 4;
        final int fila = 6;
        int[][] tabla = new int[calumnas][fila];
        int suma = 0;
        System.out.println( "Introduce 20 numeros");
        for ( int i = 0; i < calumnas; i++) {
            suma = 0;
            for ( int j = 0; j < fila ; j++) {
                if ( j < 5) {
                    tabla[i][j] = teclado.nextInt();
                    suma = suma + tabla[i][j];
                } else {
                    tabla[i][j] = suma;
                }
            }
        }
        System.out.println( "La tabla es:");
        for ( int i = 0; i < calumnas; i++) {
            for ( int j = 0; j < fila; j++) {
                System.out.print( tabla[i][j] );
                if( j != 5 ) {
                    System.out.print(", ");
                }
            }
            System.out.println();
        }
    }
}

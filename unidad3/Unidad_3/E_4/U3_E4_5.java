import java.util.Arrays;
import java.util.Scanner;

public class U3_E4_5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        final int longitud = 6;
        int[] tabla_1 = new int[longitud];
        int[] tabla_2 = new int[longitud];
        int[] tabla_3 = new int[ longitud * 2 ];
        int con_tabla_1 = 0;
        int con_tabla_2 = 0;
        int con_tabla_3 = 0;
        for (int i = 1; i <= 2; i++) {
            System.out.println("Introduce 6 numeros para la tabla " + i);
            for (int guarda = 0; guarda < longitud; guarda++) {
                if (i == 1) {
                     tabla_1[guarda] = teclado.nextInt();
                }
                if (i == 2) {
                    tabla_2[guarda] = teclado.nextInt();
                }
            }
            System.out.println("La tabla " + i);
            if (i == 1) {
                Arrays.sort(tabla_1);
                System.out.println( Arrays.toString(tabla_1) );
            }
            if (i == 2) {
                Arrays.sort(tabla_2);
                System.out.println( Arrays.toString(tabla_2) );
            }
        }
        while ( con_tabla_2 < longitud && con_tabla_1 < longitud) {
            if (tabla_1[con_tabla_1] < tabla_2[con_tabla_2] ) {
                tabla_3[con_tabla_3] = tabla_1[con_tabla_1];
                con_tabla_1++;
            }
            else {
                tabla_3[con_tabla_3] = tabla_2[con_tabla_2];
                con_tabla_2++;
            }
            con_tabla_3++;
        }
        if (con_tabla_1 < longitud ) {
            while ( con_tabla_1 < longitud ) {
                tabla_3[con_tabla_3] = tabla_1[con_tabla_1];
                con_tabla_1++;
                con_tabla_3++;
            }
        }
        else {
            while ( con_tabla_2 < longitud ) {
                tabla_3[con_tabla_3] = tabla_2[con_tabla_2];
                con_tabla_2++;
                con_tabla_3++;
            }
        }
        System.out.println("La tabla 3");
        System.out.println( Arrays.toString(tabla_3) );
    }
}

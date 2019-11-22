import java.util.Arrays;
import java.util.Scanner;

public class U3_E4_10 {
    public static void main(String[] args) {
        int[] pares = new int[6];
        ;
        System.out.println("Se han introducido " + rellenaPares(pares) + " impares");
        System.out.println(Arrays.toString( pares ));
    }
    static int rellenaPares( int pares[]) {
        Scanner teclado = new Scanner(System.in);
        int cont = 0;
        int i = 0;
        System.out.println("Introduce los numeros ");
        while ( i < pares.length ) {
            int numero = teclado.nextInt();
            if ( numero != 0) {
                if ( numero % 2 == 0) {
                    pares[i] = numero;
                    i++;
                }else {
                    cont++;
                }
            }else {
                pares[i] = numero;
                i++;
            }
        }
        return cont;
    }
}

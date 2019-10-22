import java.util.Scanner;

public class Adicional_3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println( "¿cuantos numeros de la serie  Fibonacci? ");
        int numero = teclado.nextInt();
        int primero = 0;
        int segundo = 1;
        int tercero = 0;
        int i = 0;
        while (i <= numero) {
            i++;
            System.out.println( primero );
            i++;
            if ( tercero > 0) {
                segundo = primero + tercero;
            }
            System.out.println( segundo);
            i++;
            tercero = primero + segundo;
            System.out.println( tercero );
            i++;
            primero = segundo + tercero;
        }
    }
}

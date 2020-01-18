import java.util.Scanner;

public class Adicional_9 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        System.out.println( "Indroduce la altura de la letra L ");
        int altura = teclado.nextInt();
        int horizontal = ( altura / 2 ) + 1;
        for ( int alt = 1; alt < altura; alt++ ) {
            System.out.println( "*" );
        }
        for ( int dib = 1; dib <= horizontal; dib++ ) {
            System.out.print( "* " );
        }
    }
}

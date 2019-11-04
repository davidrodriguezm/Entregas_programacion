import java.util.Scanner;

public class U2_ex_1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println( "Indroduce la altura de la figura");
        int altura = teclado.nextInt();
        int mitad = (altura / 2) +1;
        if ( ( altura % 2 ) != 0 && altura >= 5 ) {
            for ( int i = 1; i <= altura; i++ ) {
                for (  int j = 1; j <= altura; j++ ) {
                    if ( j == 1 || j == altura || i == mitad || i == 1 || i == altura) {
                        System.out.print("M");
                    }
                    else {
                        System.out.print( " " );
                    }
                }
                System.out.println("");
            }
        }
        else {
            System.out.print( "Se necesita un numero impar igual o mayor a 5" );
        }

    }
}

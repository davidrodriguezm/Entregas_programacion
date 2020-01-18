import java.util.Scanner;

public class Adicional_10 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        System.out.println( "Indroduce la altura de la letra U ");
        int altura = teclado.nextInt();
        for ( int i = 0; i < altura; i++ ) {
            if ( ( i + 1 ) == altura ) {
                System.out.print( "  " );
                for (  int dibujar_base = 0; dibujar_base < ( altura -2 ); dibujar_base++ ) {
                    System.out.print("* ");
                }
            }
            else  {
                for ( int dibujar = 0; dibujar < altura; dibujar++ ) {
                    if (dibujar == 0 || ( dibujar + 1 ) == altura) {
                        System.out.print("* ");
                    }
                    else {
                        System.out.print("  ");
                    }
                }
            }
            System.out.println("");
        }
    }
}

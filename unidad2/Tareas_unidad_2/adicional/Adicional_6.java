import java.util.Scanner;

public class Adicional_6 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        System.out.println( "Indroduce la altura de la piramide ");
        int altura = teclado.nextInt();
        System.out.println( "Indroduce el carácter con el que dibujar");
        String carácter = teclado.next();
        int cont = 1;
        for ( int i = altura; i > 0; i-- ) {
            for ( int esp = 0; esp != i; esp++ ) {
                System.out.print( " ");
            }
            for ( int dibjar = 1; dibjar <= cont; dibjar++ ) {
                if ( dibjar == 1 || dibjar  == cont ) {
                    System.out.print( carácter);
                }
                else {
                    System.out.print( " ");
                }
            }
            cont = cont +2;
            System.out.println("");
        }
    }
}

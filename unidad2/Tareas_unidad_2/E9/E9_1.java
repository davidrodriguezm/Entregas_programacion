import java.util.Scanner;

public class E9_1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println( " escribe una palabra ");
        String palabra1 = teclado.nextLine();
        System.out.println( " escribe otra palabra ");
        String palabra2 = teclado.nextLine();
        if ( palabra1.length() > palabra2.length() ) {
            System.out.println( "la más corta es la segunda: " + palabra2 );
        }
        if ( palabra2.length() > palabra1.length() ) {
            System.out.println( "la más corta es la primera: " + palabra1 );
        }
        if ( palabra2.length() == palabra1.length()) {
            System.out.println("son iguales de cortas " + palabra1 + " y " + palabra2);
        }
    }
}

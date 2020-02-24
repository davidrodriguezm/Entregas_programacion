package t1.a7;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class principal_1_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            String linea;
            BufferedReader lee = new BufferedReader(new FileReader("src\\t1\\a7\\more.txt"));
            linea = lee.readLine();
            while ( linea != null ) {
                int cont_linea = 0;
                while ( cont_linea <= 3 && linea != null) {
                    cont_linea++;
                    System.out.println( linea );
                    linea = lee.readLine();
                }
                if ( linea != null ) {
                    System.out.println("Introduzca cualquier cosa para continuar");
                    String continua = sc.nextLine();
                }
            }
            lee.close();
            System.out.println("Fin");
        } catch ( Exception e ) {
            System.out.println("Error en el fichero");
            System.out.println( e.getMessage() );
        }
    }
}

package t1.a1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class principal_1_1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        final String fichero_por_defecto = "src\\t1\\a1\\prueba.txt";
        System.out.println("Escriba el nombre de un fichero (src\\t1\\a1\\prueba.txt por defecto)");
        String nombre_fichero = sc.nextLine();
        if (nombre_fichero.isEmpty()) {
            nombre_fichero = fichero_por_defecto;
        }
        try {
            BufferedReader f = new BufferedReader(new FileReader(nombre_fichero));
            int c = f.read();
            while ( c != -1 ) {
                System.out.print( (char) c );
                c = f.read();
            }
            f.close();
        } catch ( IOException e ) {
            System.out.println("Error al abrir el fichero");
            System.out.println( e.getMessage() );
        }
    }
}

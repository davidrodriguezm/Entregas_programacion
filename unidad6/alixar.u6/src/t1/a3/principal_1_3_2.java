package t1.a3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class principal_1_3_2 {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        final String fichero_por_defecto = "src\\t1\\a3\\original.txt";
        System.out.println("Escriba el nombre de un fichero (src\\t1\\a3\\original.txt por defecto)");
        String nombre_fichero = sc.nextLine();
        String nombre_copia = "copia_de_";
        if ( nombre_fichero.isEmpty() ) {
            nombre_fichero = fichero_por_defecto;
        }
        int barra = nombre_fichero.lastIndexOf("\\");
        if ( barra == -1 ) {
            nombre_copia = nombre_copia + nombre_fichero;
        } else {
            nombre_copia = nombre_fichero.substring( 0, barra+1 ) + nombre_copia + nombre_fichero.substring( barra+1 );
        }
        try {
            BufferedReader lee = new BufferedReader(new FileReader(nombre_fichero));
            BufferedWriter escribe = new BufferedWriter(new FileWriter(nombre_copia));
            int c = lee.read();
            while ( c != -1 ) {
                escribe.write (c);
                c = lee.read();
            }
            lee.close();
            escribe.close();
        } catch ( Exception e ) {
            System.out.println("Error en el fichero");
            System.out.println( e.getMessage() );
        }
    }
}

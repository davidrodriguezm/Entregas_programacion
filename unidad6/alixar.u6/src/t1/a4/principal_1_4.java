package t1.a4;

import java.io.BufferedReader;
import java.io.FileReader;

public class principal_1_4 {
    public static void main(String[] args) {
        int con_caracters = 0;
        int con_palabras = 0;
        int con_lineas = 0;
        boolean vacio = true;
        try {
        BufferedReader lee = new BufferedReader(new FileReader("src\\t1\\a4\\carta.txt"));
        int c = lee.read();
        if ( c != -1 ) {
            con_palabras++;
            vacio = false;
        }
        while ( c != -1 ) {
            if ( (char) c == ' ' ) {
                con_palabras++;
            }
            if ( (char) c == '\n' ) {
                con_lineas++;
                con_palabras++;
            }
            con_caracters++;
            c = lee.read();
        }
        if ( ! vacio ) {
            con_lineas++;
        }
        lee.close();
        } catch ( Exception e ) {
        System.out.println("Error en el fichero");
        System.out.println( e.getMessage() );
        }
        System.out.println("Hay " + con_caracters +" caracteres, " + con_palabras +" palabras y "
                + con_lineas + " lineas");

    }
}

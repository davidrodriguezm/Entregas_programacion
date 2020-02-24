package t1.a3;

import java.io.*;

public class principal_1_3_1 {
    public static void main(String[] args) {
        try {
            BufferedReader lee = new BufferedReader(new FileReader("src\\t1\\a3\\original.txt"));
            BufferedWriter escribe = new BufferedWriter(new FileWriter("src\\t1\\a3\\copia.txt"));
            int c = lee.read();
            while ( c != -1 ) {
                escribe.write (c);
                c = lee.read();
            }
            lee.close();
            escribe.close();
        } catch (IOException e ) {
            System.out.println("Error en el fichero");
            System.out.println( e.getMessage() );
        }
    }
}

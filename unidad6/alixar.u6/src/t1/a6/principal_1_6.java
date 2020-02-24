package t1.a6;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class principal_1_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1 para ver la lista. otro numero para firmar");
        int menu = sc.nextInt();
        sc.nextLine();
        if ( menu == 1 ) {
            try {
                String linea;
                BufferedReader lee = new BufferedReader(new FileReader("src\\t1\\a6\\firmas.txt"));
                linea = lee.readLine();
                while ( linea != null ) {
                    System.out.println( linea );
                    linea = lee.readLine();
                }
                lee.close();
            } catch ( Exception e ) {
                System.out.println("Error en el fichero");
                System.out.println( e.getMessage() );
            }

        } else {
            System.out.println("Intruduzca su firma");
            String firma = sc.nextLine();
            String linea_actual;
            boolean repetido = false;
            try {
                BufferedReader lee = new BufferedReader(new FileReader("src\\t1\\a6\\firmas.txt"));
                linea_actual = lee.readLine();
                while ( linea_actual != null ) {
                    if ( linea_actual.equals(firma) ) {
                        repetido = true;
                    }
                    linea_actual = lee.readLine();
                }
                if ( ! repetido ) {
                    BufferedWriter escribe = new BufferedWriter(new FileWriter("src\\t1\\a6\\firmas.txt",true));
                    escribe.write(firma);
                    escribe.newLine();
                    escribe.close();
                }
                lee.close();
            } catch ( Exception e ) {
                System.out.println("Error en el fichero");
                System.out.println( e.getMessage() );
            }
            if ( repetido ) {
                System.out.println("Firma repetida");
            } else {
                System.out.println("Firmado");
            }
        }
    }
}

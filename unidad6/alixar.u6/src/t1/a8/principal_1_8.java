package t1.a8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class principal_1_8 {
    public static void main(String[] args) {
        try {
            String nombre_1;
            String nombre_2;
            BufferedReader per1 = new BufferedReader(new FileReader("src\\t1\\a8\\persona1.txt"));
            BufferedReader per2 = new BufferedReader(new FileReader("src\\t1\\a8\\persona2.txt"));
            BufferedWriter todos = new BufferedWriter(new FileWriter("src\\t1\\a8\\todos.txt"));
            nombre_1 = per1.readLine();
            nombre_2 = per2.readLine();
            while ( nombre_1 != null && nombre_2 != null ) {
                if ( nombre_1.compareToIgnoreCase(nombre_2) < 0 ) {
                    todos.write(nombre_1);
                    todos.newLine();
                    nombre_1 = per1.readLine();
                } else {
                    todos.write(nombre_2);
                    todos.newLine();
                    nombre_2 = per2.readLine();
                }
            }
            if (nombre_1 == null) {
                while ( nombre_2 != null ) {
                    todos.write(nombre_2);
                    todos.newLine();
                    nombre_2 = per2.readLine();
                }
            } else {
                while ( nombre_1 != null ) {
                    todos.write(nombre_1);
                    todos.newLine();
                    nombre_1 = per1.readLine();
                }
            }
            per1.close();
            per2.close();
            todos.close();
        } catch ( Exception e ) {
            System.out.println("Error en el fichero");
            System.out.println( e.getMessage() );
        }
    }
}

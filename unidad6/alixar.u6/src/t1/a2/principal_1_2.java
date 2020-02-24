package t1.a2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

public class principal_1_2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Escriba tu nombre");
        String nombre = sc.nextLine();
        System.out.println("Tu edad");
        String edad = sc.nextLine();
        try {
            BufferedWriter f = new BufferedWriter(new FileWriter("src\\t1\\a2\\datos.txt"));
            f.write("Nombre: " + nombre );
            f.newLine();
            f.write("Edad: " + edad );
            f.close();
        } catch ( Exception e ) {
            System.out.println("Error al crear el fichero");
            System.out.println( e.getMessage() );
        }
    }
}

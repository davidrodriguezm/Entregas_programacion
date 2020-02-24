package t2.a7;

import java.io.*;
import java.util.Scanner;

public class principal_2_7 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        ObjectOutputStream salida = null;
        ObjectInputStream entrada = null;
        try {
            salida = new ObjectOutputStream(new FileOutputStream("src\\t2\\a7\\frase.dat"));
            System.out.println("Introduce una frase");
            String frase = teclado.nextLine();
            salida.writeObject(frase);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (salida != null) {
                    salida.close();
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        try {
            entrada = new ObjectInputStream(new FileInputStream("src\\t2\\a7\\frase.dat"));
            System.out.println( (String) entrada.readObject() );
        } catch (EOFException e) {
            //System.out.println("EOF exception");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (entrada != null) {
                    entrada.close();
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}

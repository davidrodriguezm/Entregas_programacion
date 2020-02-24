package t2.a6;

import java.io.*;
import java.util.Scanner;

public class principal_2_6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        ObjectOutputStream salida = null;
        ObjectInputStream entrada = null;
        try {
            salida = new ObjectOutputStream(new FileOutputStream("src\\t2\\a6\\dobles.dat"));
            double numero = 0;
            while ( numero != -1 ) {
                System.out.println("Introduce un numero real, -1 para parar");
                numero = teclado.nextDouble();
                if ( numero != -1 ) {
                    salida.writeDouble(numero);
                }
            }
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
            entrada = new ObjectInputStream(new FileInputStream("src\\t2\\a6\\dobles.dat"));
            while (true) {
                System.out.println(entrada.readDouble());
            }
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

package t2.a3;

import java.io.*;
import java.nio.channels.ScatteringByteChannel;
import java.util.Scanner;

public class principal_2_3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        ObjectOutputStream salida = null;
        ObjectInputStream entrada = null;
        try {
            salida = new ObjectOutputStream(new FileOutputStream("src\\t2\\a3\\enteros.dat"));
            int numero = 0;
            while (numero >= 0) {
                System.out.println("Introduce un numero entero, uno negativo para parar");
                numero = teclado.nextInt();
                if (numero >= 0) {
                    salida.writeInt(numero);
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
            entrada = new ObjectInputStream(new FileInputStream("src\\t2\\a3\\enteros.dat"));
            while (true) {
                System.out.println(entrada.readInt());
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

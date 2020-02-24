package t2.a8;

import java.io.*;
import java.lang.reflect.Array;
import java.util.Arrays;

public class principal_2_8 {
    public static void main(String[] args) {
        ObjectOutputStream salida = null;
        ObjectInputStream entrada = null;
        try {
            salida = new ObjectOutputStream(new FileOutputStream("src\\t2\\a8\\tabla_aleatorios.dat"));
            short[] tabla = new short[10];
            for (int i = 0; i < tabla.length ; i++) {
                tabla[i] = (short) Math.floor(Math.random()*100);
            }
            Arrays.sort( tabla );
            salida.writeObject(tabla);
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
            entrada = new ObjectInputStream(new FileInputStream("src\\t2\\a8\\tabla_aleatorios.dat"));
            short[] tabla = (short[]) entrada.readObject();
            System.out.println("La tabla :");
            for (int i = 0; i < tabla.length; i++) {
                System.out.print( tabla[i] + ", " );
            }
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

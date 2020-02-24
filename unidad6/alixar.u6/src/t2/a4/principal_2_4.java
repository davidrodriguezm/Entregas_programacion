package t2.a4;

import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Locale;
import java.util.Scanner;

public class principal_2_4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        ObjectOutputStream salida = null;
        try {
            salida = new ObjectOutputStream(new FileOutputStream("src\\t2\\a4\\tabla_dobles.dat"));
            System.out.println("Introduce el numero de elementos de la tabla");
            int elementos = teclado.nextInt();
            double[] tabla = new double[elementos];
            System.out.println("Introduce los numeros de la tabla");
            for (int i = 0; i < elementos ; i++) {
                tabla[i] = teclado.nextDouble();
            }
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
    }
}

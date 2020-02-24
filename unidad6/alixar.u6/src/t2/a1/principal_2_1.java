package t2.a1;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class principal_2_1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un numero real");
        double numero = teclado.nextDouble();
        ObjectOutputStream salida = null;
        try {
            salida = new ObjectOutputStream( new FileOutputStream("src\\t2\\a1\\doble.dat"));
            salida.writeDouble(numero);
        } catch ( Exception e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if ( salida != null ) {
                    salida.close();
                }
            } catch ( Exception e ) {
                System.out.println(e.getMessage());
            }
        }
    }
}

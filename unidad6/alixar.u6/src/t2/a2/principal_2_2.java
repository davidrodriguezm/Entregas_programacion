package t2.a2;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class principal_2_2 {
    public static void main(String[] args) {
        ObjectInputStream entrada = null;
        try {
            entrada = new ObjectInputStream( new FileInputStream("src\\t2\\a1\\doble.dat"));
            double numero = entrada.readDouble();
            System.out.println("El numero es: " + numero );
        } catch ( Exception e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if ( entrada != null ) {
                    entrada.close();
                }
            } catch ( Exception e ) {
                System.out.println(e.getMessage());
            }
        }
    }
}

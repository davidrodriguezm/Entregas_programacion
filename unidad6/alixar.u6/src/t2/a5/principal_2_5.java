package t2.a5;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class principal_2_5 {
    public static void main(String[] args) {
        ObjectInputStream entrada = null;
        try {
            entrada = new ObjectInputStream(new FileInputStream("src\\t2\\a4\\tabla_dobles.dat"));
            double[] tabla = (double[]) entrada.readObject();
            for ( double numero : tabla ) {
                System.out.println(numero);
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

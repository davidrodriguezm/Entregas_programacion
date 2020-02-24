package t1.a5;

import java.io.BufferedReader;
import java.io.FileReader;

public class principal_1_5 {
    public static void main(String[] args) {
        String numero = "";
        int menor = 0;
        int mayor = 0;
        int num_actual = 0;
        try {
            BufferedReader lee = new BufferedReader(new FileReader("src\\t1\\a5\\numeros.txt"));
            numero = lee.readLine();
            if (  numero != null ) {
                num_actual = Integer.valueOf(numero);
                mayor = num_actual;
                menor = num_actual;
            }
            while ( numero != null ) {
                mayor =  mayor > num_actual  ? mayor : num_actual;
                menor =  menor < num_actual  ? menor : num_actual;
                numero = lee.readLine();
                if ( numero != null ) {
                    num_actual = Integer.valueOf(numero);
                }
            }
            lee.close();
        } catch ( Exception e ) {
            System.out.println("Error en el fichero");
            System.out.println( e.getMessage() );
        }
        System.out.println("El mayor: " + mayor + " y el menor: " + menor);
    }
}

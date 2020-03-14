package t1;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class a6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        LinkedHashSet<String> conjunto = new LinkedHashSet<>();
        System.out.println("Introduce nombres para guardar en una coleccion, introduce fin para terminar");
        while ( true ) {
            String nombre = teclado.nextLine();
            if ( nombre.equalsIgnoreCase("fin") ) {
                break;
            } else if ( !nombre.isEmpty() ) {
                conjunto.add(nombre);
            }
        }
        System.out.println("El conjunto sin repetidos:\n" + conjunto);
    }
}

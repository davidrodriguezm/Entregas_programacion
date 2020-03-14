package t1;

import java.util.Scanner;
import java.util.TreeSet;

public class a7 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        TreeSet<String> conjunto = new TreeSet<>();
        System.out.println("Introduce nombres para guardar en una coleccion, introduce fin para terminar");
        while ( true ) {
            String nombre = teclado.nextLine();
            if ( nombre.equalsIgnoreCase("fin") ) {
                break;
            } else if ( !nombre.isEmpty() ) {
                conjunto.add(nombre);
            }
        }
        System.out.println("El conjunto sin repetidos y en orden alfabetico:\n" + conjunto);
    }
}

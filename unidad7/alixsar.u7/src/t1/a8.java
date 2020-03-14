package t1;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;

public class a8 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        List<String> lista = new ArrayList<>();
        System.out.println("Introduce nombres para guardar en una coleccion, introduce fin para terminar");
        while ( true ) {
            String nombre = teclado.nextLine();
            if ( nombre.equalsIgnoreCase("fin") ) {
                break;
            } else if ( !nombre.isEmpty() ) {
                lista.add(nombre);
            }
        }
        System.out.println("La lista original:\n" + lista);
        lista = eliminaRepetidos(lista);
        System.out.println("La lista sin repetidos:\n" + lista);
    }

    static List eliminaRepetidos(List c) {
        LinkedHashSet eliminar_repe = new LinkedHashSet(c);
        return new ArrayList(eliminar_repe);
    }
}

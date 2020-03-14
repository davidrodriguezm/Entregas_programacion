package t2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class a14 {
    public static void main(String[] args) {
        List<Character> lista = leeCadena();
        System.out.println("La lista:\n" + lista);
    }

    static List<Character> leeCadena() {
        Scanner teclado = new Scanner(System.in);
        List<Character> lista = new ArrayList<>();
        System.out.println("Introduce un cadena de char");
        String cadena = teclado.nextLine();
        for (int i = 0; i < cadena.length() ; i++) {
            lista.add( cadena.charAt(i) );
        }
        return lista;
    }
}
